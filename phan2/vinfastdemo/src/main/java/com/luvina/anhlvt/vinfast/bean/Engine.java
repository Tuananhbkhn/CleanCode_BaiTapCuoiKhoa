package com.luvina.anhlvt.vinfast.bean;

public class Engine {
	private String model;

	public String getModel() {
		return model;
	}

	public Engine(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return model;
	}
}
