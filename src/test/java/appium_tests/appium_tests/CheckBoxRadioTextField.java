package appium_tests.appium_tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class CheckBoxRadioTextField 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		AppiumDriver<MobileElement> appdriver;
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Redmi_Sushma");
		cap.setCapability("udid", "5534de407d34");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion" ,"7.1.2");
		
		cap.setCapability("appPackage" ,"com.android.settings");
		cap.setCapability("appActivity","com.android.settings.Settings");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
	
		appdriver = new AppiumDriver<MobileElement>(url, cap);
		
		
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        
        //Views
		
		appdriver.findElements(By.id(" ")).get(10).click();
		
		//Controls
		appdriver.findElements(By.id(" ")).get(4).click(); 
		
		//Dark theme
		
		appdriver.findElementByAccessibilityId("2. Dark Theme").click();
		
		//text-box
		
		appdriver.findElement(By.id("")).sendKeys("");
		
		//Check-box
		
		appdriver.findElement(By.id("")).click();
		
		//Radio Button
		
		appdriver.findElement(By.id("")).click();
		
		
		appdriver.quit();
		
		
		
		

    }
}	
