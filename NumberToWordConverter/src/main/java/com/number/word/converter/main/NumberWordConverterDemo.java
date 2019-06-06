package com.number.word.converter.main;

import com.number.word.converter.impl.NumberWordConverterImpl;
import com.number.word.converters.NumberWordConverter;

public class NumberWordConverterDemo {
	 public static void main(String[] args) {
	    	NumberWordConverter obj = new NumberWordConverterImpl();
	    	System.out.println("Given Number is :   " + obj.convert(123456789));
	        System.out.println("Given Number is :   " + obj.convert(29));
	        System.out.println("Given Number is :  " + obj.convert(-55));
	    }
}
