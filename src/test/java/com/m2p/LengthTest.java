package com.m2p;

import org.junit.jupiter.api.Test;

import static com.m2p.Length.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LengthTest {

    @Test
    void toReturnTrueIf1cmIsEqualTo1cm()
    {
        Length oneCentimeter = centimeter(1);
        Length anotherCentimeter = centimeter(1);

        assertThat(oneCentimeter , is(equalTo(anotherCentimeter)));
    }

    @Test
    void toReturnFalseIf1cmIsNotEqualTo1cm()
    {
        Length oneCentimeter = centimeter(1);
        Length anotherCentimeter = centimeter(3);

        assertThat(oneCentimeter , is(not(equalTo(anotherCentimeter))));
    }

    @Test
    void toReturn100CmIf1MeterIsGiven()
    {
        Length oneMeter = meter(1);
        Length hundredCm = centimeter(100);
        assertThat(oneMeter, is(equalTo(hundredCm)));
    }

    @Test
    void toReturnNotEqual100CmIf1MeterIsGiven()
    {
        Length oneMeter = meter(1);
        Length hundredCm = centimeter(1000);
        assertThat(oneMeter, is(not(equalTo(hundredCm))));
    }


    @Test
    void toReturnTrue001KmWhen100cmIsGiven()
    {
        Length kmConversion = centimeter(100);
        Length kilometer = kilometer(0.001);
        assertThat(kmConversion,is(equalTo(kilometer)));
    }
    @Test
    void toReturnFalse01KmWhen100cmIsGiven()
    {
        Length kmConversion = centimeter(100);
        Length kilometer = kilometer(0.1);
        assertThat(kmConversion,is(not(equalTo(kilometer))));
    }

}
