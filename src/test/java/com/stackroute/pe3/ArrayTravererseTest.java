package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class ArrayTravererseTest {
    public static ArrayTravererse arrayTravererse;

    @BeforeClass
    public static void setUp() {
        arrayTravererse=new ArrayTravererse();
    }

    @AfterClass
    public static void tearDown() {
        arrayTravererse=null;
    }

    @Deprecated
    @Test
    public void testCheckEvenOrOdd() {
        assertEquals(new String[]{"even","odd","odd","even","even","odd"},arrayTravererse.checkEvenOrOdd(new int[]{Integer.MIN_VALUE,23,45,56,102,Integer.MAX_VALUE}));
        assertEquals(new String[]{"array should not be null"},arrayTravererse.checkEvenOrOdd(null));
        assertEquals(new String[]{"even","odd","odd","odd","even","even","even"},arrayTravererse.checkEvenOrOdd(new int[]{Integer.MIN_VALUE,23,45,-37,-56,102,Integer.MAX_VALUE+1}));
    }


    @Test
    public void testRemovePrime() {
        assertEquals("105,45,102",arrayTravererse.removePrime(new int[]{2,3,105,45,102,Integer.MAX_VALUE}));
        assertEquals("array should not be null",arrayTravererse.removePrime(null));
        assertEquals("45,102",arrayTravererse.removePrime(new int[]{Integer.MIN_VALUE,23,45,-37,-56,102,Integer.MAX_VALUE+1}));

    }

    @Deprecated
    @Test
    public void testReverseArray() {
        assertEquals(new String[]{"2147483647","102","23","-2147483648"},arrayTravererse.reverseArray(new int[]{Integer.MIN_VALUE,23,102,Integer.MAX_VALUE}));
        assertEquals(new String[]{"array should not be null"},arrayTravererse.reverseArray(null));
        assertEquals(new String[]{"-102","2147483647","-37","-2147483648"},arrayTravererse.reverseArray(new int[]{Integer.MIN_VALUE,-37,Integer.MAX_VALUE,-102}));

    }
}