package com.home.mycafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {
	
	@RequestMapping("/cafe")
	public String showWelcomePage() {
		
	/*	String myName="Krina";
		String myTitle="Mom's Cafe";
		model.addAttribute("myNameValue",myName);
		model.addAttribute("myProjectTitle",myTitle);*/
		
		return "welcome";
	}
	
	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request, Model model){
		
		// handle the data that user sends
		String userEnteredValue = request.getParameter("foodType");
		
		// adding captured value to model
		model.addAttribute("userInput",userEnteredValue);
		// set the user data with the model object and send to view
		
		return "process-order";
	}
}
   