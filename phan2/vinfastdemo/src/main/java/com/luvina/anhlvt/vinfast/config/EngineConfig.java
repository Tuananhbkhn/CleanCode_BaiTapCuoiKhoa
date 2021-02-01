package com.luvina.anhlvt.vinfast.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luvina.anhlvt.vinfast.bean.Engine;

@Configuration
public class EngineConfig {
	@Bean(name = "gasEngine")
	public Engine gasEngine() {
		return new Engine("Gas Engine");
	}

	@Bean(name = "electricEngine")
	public Engine teslaEngine() {
		return new Engine("Vinfast Electric Engine");
	}
}
