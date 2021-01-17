package PageObjects;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FourthPage 
{
	public  AppiumDriver <MobileElement> driver;

    private	By text = By.id("com.gaana:id/search_src_text");
    private By picksong = By.id("com.gaana:id/search_src_text");
	private By play = By.id("com.gaana:id/tv_search_keyword");
    
	public FourthPage(AppiumDriver driver)
	{
		this.driver = driver;
	}
	
    public MobileElement textfind()
    {
    	return (MobileElement) driver.findElement(text);
    }
    
    public MobileElement clickon()
    {
    	return (MobileElement) driver.findElement(picksong);
    }

    public List<MobileElement> playsong()
    {
    	return (List<MobileElement>) driver.findElements(play);
    }

    

}

