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
import PageObjects.MainPage;
import PageObjects.ThirdPage;
import Resources.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MainPageTest extends Base
{
	 public  AppiumDriver <MobileElement> driver;
	
	@BeforeTest
	public void intialize() throws IOException
	{
		driver = intializedevice();
		
	}
	@Test(priority=1)
	   
	   public void VerifySavePage() throws IOException, InterruptedException
	   {
		   FirstPage lp = new FirstPage( driver);
		   Reporter.log("Step 1 Clicking on save Button");
		   lp.savebutton().click();
		   
	   }
	@Test(priority=2)
   
   public void verifyMainpageElements() throws IOException, InterruptedException
   {
	   MainPage mp = new MainPage( driver);
	  
	   Reporter.log("On home Page/n");
	   Thread.sleep(3000);
	  
	   mp.Podcasttab().click();
	   Reporter.log("On Podcast Page/n");
	   driver.navigate().back();
	   
	   Thread.sleep(3000);
	   
	   mp.Hotshotstab().click();
	   Reporter.log("On Hotshots Page/n");
	   driver.navigate().back();
	   Thread.sleep(3000);
	   
	   mp.Buzztab().click();
	   Reporter.log("On Buzz Page/n");
	   driver.navigate().back();
	  
	   Thread.sleep(3000);
	   
	   mp.MyMusictab().click();
	   Reporter.log("On My music Page/n");
	   
	  
   }
   
  @AfterTest
  public void teardown()
   {
	  driver.closeApp();


   }

}
