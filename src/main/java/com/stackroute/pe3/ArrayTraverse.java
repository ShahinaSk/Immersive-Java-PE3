package com.stackroute.pe3;

public class ArrayTraverse {

    public String[] checkEvenOrOdd(int[] input) {
        /*check if input array is not null if null then return error message*/
        if (input!=null){
            /*declare new string array to store result*/
            String[] result=new String[input.length];
            int index=0;
            /*traverse through input array check if value at index is even or odd
            * put result in the result array at corresponding index*/
            while (index<result.length){
                result[index]=(input[index]%2==0)?"even":"odd";
                index++;
            }
            /*return result array*/
            return result;
        }
       return "array should not be null".split(",");
    }

    public String removePrime(int[] input) {

        /*check if input array is not null if null then return error message*/
        if (input!=null){
            int index=0,rem=2;
            String string="";
            /*traverse through input array check if value at index is divisible by 2
            * if true append value to string and break inner loop
            * else increment rem by 1 and check if value is divisible by rem
            * continue upto square root of value at index
            * */
            while (index<input.length){
                rem=2;
                while (rem<=Math.sqrt(input[index])){

                    if (input[index]%rem==0){
                        string += (index < input.length - 1) ? input[index] + "," : input[index];
                        break;
                    }
                    rem++;
                }

                index++;
            }
            /*return result string */
            return string.substring(0,string.length()-1);
        }
        /*if input array is null return error message*/
        return "array should not be null";
    }

    public String[] reverseArray(int[] input) {
        try{

            /*decleare a string array to store result*/
            String[] reverse=new String[input.length];
            /*initialize index as last index of input array*/
            int index=input.length-1;

            /*taverse through the array put vlue at index in reverse array*/
            while (index>=0){
                reverse[input.length-index-1]=String.valueOf(input[index]);
                index--;
            }
            return reverse;

        }catch (NullPointerException ne){

            /*if array is null return error message*/
            return "array should not be null".split(",");

        }
    }
}

