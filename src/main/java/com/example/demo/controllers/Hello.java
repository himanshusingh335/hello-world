package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	 @GetMapping("/")
	 public String getMessage() {
		 System.out.println("/ is called !!");
	        return "Hello from Docker!";
	    }

}
