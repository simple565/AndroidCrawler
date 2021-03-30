package com.maureen.androidcrawler;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.maureen.androidcrawler.utils.RxSchedulersUtils;
import com.maureen.androidcrawler.utils.SurfRankHelper;
import com.maureen.androidcrawler.utils.UrlConstants;
import com.maureen.androidcrawler.utils.WebClient;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * @author Maureen
 */
public class MainActivity extends AppCompatActivity {
    private static String TAG = MainActivity.class.getSimpleName();
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        Observable.interval(0, 300, TimeUnit.SECONDS)
                .doOnNext(aLong -> {
                    SurfRankHelper.getInstance(mContext).getFinalTeamRank();
                    SurfRankHelper.getInstance(mContext).getPastTeamRank();
                    SurfRankHelper.getInstance(mContext).getPersonRank();
                }).compose(RxSchedulersUtils.applyObservableAsync())
                .doOnError(throwable -> Log.e(TAG, Objects.requireNonNull(throwable.getMessage())))
                .subscribe();
    }


    public void loadData() {
        Observable.create((ObservableOnSubscribe<String>) emitter -> {
            String result = Objects.requireNonNull(WebClient.getInstance().syncGet(UrlConstants.SIGN_DATA_URL).body()).string();
            if (TextUtils.isEmpty(result)) {
                emitter.onError(new Throwable("数据为空"));
            } else {
                emitter.onNext(result);
            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<String>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(String s) {
                        Log.d(TAG, "onNext: " + s);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(TAG, "onError: " + e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private void loadAllData() {
        Observable<String> signDataObservable = Observable.create(emitter -> {
            String result = Objects.requireNonNull(WebClient.getInstance().syncGet(UrlConstants.SIGN_DATA_URL).body()).string();
            if (TextUtils.isEmpty(result)) {
                emitter.onError(new Throwable("数据为空"));
            } else {
                emitter.onNext(result);
            }
        });

        Observable<String> popularityObservable = Observable.create(emitter -> {
            String result = Objects.requireNonNull(WebClient.getInstance().syncGet(UrlConstants.POPULARITY_DATA_URL).body()).string();
            if (TextUtils.isEmpty(result)) {
                emitter.onError(new Throwable("数据为空"));
            } else {
                emitter.onNext(result);
            }
        });

        Observable.merge(signDataObservable, popularityObservable)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext(s -> Log.d(TAG, "loadAllData: " + s)).subscribe();
    }
}
