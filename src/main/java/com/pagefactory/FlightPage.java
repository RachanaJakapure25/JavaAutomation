package com.pagefactory;

 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.WrapperFunction;

public class FlightPage {
	////strong[text()='Multi-city']/preceding-sibling::input[1]
	 
 //By loc_inpt_fromcity=By.id("FromTag");
 
 
 By loc_btn_searchflight=By.xpath("//*[@id='SearchBtn']");
 By loc_datepicker_departure=By.xpath("//input[@id='DepartDate']/following::a[@class='calendarIcon']/i[text()='Cal']");
 By loc_datepicker_return=By.xpath("//input[@id='ReturnDate']/following::a[@class='calendarIcon']/i[text()='Cal']");
 By loc_list_optiondate=By.xpath("//td[@data-handler='selectDay']");
 By loc_list_optiondatereturn=By.xpath("//td[@data-handler='selectDay']");
 By loc_drp_adults=By.xpath("//select[@name='adults']");
  
 
 String strdate;
 
 
 public void selectTripType(String strtriptype){
	 
	  
	 By loc_rbt_triptype=By.xpath("//strong[text()='"+strtriptype+"']/preceding-sibling::input[1]"); 
		 
		BaseTest.getDriver().findElement(loc_rbt_triptype).click();
		
		
	}
	
	
	public void setCity(String strActualCity,String strkey,By locator){
		//String strActualCity="Mumbai, IN - Chatrapati Shivaji Airport (BOM)";
		WebElement autooptionsource=BaseTest.getDriver().findElement(locator);
		autooptionsource.sendKeys(strkey);
		autooptionsource.sendKeys(Keys.ENTER);
		WrapperFunction.setExplicitWaitForvisibilityOfElementLocated(5,  locator, BaseTest.getDriver());
		List<WebElement> selectoption=BaseTest.getDriver().findElements(By.tagName("li"));
		
		for(WebElement option:selectoption){
			
			//System.out.println(option);
			if(option.getText().equals(strActualCity)){
				//System.out.println("selecting :"+strActualCity);
				option.click();
				break;
			}
		}
		
		WrapperFunction.setImplicitWait(3, BaseTest.getDriver());
	}
	
	
			/*	public void setDestinationCity(){
				String strActualCity="New Delhi, IN - Indira Gandhi Airport (DEL)";
				WebElement autooptiondest=BaseTest.getDriver().findElement(loc_inpt_tocity);
				autooptiondest.sendKeys("Del");
				autooptiondest.sendKeys(Keys.ENTER);
				WrapperFunction.setExplicitWaitForvisibilityOfElementLocated(5, loc_inpt_tocity, BaseTest.getDriver());
				List<WebElement> selectoption=BaseTest.getDriver().findElements(By.tagName("li"));
				
				for(WebElement option:selectoption){
					
				//	System.out.println(option);
					if(option.getText().equals(strActualCity)){
						//System.out.println("selecting :"+strActualCity);
						option.click();
						break;}}WrapperFunction.setImplicitWait(3, BaseTest.getDriver());}*/				
				
	
				public void selectAdults(String strcount){
					
					WrapperFunction.selectValueFromdropdown(loc_drp_adults,strcount);
					
					WrapperFunction.setImplicitWait(3, BaseTest.getDriver());
				}


				public void clickOnSearchFlight(){
					
					 
					 JavascriptExecutor jse = (JavascriptExecutor) BaseTest.getDriver();
				      //Scroll vertically downward by 250 pixels
				      jse.executeScript("window.scrollBy(0,2500)", "");	
				      WrapperFunction.setExplicitWaitForelementToBeClickable(5,  loc_btn_searchflight, BaseTest.getDriver());
					WebElement webelement=BaseTest.getDriver().findElement(loc_btn_searchflight);
					webelement.click();
					 
					
					//BaseTest.getDriver().navigate().forward();
					
					WrapperFunction.setImplicitWait(3, BaseTest.getDriver());
					WrapperFunction.setPageLoadWait(BaseTest.getDriver(), 6);
				       
					BaseTest.getDriver().navigate().refresh();
                   			//WrapperFunction.assertTrue(webelement.isDisplayed());	
                   			
                   BaseTest.getDriver().navigate().to("https://www.cleartrip.com/flights/results?origin=Mumbai,+IN+-+Chatrapati+Shivaji+Airport+(BOM)&from=BOM&destination=New+Delhi,+IN+-+Indira+Gandhi+Airport+(DEL)&to=DEL&depart_date=01/06/2021&return_date=02/06/2021&adults=2&childs=0&infants=0&class=Economy&airline=&carrier=&intl=n&sd=1622109865734&rnd_one=R");		
				//
				}

					
				public void selectdepartureAndReturnDate(int intdeparturedays,int intreturndays){
					
					WrapperFunction.selecetFlightDate(loc_datepicker_departure, loc_list_optiondate, intdeparturedays);
					
					WrapperFunction.selecetFlightDate(loc_datepicker_return, loc_list_optiondatereturn, intreturndays);
					
					
				}
				 
				
				
				
}

/*WrapperFunction.setImplicitWait(3, BaseTest.getDriver());
					   BaseTest.getDriver().findElement(loc_datepicker_departure).click();
					   
					   List<WebElement> optionlistdate=BaseTest.getDriver().findElements(loc_list_optiondate);
					   WrapperFunction.setExplicitWaitForvisibilityOfElementLocated(5,  loc_list_optiondate, BaseTest.getDriver());
//					   
				        for(int i = 0;i<optionlistdate.size();i++){
				    	   
				    	   
				    	   if(i<intdeparturedays){
				    		   continue;
				    	   				
				    	   }
				    	   else{
				    		   strdate=optionlistdate.get(i).getText();
				    		   WrapperFunction.setImplicitWait(3, BaseTest.getDriver());
				    		   optionlistdate.get(i).click();
				    		   break;
				    	   }
				    	   
				        }
				        
				        
				        //returning date 
				         
				        
				        BaseTest.getDriver().findElement(loc_datepicker_return).click();
						   
						   List<WebElement> optionlistdate1=BaseTest.getDriver().findElements(loc_list_optiondate);
						   WrapperFunction.setExplicitWaitForvisibilityOfElementLocated(5, loc_list_optiondate, BaseTest.getDriver());
				        
				        for(int i = 0;i<optionlistdate1.size();i++){
					    	   
					    	   
					    	   if(i<intreturndays){
					    		   continue;
					    	   				
					    	   }
					    	   else{
					    		   strdate=optionlistdate1.get(i).getText();
					    		   WrapperFunction.setImplicitWait(3, BaseTest.getDriver());
					    		   optionlistdate1.get(i).click();
					    		   break;
					    	   }
					    	   
					        }
				        */