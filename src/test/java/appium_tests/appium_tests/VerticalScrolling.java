package appium_tests.appium_tests;

import java.awt.List;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class VerticalScrolling {

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
		
		//vertical scrolling
		

		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		
		appdriver.findElements(By.id(" ")).get(10).click();
		
		//capturing all list items
		
		AndroidElement list= (AndroidElement) appdriver.findElement(By.id(""));
		
		
		//scroll down till we get the element -Clicks on Switches
		
		MobileElement listitem = (MobileElement) appdriver.findElement
				(
						MobileBy.AndroidUIAutomator(
								"new UiScrollable(new UiSelector()).scrollIntoView("
								+ " new UiSelector().description(\"Switches\"));"));
		
				
				System.out.println(listitem.getLocation());
				
				listitem.click();
			
		
		




		
		Thread.sleep(5000);

		appdriver.quit();
		
		
		


	}

}
