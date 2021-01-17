package Gaana.Appium;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.FirstPage;
import PageObjects.SecondPage;
import PageObjects.ThirdPage;
import Resources.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Skippage extends Base
{
	 public  AppiumDriver <MobileElement> driver;
	
	@BeforeTest
	public void intialize() throws IOException
	{
		driver = intializedevice();
		
	}
	
	@Test
   
   public void SkipPage() throws IOException, InterruptedException
   {
	  
	   
	
	   FirstPage lp = new FirstPage( driver);
	   lp.skipm().click();
	   Reporter.log("Step 1 clear/n");
	   SecondPage sp = new SecondPage(driver);
	   sp.tappinghotshots().click();
	   Reporter.log("Step 2 clear/n");
	   Thread.sleep(4000);
	   ThirdPage tp = new ThirdPage(driver);
	   WebDriverWait wait = new WebDriverWait(driver, 20);
	   wait.until(ExpectedConditions.visibilityOf(tp.skipm()));
	   tp.skipm().click();
	   Reporter.log("Step 3 clear/n");
   }
   
   @AfterTest
   public void teardown()
   {
	  driver.closeApp();

;
   }

}
