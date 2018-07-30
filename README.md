TempratureConverter

It is a library which is used to convert Temprature °C-F and F-°C
You can easily convert °C to Faranhit and vice versa

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	       implementation 'com.github.gagan1994:TempratureConverter:1.0.0'
	}

Covert Fahrenheit to celsius using 

        CustomThrmoMeter.ToDegreeCelsius(faranhit)

Convert CelsiusTo Fahrenheit using

        CustomThrmoMeter.ToFahrenheit(degree)
