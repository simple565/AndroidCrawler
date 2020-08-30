package com.maureen.androidcrawler.bean;

import java.util.List;

/**
 * Description Doki人气值
 *
 * @author Maureen
 * Create 2020-03-24 21:25
 */
public class PopularityBean {
    /**
     * iErrCode : 0
     * strErrMsg :
     * stBackGoundScore : {"dwFanTuanId":0,"strStarTotalScore":"","ddwVideoView":0,"ddwSearchCnt":0,"ddwFollowCnt":0,"ddwWeChatIndex":0,"ddwPopularity":9646,"ddwStarReplyCnt":0,"ddwStarCommentCnt":0,"ddwStarFanPaiCnt":0,"ddwStarOnlineCnt":0,"ddwStarBefallCnt":0,"dwLastRank":0,"dwCurRank":0,"dfVideoScore":0,"dfSearchScore":0,"dfFollowScore":0,"dfWechatScore":0,"ddwStarCommentScore":0,"ddwStarFanPaiScore":0,"ddwStarOnlineScore":0,"ddwStarBefallScore":0,"dwLastInfluenceWeekRank":0,"dwCurInfluenceWeekRank":0}
     * stFanTuanLink : {"strRenqiLink":"txvideo://v.qq.com/FanCircleActivity?starid=10477&tabId=100226","strVideoLink":""}
     * vecUserInfo : [{"stPersonData":{"lUserid":578707990,"strNick":"lvic","strHead":"http://puui.qpic.cn/vshpic/0/LARCLlylW8bLpRjZc3bgHf5O1nnfwzviNGXqA8xmQuqAjZCh_0/0","strCity":"","strCountry":"","strSex":"","cFrom":0,"dwCreateTime":0,"dwStatus":0,"lGiftPoint":0},"lGiftPoint":3026,"strPersonalLink":"","stBadgeLevelInfo":{"iStarId":0,"iLevelId":0,"strBadgeIcon":"","strLevelIcon_h":"","strLevelIcon_v":"","iFansVal":0,"strLevelName":"","strLevelText":"","iSortKey":0,"iRankNameId":0,"strUrl":"","iFantuanId":0,"strLevelIcon_450_336":"","strLevelIcon_225_168":""},"iRank":0},{"stPersonData":{"lUserid":86459028,"strNick":"添美","strHead":"http://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTKepZsBOziaLbS1q61OKYMheG4S1gicKmybZ1vFZTdeYQE3ymhrQIvic0XkjFPK1doCgNeKUyIESaLnQ/132","strCity":"茂名","strCountry":"中国","strSex":"2","cFrom":0,"dwCreateTime":0,"dwStatus":0,"lGiftPoint":0},"lGiftPoint":1586,"strPersonalLink":"","stBadgeLevelInfo":{"iStarId":0,"iLevelId":0,"strBadgeIcon":"","strLevelIcon_h":"","strLevelIcon_v":"","iFansVal":0,"strLevelName":"","strLevelText":"","iSortKey":0,"iRankNameId":0,"strUrl":"","iFantuanId":0,"strLevelIcon_450_336":"","strLevelIcon_225_168":""},"iRank":0},{"stPersonData":{"lUserid":341923042,"strNick":"枫叶85","strHead":"http://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTJ5lymq6sPlG9wB90fp19Jn9w63dGODaicDRyOVmtb1bXCL6MQbiaHEFdJRzUenJpAibeZIpruptibpnA/132","strCity":"常州","strCountry":"中国","strSex":"2","cFrom":0,"dwCreateTime":0,"dwStatus":0,"lGiftPoint":0},"lGiftPoint":342,"strPersonalLink":"","stBadgeLevelInfo":{"iStarId":0,"iLevelId":0,"strBadgeIcon":"","strLevelIcon_h":"","strLevelIcon_v":"","iFansVal":0,"strLevelName":"","strLevelText":"","iSortKey":0,"iRankNameId":0,"strUrl":"","iFantuanId":0,"strLevelIcon_450_336":"","strLevelIcon_225_168":""},"iRank":0}]
     * dwFanTuanId : 10477
     * dwStarId : 72880
     * iStarType : 4
     * strName : 周渝民
     * strDesc :
     * strHeader : http://puui.qpic.cn/media_img/0/null1521629483/0
     * bAttention : 0
     * stFanTuanScoreInfo : {"dwFanTuanId":0,"strStarTotalScore":"9568.00","ddwVideoView":0,"ddwSearchCnt":0,"ddwFollowCnt":0,"ddwWeChatIndex":0,"ddwPopularity":9568,"ddwStarReplyCnt":0,"ddwStarCommentCnt":0,"ddwStarFanPaiCnt":0,"ddwStarOnlineCnt":0,"ddwStarBefallCnt":0,"dwLastRank":237,"dwCurRank":175,"dfVideoScore":0,"dfSearchScore":0,"dfFollowScore":0,"dfWechatScore":0,"ddwStarCommentScore":0,"ddwStarFanPaiScore":0,"ddwStarOnlineScore":0,"ddwStarBefallScore":0,"dwLastInfluenceWeekRank":0,"dwCurInfluenceWeekRank":0}
     * strHotShow : 烈火如歌
     * strDataKey : curtype=29&curid=72880
     * iPosition : 0
     * iTalentShow : 0
     * strNoRank :
     */

