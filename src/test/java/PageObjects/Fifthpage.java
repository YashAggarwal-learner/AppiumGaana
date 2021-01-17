package PageObjects;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Fifthpage 
{
	public  AppiumDriver <MobileElement> driver;

    
    private By song = By.id("com.gaana:id/ll_track_container");
	
    public Fifthpage(AppiumDriver driver)
	{
		this.driver = driver;
	}
	
     public List<MobileElement> songplayed()
    {
    	return (List<MobileElement>) driver.findElements(song);
    }


}
