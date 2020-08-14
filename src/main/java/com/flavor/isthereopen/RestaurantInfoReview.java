package com.flavor.isthereopen;


public class RestaurantInfoReview {
    Integer seq;
    Integer restaurantSeq;
    Integer openStyle; //0 잘 지키는 편, 1 보통, 2 들쭉날쭉 지맘대로
    Integer waitingTime; // 0 짧은 편, 1 보통, 2 긴편
    Integer cleanness; //0 깨끗함, 1 보통, 2 더러움
    Integer price; //0 쌈, 1 보통, 2 비쌈
    Integer takeOut; // 0 불가능, 1 가능
    Integer eatAlone; // 0 가능, 1 보통, 2 눈치보임

    public RestaurantInfoReview(Integer seq, Integer restaurantSeq, Integer openStyle, Integer waitingTime, Integer cleanness, Integer price, Integer takeOut, Integer eatAlone) {
        this.seq = seq;
        this.restaurantSeq = restaurantSeq;
        this.openStyle = openStyle;
        this.waitingTime = waitingTime;
        this.cleanness = cleanness;
        this.price = price;
        this.takeOut = takeOut;
        this.eatAlone = eatAlone;
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

    public Integer getOpenStyle() {
        return openStyle;
    }

    public void setOpenStyle(Integer openStyle) {
        this.openStyle = openStyle;
    }

    public Integer getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(Integer waitingTime) {
        this.waitingTime = waitingTime;
    }

    public Integer getCleanness() {
        return cleanness;
    }

    public void setCleanness(Integer cleanness) {
        this.cleanness = cleanness;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTakeOut() {
        return takeOut;
    }

    public void setTakeOut(Integer takeOut) {
        this.takeOut = takeOut;
    }

    public Integer getEatAlone() {
        return eatAlone;
    }

    public void setEatAlone(Integer eatAlone) {
        this.eatAlone = eatAlone;
    }
}
