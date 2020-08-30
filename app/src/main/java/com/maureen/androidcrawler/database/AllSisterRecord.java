package com.maureen.androidcrawler.database;

import org.litepal.crud.LitePalSupport;

/**
 * Description: 所有姐姐个人榜浪花记录实体类
 *
 * @author Maureen
 * Create 2020-08-29 14:50
 */
public class AllSisterRecord extends LitePalSupport {
    private String name;
    private int vote;
    private String dateTime;

    public AllSisterRecord(String name, int vote, String dateTime) {
        this.name = name;
        this.vote = vote;
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
