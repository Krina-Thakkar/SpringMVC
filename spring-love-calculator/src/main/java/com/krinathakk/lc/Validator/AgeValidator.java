package com.krinathakk.lc.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age,Integer> {

	private int lower;
	private int upper;
	@Override
	public void initialize(Age age) {
		// I can write post construct work here
		this.lower=age.lower();
		this.upper = age.upper();
		
	}

	
	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if(value==null)
			return false;
		if(value<lower || value>upper)
			return false;
		
		return true;
	}

}
