package com.me.design.observer.display;

import com.me.design.observer.Observable;
import com.me.design.observer.Observer;

/**
 * @author sondv
 */
public class CurrentConditionDisplay implements Observer, DisplayElement
{
	private double temp;
	private double humid;
	private double pressure;
	private Observable observable;

	public CurrentConditionDisplay(Observable _observable)
	{
		observable = _observable;
		observable.registerObserver(this);
	}

	public void update(double _temp, double _humidity, double _pressure)
	{
		this.temp = _temp;
		this.humid = _humidity;
		this.pressure = _pressure;
		display();
	}

	public void display()
	{
		// TODO: Display current weather data in real-time
		System.out.println("Temp: " + temp);
		System.out.println("Humidity: " + humid);
		System.out.println("Pressure: " + pressure);
	}
}
