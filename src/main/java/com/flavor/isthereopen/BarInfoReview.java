package com.flavor.isthereopen;


public class BarInfoReview {
    Integer seq;
    Integer barSeq;
    Integer openStyle; //0 잘 지키는 편, 1 보통, 2 들쭉날쭉 지맘대로
    Integer cleanness;
    Integer mood; //0 조용, 1 보통, 2 시끄러움
    Integer mainAlcohol; // 0 소주, 1 맥주, 2 막걸리, 3 와인, 4 보드카
    Integer price; //0 쌈, 1 보통, 2 비쌈

    public BarInfoReview(Integer seq, Integer barSeq, Integer openStyle, Integer cleanness, Integer mood, Integer mainAlcohol, Integer price) {
        this.seq = seq;
        this.barSeq = barSeq;
        this.openStyle = openStyle;
        this.cleanness = cleanness;
        this.mood = mood;
        this.mainAlcohol = mainAlcohol;
        this.price = price;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getBarSeq() {
        return barSeq;
    }

    public void setBarSeq(Integer barSeq) {
        this.barSeq = barSeq;
    }

    public Integer getOpenStyle() {
        return openStyle;
    }

    public void setOpenStyle(Integer openStyle) {
        this.openStyle = openStyle;
    }

    public Integer getCleanness() {
        return cleanness;
    }

    public void setCleanness(Integer cleanness) {
        this.cleanness = cleanness;
    }

    public Integer getMood() {
        return mood;
    }

    public void setMood(Integer mood) {
        this.mood = mood;
    }

    public Integer getMainAlcohol() {
        return mainAlcohol;
    }

    public void setMainAlcohol(Integer mainAlcohol) {
        this.mainAlcohol = mainAlcohol;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
