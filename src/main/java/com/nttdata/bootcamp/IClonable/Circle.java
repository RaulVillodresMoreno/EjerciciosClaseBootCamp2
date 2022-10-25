package com.nttdata.bootcamp.IClonable;

public class Circle extends Shape {
	public Circle (int x, int y) {
		super(x, y);
	}
	
	public Circle(Circle circle) {
		super(circle.x, circle.y);
	}

	@Override
	public Shape clone() {
		return new Circle(this);
	}
}
