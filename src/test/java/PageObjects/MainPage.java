package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MainPage 
{
	 public  AppiumDriver <MobileElement> driver;

	    private	By hometab = By.xpath("//android.widget.FrameLayout[@content-desc='Home']/android.widget.ImageView");
	    private By Podcasttab = By.xpath("//android.widget.FrameLayout[@content-desc='Podcast']/android.view.ViewGroup/android.widget.TextView[2]");
	    private By Hotshotstab = By.xpath("//android.widget.FrameLayout[@content-desc='Hotshots']/android.view.ViewGroup/android.widget.TextView[2]");
	    private By Buzztab = By.xpath("//android.widget.FrameLayout[@content-desc='Buzz']/android.view.ViewGroup/android.widget.TextView[2]");
	    private By MyMusictab = By.xpath("//android.widget.FrameLayout[@content-desc='My Music']/android.view.ViewGroup/android.widget.TextView[2]");
	    
	    public MainPage(AppiumDriver driver)
		{
			this.driver = driver;
		}
		
	    public MobileElement Hometab()
	    {
	    	return (MobileElement) driver.findElement(hometab);
	    }

	    public MobileElement Podcasttab()
	    {
	    	return (MobileElement)driver.findElement(Podcasttab);
	    }
	    public MobileElement Hotshotstab()
	    {
	    	return (MobileElement)driver.findElement(Hotshotstab);
	    }
	    public MobileElement  Buzztab()
	    {
	    	return (MobileElement)driver.findElement(Buzztab);
	    }
	    public MobileElement MyMusictab()
	    {
	    	return (MobileElement)driver.findElement(MyMusictab);
	    }




}
