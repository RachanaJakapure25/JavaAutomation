package com.testscript.cleartrip;

 
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pagefactory.FlightPage;
import com.pagefactory.FlightResultPage;
import com.pagefactory.HomePage;

public class TestClearTrip extends BaseTest {
	
	By loc_inpt_fromcity=By.xpath("//input[@id='FromTag']");
	// By loc_inpt_tocity=By.id("ToTag");
	 By loc_inpt_tocity=By.xpath("//input[@id='ToTag']");
	
	
	
	FlightPage objFlightPage;
	HomePage objHomePage;
	
	FlightResultPage objFlightResultPage;
	
     @BeforeClass
	 public void intializeEnvironment() {
		 objFlightPage=new FlightPage();
		 objHomePage=new HomePage();
		 
		 objFlightResultPage=new FlightResultPage();
		  initializeWebBrowser();
		  Reporter.log("browser is open link is opening==>");
		  
	  }
     @Test 
     public void verifyFlightSearchButton() {
   	  
   	  objFlightPage.selectTripType("Round trip");
   		 Reporter.log("round trip is selected==>s");
   		 
   		objFlightPage.setCity("Mumbai, IN - Chatrapati Shivaji Airport (BOM)","Mum",loc_inpt_fromcity);
   		Reporter.log("source city is selected==>");
   		 
   		 objFlightPage.setCity("New Delhi, IN - Indira Gandhi Airport (DEL)","Del",loc_inpt_tocity);
   		 Reporter.log("Destination is selected==>");
   		  
   		  objFlightPage.selectdepartureAndReturnDate(5,1);
   		  Reporter.log("departure and return date  trip is selected==>");
   		  
   		  objFlightPage.selectAdults("2");
   			 
   			 Reporter.log("adult chek box  is selected==>");
   			  
   			 objFlightPage.clickOnSearchFlight();
   			 Reporter.log("clicking on search flight selected==>");
   			 
   		 
   		  
   	  
     }
}
