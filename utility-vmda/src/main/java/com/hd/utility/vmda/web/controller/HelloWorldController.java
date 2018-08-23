package com.hd.utility.vmda.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MyTest")
public class HelloWorldController {
	@Value("${utility.name}")
	private String myName;
	@RequestMapping("/hello")
	private String hello() {
		return myName+":hello world!";
	}
}
