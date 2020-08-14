package com.flavor.isthereopen;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cafe {
    private Integer seq;
    private String name;
    private String address;
    private String runningTime;
    private Double rate;
    private Integer currentState;
    private String photoURL;
    private Date lastUpdate;
    private List<CafeInfoReview> cafeInfoReviewList;
    private List<CafeOpenReview> cafeOpenReviewList;

    public Cafe(Integer seq, String name, String address, String runningTime) {
        this.seq = seq;
        this.name = name;
        this.address = address;
        this.runningTime = runningTime;
        rate = -1.0;
        currentState = 3;
        cafeInfoReviewList = new ArrayList<>();
        cafeOpenReviewList = new ArrayList<>();
    }

    public Cafe(Integer seq, String name, String address, String runningTime, String photoURL) {
        this.seq = seq;
        this.name = name;
        this.address = address;
        this.runningTime = runningTime;
        rate = -1.0;
        this.currentState = 3;
        this.photoURL = photoURL;
        cafeInfoReviewList = new ArrayList<>();
        cafeOpenReviewList = new ArrayList<>();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public void setCurrentState(Integer currentState) {
        this.currentState = currentState;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public Double getRate() {
        return rate;
    }

    public Integer getCurrentState() {
        return currentState;
    }

    public List<CafeInfoReview> getCafeInfoReviewList() {
        return cafeInfoReviewList;
    }

    public void setCafeInfoReviewList(List<CafeInfoReview> cafeInfoReviewList) {
        this.cafeInfoReviewList = cafeInfoReviewList;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<CafeOpenReview> getCafeOpenReviewList() {
        return cafeOpenReviewList;
    }

    public void setCafeOpenReviewList(List<CafeOpenReview> cafeOpenReviewList) {
        this.cafeOpenReviewList = cafeOpenReviewList;
    }
}
