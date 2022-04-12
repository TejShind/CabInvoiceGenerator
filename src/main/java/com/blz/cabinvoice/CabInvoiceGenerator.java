package com.blz.cabinvoice;

public class CabInvoiceGenerator {

    private final double COST_PER_KM = 10.0;
    private final int COST_PER_MINUTE = 1;
    private final double MIN_FARE = 5.0;

    public double calculateFare(double distance, int time) {
        double totalFare = (distance * COST_PER_KM) + (time * COST_PER_MINUTE);
        return Math.max(totalFare, MIN_FARE);
    }

    public double calculateFare(Ride[] rides) {
        double totalFare = 0.0;
        for (Ride ride : rides)
            totalFare = totalFare + this.calculateFare(ride.distance, ride.time);

        return totalFare;
    }

    public InvoiceSummery calculateTotalFare(Ride[] rides) {
        double totalFare = calculateFare(rides);
        return new InvoiceSummery(rides.length, totalFare);
    }

}
