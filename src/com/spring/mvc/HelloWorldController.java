package com.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";		
	}
	
	@RequestMapping("/processForm")
	public String processIt()
	{
		return "displaydata-form";
	}

	@RequestMapping("/processForm2")
	public String processForm2(HttpServletRequest request,Model model)
	{
		String part1=request.getParameter("firstname");
		part1=part1.toUpperCase();
		String part2="Yo! "+part1;
		model.addAttribute("message",part2);
		return "displaydata-form";
	}
}
