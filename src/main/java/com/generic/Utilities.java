package com.generic;

import java.util.Random;

public class Utilities {
	static Random random=new Random();

	public static String generateRandomString(int count)
	{
			String strAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
			 StringBuilder builder = new StringBuilder();
		        while (count-- != 0) {
		        int character = (int)(Math.random()*strAlphabets.length());
		        builder.append(strAlphabets.charAt(character));
		        }
		        
		        
		        return builder.toString();	  
		        }
	
	public static String generateRandomStringWithNumber(int count)
	{
			String strAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
			 StringBuilder builder = new StringBuilder();
		        while (count-- != 0) {
		        int character = (int)(Math.random()*strAlphabets.length());
		        builder.append(strAlphabets.charAt(character));
		        }
		        return builder.toString();	  
		        }
	
	//method for random syambol
	public static String generateRandomSymbol(int count)
	{
			String strAlphabets = "@.";
			 StringBuilder builder = new StringBuilder();
		        while (count-- != 0) {
		        int character = (int)(Math.random()*strAlphabets.length());
		        builder.append(strAlphabets.charAt(character));
		        }
		        return builder.toString();	  
		        }
	
	
			//method for email generation
          public static String generateRandomEmail(){
	
	        //String strEmail=this.generateRandomStringWithNumber(10)+this.generateRandomSymbol(1)+this.generateRandomString(5)+this.generateRandomSymbol(1)+this.generateRandomString(3);
	        
         String strEmail=generateRandomStringWithNumber(10)+"@"+generateRandomString(5)+"."+generateRandomString(3);
	        
	        return strEmail;
	         
	         
	
              }

	
		//Randome number generation function	
	         public static String generateRandomNumber(int intRange)
	        {
		        int intNumber;
		     String strNumber;
		       do{
			 intNumber=(int)(Math.random()*intRange);
			
		         }while(intNumber==0);
		
		       strNumber=Integer.toString(intNumber);
		   
	         	return strNumber;
		
		
          	}
	
	 
	         public static String generateRandomNumber(int intup,int intlow ){
		 
		
	         int intBirthYear=(int)(Math.random()*(intup-intlow))+intlow;
	         
	          String strNumber=Integer.toString(intBirthYear);
	         return strNumber;
	         }
	
	      public static String generateRandomePhoneNumber(){
		      String strCode[]={"99","98","78","70","88","80","91","77","72"};
		
		      String strrandom=(strCode[random.nextInt(strCode.length)]);
		 
		      int str8digit=(int)((Math.random()*90000000)+10000000);
		      String strPhone=strrandom+Integer.toString(str8digit);
		
		 
		      return strPhone;

	      }

	
	
}
