package com.stackroute.pe3;

public class CheckForConsecutiveNums {


    public static String consecutiveNums(String input){

        /*split input string into array of strings*/
        String[] strings=input.split(",");

        int index=1;
        /*traverse through the array */
        while (index<strings.length){

                try{
                    /*if absolute value of difference between value at index and (index-1) not equal to 1
                    * return eror message else continue the traversal */
                    if (Math.abs(Integer.parseInt(strings[index])-Integer.parseInt(strings[index-1]))!=1){
                        return input+" non consecutive numbers";
                    }

                    /*if input contains non integer value return error message*/
                }catch (NumberFormatException ne){
                    return "Enter only integer values!!!";
                }

            index++;
        }
        /*if traversal is complete the return success message*/
        return input+" are consecutive numbers";
    }


}