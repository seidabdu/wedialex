package com.example.wedialexfara;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(value = "/home")
	public String getHome() {
		
		//this is written for wedi alex

		return "Welcome wedi alex fara";
	}

}
