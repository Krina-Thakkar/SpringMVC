package com.krinathakk.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.krinathakk.lc.api.UserInfoDTO;
import com.krinathakk.lc.api.UserRegisterDetailsDTO;

@Controller
public class LCAppController {
	
/*	@RequestMapping("/")
	public String showHomePage(Model model) {
		
		// read the existing property value by fetching it form DTO (data transfer object)
		UserInfoDTO userInfo = new UserInfoDTO();
		model.addAttribute("userInfo",userInfo);
		
		
		 
		return "home-page";
	}*/
	
	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfodto) {
		return "home-page";
	}
	
/*	@RequestMapping("process-homepage")
	public String showResultpage(@RequestParam("userName") String userName1, @RequestParam("crushName") String crushName1, Model model){
		model.addAttribute("userName",userName1);
	 // we can also do above instead of creating DTO, but that will be long code when we have many query parameters
		
		return "result-page";
	}*/
	
	
/* 	@RequestMapping("process-homepage")
	public String showResultpage(UserInfoDTO userInfoDTO, Model model) {	
	
		// writing the values to the properties by fetching from URL
		System.out.println("username is "+userInfoDTO.getUserName());
		System.out.println("crushname is "+userInfoDTO.getCrushName());
		
		model.addAttribute("userInfo",userInfoDTO);
		return "result-page";
	}*/
	
 	@RequestMapping("process-homepage")
	public String showResultpage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO ) {	
		return "result-page";
	}
 	
}
