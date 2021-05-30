package com.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.generic.BaseTest;

public class FlightResultPage {
////img[@alt='IndiGo']//following::div[@data-test-attrib='onward-view']//img[@alt='IndiGo'][1]

	By loc_chkbx_nonstop=By.xpath("/html/body/div[1]/div/main/div/div/div[1]/div/aside/div[4]/div[2]/div[2]/div/label[1]/div[1]/span");
	By loc_href_departureflight=By.xpath("/html/body/div[1]/div/main/div/div[1]/div[2]/div[2]/div[12]/div[1]/div[1]/div/div[7]/div[1]");
	By loc_href_returnflight=By.xpath("/html/body/div[1]/div/main/div/div/div[2]/div[2]/div[12]/div[2]/div[1]/div/div[3]/div[1]");
	By loc_btn_bookflight=By.xpath("/html/body/div[1]/div/main/div/div/div[2]/div[2]/div[7]/div/div[2]/button");
	By loc_btn_continuebooking=By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/main/div[2]/div/div/div[25]/div[1]/button");
	By loc_btn_skipthisstep=By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/main/div[5]/div/div/button[2]");
	
	public void refreesh(){
		
		BaseTest.getDriver().navigate().refresh();
	}
	
public void clickonNonStopFlights(){
	
	BaseTest.getDriver().findElement(loc_chkbx_nonstop).click();
	
}

public void selectDepartureFlight(){
	
	BaseTest.getDriver().findElement(loc_href_departureflight).click();
	
	
}
	
public void selectReturnFlight(){
	
	BaseTest.getDriver().findElement(loc_href_returnflight).click();
	
	
}

public void selectContinueBooking(){

	 JavascriptExecutor jse = (JavascriptExecutor) BaseTest.getDriver();
     //Scroll vertically downward by 250 pixels
     jse.executeScript("window.scrollBy(0,2500)", "");	
     
     BaseTest.getDriver().findElement(loc_btn_continuebooking).click();
 	
}

}
