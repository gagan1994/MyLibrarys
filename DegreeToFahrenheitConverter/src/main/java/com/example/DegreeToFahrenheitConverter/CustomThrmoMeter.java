package com.example.DegreeToFahrenheitConverter;

/**
 * Created by Gagan on 2/21/2018.
 */

public class CustomThrmoMeter {
    //(°F − 32) x 5/9
    public static float ToDegreeCelsius(float Fahrenheit) {
        float celsius =  (Fahrenheit - 32) * 5f / 9f;
        return celsius;
    }
//(°C × 9/5) + 32
    public static float ToFahrenheit(float Celsius) {
        float farenheit = (Celsius * (9.0f / 5.0f)) + 32f;
        return farenheit;
    }
}
