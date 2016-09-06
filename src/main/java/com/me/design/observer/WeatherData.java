package com.me.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sondv
 */
public class WeatherData implements Observable
{
	private double temperature;

	private double humidity;

	private double pressure;

	List<Observer> observers;

	public WeatherData()
	{
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer _observer)
	{
		observers.add(_observer);
	}

	public void removeObserver(Observer _observer)
	{
		observers.remove(_observer);
	}

	public void notifyObservers()
	{
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementChanged()
	{
		notifyObservers();
	}
}
