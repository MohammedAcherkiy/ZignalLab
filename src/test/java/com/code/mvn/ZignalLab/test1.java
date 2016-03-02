package com.code.mvn.ZignalLab;

import org.testng.annotations.Test;

import Helper.StartWebDriver;

public class test1 extends StartWebDriver {
	
	
	@Test
	public void test(){
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
