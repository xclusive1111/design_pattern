package com.me.design.separate_changes.entity;

import com.me.design.separate_changes.Duck;
import com.me.design.separate_changes.FlyBehavior;
import com.me.design.separate_changes.QuackBehavior;
import com.me.design.separate_changes.behavior.FlyingNoWay;
import com.me.design.separate_changes.behavior.Quack;

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
