package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Base 
{
	 public  AppiumDriver <MobileElement> driver;
	 public Properties prop;

public AppiumDriver intializedevice() throws IOException 
{
	
	prop = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/Resources/data properties");

	prop.load(fis);
	//MVN TEST -Dbrowser=chrome
	//String deviceName = System.getProperty("device"); // it will take the parameter from the maven in command terminal
	String deviceName = prop.getProperty("device");
		
	if(deviceName.contains("Android"))
	{
		 DesiredCapabilities dc = new DesiredCapabilities();
		 dc.setCapability("deviceName","Redmi8" );
		 dc.setCapability("udid","00d5498d0307" );
		 dc.setCapability("platformName","Android" );
		 dc.setCapability("platformVersion","9" );
		 dc.setCapability("appPackage","com.gaana");
		 dc.setCapability("appActivity","com.gaana.SplashScreenActivity");
		
		 
		 URL url = new URL("http://127.0.0.1:4723/wd/hub");
		 driver = new <MobileElement> AppiumDriver(url,dc);
		
		 System.out.println("Application started");
	}
	else if(deviceName.contains("iOS"))
	{
		//firefox code
	}
	else if(deviceName.contains("Kindle"))
	{
		
	}

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	return driver;

	}
	
	public String getScreenShotPath(String testCaseName ,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"/reports/"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
	}




public  void main(String[] args) 
{
	try {
		intializedevice();
	
	} catch (Exception exp) 
	{
		System.out.println(exp.getCause());
		System.out.println(exp.getMessage());
		exp.printStackTrace();
	}
}












}





