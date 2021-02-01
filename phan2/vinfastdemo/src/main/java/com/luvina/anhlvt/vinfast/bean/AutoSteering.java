package com.luvina.anhlvt.vinfast.bean;

import org.springframework.stereotype.Component;

import com.luvina.anhlvt.vinfast.interfaces.Steering;

@Component
public class AutoSteering implements Steering{

	@Override
	public String steer() {
		return "Auto steering";
	}

}
