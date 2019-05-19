package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class ArrayTraverseTest {
    public static ArrayTraverse arrayTraverse;

    @BeforeClass
    public static void setUp() {
        arrayTraverse =new ArrayTraverse();
    }

    @AfterClass
    public static void tearDown() {
        arrayTraverse =null;
    }

    @Deprecated
    @Test
    public void testCheckEvenOrOdd_GivenArray_ShouldReturnStringArray() {
        assertEquals(new String[]{"even","odd","odd","even","even","odd"},
                arrayTraverse.checkEvenOrOdd(new int[]{Integer.MIN_VALUE,23,45,56,102,Integer.MAX_VALUE}));
    }

    @Deprecated
    @Test
    public void testCheckEvenOrOdd_GivenArrayWithNegativeValues_ShouldReturnStringArray() {
        assertEquals(new String[]{"even","odd","odd","odd","even","even","even"},
                arrayTraverse.checkEvenOrOdd(new int[]{Integer.MIN_VALUE,23,45,-37,-56,102,Integer.MAX_VALUE+1}));
    }

    @Deprecated
    @Test
    public void testCheckEvenOrOdd_GivenArrayAsNull_ShouldReturnErrorMessage() {
        assertEquals(new String[]{"array should not be null"}, arrayTraverse.checkEvenOrOdd(null));
    }


    @Test
    public void testRemovePrime_GivenArray_ShouldReturnStringWithoutPrimes() {
        assertEquals("105,45,102", arrayTraverse.removePrime(new int[]{2,3,105,45,102,Integer.MAX_VALUE}));
    }

    @Test
    public void testRemovePrime_GivenArrayAsNull_ShouldReturnErrorMessage() {
        assertEquals("array should not be null", arrayTraverse.removePrime(null));
    }

    @Deprecated
    @Test
    public void testReverseArray_GivenArrayOfIntegers_ShouldReturnReverseArray() {
        assertEquals(new String[]{"2147483647","102","23","-2147483648"},
                arrayTraverse.reverseArray(new int[]{Integer.MIN_VALUE,23,102,Integer.MAX_VALUE}));
    }

    @Deprecated
    @Test
    public void testReverseArray_GivenArrayWithNegativeIntegers_ShouldReturnReverseArray() {
        assertEquals(new String[]{"-102","2147483647","-37","-2147483648"},
                arrayTraverse.reverseArray(new int[]{Integer.MIN_VALUE,-37,Integer.MAX_VALUE,-102}));
    }

    @Deprecated
    @Test
    public void testReverseArray_GivenArrayOfIntegersAsNull_ShouldReturnErrorMessage() {
        assertEquals(new String[]{"array should not be null"}, arrayTraverse.reverseArray(null));
    }

}