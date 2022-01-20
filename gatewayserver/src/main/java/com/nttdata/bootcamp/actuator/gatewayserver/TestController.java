package com.nttdata.bootcamp.actuator.gatewayserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(path="/micro1")
	public String helloM1() {
		return "Hello micro1";
	}
	
	@GetMapping(path="/micro2")
	public String helloM2() {
		return "Hello micro2";
	}
}
