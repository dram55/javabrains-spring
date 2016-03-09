package org.example;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {

	public Point pointA;
	public Point pointB;
	public Point pointC;
	

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

	public Point getPointC() {
		return pointC;
	}

	@Resource
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Draw Triangle:" + pointA + pointB+ pointC);
	}

}
