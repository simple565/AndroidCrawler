package com.maureen.androidcrawler;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.maureen.androidcrawler.bean.PopularityBean;
import com.maureen.androidcrawler.bean.SignBean;
import com.maureen.androidcrawler.utils.UrlConstants;
import com.maureen.androidcrawler.utils.WebClient;

import org.junit.Test;

import java.net.URLConnection;
import java.util.Objects;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {

        try {
            String json = Objects.requireNonNull(WebClient.getInstance().syncGet(UrlConstants.SIGN_DATA_URL).body()).string();
            String realJson = json.substring(json.indexOf("(") + 1, json.lastIndexOf(")"));
            Gson gson = new Gson();
            SignBean signBean = gson.fromJson(realJson, SignBean.class);
            String jsonArray = Objects.requireNonNull(WebClient.getInstance().syncGet("http://node.video.qq.com/x/api/doki_rank_detail?starids=94125%2C8237587%2C509538%2C94359%2C1656027%2C93893%2C1484179%2C1305836%2C1534879%2C1661498%2C131182%2C8191786%2C1318558%2C84601%2C1503848%2C83324%2C1655835%2C132179%2C1660161%2C174688%2C85042%2C1325760%2C115905%2C453571%2C94524%2C151228%2C1574532%2C93984%2C222071%2C225710%2C132072%2C303979%2C74260%2C72880%2C132354%2C132190%2C1657527%2C1649290%2C108180%2C499883%2C84640%2C1320230%2C311548%2C831206%2C1603694%2C97546%2C1661523%2C1648466%2C86390%2C96510%2C1594620%2C74260%2C8238860&fantuans=14890%2C58237587%2C17701%2C10580%2C51656027%2C10181%2C51484179%2C51305836%2C51534879%2C51661498%2C16583%2C58191786%2C51318558%2C14572%2C17754%2C15951%2C51655835%2C15168%2C51660161%2C50174688%2C10570%2C51325760%2C18306%2C16841%2C15155%2C15611%2C51574532%2C10631%2C10327%2C16364%2C18726%2C15203%2C14300%2C10477%2C17125%2C15123%2C51657527%2C51649290%2C76868%2C10359%2C14841%2C10401%2C50311548%2C50831206%2C51603694%2C10201%2C51661523%2C51648466%2C15289%2C10658%2C51594620%2C14300%2C58238860&_=1585058054898&callback=Zepto1585058054575").body()).string();
            String realJsonArray = jsonArray.substring(jsonArray.indexOf("{"), jsonArray.lastIndexOf("}") + 1);
            System.out.println(realJsonArray);
            JsonObject objects = gson.fromJson(realJsonArray, JsonObject.class);
            System.out.println(objects.get("222071"));
            PopularityBean popularityBean = gson.fromJson(objects.get("222071"), PopularityBean.class);
            System.out.println(popularityBean.getStrName() + popularityBean.getStFanTuanScoreInfo().getDdwPopularity());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}