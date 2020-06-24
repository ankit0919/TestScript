package appium_tests.appium_tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;

public class DragAndDrop {

	public static void main(String[] args) throws MalformedURLException
	{
		
		AppiumDriver<MobileElement> appdriver;
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Redmi_Sushma");
		cap.setCapability("udid", "5534de407d34");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion" ,"7.1.2");
		
		cap.setCapability("appPackage" ,"com.android.contacts");
		cap.setCapability("appActivity","com.android.contacts.TwelveKeyDialer");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
	
		appdriver = new AppiumDriver<MobileElement>(url, cap);
		
		//Navigation
		
		
		appdriver.findElement(By.xpath("")).click();
		
		
		//Select element to be dragged
		WebElement source=appdriver.findElements(By.id("")).get(2);
		
		WebElement dest =  appdriver.findElements(By.id("")).get(5);
		
		
		TouchAction action = new TouchAction((MobileDriver)appdriver);
		
		//Drag and drop
		
		action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(dest)).release().perform();
		
		System.out.println("Element has been dropped at destination successfully");
		
		appdriver.quit();
		

	}

}
