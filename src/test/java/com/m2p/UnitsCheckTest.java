package com.m2p;


import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitsCheckTest {
    UnitsCheck unitsCheck = new UnitsCheck();
    @Test
    void toReturnTrueIf1cmIsEqualTo1cm()
    {
        //Arrange
        boolean expectedString = true;

        //Act
        boolean actualString = unitsCheck.checkEquality("1cm","1cm");

        //Assert
        // assertEquals(expectedString,actualString);

        //Using hamcrest dependency for better code readability
        assertThat(actualString,is(equalTo(expectedString)));
    }

}
