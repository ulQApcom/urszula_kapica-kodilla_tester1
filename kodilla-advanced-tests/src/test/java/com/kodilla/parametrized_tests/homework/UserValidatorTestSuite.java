package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTestSuite {
    private final UserValidator validator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"Ania,true","@xb,false","a,false","aa,false"})

    public void shouldValidateUserName(String input, boolean expected){
        assertEquals(expected,validator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"Ania1999@wp.pl,true","@xb,false","ania@wp,false","aa.com,false"})

    public void shouldValidateEmail(String input, boolean expected){
        assertEquals(expected,validator.validateEmail(input));
    }


}