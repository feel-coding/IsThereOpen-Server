package com.flavor.isthereopen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bar {
    private Integer seq;
    private String name;
    private String address;
    private String runningTime;
    private Double rate;
    private Integer currentState;
    private String photoURL;
    private Date lastUpdate;
    private List<BarOpenReview> barOpenReviewList;
    private List<BarInfoReview> barInfoReviewList;

    public Bar(Integer seq, String name, String address, String runningTime) {
        this.seq = seq;
        this.name = name;
        this.address = address;
        this.runningTime = runningTime;
        rate = -1.0;
        currentState = 3;
        barInfoReviewList = new ArrayList<>();
        barOpenReviewList = new ArrayList<>();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Integer getCurrentState() {
        return currentState;
    }

    public void setCurrentState(Integer currentState) {
        this.currentState = currentState;
    }

    public List<BarOpenReview> getBarOpenReviewList() {
        return barOpenReviewList;
    }

    public void setBarOpenReviewList(List<BarOpenReview> barOpenReviewList) {
        this.barOpenReviewList = barOpenReviewList;
    }

    public List<BarInfoReview> getBarInfoReviewList() {
        return barInfoReviewList;
    }

    public void setBarInfoReviewList(List<BarInfoReview> barInfoReviewList) {
        this.barInfoReviewList = barInfoReviewList;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
