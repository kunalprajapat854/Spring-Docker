package in.kunal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Democontroller {
	
	
	@GetMapping("/welcome")
	public String getmsg() {
		String msg = "Welcome Developer";
		return msg;
	}
	
	

}
