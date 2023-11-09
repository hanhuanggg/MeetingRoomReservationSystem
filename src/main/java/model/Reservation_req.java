package model;

import java.sql.Timestamp;

public class Reservation_req {
    private int r_id;
    private String userName;
    private String states;
    private int capacity;
    private int area;
    private String function;

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public Timestamp getReqTime() {
        return reqTime;
    }

    public void setReqTime(Timestamp reqTime) {
        this.reqTime = reqTime;
    }

    private Timestamp reqTime;
}
