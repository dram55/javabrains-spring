package org.example;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Line implements Shape {

	Point pointA;
	Point pointB;
	 
	public Point getPointA() {
		return pointA;
	}
	@Resource
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	@Resource
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public void draw() {
		System.out.println("Draw Line: " + pointA + pointB);
	}

}
