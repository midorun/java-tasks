package com.vorozheykin.Time;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int seconds){
        setTime(seconds);
    }

    public Time(int hours, int minutes, int seconds) {
        this(hours * 3600 + minutes * 60 + seconds);
    }

    public void setTime(int seconds) {
        if(seconds < 0) throw new IllegalArgumentException("Amount of second can't be less than zero");
        if(seconds > 86400) throw new IllegalArgumentException("Amount of second can't be more than 24 hours");
        else this.seconds = seconds;
        this.hours = seconds / 3600 % 24;
        this.minutes = seconds / 60 % 60;
    }

    public int getHour(){
        return hours;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getSeconds(){
        return seconds;
    }

    public static String getZero(int x) {
        return x < 10 ? (x < 0 ? "-0" : "0") + Math.abs(x) : Integer.toString(x);
    }

    @Override
    public String toString(){
        return getZero(hours) + ":" + getZero(minutes) + ":" + getZero(seconds % 60);
    }
}
