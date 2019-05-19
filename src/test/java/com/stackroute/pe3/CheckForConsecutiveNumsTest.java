package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckForConsecutiveNumsTest {
    private static CheckForConsecutiveNums checkForConsecutiveNums;

    @BeforeClass
    public static void setUp() {
        checkForConsecutiveNums = new CheckForConsecutiveNums();
    }

    @AfterClass
    public static void tearDown() {
        checkForConsecutiveNums = null;
    }

    @Test
    public void testConsecutiveNums_GivenStringWithIntegerValues_ShouldReturnSuccessMessage() {
        assertEquals("testConsecutiveNums() : ", "98,96,95,94,93 non consecutive numbers", checkForConsecutiveNums.consecutiveNums("98,96,95,94,93"));
    }

    @Test
    public void testConsecutiveNums_GivenStringWithIntegerValues_ShouldReturnFailureMessage() {
        assertEquals("testConsecutiveNums() : ", "54,53,52,51,50,49,48 are consecutive numbers", checkForConsecutiveNums.consecutiveNums("54,53,52,51,50,49,48"));

    }
    @Test
    public void testConsecutiveNums_GivenStringWithIntegerValuesWithDuplicates_ShouldReturnFailureMessage() {
        assertEquals("testConsecutiveNums() : ", "1,2,3,4,5,6,6 non consecutive numbers", checkForConsecutiveNums.consecutiveNums("1,2,3,4,5,6,6"));
    }

    @Test
    public void testConsecutiveNums_GivenStringWithIntegerValuesWithNonIntegers_ShouldReturnFailureMessage() {
        assertEquals("testConsecutiveNums() : ", "Enter only integer values!!!", checkForConsecutiveNums.consecutiveNums("1,2,3,some,5,6,7"));
    }

}
