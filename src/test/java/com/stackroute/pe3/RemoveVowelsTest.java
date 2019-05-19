package com.stackroute.pe3;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveVowelsTest {
    private static RemoveVowels removeVowels;
    @BeforeClass
    public static void setUp() {
        removeVowels=new RemoveVowels();
    }

    @AfterClass
    public static void tearDown() {
        removeVowels=null;
    }

    @Deprecated
    @Test
    public void testRemoveVowelsFromPlaces_GivenString_ShouldReturnStringArrayWithoutVowels(){
        assertEquals("removeVowelsFromPlaces() : ",
                new String[]{"Place Name without Vowels:0 ind","Place Name without Vowels:1 amrc",
                        "Place Name without Vowels:2 jpn","Place Name without Vowels:3 grmny",
                        "Place Name without Vowels:4 kr"},
                removeVowels.removeVowelsFromPlaces("india,america,japan,germany,korea"));


    }

    @Deprecated
    @Test
    public void testRemoveVowelsFromPlaces_GivenStringWithNonString_ShouldReturnErrorMessage(){
        assertEquals("removeVowelsFromPlaces() : ",
                new String[]{"Input Should only be a String"},
                removeVowels.removeVowelsFromPlaces("india,america, ,germany,korea"));
    }

    @Deprecated
    @Test
    public void testRemoveVowelsFromPlaces_GivenStringWithInteger_ShouldReturnErrorMessage(){
        assertEquals("removeVowelsFromPlaces() : ",
                new String[]{"Input Should only be a String"},
                removeVowels.removeVowelsFromPlaces("india,america,1,germany,korea"));
    }


}