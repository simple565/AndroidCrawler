package com.maureen.androidcrawler.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.maureen.androidcrawler.R;
import com.maureen.androidcrawler.bean.SurfRankBean;
import com.maureen.androidcrawler.database.AllPastShowsRecord;
import com.maureen.androidcrawler.database.AllSisterRecord;
import com.maureen.androidcrawler.database.FinalShow;
import com.maureen.androidcrawler.database.PastShow;
import com.maureen.androidcrawler.database.Sister;

import org.litepal.LitePal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

import io.reactivex.Completable;

/**
 * Description:
 *
 * @author Maureen
 * Create 2020-08-29 3:02
 */
public class SurfRankHelper {
    private static final String TAG = "SurfRankHelper";
    private static SurfRankHelper mInstance = null;
    private String[] mFinalTeamArray;
    private String[] mSisterArray;
    private String[] mPastShowArray;

    private SurfRankHelper(Context context) {
        mFinalTeamArray = context.getResources().getStringArray(R.array.final_show);
        mSisterArray = context.getResources().getStringArray(R.array.person);
        mPastShowArray = context.getResources().getStringArray(R.array.past_show);
    }

    public static SurfRankHelper getInstance(Context context) {
        if (null == mInstance) {
            synchronized (SurfRankHelper.class) {
                if (null == mInstance) {
                    mInstance = new SurfRankHelper(context.getApplicationContext());
                }
            }
        }
        return mInstance;
    }

    public void initData() {
        Completable.create(emitter -> {
            for (String showInfo : mPastShowArray) {
                String[] info = showInfo.split(",");
                // PastShow pastShow = new PastShow(info[0], info[1], Integer.parseInt(info[2]), Integer.parseInt(info[3]),Integer.parseInt(info[4]));
                // pastShow.save();
            }

            for (String person : mSisterArray) {
                Sister sister = new Sister();
                sister.setName(person);
                StringBuilder allShows = new StringBuilder();
                List<PastShow> pastShows = LitePal.findAll(PastShow.class);
                for (PastShow pastShow : pastShows) {
                    if (pastShow.getAllPerformers().contains(person)) {
                        allShows.append(pastShow.getName());
                    }
                }
                sister.setAllShows(allShows.toString());
                sister.save();
            }
        }).compose(RxSchedulersUtils.applyCompletableAsync())
                .subscribe();
    }

    public void getFinalTeamRank() throws Exception {
        String result = Objects.requireNonNull(WebClient.getInstance().syncGet(UrlConstants.SISTER_FINAL_TEAM).body()).string();
        if (!TextUtils.isEmpty(result)) {
            SurfRankBean surfRankBean = new Gson().fromJson(result, SurfRankBean.class);
            if (SurfRankBean.SUCCESS_CODE == surfRankBean.getCode()) {
                StringBuilder builder = new StringBuilder();
                // 对照各个舞台票数
                List<SurfRankBean.DataBean> dataBeanList = surfRankBean.getData();
                int teamNjTotalCount = 0, teamLsTotalCount = 0;
                for (SurfRankBean.DataBean data : dataBeanList) {
                    int index = rank2Index(data.getId());
                    Log.d(TAG, "getFinalTeamRank: " + mFinalTeamArray[index] + " " + data.getNum());
                    builder.append(data.getNum()).append(",");
                    // 计算团总票数
                    if (index < 3) {
                        teamNjTotalCount += data.getNum();
                    } else {
                        teamLsTotalCount += data.getNum();
                    }
                }
                Log.d(TAG, "getFinalTeamRank: " + teamNjTotalCount + " " + teamLsTotalCount);
                FinalShow data = new FinalShow();
                data.setAllFinalShowsVotes(builder.toString());
                data.setTeamOneTotalVotes(teamNjTotalCount);
                data.setTeamTwoTotalVotes(teamLsTotalCount);
                data.setDateTime(timeStamp2Date(surfRankBean.getCurrent_time()));
                data.save();
            }
        }
    }

    public void getPastTeamRank() throws Exception {
        String result = Objects.requireNonNull(WebClient.getInstance().syncGet(UrlConstants.SISTER_PAST_TEAM).body()).string();
        if (!TextUtils.isEmpty(result)) {
            SurfRankBean surfRankBean = new Gson().fromJson(result, SurfRankBean.class);
            if (SurfRankBean.SUCCESS_CODE == surfRankBean.getCode()) {
                // 获取每个舞台浪花值
                List<SurfRankBean.DataBean> dataBeanList = surfRankBean.getData();
                for (SurfRankBean.DataBean dataBean : dataBeanList) {
                    int index = rank2Index(dataBean.getId());
                    PastShow pastShow = new PastShow();
                    pastShow.setName(mPastShowArray[index].split(",")[0]);
                    pastShow.setVotes(dataBean.getNum());
                    pastShow.setDateTime(timeStamp2Date(surfRankBean.getCurrent_time()));
                    pastShow.update(index + 1);
                    Log.d(TAG, "getPastTeamRank:  " + mPastShowArray[index].split(",")[0] + ":" + dataBean.getNum());
                    // 添加往期舞台记录
                    AllPastShowsRecord record = new AllPastShowsRecord(mPastShowArray[index].split(",")[0],
                            dataBean.getNum(), timeStamp2Date(surfRankBean.getCurrent_time()));
                    record.save();
                }
            }
        }
    }

    public void getPersonRank() throws Exception {
        String result = Objects.requireNonNull(WebClient.getInstance().syncGet(UrlConstants.SISTER_PERSON).body()).string();
        if (!TextUtils.isEmpty(result)) {
            SurfRankBean surfRankBean = new Gson().fromJson(result, SurfRankBean.class);
            if (SurfRankBean.SUCCESS_CODE == surfRankBean.getCode()) {
                List<SurfRankBean.DataBean> dataBeanList = surfRankBean.getData();
                for (SurfRankBean.DataBean data : dataBeanList) {
                    int index = rank2Index(data.getId());
                    Log.d(TAG, "getPersonRank: " + mSisterArray[index] + " " + data.getNum());
                    // 更新个人榜实时记录
                    Sister sister = LitePal.find(Sister.class, index + 1);
                    sister.setVotes(data.getNum());
                    sister.setDateTime(timeStamp2Date(surfRankBean.getCurrent_time()));
                    sister.update(index + 1);
                    // 添加个人榜记录
                    AllSisterRecord record = new AllSisterRecord(mSisterArray[index], data.getNum(), timeStamp2Date(surfRankBean.getCurrent_time()));
                    record.save();
                }
            }
        }
    }

    private int rank2Index(String rankNum) {
        return Integer.parseInt(rankNum.substring(4)) - 1;
    }

    private String timeStamp2Date(long time) {
        String format = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.SIMPLIFIED_CHINESE);
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return sdf.format(new Date(time * 1000));
    }
}
