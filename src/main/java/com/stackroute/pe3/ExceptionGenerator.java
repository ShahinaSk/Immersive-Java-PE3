package com.stackroute.pe3;

import java.util.Arrays;

public class ExceptionGenerator {

    public String stringArrayTraverse(String[] array){
        try {
            int size=Integer.parseInt(array[0]);
            String[] strings=new String[size];
            int index=0;
            while (index<array.length){
                strings[index]=array[index+1];
                index++;
            }
        }catch(NullPointerException ne){
            return "Caught NullPointerException";

        }catch (NegativeArraySizeException negSize){
            return "Caught NegativeArraySizeException";

        }catch (ArrayIndexOutOfBoundsException arrayIndex){
            return "Caught ArrayIndexOutOfBoundsException";
        }

        return "Returned Successfully!";
    }
}
