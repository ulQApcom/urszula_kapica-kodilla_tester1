package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTestSuite {

    private StringManipulator manipulator = new StringManipulator();

    @ParameterizedTest
    @CsvFileSource(resources =  "/stringWithLowerCase.csv", numLinesToSkip =1 )
    public void shouldReverseStringWithLowerCase(String input, String expected){
        assertEquals(expected, manipulator.reverseWithLowerCase(input));
    }

    @ParameterizedTest
    @MethodSource(value = {"provideStringForTestingLength"})
    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected){
        assertEquals(expected, manipulator.getStringLengthWithoutSpaces(input));
    }


    @ParameterizedTest
    @CsvSource(value = {"te,st:1","...OtHEr :0","E,V,e,n.t:3", "null :0","A:0"},delimiter = ':')
    public void shouldCountNumberOfCommas(String input, int expected){
        assertEquals(expected,manipulator.countNumberOffCommas(input));
    }

    }