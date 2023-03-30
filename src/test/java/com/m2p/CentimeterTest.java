package com.m2p;

import org.junit.jupiter.api.Test;

import static com.m2p.Centimeter.conversionCmToKm;
import static com.m2p.Centimeter.conversionMetreToCm;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
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

    @Test
    void toReturnFalseIf1cmIsNotEqualTo1cm()
    {
        Centimeter oneCentimeter = new Centimeter(1);
        Centimeter anotherCentimeter = new Centimeter(3);

        assertThat(oneCentimeter , is(not(equalTo(anotherCentimeter))));
    }

    @Test
    void toReturn100CmIf1MeterIsGiven()
    {
        Centimeter oneMeter = conversionMetreToCm(1);
        Centimeter hundredCm = new Centimeter(100);
        assertThat(oneMeter, is(equalTo(hundredCm)));
    }

    @Test
    void toReturnNotEqual100CmIf1MeterIsGiven()
    {
        Centimeter oneMeter = conversionMetreToCm(1);
        Centimeter hundredCm = new Centimeter(1000);
        assertThat(oneMeter, is(not(equalTo(hundredCm))));
    }


    @Test
    void toReturnTrue001KmWhen100cmIsGiven()
    {
        Centimeter kmConversion = conversionCmToKm(100);
        Centimeter kilometer = new Centimeter(0.001);
        assertThat(kmConversion,is(equalTo(kilometer)));
    }
    @Test
    void toReturnFalse01KmWhen100cmIsGiven()
    {
        Centimeter kmConversion = conversionCmToKm(100);
        Centimeter kilometer = new Centimeter(0.1);
        assertThat(kmConversion,is(not(equalTo(kilometer))));
    }

}
