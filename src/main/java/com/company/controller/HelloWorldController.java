package com.company.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value="name", required=false, defaultValue="world") String name)
	{
		ModelAndView mv = new ModelAndView("myFirstView");
		mv.addObject("hello", "hello");
		mv.addObject("name", name);
		return mv;
		
	}

}
