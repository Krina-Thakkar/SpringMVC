package com.krinathakk.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.krinathakk.lc.api.Phone;
import com.krinathakk.lc.api.UserRegisterDetailsDTO;
import com.krinathakk.lc.api.communicationDTO;

@Controller
public class RegisterationController {
	
	@RequestMapping("/register")
 	public String registerPage(@ModelAttribute("userRegisterDetails") UserRegisterDetailsDTO userRegisterDetailsDTO) {
		System.out.println("inside registeration page");
		
		// load saved user data from database
		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setUserNumber("121233");
		
		communicationDTO comdto = new communicationDTO();
		userRegisterDetailsDTO.setCommunicationDto(comdto);
		comdto.setPhone(phone);
		return "register-page";
 	}
 	
 	@RequestMapping("/process-registeration")
	public String showResultpage(@ModelAttribute("userRegisterDetails") UserRegisterDetailsDTO userRegisterDetailsDTO ) {	
 		System.out.println("inside process registeration page");
 		
 		// save dto object in database
 		
 		return "registeration-confirmationPage";
	}
 	
}
