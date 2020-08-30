package com.maureen.androidcrawler.database;

import org.litepal.crud.LitePalSupport;

/**
 * Description: 往期公演舞台实体类
 *
 * @author Maureen
 * Create 2020-08-29 14:50
 */
public class PastShow extends LitePalSupport {
    private String name;
    private String allPerformers;
    private int votes;
    private int teamOneScale;
    private int teamTwoScale;
    private int totalPerformersCount;
    private String dateTime;


    /*public PastShow(String name, String allPerformers, int totalPerformersCount, int teamOneScale, int teamTwoScale) {
        this.name = name;
        this.allPerformers = allPerformers;
        this.teamOneScale = teamOneScale;
        this.teamTwoScale = teamTwoScale;
        this.totalPerformersCount = totalPerformersCount;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAllPerformers() {
        return allPerformers;
    }

    public void setAllPerformers(String allPerformers) {
        this.allPerformers = allPerformers;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public int getTeamOneScale() {
        return teamOneScale;
    }

    public void setTeamOneScale(int teamOneScale) {
        this.teamOneScale = teamOneScale;
    }

    public int getTeamTwoScale() {
        return teamTwoScale;
    }

    public void setTeamTwoScale(int teamTwoScale) {
        this.teamTwoScale = teamTwoScale;
    }

    public int getTotalPerformersCount() {
        return totalPerformersCount;
    }

    public void setTotalPerformersCount(int totalPerformersCount) {
        this.totalPerformersCount = totalPerformersCount;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
