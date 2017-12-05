package com.greatersum.rental;

import org.approvaltests.Approvals;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RentalTests {
    @Test
    public void MartinTest() {
        Customer customer = new Customer("martin", Arrays.asList(new MovieRental("F001", 3), new MovieRental("F002", 1)));
        RentalInfo info = new RentalInfo();
        String actualResult = info.statement(customer);
        Approvals.verify(actualResult);
    }
}
