package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private EmailSender Controller;
	
	@GetMapping("/mail")
	public String sent() {
		Controller.send("bitanstrikermondal@gmail.com", "test mail: from spring boot app", "test mail: Bunty");
		return "sucess";
	}

}
