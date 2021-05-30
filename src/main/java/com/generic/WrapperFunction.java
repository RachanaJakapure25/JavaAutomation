package com.generic;
import java.util.List;
import java.util.concurrent.TimeUnit;

 

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
 
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;

import junit.framework.Assert;

//import com.google.common.util.concurrent.FluentFuture;

public class WrapperFunction {
		static WebDriverWait wait;
	 
	     Select select;
	     
	  public WrapperFunction() {
		// TODO Auto-generated constructor stub
	}

	
 	  
	  public static  WebElement getWebElement(By locator) {
	        return   BaseTest.getDriver().findElement(locator);
	    }
	   
	  
	  public static void selectValueFromdropdown(By locator,String strValue) {
	       
	        try {
	            Select dropdown = new Select(getWebElement(locator));
	        dropdown.selectByVisibleText(strValue);
	   
	        }catch(Exception e) {
	           
	            System.out.println("Webdriver could'nt locate the element");
	           
	        }
	    }
	
	  public  void setThreadSleepWait(){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		  }
	  
	  public static void setImplicitWait(int intwait,WebDriver driver){
		  try {
			   
				driver.manage().timeouts().implicitlyWait(intwait, TimeUnit.SECONDS);
			
		} catch (Exception e) {
			// TODO: handle exception
		System.out.println("wail error");
		
		}
		 
		  
	  }
	  
	  public static void setPageLoadWait(WebDriver driver,int intTime){
		  driver.manage().timeouts().pageLoadTimeout(intTime, TimeUnit.SECONDS);
		  
		  
	  }
	  
	  public static void setExplicitWaitForvisibilityOfElementLocated(int intDriverWaitTime,By Locator,WebDriver driver){
		 try {
			 
			  wait=new WebDriverWait(driver,intDriverWaitTime);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		 
	  }
	  
	  public static void setExplicitWaitForvisibilityOfWebElement(int intDriverWaitTime,WebElement webelement,WebDriver driver){
		
		  try {
			  wait=new WebDriverWait(driver,intDriverWaitTime);
			  wait.until(ExpectedConditions.visibilityOf(webelement));
			  } catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		  
	  }
	  
	  public void setExplicitWaitForpresenceOfElementLocated(int intDriverWaitTime,By Locator,WebDriver driver){
		  try {
			  wait=new WebDriverWait(driver,intDriverWaitTime);
			  wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
			  } catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		  
		 
	  }
	  
	  public static void setExplicitWaitForelementToBeClickable(int intDriverWaitTime,By Locator,WebDriver driver){
		
		  try {
			  wait=new WebDriverWait(driver,intDriverWaitTime);
			  wait.until(ExpectedConditions.elementToBeClickable(Locator));
			  } catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		  
		 
	  }
	  
	  public static void setExplicitWaitForelementToBeSelected(int intDriverWaitTime,By Locator,WebDriver driver){
		  try {
			  wait=new WebDriverWait(driver,intDriverWaitTime);
			  wait.until(ExpectedConditions.elementToBeSelected(Locator));
			  } catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}	 
	  }
	  //equal string
	  public static void assertEquals(String str1,String str2) {
		  Assert.assertEquals(str1, str2);
	  }
	  //equal integer
	  public static void assertEquals(int intexpected,int intactual) {
		  Assert.assertEquals( intexpected,  intactual);
	  }
	  //not null object
	  public static void assertNotNull(Object obj) {
		   Assert.assertNotNull(obj);
	  }
	  //not equal object
	  public static void assertNotEquals(Object obj1,Object obj2) {
		  Assert.assertNotSame(obj1, obj2);
	  }
	  //faill message
	  public static void assertFail(String msg) {
		  Assert.fail(msg);
	  }
	  
	  public static void assertFalse(Boolean blnresult) {
		  Assert.assertFalse(blnresult);
	  }
	  
	  public static void assertTrue(Boolean blnresult) {
		  Assert.assertTrue( blnresult); 
	  }
	  
	  public static void assertEquals(String str1,String str2,String str3){
		  Assert.assertEquals(str1, str2, str3);
	  }
	  
	  public static void selecetFlightDate(By callocator,By dateoptionlocator,int intdays){
		  
		  WrapperFunction.setImplicitWait(3, BaseTest.getDriver());
		   BaseTest.getDriver().findElement(callocator).click();
		   
		   List<WebElement> optionlistdate=BaseTest.getDriver().findElements( dateoptionlocator);
		   WrapperFunction.setExplicitWaitForvisibilityOfElementLocated(5,dateoptionlocator, BaseTest.getDriver());
//		   
	        for(int i = 0;i<optionlistdate.size();i++){
	    	   
	    	   
	    	   if(i<intdays){
	    		   continue;
	    	   				
	    	   }
	    	   else{
	    		   //strdate=optionlistdate.get(i).getText();
	    		   WrapperFunction.setImplicitWait(3, BaseTest.getDriver());
	    		   optionlistdate.get(i).click();
	    		   break;
	    	   }
	    	   
	        }
		  
		  
		  
	  }
	  
}
