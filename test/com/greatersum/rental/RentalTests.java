package com.greatersum.rental;

import org.approvaltests.Approvals;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RentalTests {
    @Test
    public void MartinTest() {
        RentalInfo info = new RentalInfo();
        String actualResult = info.statement();
        Approvals.verify(actualResult);
    }
}
