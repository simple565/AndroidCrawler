package com.maureen.androidcrawler.database;

import org.litepal.crud.LitePalSupport;

/**
 * Description: 决赛公演舞台实体类
 *
 * @author Maureen
 * Create 2020-08-29 14:50
 */
public class FinalShow extends LitePalSupport {
    private String allFinalShowsVotes;
    private int teamOneTotalVotes;
    private int teamTwoTotalVotes;
    private String dateTime;

    public String getAllFinalShowsVotes() {
        return allFinalShowsVotes;
    }

    public void setAllFinalShowsVotes(String allFinalShowsVotes) {
        this.allFinalShowsVotes = allFinalShowsVotes;
    }

    public int getTeamOneTotalVotes() {
        return teamOneTotalVotes;
    }

    public void setTeamOneTotalVotes(int teamOneTotalVotes) {
        this.teamOneTotalVotes = teamOneTotalVotes;
    }

    public int getTeamTwoTotalVotes() {
        return teamTwoTotalVotes;
    }

    public void setTeamTwoTotalVotes(int teamTwoTotalVotes) {
        this.teamTwoTotalVotes = teamTwoTotalVotes;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
