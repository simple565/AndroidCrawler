package com.maureen.androidcrawler.bean;

import org.litepal.crud.LitePalSupport;

import java.util.List;

/**
 * Description Doki签到值
 *
 * @author Maureen
 * Create 2019-12-12 21:33
 */
public class SignBean extends LitePalSupport {

    /**
     * data : {"ret":0,"msg":"SUCCESS",
     * "doki_list":[{"star_id":222071,"name":"迪丽热巴","head":"http://puui.qpic.cn/vcolumn_pic/0/name_222071_1461t1508139208.jpg/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10327&tabId=3","rank":1,"sign_num":397772},{"star_id":1661523,"name":"火箭少女101傅菁","head":"http://puui.qpic.cn/media_img/0/16615231572428014/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51661523&tabId=3","rank":2,"sign_num":196392},{"star_id":1661498,"name":"李子璇","head":"http://puui.qpic.cn/media_img/0/null1523863896/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51661498&tabId=3","rank":3,"sign_num":168964},{"star_id":1657527,"name":"时代少年团贺峻霖","head":"http://puui.qpic.cn/media_img/0/_213_1533985451589508_15490/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51657527&tabId=3","rank":4,"sign_num":75448},{"star_id":93893,"name":"李易峰","head":"http://puui.qpic.cn/media_img/0/_575_1533985500395830_19992/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10181&tabId=3","rank":5,"sign_num":63715},{"star_id":303979,"name":"金瀚","head":"http://puui.qpic.cn/media_img/0/3039791577254314/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=15203&tabId=3","rank":6,"sign_num":60966},{"star_id":499883,"name":"鞠婧祎","head":"http://puui.qpic.cn/media_img/0/4998831554196548/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10359&tabId=3","rank":7,"sign_num":52451},{"star_id":1649290,"name":"范丞丞","head":"http://puui.qpic.cn/media_img/0/16492901532661446/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51649290&tabId=3","rank":8,"sign_num":34030},{"star_id":1320230,"name":"谷嘉诚","head":"http://puui.qpic.cn/media_img/0/null1514430391/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10401&tabId=3","rank":9,"sign_num":33420},{"star_id":132072,"name":"熊梓淇","head":"http://puui.qpic.cn/media_img/0/_600_1533985650434577_19992/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=18726&tabId=3","rank":10,"sign_num":26628},{"star_id":108180,"name":"梁洁","head":"http://puui.qpic.cn/media_img/0/1081801540548705/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=76868&tabId=3","rank":11,"sign_num":17593},{"star_id":453571,"name":"宋祖儿","head":"http://puui.qpic.cn/media_img/0/4535711578551357/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=16841&tabId=3","rank":12,"sign_num":13373},{"star_id":1534879,"name":"张铭恩","head":"http://puui.qpic.cn/media_img/0/15348791553512503/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51534879&tabId=3","rank":13,"sign_num":13350},{"star_id":94125,"name":"潘粤明","head":"http://puui.qpic.cn/media_img/0/_684_1533985552156910_20018/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=14890&tabId=3","rank":14,"sign_num":12430},{"star_id":509538,"name":"李宏毅","head":"http://puui.qpic.cn/media_img/0/5095381531736517/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=17701&tabId=3","rank":15,"sign_num":11056},{"star_id":151228,"name":"谭松韵","head":"http://puui.qpic.cn/media_img/0/_692_1533985593635878_20018/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=15611&tabId=3","rank":16,"sign_num":9925},{"star_id":115905,"name":"陈芳语","head":"http://puui.qpic.cn/media_img/0/null1524141793/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=18306&tabId=3","rank":17,"sign_num":8972},{"star_id":1656027,"name":"林超泽","head":"http://puui.qpic.cn/media_img/0/16560271541042051/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51656027&tabId=3","rank":18,"sign_num":8767},{"star_id":84601,"name":"张哲瀚","head":"http://puui.qpic.cn/media_img/0/846011569839092/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=14572&tabId=3","rank":19,"sign_num":8644},{"star_id":174688,"name":"小鬼","head":"http://puui.qpic.cn/media_img/0/1746881584801461/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=50174688&tabId=3","rank":20,"sign_num":8564},{"star_id":97546,"name":"陈学冬","head":"http://puui.qpic.cn/media_img/0/975461547205425/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10201&tabId=3","rank":21,"sign_num":8174},{"star_id":132179,"name":"王博文","head":"http://puui.qpic.cn/media_img/0/_209_1533985604368045_21148/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=15168&tabId=3","rank":22,"sign_num":7757},{"star_id":132190,"name":"于朦胧","head":"http://puui.qpic.cn/media_img/0/1321901555056470/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=15123&tabId=3","rank":23,"sign_num":7609},{"star_id":83324,"name":"万茜","head":"http://puui.qpic.cn/media_img/0/_559_1533985600200545_16629/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=15951&tabId=3","rank":24,"sign_num":7210},{"star_id":84640,"name":"张雪迎","head":"http://puui.qpic.cn/media_img/0/_580_1533985721726222_16629/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=14841&tabId=3","rank":25,"sign_num":6313},{"star_id":1648466,"name":"赵品霖","head":"http://puui.qpic.cn/media_img/0/16484661577182934/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51648466&tabId=3","rank":26,"sign_num":6115},{"star_id":85042,"name":"杜淳","head":"http://puui.qpic.cn/media_img/0/850421541576541/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10570&tabId=3","rank":27,"sign_num":5928},{"star_id":72880,"name":"周渝民","head":"http://puui.qpic.cn/media_img/0/_549_1533985752195957_16631/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10477&tabId=3","rank":28,"sign_num":5875},{"star_id":225710,"name":"孙怡","head":"http://puui.qpic.cn/media_img/0/null1522058218/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=16364&tabId=3","rank":29,"sign_num":5589},{"star_id":93984,"name":"杨蓉","head":"http://puui.qpic.cn/media_img/0/_604_1533985672262053_19992/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10631&tabId=3","rank":30,"sign_num":5191},{"star_id":1660161,"name":"戚砚笛","head":"http://puui.qpic.cn/media_img/0/null1523864727/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51660161&tabId=3","rank":31,"sign_num":4799},{"star_id":94359,"name":"蒋欣","head":"http://puui.qpic.cn/media_img/0/_604_1533985472782502_20012/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10580&tabId=3","rank":32,"sign_num":3372},{"star_id":132354,"name":"安悦溪","head":"http://puui.qpic.cn/media_img/0/_481_1533985380993559_16631/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=17125&tabId=3","rank":33,"sign_num":3263},{"star_id":1603694,"name":"廖劲锋","head":"http://puui.qpic.cn/media_img/0/16036941553767974/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51603694&tabId=3","rank":34,"sign_num":3177},{"star_id":131182,"name":"宋伊人","head":"http://puui.qpic.cn/media_img/0/_247_1533985578705753_15490/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=16583&tabId=3","rank":35,"sign_num":2537},{"star_id":96510,"name":"王力宏","head":"http://puui.qpic.cn/media_img/0/965101581756798/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10658&tabId=3","rank":36,"sign_num":1662},{"star_id":1594620,"name":"赵弈钦","head":"http://puui.qpic.cn/media_img/0/15946201577182963/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51594620&tabId=3","rank":37,"sign_num":1248},{"star_id":831206,"name":"应昊茗","head":"http://puui.qpic.cn/media_img/0/_271_1533985682423467_15490/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=50831206&tabId=3","rank":38,"sign_num":947},{"star_id":74260,"name":"张俪","head":"http://puui.qpic.cn/media_img/0/_276_1533985709949284_15490/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=14300&tabId=3","rank":39,"sign_num":852},{"star_id":1305836,"name":"钱蓓婷","head":"http://puui.qpic.cn/media_img/0/13058361539946229/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51305836&tabId=3","rank":40,"sign_num":834},{"star_id":1574532,"name":"高至霆","head":"http://puui.qpic.cn/media_img/0/15745321569835231/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51574532&tabId=3","rank":41,"sign_num":829},{"star_id":311548,"name":"周兴哲","head":"http://puui.qpic.cn/media_img/0/3115481530523506/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=50311548&tabId=3","rank":42,"sign_num":758},{"star_id":1655835,"name":"黄新淳","head":"http://puui.qpic.cn/media_img/0/16558351553512381/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51655835&tabId=3","rank":43,"sign_num":684},{"star_id":1484179,"name":"孙珍妮","head":"http://puui.qpic.cn/media_img/0/14841791553768284/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51484179&tabId=3","rank":44,"sign_num":650},{"star_id":1325760,"name":"魏哲鸣","head":"http://puui.qpic.cn/media_img/0/_591_1533985625824251_19992/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51325760&tabId=3","rank":45,"sign_num":305},{"star_id":1503848,"name":"丁翔南","head":"http://puui.qpic.cn/media_img/0/_97_1533985421014642_30589/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=17754&tabId=3","rank":46,"sign_num":255},{"star_id":8191786,"name":"陈思键","head":"http://puui.qpic.cn/media_img/0/81917861553562645/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=58191786&tabId=3","rank":47,"sign_num":161},{"star_id":94524,"name":"郑国霖","head":"http://puui.qpic.cn/media_img/0/_233_1533985739695334_21148/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=15155&tabId=3","rank":48,"sign_num":158},{"star_id":86390,"name":"郭雪芙","head":"http://puui.qpic.cn/media_img/0/_490_1533985442546157_16631/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=15289&tabId=3","rank":49,"sign_num":124},{"star_id":8238860,"name":"何楷成","head":"http://puui.qpic.cn/media_img/0/82388601553669901/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=58238860&tabId=3","rank":50,"sign_num":123},{"star_id":1318558,"name":"李鸿其","head":"http://puui.qpic.cn/media_img/0/13185581553512562/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51318558&tabId=3","rank":51,"sign_num":111},{"star_id":8237587,"name":"吴承泽","head":"http://puui.qpic.cn/media_img/0/82375871553849322/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=58237587&tabId=3","rank":52,"sign_num":86}]}
     * ret : 0
     * msg : ok.
     */

