package com.stackroute.pe3;

public class RemoveVowels {

    public static String[] removeVowelsFromPlaces(String string) {
        /*split string into array of places */
        String[] places=string.split(",");
        /*declare a result array */
        String[] result=new String[places.length];
        String sub="";
        int index=0;
        /*traverse through the places array*/
        while (index<places.length){
            try{
                /*if any of the places is null or it contains integer or white spaces throw user defined InvalidInputException*/
                if (places[index]==null || places[index].matches("[0-9 ]+")){
                    throw new InvalidInputException();
                }
                /*take substring from the element at current index
                i.e; if places[index]="India" then
                sub="ndia" and remove all vowels */
                sub=places[index].substring(1);
                sub=sub.replaceAll("[aeiou]","");
                result[index]=("Place Name without Vowels:"+index+" "+places[index].substring(0,1)+sub);

                /*if either of the exception is caught then return error message */
            }catch (InvalidInputException |NullPointerException in ){
                return "Input Should only be a String".split(",");
            }
            index++;;
        }
        /*return result array */
        return result;
    }
}

