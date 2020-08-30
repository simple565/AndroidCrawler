package com.maureen.androidcrawler.database;

import org.litepal.crud.LitePalSupport;

/**
 * Description: 参演姐姐实体类
 *
 * @author Maureen
 * Create 2020-08-29 14:50
 */
public class Sister extends LitePalSupport {
    private String name;
    private int belongTeam;
    private String allShows;
    private int votes;
    private int rankInTeam;
    private int dispersion;
    private String dateTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBelongTeam() {
        return belongTeam;
    }

    public void setBelongTeam(int belongTeam) {
        this.belongTeam = belongTeam;
    }

    public String getAllShows() {
        return allShows;
    }

    public void setAllShows(String allShows) {
        this.allShows = allShows;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public int getRankInTeam() {
        return rankInTeam;
    }

    public void setRankInTeam(int rankInTeam) {
        this.rankInTeam = rankInTeam;
    }

    public int getDispersion() {
        return dispersion;
    }

    public void setDispersion(int dispersion) {
        this.dispersion = dispersion;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
