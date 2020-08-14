package com.flavor.isthereopen;


import java.util.Date;

public class RestaurantOpenReview {
    Integer seq;
    Integer restaurantSeq;
    Integer userSeq;
    Integer openState; //0 close, 1 break time, 2 open, 3 미확인
    Date lastUpdate;

    public RestaurantOpenReview(Integer seq, Integer restaurantSeq, Integer userSeq, Integer openState) {
        this.seq = seq;
        this.restaurantSeq = restaurantSeq;
        this.userSeq = userSeq;
        this.openState = openState;
        lastUpdate = new Date();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getRestaurantSeq() {
        return restaurantSeq;
    }

    public void setRestaurantSeq(Integer restaurantSeq) {
        this.restaurantSeq = restaurantSeq;
    }

    public Integer getUserSeq() {
        return userSeq;
    }

    public void setUserSeq(Integer userSeq) {
        this.userSeq = userSeq;
    }

    public Integer getOpenState() {
        return openState;
    }

    public void setOpenState(Integer openState) {
        this.openState = openState;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }
}
