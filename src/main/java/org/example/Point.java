package org.example;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;


public class Point {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@PostConstruct
	public void initMethod(){
		System.out.println("Initialized Point Bean..");
	}
	
	@Override
	public String toString(){
		return "(" + x + "," + y + ")";
	}
	
}
