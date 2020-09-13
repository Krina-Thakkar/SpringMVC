package com.krinathakk.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.krinathakk.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone>{

	@Override
	public String print(Phone phone, Locale locale) {
		System.out.println("inside print method of PhoneNumberformatter");
		// load saved userdata from database and convert phone object to string object 
		return phone.getCountryCode()+"-"+phone.getUserNumber(); 
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		// we use parse method to convert string object to phone object type
		System.out.println("inside parse method of PhoneNumberformatter");
		
		Phone phone = new Phone();
		// split the string received from user
		String[] phoneNumberArray = text.split("-");
				 
		// whether the phone number consits of -
		int index = text.indexOf('-');
		if(index==-1 || index==0) {
			// if '-' is not found, we will add 91 as default country code
			phone.setCountryCode("91");
			if(index==0) {
				phone.setUserNumber(phoneNumberArray[1]);
			}
			else {
				phone.setUserNumber(phoneNumberArray[0]);
			}
		} 
		else {
		// Extract the countryCode and set it to the phone class countryCode property
		 phone.setCountryCode(phoneNumberArray[0]);
		 phone.setUserNumber(phoneNumberArray[1]);
		}
		
		return phone ;
	}


}
