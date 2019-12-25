package com.inti.formation.testService;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.inti.formation.service.CalculatriceService;

public class CalculatriceServiceTest {
	
	
	@Test   //chaque methode doit etre annoter par test
	public void additionTest() {
		
	CalculatriceService calcService= new CalculatriceService();	
	int a= 5;
	int b= 6;
	int result = calcService.addition(a, b);
	assertEquals(11, result);
	
	
	}

	
	
}
