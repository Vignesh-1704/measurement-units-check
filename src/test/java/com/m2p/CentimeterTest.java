package com.m2p;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CentimeterTest {

    @Test
    void toReturnTrueIf1cmIsEqualTo1cm()
    {
        Centimeter oneCentimeter = new Centimeter(1);
        Centimeter anotherCentimeter = new Centimeter(1);

        assertThat(oneCentimeter , is(equalTo(anotherCentimeter)));
    }

}
