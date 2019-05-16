package com.stackroute.pe3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    private static RemoveVowels removeVowels;
    @BeforeClass
    public static void setUp() throws Exception {
        removeVowels=new RemoveVowels();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        removeVowels=null;
    }

    @Deprecated
    @Test
    public void testRemoveVowelsFromPlaces(){
        assertEquals("removeVowelsFromPlaces() : ",new String[]{"Place Name without Vowels:0 ind","Place Name without Vowels:1 amrc","Place Name without Vowels:2 jpn","Place Name without Vowels:3 grmny","Place Name without Vowels:4 kr"},
                removeVowels.removeVowelsFromPlaces("india,america,japan,germany,korea"));
        assertEquals("removeVowelsFromPlaces() : ",new String[]{"Input Should only be a String"},removeVowels.removeVowelsFromPlaces("india,america, ,germany,korea"));
        assertEquals("removeVowelsFromPlaces() : ",new String[]{"Input Should only be a String"},removeVowels.removeVowelsFromPlaces("india,america,1,germany,korea"));


    }

}