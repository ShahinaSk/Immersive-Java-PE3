package com.stackroute.pe3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayOperations {

    public String compareArrays(String[] array1,String[] array2){
        if (array1==null||array2==null){
            return "array should not be null";
        }
        if (array1.length!=array2.length){
            return "Given arrays differ in length";
        }
        return (Arrays.equals(array1,array2))?"arrays are similar":"arrays are not similar";
    }
    public String[] removeDuplicateElements(String[] array1){
        if (array1==null){
            return "array should not be null".split(",");
        }
        else {
            int i = 0, j = 0;
            String[] output=new String[array1.length];
            for (i = 0; i < array1.length - 1; i++) {
                for (j = i + 1; j < array1.length; j++) {
                    if (array1[i] != null && array1[i].equals(array1[j])) {
                        array1[j] = null;
                    }
                }
            }
            for (i = 0,j=0; i < array1.length; i++) {
                if (array1[i] != null) {
                    output[j] = array1[i];
                    j++;
                }
            }
            String[] output1=new String[j];
            for (i = 0; i < j; i++) {
                output1[i]=output[i];
            }
            return output1;
        }
    }

    public String[] appendFirstElementToSecondArrayLastElement(String[] array1,String[] array2){
        if (array1==null || array2==null){
            return "array should not be null".split(",");
        }
        String[] result=new String[array2.length+1];
        int index=0;
        while(index<array2.length){
            if (array2[index]!=null){
                result[index]=array2[index];
                index++;
            }else{
                return "array shoud not contain null".split(",");
            }
        }
        if (array1[0]!=null){
            result[index]=array1[0];
        }else{
            return "array shoud not contain null".split(",");

        }
        return result;
    }

    public String[] prependMidElementToSecondArrayFirstElement(String[] array1,String[] array2){
        if (array1==null || array2==null){
            return "array should not be null".split(",");
        }
        String[] result=new String[array1.length+1];


        if (array2[array2.length/2]!=null){
            result[0]=array2[array2.length/2];
        }else{
            return "array shoud not contain null".split(",");

        }
        int index=0;
        while(index<array1.length){
            if (array1[index]!=null){
                result[index+1]=array1[index];
                index++;
            }else{
                return "array shoud not contain null".split(",");
            }
        }

        return result;
    }


    /*You need to create a Java class that accepts two arrays of String objects, array1 and array2.
1.    Compare the elements of both the arrays
2.    Loop through each array, to remove any duplicate elements.
3.    Append the first element of array1 to array2.
4.    Prepend the mid element of array2 to array1.
You need to:
1.    Write the Test Scenarios in Given-Should Format in the README.md under the Header
# PE <pe_number> Problem <prob_number>
Ensure you create scenarios for:
a.    One or more Positive Test Case
b.    One or More Negative Test Cases
c.    One or More Edge Cases
2.    Implement the Test Cases
3.    Write the implementation code*/




}
