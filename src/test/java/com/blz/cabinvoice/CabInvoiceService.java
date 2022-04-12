package com.blz.cabinvoice;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceService {

    @Test
   public void givenDistanceAndTime_ShouldReturnTotalFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double TotalFare = cabInvoiceGenerator.calculateFare(5.0, 4);
        Assert.assertEquals(54, TotalFare, 0);
    }

    @Test
   public void givenDistanceAndTime_ShouldReturnMinFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double TotalFare = cabInvoiceGenerator.calculateFare(0.1, 2);
        Assert.assertEquals(5, TotalFare, 0);
    }


}

