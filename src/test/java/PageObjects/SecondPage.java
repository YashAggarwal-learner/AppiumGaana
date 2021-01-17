package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SecondPage 
{
	 public  AppiumDriver <MobileElement> driver;

	    private	By hotshots = By.xpath("//android.widget.FrameLayout[@content-desc='Hotshots']/android.widget.ImageView");
	    private By search = By.id("com.gaana:id/txt_search");
	    
		
	    public SecondPage(AppiumDriver driver)
		{
			this.driver = driver;
		}
		
	    public MobileElement tappinghotshots()
	    {
	    	return (MobileElement) driver.findElement(hotshots);
	    }

	    public MobileElement search()
	    {
	    	return (MobileElement) driver.findElement(search);
	    }




}
