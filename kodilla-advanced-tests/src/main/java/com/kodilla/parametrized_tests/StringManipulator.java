package com.kodilla.parametrized_tests;

import com.sun.jdi.connect.Connector;

import java.util.stream.Stream;

public class StringManipulator {

    public String reverseWithLowerCase(String input){
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString().toLowerCase();
    }
    public int getStringLengthWithoutSpaces(String input){
        String value = input.replaceAll("  ","");
        return value.length();
    }

    public int countNumberOffCommas(String text){
        int count = text.length() - text.replace(",","").length();
        return count;
    }


    }

