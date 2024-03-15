package com.example.simple_one.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

		@GetMapping("/home")
		public String home(){
				return "This is home !!";
		}

		@GetMapping("/about")
		public String about(){
				return "This is my about page !!";
		}
}
