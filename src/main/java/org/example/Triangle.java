package org.example;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {

	public Point pointA;
	public Point pointB;
	public Point pointC;
	MessageSource msg;
	
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
	public MessageSource getMsg() {
		return msg;
	}
	@Autowired
	public void setMsg(MessageSource msg) {
		this.msg = msg;
	}

	public void draw() {
		System.out.println("Draw Triangle:" + pointA + pointB+ pointC);
	}
	@PostConstruct
	public void initMethod(){
		String tmpMsg = msg.getMessage("initmessage", null, "initialized", null);
		System.out.println("Triangle " + tmpMsg);
	}

}
