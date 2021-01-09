package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonBMI {

    private static Stream<Arguments>personList(){
        return Stream.of(
                Arguments.of(1.70, 56, "Normal (healthy weight)"),
                Arguments.of(1.53, 82, "Obese Class II (Severely obese)"),
                Arguments.of(1.78, 40, "Very severely underweight"),
                Arguments.of(1.82, 140, "Obese Class III (Very severely obese)"),
                Arguments.of(1.63, 59, "Normal (healthy weight)"),
                Arguments.of(1.68, 85, "Obese Class I (Moderately obese)"),
                Arguments.of(1.56, 48, "Normal (healthy weight)"),
                Arguments.of(1.90, 98, "Overweight")
        );
    }
}
