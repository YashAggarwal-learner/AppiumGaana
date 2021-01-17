package PageObjects;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ThirdPage 
{
	public  AppiumDriver <MobileElement> driver;

    private	By camera = By.id("com.gaana:id/vibes_camera");
   
	
    public ThirdPage(AppiumDriver driver)
	{
		this.driver = driver;
	}
	
    public MobileElement skipm()
    {
    	return (MobileElement) driver.findElement(camera);
    }
}
