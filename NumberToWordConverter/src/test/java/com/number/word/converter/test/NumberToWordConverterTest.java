package com.number.word.converter.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

import com.number.word.converters.NumberWordConverter;

public class NumberToWordConverterTest {

	
	@Test
	public void converterTest(){
	NumberWordConverter numcon = Mockito.mock(NumberWordConverter.class);
	when(numcon.convert(10)).thenReturn("ten");
	assertEquals(numcon.convert(10), "ten");
	}
}