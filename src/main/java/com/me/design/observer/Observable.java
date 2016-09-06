package com.me.design.observer;

/**
 * @author sondv
 */
public interface Observable
{
	void registerObserver(Observer _observer);

	void removeObserver(Observer _observer);

	void notifyObservers();
}