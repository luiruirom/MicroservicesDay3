package com.nttdata.bootcamp.actuator.micro1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class Micro1 {
	
	@GetMapping("/micro1")
	public ResponseEntity<String> customEndPoint(){
		return new ResponseEntity<>("Something something micro1", HttpStatus.OK);
	}
}
