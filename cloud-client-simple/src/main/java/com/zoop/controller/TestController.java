package com.zoop.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${my-config.appName}")
	private String appName; 
	
	@RequestMapping(value = "/test")
	@ResponseBody
	public String test(){
		System.out.println("==============="+appName);
		return appName;
	}
	
}
