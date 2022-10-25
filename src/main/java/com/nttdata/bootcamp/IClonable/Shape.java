package com.nttdata.bootcamp.IClonable;

public abstract class Shape implements IClonable {
	
	protected int x;
	protected int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public Object clone() {
		return null;
	}
}
