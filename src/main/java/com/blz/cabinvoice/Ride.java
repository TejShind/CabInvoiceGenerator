package com.blz.cabinvoice;
/**
 * We have declared the variables here
 * We will have the distance and time  and category for normal or premium
 */
public class Ride {
    public double distance;
    public int time;
    public String category;
    public double distancePrice;
    public double timePrice;

    public Ride(double distance, int time, String category )

    {
        this.distance = distance;
        this.time = time;

        switch (category) {
            case "premium":
                this.distancePrice = 15;
                this.timePrice = 2;
                break;
            case "normal":
                this.distancePrice = 10;
                this.timePrice = 1;
                break;
            default:
                this.distancePrice = 10;
                this.timePrice = 1;
        }
    }
            public double getDistance () {
            return distance;
        }
    public int getTime() {
        return time;
    }
}
