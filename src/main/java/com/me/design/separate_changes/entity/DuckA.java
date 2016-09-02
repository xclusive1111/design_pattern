package com.me.design.separate_changes.entity;

import com.me.design.separate_changes.Duck;
import com.me.design.separate_changes.FlyBehavior;
import com.me.design.separate_changes.QuackBehavior;
import com.me.design.separate_changes.behavior.FlyingNoWay;
import com.me.design.separate_changes.behavior.FlyingWithWings;
import com.me.design.separate_changes.behavior.Speak;

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
