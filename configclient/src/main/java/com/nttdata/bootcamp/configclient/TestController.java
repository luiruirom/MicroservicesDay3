package com.nttdata.bootcamp.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${product.product-name}")
	private String value;
	
	@GetMapping(path="/myValue")
	public String myValue() {
		return this.value;
	}
}
