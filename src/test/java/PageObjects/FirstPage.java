package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FirstPage 
{
	 public  AppiumDriver <MobileElement> driver;

    private	By save = By.id("com.gaana:id/btn_save");
   
	
    public FirstPage(AppiumDriver driver)
	{
		this.driver = driver;
	}
	
    public MobileElement savebutton()
    {
    	return (MobileElement) driver.findElement(save);
    }




}
