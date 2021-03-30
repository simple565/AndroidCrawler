package com.maureen.androidcrawler.bean

/**
 * Description Doki人气值
 *
 * @author Maureen
 * Create 2020-03-24 21:25
 */
data class DokiEntity(
        val data: Data,
        val msg: String,
        val ret: Int
)

data class Data(
        val iErrCode: Int,
        val iNextPage: Int,
        val stAsembleTime: StAsembleTime,
        val vecStarInfo: List<VecStarInfo>
)

data class StAsembleTime(
        val iAssembleRestTime: Int,
        val iDoubleRestTime: Int,
        val iTimeType: Int,
        val lAsembleTarget: Int
)

data class VecStarInfo(
        val iRank: Int,
        val iSign: Int,
        val iState: Int,
        val iTop: Int,
        val lFinishTime: Int,
        val lScore: Int,
        val stAsembleData: StAsembleData,
        val stLink: StLink,
        val strHeader: String,
        val strName: String,
        val strStarId: String
)

data class StAsembleData(
        val lAsembleNumber: Int
)

data class StLink(
        val strStarPageLink: String,
        val strSupportLink: String
)