    private int iErrCode;
    private String strErrMsg;
    private StBackGoundScoreBean stBackGoundScore;
    private StFanTuanLinkBean stFanTuanLink;
    private int dwFanTuanId;
    private int dwStarId;
    private int iStarType;
    private String strName;
    private String strDesc;
    private String strHeader;
    private int bAttention;
    private StFanTuanScoreInfoBean stFanTuanScoreInfo;
    private String strHotShow;
    private String strDataKey;
    private int iPosition;
    private int iTalentShow;
    private String strNoRank;
    private List<VecUserInfoBean> vecUserInfo;

    public int getErrCode() {
        return iErrCode;
    }

    public void setErrCode(int iErrCode) {
        this.iErrCode = iErrCode;
    }

    public String getStrErrMsg() {
        return strErrMsg;
    }

    public void setStrErrMsg(String strErrMsg) {
        this.strErrMsg = strErrMsg;
    }

    public StBackGoundScoreBean getStBackGoundScore() {
        return stBackGoundScore;
    }

    public void setStBackGoundScore(StBackGoundScoreBean stBackGoundScore) {
        this.stBackGoundScore = stBackGoundScore;
    }

    public StFanTuanLinkBean getStFanTuanLink() {
        return stFanTuanLink;
    }

    public void setStFanTuanLink(StFanTuanLinkBean stFanTuanLink) {
        this.stFanTuanLink = stFanTuanLink;
    }

    public int getDwFanTuanId() {
        return dwFanTuanId;
    }

    public void setDwFanTuanId(int dwFanTuanId) {
        this.dwFanTuanId = dwFanTuanId;
    }

    public int getDwStarId() {
        return dwStarId;
    }

    public void setDwStarId(int dwStarId) {
        this.dwStarId = dwStarId;
    }

    public int getStarType() {
        return iStarType;
    }

