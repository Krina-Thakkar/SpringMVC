package com.krinathakk.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.krinathakk.lc.api.UserRegisterDetailsDTO;

@Controller
public class RegisterationController {
	
	@RequestMapping("/register")
 	public String registerPage(@ModelAttribute("userRegisterDetails") UserRegisterDetailsDTO userRegisterDetailsDTO) {
 		return "register-page";
 	}
 	
 	@RequestMapping("/process-registeration")
	public String showResultpage(@ModelAttribute("userRegisterDetails") UserRegisterDetailsDTO userRegisterDetailsDTO ) {	
		return "registeration-confirmationPage";
	}
 	
}
