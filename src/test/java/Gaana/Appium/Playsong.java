package Gaana.Appium;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.Fifthpage;
import PageObjects.FirstPage;
import PageObjects.FourthPage;
import PageObjects.SecondPage;
import PageObjects.ThirdPage;
import Resources.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Playsong extends Base
{
	 public  AppiumDriver <MobileElement> driver;
	
	@BeforeTest
	public void intialize() throws IOException
	{
		driver = intializedevice();
		
	}
	
	@Test
   
   public void songplay() throws IOException, InterruptedException
   {
	  
	   
	
	   FirstPage lp = new FirstPage( driver);
	   lp.skipm().click();
	   Reporter.log("Step 1 clear/n");
	   SecondPage sp = new SecondPage(driver);
	   sp.search().click();
	   Reporter.log("Step 2 clear/n");
	  
	   FourthPage fp = new FourthPage(driver);
	   fp.textfind().click();
	   Thread.sleep(4000);
	   
	   fp.clickon().sendKeys("First Kiss");
	   fp.clickon().click();
       
	 
	   List<MobileElement> examples = (List<MobileElement>) fp.playsong();

	   for (MobileElement option: examples) 
	   { 
	           if(option.getText().contentEquals("First kiss"));
	           {
	        	   option.click();      
	            } 
	           
	   }
	   Thread.sleep(4000);
	   Fifthpage pp = new Fifthpage(driver);
	   
	   List<MobileElement> songslist = (List<MobileElement>) pp.songplayed();

	   for (MobileElement optionS: songslist) 
	   { 
	           if(optionS.getText().contains("First kiss"));
	           {
	        	   optionS.click();      
	            } 
	           
	   }
   
   }
   
 /* @AfterTest
 //  public void teardown()
   {
	  driver.closeApp();


   }
*/
}
