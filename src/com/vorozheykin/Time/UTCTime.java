package com.vorozheykin.Time;

public class UTCTime extends Time {
    private int utcHours;
    private int utcMinutes;

    public UTCTime(int seconds, int utcHours) {
        super(seconds + utcHours * 3600);
        setTimeZone(utcHours);
    }

    public UTCTime(int hours, int minutes, int seconds, int utcHours, int utcMinutes) {
        super((hours + utcHours) % 24, minutes, seconds);
        setTimeZone(utcHours, utcMinutes);
    }

    public UTCTime setTimeZone(int utcHours) {
        if( utcHours < -12 || utcHours > 14) throw new IllegalArgumentException("Illegal UTC initiation");
        this.utcHours = utcHours;
        return this;
    }

    public UTCTime setTimeZone(int utcHours, int utcMinutes) {
        if( utcHours < -12 || utcHours > 14 || utcMinutes < 0) throw new IllegalArgumentException("Illegal UTC initiation");
        this.utcHours = utcHours;
        this.utcMinutes = utcMinutes % 60;
        return this;
    }

    public String  getTimeZone(){
        return "(" + getZero(utcHours) + ":" + getZero(utcMinutes) + " UTC)";
    }

    public int getUtcHours() {
        return utcHours;
    }

    public int getUtcMinutes() {
        return utcMinutes;
    }

    @Override
    public String toString() {
        return   super.toString() + "(" + getZero(utcHours) + ":" + getZero(utcMinutes) + " UTC)";
    }
}
