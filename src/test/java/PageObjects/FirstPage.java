package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FirstPage 
{
	 public  AppiumDriver <MobileElement> driver;

    private	By skip = By.id("com.gaana:id/txt_skip");
   
	
    public FirstPage(AppiumDriver driver)
	{
		this.driver = driver;
	}
	
    public MobileElement skipm()
    {
    	return (MobileElement) driver.findElement(skip);
    }




}
