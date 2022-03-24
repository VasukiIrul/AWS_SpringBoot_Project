package com.HMS.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/GetStudent")
	public void display(@PathVariable String name) {
		System.out.println(name);
	}
}
