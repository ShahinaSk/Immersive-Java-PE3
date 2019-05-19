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
    public void testCompareArrays_Given2SimilarStringArrays_ShouldReturnSuccessMessage() {
        assertEquals("arrays are similar",
                stringArrayOperations.compareArrays(new String[]{"hello","hii","some","some","aa"},new String[]{"hello","hii","some","some","aa"}));
    }

    @Test
    public void testCompareArrays_GivenOneArrayAsNull_ShouldReturnErrorMessage() {
        assertEquals("array should not be null",
                stringArrayOperations.compareArrays(new String[]{"hello","hii","some","some","aa"},null));
    }

    @Deprecated
    @Test
    public void testRemoveDuplicateElements_GivenStringArray_ShouldReturnArrayWithUniqueItems() {
        assertEquals(new String[]{"hello","hii","some"},stringArrayOperations.removeDuplicateElements(new String[]{"hello","hii","some","hello"}));
    }

    @Deprecated
    @Test
    public void testRemoveDuplicateElements_GivenNull_ShouldReturnErrorMessage() {
        assertEquals(new String[]{"array should not be null"},stringArrayOperations.removeDuplicateElements(null));
    }

    @Deprecated
    @Test
    public void testAppendFirstElementToSecondArrayLastElement_GivenTwoStringArrays_ShouldReturnStringArray() {
        assertEquals(new String[]{"hello","hii","some","some","aa","hello"},
                stringArrayOperations.appendFirstElementToSecondArrayLastElement(new String[]{"hello","hii","some","some","aa"},
                        new String[]{"hello","hii","some","some","aa"}));
    }

    @Deprecated
    @Test
    public void testAppendFirstElementToSecondArrayLastElement_GivenFirstArrayAsNull_ShouldReturnErrorMessage() {
        assertEquals(new String[]{"array should not be null"},
                stringArrayOperations.appendFirstElementToSecondArrayLastElement(null,
                        new String[]{"hello","hii","some","some","aa"}));
    }

    @Deprecated
    @Test
    public void testAppendFirstElementToSecondArrayLastElement_GivenSecondArrayAsNull_ShouldReturnErrorMessage() {
        assertEquals(new String[]{"array should not be null"},
                stringArrayOperations.appendFirstElementToSecondArrayLastElement(
                        new String[]{"hello","hii","some","some","aa"},null));
    }

    @Deprecated
    @Test
    public void testPrependFirstElementToSecondArrayLastElement_GivenTwoStringArrays_ShouldReturnStrignArray() {
        assertEquals(new String[]{"some","hello","hii","some","some","aa"},
                stringArrayOperations.prependMidElementToSecondArrayFirstElement(
                        new String[]{"hello","hii","some","some","aa"},
                        new String[]{"hello","hii","some","some","aa"}));
    }

    @Deprecated
    @Test
    public void testPrependFirstElementToSecondArrayLastElement_GivenFirstArrayAsNull_ShouldReturnErrorMessage() {
        assertEquals(new String[]{"array should not be null"},
                stringArrayOperations.prependMidElementToSecondArrayFirstElement(null,
                        new String[]{"hello","hii","some","some","aa"}));
    }

}