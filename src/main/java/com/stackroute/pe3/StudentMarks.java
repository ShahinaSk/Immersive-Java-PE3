package com.stackroute.pe3;

public class StudentMarks {

    public static String validateGrade(int[] grades){
        int index=0;
        while(index<grades.length){
            if (grades[index]<0 || grades[index]>100){
                return "Enter marks between 0-100!!!";
            }
            index++;
        }
        return "Entered grades are valid";
    }
}
