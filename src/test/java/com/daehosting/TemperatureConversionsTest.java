package com.daehosting;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {

    @Test
    void getTemperatureConversionsSoap() {
    }

    @Test
    void getTemperatureConversionsSoap1() {
    }

    @Test
    void successCelsiusToFahrenheit() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.celsiusToFahrenheit(BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(32), result);
    }

    @Test
    void successFahrenheitToCelsius() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.fahrenheitToCelsius(BigDecimal.valueOf(32));
        assertEquals(BigDecimal.valueOf(0), result);
    }

    @Test
    void successWindChillInCelcius() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.windChillInCelsius(BigDecimal.valueOf(0), BigDecimal.valueOf(40));
        assertEquals(BigDecimal.valueOf(-25.23), result);
    }

    @Test
    void successWindChillInFahrenheit() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.windChillInFahrenheit(BigDecimal.valueOf(32), BigDecimal.valueOf(40));
        assertEquals(BigDecimal.valueOf(-13.414), result);
    }



}