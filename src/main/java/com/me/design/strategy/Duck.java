package com.me.design.strategy;

/**
 * @author sondv
 */
public abstract class Duck
{
	public abstract void display();

	public void eat() {
		System.out.println("Yeah! Every kind of duck can eat.");
	}
}
