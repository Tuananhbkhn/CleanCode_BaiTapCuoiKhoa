package com.luvina.anhlvt.vinfast.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	private Engine engine;
	
	@Autowired
	private Chassis chassis;
	
	@Autowired
	private AutoSteering autoSteering;

	public Car(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", steering=" + autoSteering.steer() + ", chassis=" + chassis.toString() + "]";
	}
	
}
