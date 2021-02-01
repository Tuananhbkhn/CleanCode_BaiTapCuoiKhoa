package com.luvina.anhlvt.vinfast.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Chassis {
	
	@Autowired
	private Door door;

	@Override
	public String toString() {
		return "Chassis [door=" + door.toString() + "]";
	}
	
}
