package org.example;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Line implements Shape,ApplicationEventPublisherAware {

	private Point pointA;
	private Point pointB;
	private ApplicationEventPublisher eventPublisher;

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
		CustomDrawEvent event = new CustomDrawEvent(this);
		eventPublisher.publishEvent(event);
			}
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		eventPublisher = publisher;
	}

}