    public void setStarType(int iStarType) {
        this.iStarType = iStarType;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrDesc() {
        return strDesc;
    }

    public void setStrDesc(String strDesc) {
        this.strDesc = strDesc;
    }

    public String getStrHeader() {
        return strHeader;
    }

    public void setStrHeader(String strHeader) {
        this.strHeader = strHeader;
    }

    public int getBAttention() {
        return bAttention;
    }

    public void setBAttention(int bAttention) {
        this.bAttention = bAttention;
    }

    public StFanTuanScoreInfoBean getStFanTuanScoreInfo() {
        return stFanTuanScoreInfo;
    }

    public void setStFanTuanScoreInfo(StFanTuanScoreInfoBean stFanTuanScoreInfo) {
        this.stFanTuanScoreInfo = stFanTuanScoreInfo;
    }

    public String getStrHotShow() {
        return strHotShow;
    }

    public void setStrHotShow(String strHotShow) {
        this.strHotShow = strHotShow;
    }

    public String getStrDataKey() {
        return strDataKey;
    }

    public void setStrDataKey(String strDataKey) {
        this.strDataKey = strDataKey;
    }

    public int getIPosition() {
        return iPosition;
    }

    public void setIPosition(int iPosition) {
        this.iPosition = iPosition;
    }

    public int getITalentShow() {
        return iTalentShow;
    }

    public void setITalentShow(int iTalentShow) {
        this.iTalentShow = iTalentShow;
    }

    public String getStrNoRank() {
        return strNoRank;
    }

    public void setStrNoRank(String strNoRank) {
        this.strNoRank = strNoRank;
    }

    public List<VecUserInfoBean> getVecUserInfo() {
        return vecUserInfo;
    }

    public void setVecUserInfo(List<VecUserInfoBean> vecUserInfo) {
        this.vecUserInfo = vecUserInfo;
    }

    public static class StBackGoundScoreBean {
        /**
         * dwFanTuanId : 0
         * strStarTotalScore :
         * ddwVideoView : 0
         * ddwSearchCnt : 0
         * ddwFollowCnt : 0
         * ddwWeChatIndex : 0
         * ddwPopularity : 9646
         * ddwStarReplyCnt : 0
         * ddwStarCommentCnt : 0
         * ddwStarFanPaiCnt : 0
         * ddwStarOnlineCnt : 0
         * ddwStarBefallCnt : 0
         * dwLastRank : 0
         * dwCurRank : 0
         * dfVideoScore : 0
         * dfSearchScore : 0
         * dfFollowScore : 0
         * dfWechatScore : 0
         * ddwStarCommentScore : 0
         * ddwStarFanPaiScore : 0
         * ddwStarOnlineScore : 0
         * ddwStarBefallScore : 0
         * dwLastInfluenceWeekRank : 0
         * dwCurInfluenceWeekRank : 0
         */

        private int dwFanTuanId;
        private String strStarTotalScore;
        private int ddwVideoView;
        private int ddwSearchCnt;
        private int ddwFollowCnt;
        private int ddwWeChatIndex;
        private int ddwPopularity;
        private int ddwStarReplyCnt;
        private int ddwStarCommentCnt;
        private int ddwStarFanPaiCnt;
        private int ddwStarOnlineCnt;
        private int ddwStarBefallCnt;
        private int dwLastRank;
        private int dwCurRank;
        private int dfVideoScore;
        private int dfSearchScore;
        private int dfFollowScore;
        private int dfWechatScore;
        private int ddwStarCommentScore;
        private int ddwStarFanPaiScore;
        private int ddwStarOnlineScore;
        private int ddwStarBefallScore;
        private int dwLastInfluenceWeekRank;
        private int dwCurInfluenceWeekRank;

        public int getDwFanTuanId() {
            return dwFanTuanId;
        }

        public void setDwFanTuanId(int dwFanTuanId) {
            this.dwFanTuanId = dwFanTuanId;
        }

        public String getStrStarTotalScore() {
            return strStarTotalScore;
        }

        public void setStrStarTotalScore(String strStarTotalScore) {
            this.strStarTotalScore = strStarTotalScore;
        }

        public int getDdwVideoView() {
            return ddwVideoView;
        }

        public void setDdwVideoView(int ddwVideoView) {
            this.ddwVideoView = ddwVideoView;
        }

        public int getDdwSearchCnt() {
            return ddwSearchCnt;
        }

        public void setDdwSearchCnt(int ddwSearchCnt) {
            this.ddwSearchCnt = ddwSearchCnt;
        }

        public int getDdwFollowCnt() {
            return ddwFollowCnt;
        }

        public void setDdwFollowCnt(int ddwFollowCnt) {
            this.ddwFollowCnt = ddwFollowCnt;
        }

        public int getDdwWeChatIndex() {
            return ddwWeChatIndex;
        }

        public void setDdwWeChatIndex(int ddwWeChatIndex) {
            this.ddwWeChatIndex = ddwWeChatIndex;
        }

        public int getDdwPopularity() {
            return ddwPopularity;
        }

        public void setDdwPopularity(int ddwPopularity) {
            this.ddwPopularity = ddwPopularity;
        }

        public int getDdwStarReplyCnt() {
            return ddwStarReplyCnt;
        }

        public void setDdwStarReplyCnt(int ddwStarReplyCnt) {
            this.ddwStarReplyCnt = ddwStarReplyCnt;
        }

        public int getDdwStarCommentCnt() {
            return ddwStarCommentCnt;
        }

        public void setDdwStarCommentCnt(int ddwStarCommentCnt) {
            this.ddwStarCommentCnt = ddwStarCommentCnt;
        }

        public int getDdwStarFanPaiCnt() {
            return ddwStarFanPaiCnt;
        }

        public void setDdwStarFanPaiCnt(int ddwStarFanPaiCnt) {
            this.ddwStarFanPaiCnt = ddwStarFanPaiCnt;
        }

        public int getDdwStarOnlineCnt() {
            return ddwStarOnlineCnt;
        }

        public void setDdwStarOnlineCnt(int ddwStarOnlineCnt) {
            this.ddwStarOnlineCnt = ddwStarOnlineCnt;
        }

        public int getDdwStarBefallCnt() {
            return ddwStarBefallCnt;
        }

        public void setDdwStarBefallCnt(int ddwStarBefallCnt) {
            this.ddwStarBefallCnt = ddwStarBefallCnt;
        }

        public int getDwLastRank() {
            return dwLastRank;
        }

        public void setDwLastRank(int dwLastRank) {
            this.dwLastRank = dwLastRank;
        }

        public int getDwCurRank() {
            return dwCurRank;
        }

        public void setDwCurRank(int dwCurRank) {
            this.dwCurRank = dwCurRank;
        }

        public int getDfVideoScore() {
            return dfVideoScore;
        }

        public void setDfVideoScore(int dfVideoScore) {
            this.dfVideoScore = dfVideoScore;
        }

        public int getDfSearchScore() {
            return dfSearchScore;
        }

        public void setDfSearchScore(int dfSearchScore) {
            this.dfSearchScore = dfSearchScore;
        }

        public int getDfFollowScore() {
            return dfFollowScore;
        }

        public void setDfFollowScore(int dfFollowScore) {
            this.dfFollowScore = dfFollowScore;
        }

        public int getDfWechatScore() {
            return dfWechatScore;
        }

        public void setDfWechatScore(int dfWechatScore) {
            this.dfWechatScore = dfWechatScore;
        }

        public int getDdwStarCommentScore() {
            return ddwStarCommentScore;
        }

        public void setDdwStarCommentScore(int ddwStarCommentScore) {
            this.ddwStarCommentScore = ddwStarCommentScore;
        }

        public int getDdwStarFanPaiScore() {
            return ddwStarFanPaiScore;
        }

        public void setDdwStarFanPaiScore(int ddwStarFanPaiScore) {
            this.ddwStarFanPaiScore = ddwStarFanPaiScore;
        }

        public int getDdwStarOnlineScore() {
            return ddwStarOnlineScore;
        }

        public void setDdwStarOnlineScore(int ddwStarOnlineScore) {
            this.ddwStarOnlineScore = ddwStarOnlineScore;
        }

        public int getDdwStarBefallScore() {
            return ddwStarBefallScore;
        }

        public void setDdwStarBefallScore(int ddwStarBefallScore) {
            this.ddwStarBefallScore = ddwStarBefallScore;
        }

        public int getDwLastInfluenceWeekRank() {
            return dwLastInfluenceWeekRank;
        }

        public void setDwLastInfluenceWeekRank(int dwLastInfluenceWeekRank) {
            this.dwLastInfluenceWeekRank = dwLastInfluenceWeekRank;
        }

        public int getDwCurInfluenceWeekRank() {
            return dwCurInfluenceWeekRank;
        }

        public void setDwCurInfluenceWeekRank(int dwCurInfluenceWeekRank) {
            this.dwCurInfluenceWeekRank = dwCurInfluenceWeekRank;
        }
    }

    public static class StFanTuanLinkBean {
        /**
         * strRenqiLink : txvideo://v.qq.com/FanCircleActivity?starid=10477&tabId=100226
         * strVideoLink :
         */

        private String strRenqiLink;
        private String strVideoLink;

        public String getStrRenqiLink() {
            return strRenqiLink;
        }

        public void setStrRenqiLink(String strRenqiLink) {
            this.strRenqiLink = strRenqiLink;
        }

        public String getStrVideoLink() {
            return strVideoLink;
        }

        public void setStrVideoLink(String strVideoLink) {
            this.strVideoLink = strVideoLink;
        }
    }

    public static class StFanTuanScoreInfoBean {
        /**
         * dwFanTuanId : 0
         * strStarTotalScore : 9568.00
         * ddwVideoView : 0
         * ddwSearchCnt : 0
         * ddwFollowCnt : 0
         * ddwWeChatIndex : 0
         * ddwPopularity : 9568
         * ddwStarReplyCnt : 0
         * ddwStarCommentCnt : 0
         * ddwStarFanPaiCnt : 0
         * ddwStarOnlineCnt : 0
         * ddwStarBefallCnt : 0
         * dwLastRank : 237
         * dwCurRank : 175
         * dfVideoScore : 0
         * dfSearchScore : 0
         * dfFollowScore : 0
         * dfWechatScore : 0
         * ddwStarCommentScore : 0
         * ddwStarFanPaiScore : 0
         * ddwStarOnlineScore : 0
         * ddwStarBefallScore : 0
         * dwLastInfluenceWeekRank : 0
         * dwCurInfluenceWeekRank : 0
         */

        private int dwFanTuanId;
        private String strStarTotalScore;
        private int ddwVideoView;
        private int ddwSearchCnt;
        private int ddwFollowCnt;
        private int ddwWeChatIndex;
        private int ddwPopularity;
        private int ddwStarReplyCnt;
        private int ddwStarCommentCnt;
        private int ddwStarFanPaiCnt;
        private int ddwStarOnlineCnt;
        private int ddwStarBefallCnt;
        private int dwLastRank;
        private int dwCurRank;
        private int dfVideoScore;
        private int dfSearchScore;
        private int dfFollowScore;
        private int dfWechatScore;
        private int ddwStarCommentScore;
        private int ddwStarFanPaiScore;
        private int ddwStarOnlineScore;
        private int ddwStarBefallScore;
        private int dwLastInfluenceWeekRank;
        private int dwCurInfluenceWeekRank;

        public int getDwFanTuanId() {
            return dwFanTuanId;
        }

        public void setDwFanTuanId(int dwFanTuanId) {
            this.dwFanTuanId = dwFanTuanId;
        }

        public String getStrStarTotalScore() {
            return strStarTotalScore;
        }

        public void setStrStarTotalScore(String strStarTotalScore) {
            this.strStarTotalScore = strStarTotalScore;
        }

        public int getDdwVideoView() {
            return ddwVideoView;
        }

        public void setDdwVideoView(int ddwVideoView) {
            this.ddwVideoView = ddwVideoView;
        }

        public int getDdwSearchCnt() {
            return ddwSearchCnt;
        }

        public void setDdwSearchCnt(int ddwSearchCnt) {
            this.ddwSearchCnt = ddwSearchCnt;
        }

        public int getDdwFollowCnt() {
            return ddwFollowCnt;
        }

        public void setDdwFollowCnt(int ddwFollowCnt) {
            this.ddwFollowCnt = ddwFollowCnt;
        }

        public int getDdwWeChatIndex() {
            return ddwWeChatIndex;
        }

        public void setDdwWeChatIndex(int ddwWeChatIndex) {
            this.ddwWeChatIndex = ddwWeChatIndex;
        }

        public int getDdwPopularity() {
            return ddwPopularity;
        }

        public void setDdwPopularity(int ddwPopularity) {
            this.ddwPopularity = ddwPopularity;
        }

        public int getDdwStarReplyCnt() {
            return ddwStarReplyCnt;
        }

        public void setDdwStarReplyCnt(int ddwStarReplyCnt) {
            this.ddwStarReplyCnt = ddwStarReplyCnt;
        }

        public int getDdwStarCommentCnt() {
            return ddwStarCommentCnt;
        }

        public void setDdwStarCommentCnt(int ddwStarCommentCnt) {
            this.ddwStarCommentCnt = ddwStarCommentCnt;
        }

        public int getDdwStarFanPaiCnt() {
            return ddwStarFanPaiCnt;
        }

        public void setDdwStarFanPaiCnt(int ddwStarFanPaiCnt) {
            this.ddwStarFanPaiCnt = ddwStarFanPaiCnt;
        }

        public int getDdwStarOnlineCnt() {
            return ddwStarOnlineCnt;
        }

        public void setDdwStarOnlineCnt(int ddwStarOnlineCnt) {
            this.ddwStarOnlineCnt = ddwStarOnlineCnt;
        }

        public int getDdwStarBefallCnt() {
            return ddwStarBefallCnt;
        }

        public void setDdwStarBefallCnt(int ddwStarBefallCnt) {
            this.ddwStarBefallCnt = ddwStarBefallCnt;
        }

        public int getDwLastRank() {
            return dwLastRank;
        }

        public void setDwLastRank(int dwLastRank) {
            this.dwLastRank = dwLastRank;
        }

        public int getDwCurRank() {
            return dwCurRank;
        }

        public void setDwCurRank(int dwCurRank) {
            this.dwCurRank = dwCurRank;
        }

        public int getDfVideoScore() {
            return dfVideoScore;
        }

        public void setDfVideoScore(int dfVideoScore) {
            this.dfVideoScore = dfVideoScore;
        }

        public int getDfSearchScore() {
            return dfSearchScore;
        }

        public void setDfSearchScore(int dfSearchScore) {
            this.dfSearchScore = dfSearchScore;
        }

        public int getDfFollowScore() {
            return dfFollowScore;
        }

        public void setDfFollowScore(int dfFollowScore) {
            this.dfFollowScore = dfFollowScore;
        }

        public int getDfWechatScore() {
            return dfWechatScore;
        }

        public void setDfWechatScore(int dfWechatScore) {
            this.dfWechatScore = dfWechatScore;
        }

        public int getDdwStarCommentScore() {
            return ddwStarCommentScore;
        }

        public void setDdwStarCommentScore(int ddwStarCommentScore) {
            this.ddwStarCommentScore = ddwStarCommentScore;
        }

        public int getDdwStarFanPaiScore() {
            return ddwStarFanPaiScore;
        }

        public void setDdwStarFanPaiScore(int ddwStarFanPaiScore) {
            this.ddwStarFanPaiScore = ddwStarFanPaiScore;
        }

        public int getDdwStarOnlineScore() {
            return ddwStarOnlineScore;
        }

        public void setDdwStarOnlineScore(int ddwStarOnlineScore) {
            this.ddwStarOnlineScore = ddwStarOnlineScore;
        }

        public int getDdwStarBefallScore() {
            return ddwStarBefallScore;
        }

        public void setDdwStarBefallScore(int ddwStarBefallScore) {
            this.ddwStarBefallScore = ddwStarBefallScore;
        }

        public int getDwLastInfluenceWeekRank() {
            return dwLastInfluenceWeekRank;
        }

        public void setDwLastInfluenceWeekRank(int dwLastInfluenceWeekRank) {
            this.dwLastInfluenceWeekRank = dwLastInfluenceWeekRank;
        }

        public int getDwCurInfluenceWeekRank() {
            return dwCurInfluenceWeekRank;
        }

        public void setDwCurInfluenceWeekRank(int dwCurInfluenceWeekRank) {
            this.dwCurInfluenceWeekRank = dwCurInfluenceWeekRank;
        }
    }

    public static class VecUserInfoBean {
        /**
         * stPersonData : {"lUserid":578707990,"strNick":"lvic","strHead":"http://puui.qpic.cn/vshpic/0/LARCLlylW8bLpRjZc3bgHf5O1nnfwzviNGXqA8xmQuqAjZCh_0/0","strCity":"","strCountry":"","strSex":"","cFrom":0,"dwCreateTime":0,"dwStatus":0,"lGiftPoint":0}
         * lGiftPoint : 3026
         * strPersonalLink :
         * stBadgeLevelInfo : {"iStarId":0,"iLevelId":0,"strBadgeIcon":"","strLevelIcon_h":"","strLevelIcon_v":"","iFansVal":0,"strLevelName":"","strLevelText":"","iSortKey":0,"iRankNameId":0,"strUrl":"","iFantuanId":0,"strLevelIcon_450_336":"","strLevelIcon_225_168":""}
         * iRank : 0
         */

        private StPersonDataBean stPersonData;
        private int lGiftPoint;
        private String strPersonalLink;
        private StBadgeLevelInfoBean stBadgeLevelInfo;
        private int iRank;

        public StPersonDataBean getStPersonData() {
            return stPersonData;
        }

        public void setStPersonData(StPersonDataBean stPersonData) {
            this.stPersonData = stPersonData;
        }

        public int getLGiftPoint() {
            return lGiftPoint;
        }

        public void setLGiftPoint(int lGiftPoint) {
            this.lGiftPoint = lGiftPoint;
        }

        public String getStrPersonalLink() {
            return strPersonalLink;
        }

        public void setStrPersonalLink(String strPersonalLink) {
            this.strPersonalLink = strPersonalLink;
        }

        public StBadgeLevelInfoBean getStBadgeLevelInfo() {
            return stBadgeLevelInfo;
        }

        public void setStBadgeLevelInfo(StBadgeLevelInfoBean stBadgeLevelInfo) {
            this.stBadgeLevelInfo = stBadgeLevelInfo;
        }

        public int getIRank() {
            return iRank;
        }

        public void setIRank(int iRank) {
            this.iRank = iRank;
        }

        public static class StPersonDataBean {
            /**
             * lUserid : 578707990
             * strNick : lvic
             * strHead : http://puui.qpic.cn/vshpic/0/LARCLlylW8bLpRjZc3bgHf5O1nnfwzviNGXqA8xmQuqAjZCh_0/0
             * strCity :
             * strCountry :
             * strSex :
             * cFrom : 0
             * dwCreateTime : 0
             * dwStatus : 0
             * lGiftPoint : 0
             */

            private int lUserid;
            private String strNick;
            private String strHead;
            private String strCity;
            private String strCountry;
            private String strSex;
            private int cFrom;
            private int dwCreateTime;
            private int dwStatus;
            private int lGiftPoint;

            public int getLUserid() {
                return lUserid;
            }

            public void setLUserid(int lUserid) {
                this.lUserid = lUserid;
            }

            public String getStrNick() {
                return strNick;
            }

            public void setStrNick(String strNick) {
                this.strNick = strNick;
            }

            public String getStrHead() {
                return strHead;
            }

            public void setStrHead(String strHead) {
                this.strHead = strHead;
            }

            public String getStrCity() {
                return strCity;
            }

            public void setStrCity(String strCity) {
                this.strCity = strCity;
            }

            public String getStrCountry() {
                return strCountry;
            }

            public void setStrCountry(String strCountry) {
                this.strCountry = strCountry;
            }

            public String getStrSex() {
                return strSex;
            }

            public void setStrSex(String strSex) {
                this.strSex = strSex;
            }

            public int getCFrom() {
                return cFrom;
            }

            public void setCFrom(int cFrom) {
                this.cFrom = cFrom;
            }

            public int getDwCreateTime() {
                return dwCreateTime;
            }

            public void setDwCreateTime(int dwCreateTime) {
                this.dwCreateTime = dwCreateTime;
            }

            public int getDwStatus() {
                return dwStatus;
            }

            public void setDwStatus(int dwStatus) {
                this.dwStatus = dwStatus;
            }

            public int getLGiftPoint() {
                return lGiftPoint;
            }

            public void setLGiftPoint(int lGiftPoint) {
                this.lGiftPoint = lGiftPoint;
            }
        }

        public static class StBadgeLevelInfoBean {
            /**
             * iStarId : 0
             * iLevelId : 0
             * strBadgeIcon :
             * strLevelIcon_h :
             * strLevelIcon_v :
             * iFansVal : 0
             * strLevelName :
             * strLevelText :
             * iSortKey : 0
             * iRankNameId : 0
             * strUrl :
             * iFantuanId : 0
             * strLevelIcon_450_336 :
             * strLevelIcon_225_168 :
             */

            private int iStarId;
            private int iLevelId;
            private String strBadgeIcon;
            private String strLevelIcon_h;
            private String strLevelIcon_v;
            private int iFansVal;
            private String strLevelName;
            private String strLevelText;
            private int iSortKey;
            private int iRankNameId;
            private String strUrl;
            private int iFantuanId;
            private String strLevelIcon_450_336;
            private String strLevelIcon_225_168;

            public int getIStarId() {
                return iStarId;
            }

            public void setIStarId(int iStarId) {
                this.iStarId = iStarId;
            }

            public int getILevelId() {
                return iLevelId;
            }

            public void setILevelId(int iLevelId) {
                this.iLevelId = iLevelId;
            }

            public String getStrBadgeIcon() {
                return strBadgeIcon;
            }

            public void setStrBadgeIcon(String strBadgeIcon) {
                this.strBadgeIcon = strBadgeIcon;
            }

            public String getStrLevelIcon_h() {
                return strLevelIcon_h;
            }

            public void setStrLevelIcon_h(String strLevelIcon_h) {
                this.strLevelIcon_h = strLevelIcon_h;
            }

            public String getStrLevelIcon_v() {
                return strLevelIcon_v;
            }

            public void setStrLevelIcon_v(String strLevelIcon_v) {
                this.strLevelIcon_v = strLevelIcon_v;
            }

            public int getIFansVal() {
                return iFansVal;
            }

            public void setIFansVal(int iFansVal) {
                this.iFansVal = iFansVal;
            }

            public String getStrLevelName() {
                return strLevelName;
            }

            public void setStrLevelName(String strLevelName) {
                this.strLevelName = strLevelName;
            }

            public String getStrLevelText() {
                return strLevelText;
            }

            public void setStrLevelText(String strLevelText) {
                this.strLevelText = strLevelText;
            }

            public int getISortKey() {
                return iSortKey;
            }

            public void setISortKey(int iSortKey) {
                this.iSortKey = iSortKey;
            }

            public int getIRankNameId() {
                return iRankNameId;
            }

            public void setIRankNameId(int iRankNameId) {
                this.iRankNameId = iRankNameId;
            }

            public String getStrUrl() {
                return strUrl;
            }

            public void setStrUrl(String strUrl) {
                this.strUrl = strUrl;
            }

            public int getIFantuanId() {
                return iFantuanId;
            }

            public void setIFantuanId(int iFantuanId) {
                this.iFantuanId = iFantuanId;
            }

            public String getStrLevelIcon_450_336() {
                return strLevelIcon_450_336;
            }

            public void setStrLevelIcon_450_336(String strLevelIcon_450_336) {
                this.strLevelIcon_450_336 = strLevelIcon_450_336;
            }

            public String getStrLevelIcon_225_168() {
                return strLevelIcon_225_168;
            }

            public void setStrLevelIcon_225_168(String strLevelIcon_225_168) {
                this.strLevelIcon_225_168 = strLevelIcon_225_168;
            }
        }
    }
}



