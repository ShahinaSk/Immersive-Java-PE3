package com.stackroute.pe3;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
    /*public static void main(String[] args) {
        try(BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in))) {
            int noOfStudents = Integer.parseInt(bufferedReader.readLine());
            int[] stuGrades=new int[noOfStudents];
            int index=0;
            while (index<noOfStudents){
                stuGrades[index]=Integer.parseInt(bufferedReader.readLine());
                if (!validateGrade(stuGrades[index])){
                    System.out.println("Student "+(index+1)+" grade is invalid!!!\nPlease enter valid marks...");
                    return;
                }
                index++;
            }

        } catch (IOException ie){
         ie.printStackTrace();
        }
    }*/









    private static boolean validateGrade(int stuGrade) {
        if (stuGrade<0 || stuGrade>100){
            return false;
        }
        return true;
    }
}
