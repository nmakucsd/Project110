package edu.ucsd.cs110.temperature;
//abstract represents a framework for subclasses (inheritance)
public abstract class Temperature {
    private float value;

    public Temperature(float v)
    {
        value = v;
    }
    public final float getValue()
    {
        return value;
    }
    public abstract Temperature toCelsius();
    public abstract Temperature toFahrenheit();
}