package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class StringArrayOperationsTest {
    public static StringArrayOperations stringArrayOperations;
    @BeforeClass
    public static void setUp() {
        stringArrayOperations=new StringArrayOperations();
    }

    @AfterClass
    public static void tearDown(){
        stringArrayOperations=null;
    }

    @Test
    public void testCompareArrays() {
        assertEquals("arrays are similar",stringArrayOperations.compareArrays(new String[]{"hello","hii","some","some","aa"},new String[]{"hello","hii","some","some","aa"}));
        assertEquals("array should not be null",stringArrayOperations.compareArrays(null,new String[]{"hello","hii","some","some","aa"}));
        assertEquals("array should not be null",stringArrayOperations.compareArrays(new String[]{"hello","hii","some","some","aa"},null));
    }

    @Deprecated
    @Test
    public void testRemoveDuplicateElements() {
        assertEquals(new String[]{"hello","hii","some"},stringArrayOperations.removeDuplicateElements(new String[]{"hello","hii","some","hello"}));
        assertEquals(new String[]{"array should not be null"},stringArrayOperations.removeDuplicateElements(null));
    }

    @Deprecated
    @Test
    public void testAppendFirstElementToSecondArrayLastElement() {
        assertEquals(new String[]{"hello","hii","some","some","aa","hello"},stringArrayOperations.appendFirstElementToSecondArrayLastElement(new String[]{"hello","hii","some","some","aa"},new String[]{"hello","hii","some","some","aa"}));
        assertEquals(new String[]{"array should not be null"},stringArrayOperations.appendFirstElementToSecondArrayLastElement(null,new String[]{"hello","hii","some","some","aa"}));
        assertEquals(new String[]{"array should not be null"},stringArrayOperations.appendFirstElementToSecondArrayLastElement(new String[]{"hello","hii","some","some","aa"},null));
    }

    @Deprecated
    @Test
    public void testPrependFirstElementToSecondArrayLastElement() {
        assertEquals(new String[]{"some","hello","hii","some","some","aa"},stringArrayOperations.prependMidElementToSecondArrayFirstElement(new String[]{"hello","hii","some","some","aa"},new String[]{"hello","hii","some","some","aa"}));
        assertEquals(new String[]{"array should not be null"},stringArrayOperations.prependMidElementToSecondArrayFirstElement(null,new String[]{"hello","hii","some","some","aa"}));
        assertEquals(new String[]{"array should not be null"},stringArrayOperations.prependMidElementToSecondArrayFirstElement(new String[]{"hello","hii","some","some","aa"},null));
    }
}