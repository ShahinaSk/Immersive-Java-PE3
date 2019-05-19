package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class ExceptionGeneratorTest {

    public static ExceptionGenerator exceptionGenerator;
    @BeforeClass
    public static void setUp() {
        exceptionGenerator=new ExceptionGenerator();
    }

    @AfterClass
    public static void tearDown() {
        exceptionGenerator=null;
    }

    @Test
    public void testStringArrayTraverse_GivenNegativeIndexValue_ShouldReturnErorMessage(){
        assertEquals("Caught NegativeArraySizeException",
                exceptionGenerator.stringArrayTraverse(new String[]{"-1","hello","hi","bye","some","text"}));

    }

    @Test
    public void testStringArrayTraverse_GivenValuesMoreThanSize_ShouldReturnErorMessage(){
        assertEquals("Caught ArrayIndexOutOfBoundsException",
                exceptionGenerator.stringArrayTraverse(new String[]{"4","hello","hi","bye","some","text","hello"}));

    }

    @Test
    public void testStringArrayTraverse_GivenNull_ShouldReturnErorMessage(){
        assertEquals("Caught NullPointerException",
                exceptionGenerator.stringArrayTraverse(null));
    }
}