package com.krishna.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
	
	@RequestMapping("/testpage")
	public String sayHelloPage() {
		return "hello-world";
	}
	@ResponseBody
	@RequestMapping("/testapi")
	public String sayHelloAPI() {
		return "hello-world";
	}
}
