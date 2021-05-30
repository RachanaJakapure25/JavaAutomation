package com.testscript.cleartrip;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.generic.WrapperFunction;
import com.pagefactory.HomePage;

public class HomePageTest {
	
	HomePage objHomePage;
	
	
	public void intializePageObjects(){
		objHomePage=new HomePage();
	}
	
	public void verifyHomePage(){
		String strcurentURL=BaseTest.getDriver().getCurrentUrl();
		String strexpectedURL="https://www.cleartrip.com/";
		WrapperFunction.assertEquals(strcurentURL, strexpectedURL);
	}
 
  public void verifyFlightPage(){
	  
	  String stractualURL="https://www.cleartrip.com/flights";
	  
	  objHomePage.clickOnFlight();
	  
	  String strcurentURL=BaseTest.getDriver().getCurrentUrl();
	  
	  WrapperFunction.assertEquals(strcurentURL, stractualURL);
	  
  }
}
