package com.stackroute.pe3;

import java.util.Arrays;

public class ExceptionGenerator {

    public String stringArrayTraverse(String[] array){

        try {

            /*assign first element of array to string */
            int size=Integer.parseInt(array[0]);
            /*if size is negative int "NegativeArraySizeException will be thrown"*/
            String[] strings=new String[size];
            int index=0;

            /*traverse through array if value at any index is null "NullPointerException will be thrown"*/
            while (index<array.length){

                /*if array length is more than strings array then
                "ArrayIndexOutOfBoundsException will be thrown"*/

                strings[index]=array[index+1];
                index++;

            }

            /*if "NullPointerException is caught then return error message*/
        }catch(NullPointerException ne){
            return "Caught NullPointerException";

            /*if "NegativeArraySizeException is caught then reurn error message*/
        }catch (NegativeArraySizeException negSize){
            return "Caught NegativeArraySizeException";

            /*if "ArrayIndexOutOfBoundsException is caught then reurn error message*/
        }catch (ArrayIndexOutOfBoundsException arrayIndex){
            return "Caught ArrayIndexOutOfBoundsException";
        }
        /*if no exception is thrown then return success message*/
        return "Returned Successfully!";
    }
}
