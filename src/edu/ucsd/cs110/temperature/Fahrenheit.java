package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float newTemp = value;
        newTemp = newTemp -32;
        newTemp *= 5;
        newTemp /= 9;

        return  new Celsius(newTemp);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

}

