package com.stackroute.pe3;

import java.util.*;

public class StringArrayOperations {

    public String compareArrays(String[] array1,String[] array2){

        /*if any of the give arrays is null return failure message*/
        if (array1==null||array2==null){
            return "array should not be null";
        }

        /*if arrays have different length return error message*/
        if (array1.length!=array2.length){
            return "Given arrays differ in length";
        }

        /*if arrays are equal return success message else return failure message */
        return (Arrays.equals(array1,array2))?"arrays are similar":"arrays are not similar";
    }

    public String[] removeDuplicateElements(String[] array1){

        /*if array is null return error message */
        if (array1==null){
            return "array should not be null".split(",");
        }

        /*Declare a treeSet  as it accepts only unique value and in the lexicographical order*/
        Set<String> stringSet=new TreeSet<String>(Arrays.asList(array1));
        /*remove '[' and ']' and white spaces*/
        String s=stringSet.toString().replaceAll("[\\[\\]\\s+]","");
        /*return string array*/
        return s.split(",");

    }

    public String[] appendFirstElementToSecondArrayLastElement(String[] array1,String[] array2){
        /*if either of the arrays is null return error message*/
        if (array1==null || array2==null){
            return "array should not be null".split(",");
        }
        /*declare array which has length of second array +1 to store result */
        String[] result=new String[array2.length+1];
        int index=0;
        /*traverse through the array, if value at any index is not null,
        * add element to the result array */
        while(index<array2.length){
            if (array2[index]!=null){
                result[index]=array2[index];
            }else{
                /*if any element is null return error message */
                return "array shoud not contain null".split(",");
            }
            index++;
        }
        /*if first element of array1 is not null add element to the last index of result array*/
        if (array1[0]!=null){
            result[index]=array1[0];
            return result;
        }

        /*if first element of array1 is null return error message */
        return "array shoud not contain null".split(",");

    }

    public String[] prependMidElementToSecondArrayFirstElement(String[] array1,String[] array2){
        /*if either of the given arrays is null, then return error message */
        if (array1==null || array2==null){
            return "array should not be null".split(",");
        }
        /*decleare result array of length array1+1*/
        String[] result=new String[array1.length+1];

        /*if mid element of the array2 is not null, add element to the first index of result,
         else return error message */
        if (array2[array2.length/2]!=null){
            result[0]=array2[array2.length/2];
        }else{
            return "array shoud not contain null".split(",");

        }
        int index=0;
        /*traverse through the array if any element is not null, add element to the result array,
        else return error message*/
        while(index<array1.length){
            if (array1[index]!=null){
                result[index+1]=array1[index];
                index++;
            }else{
                return "array shoud not contain null".split(",");
            }
        }
        /*return result array */
        return result;
    }
}
