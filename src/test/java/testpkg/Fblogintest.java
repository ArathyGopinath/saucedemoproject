package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Fbloginpage;
import utilities.Excelutils;

public class Fblogintest extends Baseclass {
	
	@Test
	public void verifyLoginWithValidCred()
	{
		  Fbloginpage ob=new Fbloginpage(driver);
		   
		  //reading data from excel file by the specified path

	       String xl="\"C:\\Users\\Acer\\Desktop\\ARATHY\\LUMINAR\\excel work\\fblogin.xlsx\"";
	       String Sheet="Sheet1";
	       int rowCount=Excelutils.getRowCount(xl,Sheet);
	    
	       for(int i=1;i<=rowCount;i++)
	       {
	    	   String un=Excelutils.getCellValue(xl,Sheet,i,0);
	    	   System.out.println("username...." +un);
	    	 
	    	   String pswd=Excelutils.getCellValue(xl,Sheet,i,1);
	    	   System.out.println("password...." +pswd);
	    	 
	    	   ob.setvalues(un, pswd);                                    //passing un and pwd as parameters
	    	   ob.loginclick();                                              //clicking login button
	       }	

	 
	   String expurl="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzE0Mjk4MjEzLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
	   String actualurl=driver.getCurrentUrl();
	   
	   if(actualurl.equals(expurl))
	   {
		   System.out.println("pass");
	   }
	   else
	   {
		   System.out.println("fail");
	   }
   }
}
