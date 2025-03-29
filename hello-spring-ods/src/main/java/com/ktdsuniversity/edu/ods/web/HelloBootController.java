package com.ktdsuniversity.edu.ods.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HelloBootController {

	
	@GetMapping("/hello")
	public String hello(Model model) {
		// view에 모델을 추가해보자
		
		model.addAttribute("app_name", "Hello Boot!");
		
		return "helloboot";
			
	}

}