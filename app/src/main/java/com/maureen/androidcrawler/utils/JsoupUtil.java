package com.maureen.androidcrawler.utils;

import android.util.Log;

import com.maureen.androidcrawler.bean.SignBean;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @Description
 * @Author Lianml
 * @Create 2019-12-12 22:18
 */
public class JsoupUtil {
    private static String TAG = JsoupUtil.class.getSimpleName();

    /**
     * 获取微博之夜年度人物
     *
     * @param html
     * @return
     */
    public static ArrayList<SignBean> getPersonOfTheYear(String html) {
        ArrayList<SignBean> dokiBeanArrayList = new ArrayList<>();

        Document document = Jsoup.parse(html);
        Elements elements = document
                .body()
                .select("div.index1.list_kq_loop")
                .select("div.wrapper")
                .select("div:nth-child(1)")
                .select("div.con_kq_content.clearfix")
                .select("div.con_kq_list.con_q")
                .select("ul");

        Log.d("Test1", String.valueOf(elements.size()));
        for (Element element : elements) {
            Log.d("Test", element.text());
        }
        return dokiBeanArrayList;
    }

    /**
     * 获取微博之夜QUEEN
     *
     * @param html
     * @return
     */
    public static ArrayList<SignBean> getSinaNightQueen(String html) {
        ArrayList<SignBean> dokiBeanArrayList = new ArrayList<>();
        String time = Utils.getTime(System.currentTimeMillis());
        Document document = Jsoup.parse(html);
        Elements elements = document
                .body()
                .select("div.index1.list_kq_loop")
                .select("div.wrapper")
                .select("div:nth-child(1)")
                .select("div.con_kq_content.clearfix")
                .select("div.con_kq_list.con_q")
                .select("ul");
        String top7 = elements.get(0).text();
        String[] tops = top7.split(" ");
        Log.d(TAG, dokiBeanArrayList.get(0).toString());
        Log.d(TAG, dokiBeanArrayList.get(1).toString());
        return dokiBeanArrayList;
    }

    /**
     * 获取微博之夜KING
     *
     * @param html
     * @return
     */
    public static ArrayList<SignBean> getSinaNightKing(String html) {
        ArrayList<SignBean> dokiBeanArrayList = new ArrayList<>();
        String time = Utils.getTime(System.currentTimeMillis());
        Document document = Jsoup.parse(html);
        Elements elements = document
                .body()
                .select("div.index1.list_kq_loop")
                .select("div.wrapper")
                .select("div:nth-child(1)")
                .select("div.con_kq_content.clearfix")
                .select("div.con_kq_list.con_k")
                .select("ul");
        String top7 = elements.get(0).text();
        String[] tops = top7.split(" ");
        Log.d(TAG, dokiBeanArrayList.get(0).toString());
        Log.d(TAG, dokiBeanArrayList.get(1).toString());
        return dokiBeanArrayList;
    }

    /**
     * 获取新浪新闻年度娱乐影响力
     *
     * @param html
     * @return
     */
    public static ArrayList<SignBean> getSinaNewsAnnual(String html) {
        ArrayList<SignBean> dokiBeanArrayList = new ArrayList<>();
        String url = "https://sinanews.sina.cn/ent/weibo_night_sublist_2019.d.html?wm=3049_0109";
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.d("Test", doc.html());
        Elements elements = doc.getElementsByClass("survey_item");
        Log.d("Test", String.valueOf(elements.size()));
        for (Element element : elements) {
            Log.d("Test", element.text());
        }
        return dokiBeanArrayList;
    }

}
