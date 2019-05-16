package com.stackroute.pe3;

public class ArrayTravererse {

    public String[] checkEvenOrOdd(int[] input) {
        if (input!=null){
            String[] result=new String[input.length];
            int index=0;
            while (index<result.length){
                result[index]=(input[index]%2==0)?"even":"odd";
                index++;
            }
            return result;
        }
       return "array should not be null".split(",");
    }

    public String removePrime(int[] input) {
        if (input!=null){
            int index=0,rem=2;
            String string="";
            while (index<input.length){
                    rem=2;
                    while (rem<=Math.sqrt(input[index])){
                        if (input[index]%rem==0){
                            string += (index < input.length - 1) ? input[index] + "," : input[index];
                            break;
                        }
                        rem++;
                    }


                System.out.println(string);
                index++;
            }
            return string.substring(0,string.length()-1);
        }
        return "array should not be null";
    }

    public String[] reverseArray(int[] input) {
        try{
            String[] reverse=new String[input.length];
            int index=input.length-1;
            while (index>=0){
                reverse[input.length-index-1]=String.valueOf(input[index]);
                index--;
            }
            return reverse;
        }catch (NullPointerException ne){
            return "array should not be null".split(",");
        }
    }
}

