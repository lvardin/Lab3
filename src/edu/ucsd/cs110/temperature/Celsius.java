package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

        public Celsius(float t)
        {
            super(t);
        }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float newTemp = value;
        newTemp *= 9;
        newTemp /= 5;
        newTemp += 32;

        return  new Fahrenheit(newTemp);
    }

    @Override
    public String toString()
    {
        return (String.valueOf(value) + " C");
    }



}
