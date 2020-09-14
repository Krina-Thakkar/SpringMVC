package com.krinathakk.lc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
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
	public String showResultpage(@Valid @ModelAttribute("userRegisterDetails") UserRegisterDetailsDTO userRegisterDetailsDTO,BindingResult result){	
 		
 		
 		if(result.hasErrors()) {
 			List<ObjectError> allErrors = result.getAllErrors();
 			for(ObjectError error:allErrors) {
 				System.out.println(error );
 			}
 			return "register-page";
 		}
 		
 		System.out.println("inside process registeration page");
 		// save dto object in database
 		
 		return "registeration-confirmationPage";
	}
 	
}
