package com.flavor.isthereopen;


import java.util.ArrayList;
import java.util.List;

public class User {
    private Integer seq;
    private String id;
    private String name;
    List<Integer> patronBarList; // Bar seq list
    List<Integer> patronCafeList; // Cafe seq list
    List<Integer> patronRestaurantList; // Restaurant seq list

    public User(Integer seq, String id, String name) {
        this.seq = seq;
        this.id = id;
        this.name = name;
        patronBarList = new ArrayList<>();
        patronCafeList = new ArrayList<>();
        patronRestaurantList = new ArrayList<>();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getPatronBarList() {
        return patronBarList;
    }

    public void setPatronBarList(List<Integer> patronBarList) {
        this.patronBarList = patronBarList;
    }

    public List<Integer> getPatronCafeList() {
        return patronCafeList;
    }

    public void setPatronCafeList(List<Integer> patronCafeList) {
        this.patronCafeList = patronCafeList;
    }

    public List<Integer> getPatronRestaurantList() {
        return patronRestaurantList;
    }

    public void setPatronRestaurantList(List<Integer> patronRestaurantList) {
        this.patronRestaurantList = patronRestaurantList;
    }
}
