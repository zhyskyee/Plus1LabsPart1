package com.example.backendtime;

import java.util.Date;

public class TimeModel {

    private int hours;
    private int mins;
    private int secs;
    private int month;
    private int year;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    private int day;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMins() {
        return mins;
    }

    public void setMins(int mins) {
        this.mins = mins;
    }

    public int getSecs() {
        return secs;
    }

    public void setSecs(int secs) {
        this.secs = secs;
    }
}
