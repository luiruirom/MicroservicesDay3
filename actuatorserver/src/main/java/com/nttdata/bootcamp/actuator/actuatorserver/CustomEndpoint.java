package com.nttdata.bootcamp.actuator.actuatorserver;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@Endpoint(id = "customEndpoint")
public class CustomEndpoint {

	@GetMapping("/random")
	public ResponseEntity<String> customEndPoint(){
		return new ResponseEntity<>("Something something", HttpStatus.OK);
	}
}
