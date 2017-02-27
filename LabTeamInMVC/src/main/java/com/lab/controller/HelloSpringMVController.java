package com.lab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/helloSpring")
public class HelloSpringMVController {
	@RequestMapping("/mvc")
	public String HelloMvc(){
		System.out.println("成功！");
		return "hellomvc";
	}
}
