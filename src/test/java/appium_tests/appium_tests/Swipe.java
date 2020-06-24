package appium_tests.appium_tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Swipe {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
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
		
		MobileElement Panel = appdriver.findElement(By.id(""));
		
		SwipeScreen(Panel, appdriver);
		
		
		appdriver.quit();
		
		
	

	}
	
	public static void SwipeScreen(MobileElement el, AppiumDriver appdriver) throws InterruptedException
	{
		MobileElement Panel =el;
		Dimension dimension = Panel.getSize();
		
		int Anchor = Panel.getSize().getHeight()/2; //Get swipe position
		
		Double ScreenWidthStart = dimension.getWidth()*0.8;
		
		int scrollStart = ScreenWidthStart.intValue();
		
		Double ScreenWidthEnd = dimension.getWidth()*0.2;
		
		int scrollEnd = ScreenWidthEnd.intValue();
		
		
		new TouchAction((PerformsTouchActions) appdriver)
		.press(PointOption.point(scrollStart, Anchor))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(scrollEnd, Anchor)).release().perform();
		
		Thread.sleep(5000);
		
        

	}
	

}
