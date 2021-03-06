package com.luvina.anhlvt.vinfast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luvina.anhlvt.vinfast.bean.Car;

@Controller
public class HomeController {
	  @Autowired
	  Car car; //Lấy bean có tên là car

	  @ResponseBody
	  @GetMapping(value = "/", produces=MediaType.TEXT_HTML_VALUE)
	  public String getHome() {
	    return car.toString();
	  }
}
