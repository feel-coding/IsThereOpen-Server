package com.flavor.isthereopen;


public class CafeInfo {
    Integer seq;
    Integer openStyle; //0 잘 지키는 편, 1 보통, 2 들쭉날쭉 지맘대로
    Integer waitingTime;
    Integer price; //0 쌈, 1 보통, 2 비쌈
    Integer customerNum; // 0 적음, 1 보통, 2 많음
    Integer plugNum; // 0 적음, 1 보통, 2 많음
    Integer tableHeight; //0 낮음, 1 보통, 2 높음
    Integer longStay; // 0 가능, 1 보통, 2 눈치보임

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(Integer customerNum) {
        this.customerNum = customerNum;
    }

    public Integer getPlugNum() {
        return plugNum;
    }

    public void setPlugNum(Integer plugNum) {
        this.plugNum = plugNum;
    }

    public Integer getTableHeight() {
        return tableHeight;
    }

    public void setTableHeight(Integer tableHeight) {
        this.tableHeight = tableHeight;
    }

    public Integer getLongStay() {
        return longStay;
    }

    public void setLongStay(Integer longStay) {
        this.longStay = longStay;
    }
}