    private DataBean data;
    private int ret;
    private String msg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean {
        /**
         * ret : 0
         * msg : SUCCESS
         * doki_list : [{"star_id":222071,"name":"迪丽热巴","head":"http://puui.qpic.cn/vcolumn_pic/0/name_222071_1461t1508139208.jpg/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10327&tabId=3","rank":1,"sign_num":397772},{"star_id":1661523,"name":"火箭少女101傅菁","head":"http://puui.qpic.cn/media_img/0/16615231572428014/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51661523&tabId=3","rank":2,"sign_num":196392},{"star_id":1661498,"name":"李子璇","head":"http://puui.qpic.cn/media_img/0/null1523863896/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51661498&tabId=3","rank":3,"sign_num":168964},{"star_id":1657527,"name":"时代少年团贺峻霖","head":"http://puui.qpic.cn/media_img/0/_213_1533985451589508_15490/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51657527&tabId=3","rank":4,"sign_num":75448},{"star_id":93893,"name":"李易峰","head":"http://puui.qpic.cn/media_img/0/_575_1533985500395830_19992/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10181&tabId=3","rank":5,"sign_num":63715},{"star_id":303979,"name":"金瀚","head":"http://puui.qpic.cn/media_img/0/3039791577254314/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=15203&tabId=3","rank":6,"sign_num":60966},{"star_id":499883,"name":"鞠婧祎","head":"http://puui.qpic.cn/media_img/0/4998831554196548/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10359&tabId=3","rank":7,"sign_num":52451},{"star_id":1649290,"name":"范丞丞","head":"http://puui.qpic.cn/media_img/0/16492901532661446/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51649290&tabId=3","rank":8,"sign_num":34030},{"star_id":1320230,"name":"谷嘉诚","head":"http://puui.qpic.cn/media_img/0/null1514430391/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10401&tabId=3","rank":9,"sign_num":33420},{"star_id":132072,"name":"熊梓淇","head":"http://puui.qpic.cn/media_img/0/_600_1533985650434577_19992/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=18726&tabId=3","rank":10,"sign_num":26628},{"star_id":108180,"name":"梁洁","head":"http://puui.qpic.cn/media_img/0/1081801540548705/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=76868&tabId=3","rank":11,"sign_num":17593},{"star_id":453571,"name":"宋祖儿","head":"http://puui.qpic.cn/media_img/0/4535711578551357/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=16841&tabId=3","rank":12,"sign_num":13373},{"star_id":1534879,"name":"张铭恩","head":"http://puui.qpic.cn/media_img/0/15348791553512503/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51534879&tabId=3","rank":13,"sign_num":13350},{"star_id":94125,"name":"潘粤明","head":"http://puui.qpic.cn/media_img/0/_684_1533985552156910_20018/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=14890&tabId=3","rank":14,"sign_num":12430},{"star_id":509538,"name":"李宏毅","head":"http://puui.qpic.cn/media_img/0/5095381531736517/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=17701&tabId=3","rank":15,"sign_num":11056},{"star_id":151228,"name":"谭松韵","head":"http://puui.qpic.cn/media_img/0/_692_1533985593635878_20018/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=15611&tabId=3","rank":16,"sign_num":9925},{"star_id":115905,"name":"陈芳语","head":"http://puui.qpic.cn/media_img/0/null1524141793/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=18306&tabId=3","rank":17,"sign_num":8972},{"star_id":1656027,"name":"林超泽","head":"http://puui.qpic.cn/media_img/0/16560271541042051/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51656027&tabId=3","rank":18,"sign_num":8767},{"star_id":84601,"name":"张哲瀚","head":"http://puui.qpic.cn/media_img/0/846011569839092/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=14572&tabId=3","rank":19,"sign_num":8644},{"star_id":174688,"name":"小鬼","head":"http://puui.qpic.cn/media_img/0/1746881584801461/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=50174688&tabId=3","rank":20,"sign_num":8564},{"star_id":97546,"name":"陈学冬","head":"http://puui.qpic.cn/media_img/0/975461547205425/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10201&tabId=3","rank":21,"sign_num":8174},{"star_id":132179,"name":"王博文","head":"http://puui.qpic.cn/media_img/0/_209_1533985604368045_21148/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=15168&tabId=3","rank":22,"sign_num":7757},{"star_id":132190,"name":"于朦胧","head":"http://puui.qpic.cn/media_img/0/1321901555056470/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=15123&tabId=3","rank":23,"sign_num":7609},{"star_id":83324,"name":"万茜","head":"http://puui.qpic.cn/media_img/0/_559_1533985600200545_16629/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=15951&tabId=3","rank":24,"sign_num":7210},{"star_id":84640,"name":"张雪迎","head":"http://puui.qpic.cn/media_img/0/_580_1533985721726222_16629/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=14841&tabId=3","rank":25,"sign_num":6313},{"star_id":1648466,"name":"赵品霖","head":"http://puui.qpic.cn/media_img/0/16484661577182934/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51648466&tabId=3","rank":26,"sign_num":6115},{"star_id":85042,"name":"杜淳","head":"http://puui.qpic.cn/media_img/0/850421541576541/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10570&tabId=3","rank":27,"sign_num":5928},{"star_id":72880,"name":"周渝民","head":"http://puui.qpic.cn/media_img/0/_549_1533985752195957_16631/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10477&tabId=3","rank":28,"sign_num":5875},{"star_id":225710,"name":"孙怡","head":"http://puui.qpic.cn/media_img/0/null1522058218/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=16364&tabId=3","rank":29,"sign_num":5589},{"star_id":93984,"name":"杨蓉","head":"http://puui.qpic.cn/media_img/0/_604_1533985672262053_19992/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10631&tabId=3","rank":30,"sign_num":5191},{"star_id":1660161,"name":"戚砚笛","head":"http://puui.qpic.cn/media_img/0/null1523864727/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51660161&tabId=3","rank":31,"sign_num":4799},{"star_id":94359,"name":"蒋欣","head":"http://puui.qpic.cn/media_img/0/_604_1533985472782502_20012/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10580&tabId=3","rank":32,"sign_num":3372},{"star_id":132354,"name":"安悦溪","head":"http://puui.qpic.cn/media_img/0/_481_1533985380993559_16631/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=17125&tabId=3","rank":33,"sign_num":3263},{"star_id":1603694,"name":"廖劲锋","head":"http://puui.qpic.cn/media_img/0/16036941553767974/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51603694&tabId=3","rank":34,"sign_num":3177},{"star_id":131182,"name":"宋伊人","head":"http://puui.qpic.cn/media_img/0/_247_1533985578705753_15490/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=16583&tabId=3","rank":35,"sign_num":2537},{"star_id":96510,"name":"王力宏","head":"http://puui.qpic.cn/media_img/0/965101581756798/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=10658&tabId=3","rank":36,"sign_num":1662},{"star_id":1594620,"name":"赵弈钦","head":"http://puui.qpic.cn/media_img/0/15946201577182963/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51594620&tabId=3","rank":37,"sign_num":1248},{"star_id":831206,"name":"应昊茗","head":"http://puui.qpic.cn/media_img/0/_271_1533985682423467_15490/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=50831206&tabId=3","rank":38,"sign_num":947},{"star_id":74260,"name":"张俪","head":"http://puui.qpic.cn/media_img/0/_276_1533985709949284_15490/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=14300&tabId=3","rank":39,"sign_num":852},{"star_id":1305836,"name":"钱蓓婷","head":"http://puui.qpic.cn/media_img/0/13058361539946229/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51305836&tabId=3","rank":40,"sign_num":834},{"star_id":1574532,"name":"高至霆","head":"http://puui.qpic.cn/media_img/0/15745321569835231/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51574532&tabId=3","rank":41,"sign_num":829},{"star_id":311548,"name":"周兴哲","head":"http://puui.qpic.cn/media_img/0/3115481530523506/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=50311548&tabId=3","rank":42,"sign_num":758},{"star_id":1655835,"name":"黄新淳","head":"http://puui.qpic.cn/media_img/0/16558351553512381/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51655835&tabId=3","rank":43,"sign_num":684},{"star_id":1484179,"name":"孙珍妮","head":"http://puui.qpic.cn/media_img/0/14841791553768284/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51484179&tabId=3","rank":44,"sign_num":650},{"star_id":1325760,"name":"魏哲鸣","head":"http://puui.qpic.cn/media_img/0/_591_1533985625824251_19992/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51325760&tabId=3","rank":45,"sign_num":305},{"star_id":1503848,"name":"丁翔南","head":"http://puui.qpic.cn/media_img/0/_97_1533985421014642_30589/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=17754&tabId=3","rank":46,"sign_num":255},{"star_id":8191786,"name":"陈思键","head":"http://puui.qpic.cn/media_img/0/81917861553562645/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=58191786&tabId=3","rank":47,"sign_num":161},{"star_id":94524,"name":"郑国霖","head":"http://puui.qpic.cn/media_img/0/_233_1533985739695334_21148/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=15155&tabId=3","rank":48,"sign_num":158},{"star_id":86390,"name":"郭雪芙","head":"http://puui.qpic.cn/media_img/0/_490_1533985442546157_16631/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=15289&tabId=3","rank":49,"sign_num":124},{"star_id":8238860,"name":"何楷成","head":"http://puui.qpic.cn/media_img/0/82388601553669901/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=58238860&tabId=3","rank":50,"sign_num":123},{"star_id":1318558,"name":"李鸿其","head":"http://puui.qpic.cn/media_img/0/13185581553512562/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=51318558&tabId=3","rank":51,"sign_num":111},{"star_id":8237587,"name":"吴承泽","head":"http://puui.qpic.cn/media_img/0/82375871553849322/0","jump_url":"txvideo://v.qq.com/FanCircleActivity?starid=58237587&tabId=3","rank":52,"sign_num":86}]
         */

        private int ret;
        private String msg;
        private List<DokiListBean> doki_list;

        public int getRet() {
            return ret;
        }

        public void setRet(int ret) {
            this.ret = ret;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public List<DokiListBean> getDokiList() {
            return doki_list;
        }

        public void setDokiList(List<DokiListBean> dokiList) {
            this.doki_list = dokiList;
        }

        public static class DokiListBean {
            /**
             * star_id : 222071
             * name : 迪丽热巴
             * head : http://puui.qpic.cn/vcolumn_pic/0/name_222071_1461t1508139208.jpg/0
             * jump_url : txvideo://v.qq.com/FanCircleActivity?starid=10327&tabId=3
             * rank : 1
             * sign_num : 397772
             */

            private int star_id;
            private String name;
            private String head;
            private String jump_url;
            private int rank;
            private int sign_num;

            public int getStarId() {
                return star_id;
            }

            public void setStarId(int starId) {
                this.star_id = starId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getHead() {
                return head;
            }

            public void setHead(String head) {
                this.head = head;
            }

            public String getJumpUrl() {
                return jump_url;
            }

            public void setJumpUrl(String jumpUrl) {
                this.jump_url = jumpUrl;
            }

            public int getRank() {
                return rank;
            }

            public void setRank(int rank) {
                this.rank = rank;
            }

            public int getSignNum() {
                return sign_num;
            }

            public void setSignNum(int signNum) {
                this.sign_num = signNum;
            }
        }
    }
}
