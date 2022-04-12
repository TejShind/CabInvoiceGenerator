package com.blz.cabinvoice;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceServiceTest {
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        double totalFare = cabInvoiceGenerator.calculateFare(5.0, 4);
        Assert.assertEquals(54, totalFare, 0);
    }

    @Test
    public void givenDistanceAndTime_ShouldReturnMinFare() {
        double totalFare = cabInvoiceGenerator.calculateFare(0.1, 2);
        Assert.assertEquals(5, totalFare, 0);
    }


    @Test
    public void givenMultipleRides_ShouldCalculateAggregateTotal() {
        Ride[] rides = {new Ride(1.0, 5),
                new Ride(0.2, 2)};
        double totalFare = cabInvoiceGenerator.calculateFare(rides);
        Assert.assertEquals(20, totalFare, 0);
    }

    @Test
    public void givenRides_ShouldReturnInvoiceSummery() {
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(5.0, 10)};
        InvoiceSummery invoiceSummery = cabInvoiceGenerator.calculateTotalFare(rides);
        InvoiceSummery expectedInvoice = new InvoiceSummery(2, 85);
        Assert.assertEquals(expectedInvoice, invoiceSummery);
    }
}