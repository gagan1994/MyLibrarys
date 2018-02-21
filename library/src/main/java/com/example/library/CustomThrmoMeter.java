package com.example.library;

/**
 * Created by Gagan on 2/20/2018.
 */

public class CustomThrmoMeter {
    //To convert temperatures in degrees Fahrenheit to Celsius, subtract 32 and multiply by .5556 (or 5/9).
    public static float ToDegreeCelsius(float Fahrenheit) {
        float celsius = 5 * (Fahrenheit - 32) / 9;
        return celsius;
    }

    public static float ToFahrenheit(float Celsius) {
        float farenheit = Celsius * (9 / 5) + 32;
        return farenheit;
    }

}
