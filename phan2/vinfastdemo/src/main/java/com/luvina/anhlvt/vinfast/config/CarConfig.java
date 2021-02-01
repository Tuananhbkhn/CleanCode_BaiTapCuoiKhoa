package com.luvina.anhlvt.vinfast.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luvina.anhlvt.vinfast.bean.Car;
import com.luvina.anhlvt.vinfast.bean.Engine;

@Configuration
public class CarConfig {
	@Autowired
	private ApplicationContext context;
	
	@Value("${engineType}")
	private String engineType;

	@Bean
	public Car car() {
		Engine engine;

	    switch (engineType) {
	      case "gas":
	        engine = (Engine) context.getBean("gasEngine");
	        break;
	      case "electric":
	        engine = (Engine) context.getBean("electricEngine");
	        break;
	      default:
	        engine = (Engine) context.getBean("gasEngine");
	    }
		return new Car(engine);
	}
}
