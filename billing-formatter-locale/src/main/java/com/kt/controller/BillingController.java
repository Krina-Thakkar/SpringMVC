package com.kt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kt.api.Bill;
import com.kt.api.CreditCard;

@Controller
public class BillingController {
	
	@RequestMapping("/")
	public String showIndexPage(@ModelAttribute("billInfo") Bill billdto)
	{
		System.out.println("Inside show Index Page");
		
		CreditCard card= new CreditCard();
		
		card.setFirstFourDigits(1111);
		card.setSecondFourDigits(2222);
		card.setThirdFourDigits(3333);
		card.setLastFourDigits(4444);
		
		
		billdto.setCreditCard(card);
		
		return "show-bill";
	}
	
	@RequestMapping("/result")
	public String processBillPage(@ModelAttribute("billInfo") Bill billdto)
	{
		
		return "result-page";
	}

}
