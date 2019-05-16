package com.stackroute.pe3;

public class RemoveVowels {

    public static String[] removeVowelsFromPlaces(String string) {
        String[] places=string.split(",");
        String[] result=new String[places.length];
        String sub="";
        int index=0;
        while (index<places.length){
            try{
                if (places[index]==null || places[index].matches("[0-9 ]+")){
                    throw new InvalidInputException();
                }
                sub=places[index].substring(1);
                sub=sub.replaceAll("[aeiou]","");
                result[index]=("Place Name without Vowels:"+index+" "+places[index].substring(0,1)+sub);

            }catch (InvalidInputException |NullPointerException in ){
                return "Input Should only be a String".split(",");
            }
            index++;;
        }
        return result;
    }
}

