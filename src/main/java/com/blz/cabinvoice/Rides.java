package com.blz.cabinvoice;

public class Rides {
    public double distance;
    public int time;

    public Rides(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }

    public double getDistance() {
        return distance;
    }

    public int getTime() {
        return time;
    }
}
