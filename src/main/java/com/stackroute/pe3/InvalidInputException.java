package com.stackroute.pe3;

public class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Input Should only be a string";
    }
}
