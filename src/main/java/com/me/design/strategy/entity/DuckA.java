package com.me.design.strategy.entity;

import com.me.design.strategy.Duck;
import com.me.design.strategy.FlyBehavior;
import com.me.design.strategy.QuackBehavior;
import com.me.design.strategy.behavior.FlyingWithWings;
import com.me.design.strategy.behavior.Speak;

/**
 * @author sondv
 */
public class DuckA extends Duck
{
	private FlyBehavior flyBehavior;

	private QuackBehavior quackBehavior;

	public DuckA()
	{
		flyBehavior = new FlyingWithWings();
		quackBehavior = new Speak();
	}

	@Override
	public void display()
	{
		System.out.println("Display like Duck A");
	}

	public void performFly()
	{
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior _flyBehavior)
	{
		flyBehavior = _flyBehavior;
	}

	public void performQuack()
	{
		quackBehavior.quack();
	}

	public void setQuackBehavior(QuackBehavior _quackBehavior)
	{
		quackBehavior = _quackBehavior;
	}
}
