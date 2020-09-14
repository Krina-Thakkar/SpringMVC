package com.kt.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.kt.api.CreditCard;

public class CreditCardFormatter implements Formatter<CreditCard>{

	@Override
	public String print(CreditCard object, Locale locale) {
		System.out.println("inside print() of CreditCardformatter");
		// load saved userdata from database and convert creditcard object to string object 
		return object.getFirstFourDigits()+"-"+object.getSecondFourDigits()+"-"+object.getThirdFourDigits()+"-"+object.getLastFourDigits(); 
	}

	@Override
	public CreditCard parse(String text, Locale locale) throws ParseException {
		System.out.println("inside parse() of CreditCardFormatter");
		CreditCard card=new CreditCard();
		if(text.contains("-"))
		{
			String[] newCCNumber=text.split("-", 4);
			card.setFirstFourDigits(Integer.parseInt(newCCNumber[0]));
			card.setSecondFourDigits(Integer.parseInt(newCCNumber[1]));
			card.setThirdFourDigits(Integer.parseInt(newCCNumber[2]));
			card.setLastFourDigits(Integer.parseInt(newCCNumber[3]));	
		}
		else //if during input - is not inserted
		{
			System.out.println("inside else");
			String[] newCCNumber = new String[4];
			int len=text.length();
			if(len!=16)
			{ 
				System.out.println("Please enter valid number");
			}
				newCCNumber[0]=text.substring(0, 4);
				newCCNumber[1]=text.substring(4, 8);
				newCCNumber[2]=text.substring(8, 12);
				newCCNumber[3]=text.substring(12, 16);
			card.setFirstFourDigits(Integer.parseInt(newCCNumber[0]));
			card.setSecondFourDigits(Integer.parseInt(newCCNumber[1]));
			card.setThirdFourDigits(Integer.parseInt(newCCNumber[2]));
			card.setLastFourDigits(Integer.parseInt(newCCNumber[3]));
		}
		return card;
		/*// we use parse method to convert string object to CreditCard object type
				System.out.println("inside parse method of CreditCardformatter");
				CreditCard cc = new CreditCard();
				String[] ccArray = text.split("-",4);
				cc.setFirstFourDigits(Integer.parseInt(ccArray[0]));
				cc.setSecondFourDigits(Integer.parseInt(ccArray[1]));
				cc.setThirdFourDigits(Integer.parseInt(ccArray[2]));
				cc.setLastFourDigits(Integer.parseInt(ccArray[3]));
				return cc;*/
	}

}
