package com.pagefactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.generic.BaseTest;

public class HomePage {
	 
	//By loc_btn_flightbtn=By.xpath("ul[@class='productLinks hasProductIcons']/li/a/span[text()='Flights']");
	By loc_hrf_flightlink=By.xpath("//ul/following::li[@class='flightApp']");
			
	public void clickOnFlight(){
		
		 BaseTest.getDriver().findElement(loc_hrf_flightlink).click();
		
	}
	
	public void aletHandling(){
		  Alert alert = BaseTest.getDriver().switchTo().alert();		
	          
	        String alertMessage= BaseTest.getDriver().switchTo().alert().getText();		
	        
	        System.out.println("message"+alertMessage);
	        // Accepting alert		
	        alert.dismiss();
	        
	        
	}
			
}
