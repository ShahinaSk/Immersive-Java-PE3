package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class StudentMarksTest {
    private static StudentMarks studentMarks;

    @BeforeClass
    public static void setUp()  {
        studentMarks=new StudentMarks();
    }

    @AfterClass
    public static void tearDown() {
        studentMarks=null;
    }

    @Test
    public void testValidateGrade_GivenCorectValues_ShouldReturnSuccessMessage(){
        assertEquals("","Entered grades are valid",studentMarks.validateGrade(new int[]{99,89,67,66,89}));
    }

    @Test
    public void testValidateGrade_GivenEdgeValues_ShouldReturnFailureMessage(){
        assertEquals("","Enter marks between 0-100!!!",studentMarks.validateGrade(new int[]{99,89,67,66,101}));
    }

    @Test
    public void testValidateGrade_GivenNegativeValues_ShouldReturnSuccessMessage(){
        assertEquals("","Enter marks between 0-100!!!",studentMarks.validateGrade(new int[]{-1,0,99,89,67,66,100}));
    }
}