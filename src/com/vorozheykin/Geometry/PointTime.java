package com.vorozheykin.Geometry;

import com.vorozheykin.Time.Time;

public class PointTime extends Point {
    private Time time;

    public PointTime(int x, Time time){
        super(x);
        this.time = time;
    }

    public PointTime(int x, int y, Time time){
        super(x, y);
        this.time = time;
    }

    public PointTime(int x, int y, int z, Time time){
        super(x,y,z);
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public PointTime setTime(Time time) {
        this.time = time;
        return this;
    }

    @Override
    public String toString(){
        return super.toString() + " with time => " + time;
    }
}
