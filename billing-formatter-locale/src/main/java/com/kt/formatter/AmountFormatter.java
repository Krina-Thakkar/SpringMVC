package com.kt.formatter;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.kt.api.Amount;

public class AmountFormatter implements Formatter<Amount>{

	@Override
	public String print(Amount object, Locale locale) {
		System.out.println("inside print() of amount formatter");
		return null;
	}

	@Override
	public Amount parse(String text, Locale locale) throws ParseException {
		System.out.println("Inside Parse() of amount Formatter");
		Amount amount = new Amount();
		NumberFormat currencyFormat;
		BigDecimal billAmount;
		String[] data = text.split(" ");
		System.out.println(data[0]);
		System.out.println(data[1]);
		if (data[1].equalsIgnoreCase("EURO")) {
			currencyFormat = NumberFormat.getCurrencyInstance(locale.GERMAN);
			System.out.println("--EURO--" + currencyFormat.format(new BigDecimal(data[0])));
			billAmount = new BigDecimal(data[0]);
			amount.setBillAmount(billAmount);
			amount.setLocaleDefinition(currencyFormat.format(billAmount));
			System.out.println(" -->"+amount.getLocaleDefinition());
			// System.out.println(" ORI "+currencyFormat.format(Integer.parseInt(data[0])));
		} else if (data[1].equalsIgnoreCase("USD")) {
			currencyFormat = NumberFormat.getCurrencyInstance(locale.US);
			System.out.println(currencyFormat.format(Integer.parseInt(data[0])));
			billAmount = new BigDecimal(data[0]);
			amount.setBillAmount(billAmount);
			amount.setLocaleDefinition(currencyFormat.format(billAmount));
			System.out.println(" -->"+amount.getLocaleDefinition());
		} else if (data[1].equalsIgnoreCase("INR")) {
			currencyFormat = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
			System.out.println(currencyFormat.format(Integer.parseInt(data[0])));
			billAmount = new BigDecimal(data[0]);
			amount.setBillAmount(billAmount);
			amount.setLocaleDefinition(currencyFormat.format(billAmount));
			System.out.println(" -->"+amount.getLocaleDefinition());
		}
		return amount;
	}
}
