package com.stackroute.pe3;

public class CheckForConsecutiveNums {


    public static String consecutiveNums(String input){
        String[] strings=input.split(",");
       /* if (strings.length!=7){
            return "Enter 7 consecutive integers.";
        }*/
        int index=0;
        while (index<strings.length){
            if (index>0){
                try{
                    if (Math.abs(Integer.parseInt(strings[index])-Integer.parseInt(strings[index-1]))!=1){
                        return input+" non consecutive numbers";
                    }
                }catch (NumberFormatException ne){
                    return "Enter only integer values!!!";
                }

            }
            index++;
        }


        return input+" are consecutive numbers";
    }


}


/*Input: 98,96,95,94,93
Output: 98,96,95,94,93 non consecutive numbers
Input: 54,53,52,51,50,49,48
Output : 54,53,52,51,50,49,48 are consecutive numbers
Input: 1,2,3,4,5,6,6
Output: 1,2,3,4,5,6,6 non consecutive numbers
*/