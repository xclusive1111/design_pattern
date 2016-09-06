package com.me.design.strategy.entity;

import com.me.design.strategy.Duck;
import com.me.design.strategy.FlyBehavior;
import com.me.design.strategy.QuackBehavior;
import com.me.design.strategy.behavior.FlyingNoWay;
import com.me.design.strategy.behavior.Quack;

/**
 * @author sondv
 */
public class DuckB extends Duck
{
	private FlyBehavior flyBehavior;

	private QuackBehavior quackBehavior;

	public DuckB()
	{
		flyBehavior = new FlyingNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display()
	{
		System.out.println("Display to look like duck B");
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
