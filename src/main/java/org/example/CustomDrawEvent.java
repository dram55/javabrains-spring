package org.example;

import org.springframework.context.ApplicationEvent;

public class CustomDrawEvent extends ApplicationEvent{

	public CustomDrawEvent(Object source) {
		super(source);
	}

	@Override
	public String toString(){
		return "Draw event occured";
	}
}
