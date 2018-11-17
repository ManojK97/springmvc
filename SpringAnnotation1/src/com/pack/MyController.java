package com.pack;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController 
{
	@RequestMapping("/hello1")
	public ModelAndView helloworld1(@ModelAttribute Addition a )
	{
		System.out.println("test1..");
		ModelAndView mv=new ModelAndView("display");
		mv.addObject("ans", a);
	      
		return mv;
	}
}
