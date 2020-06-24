package appium_tests.appium_tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DialNumber
{
	WebDriver driver;
	static AppiumDriver<MobileElement> appdriver;
	AndroidDriver adbdriver;

	public static void main(String[] args) 
	{
		
		try {
			dialNumber();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
			
	}
	
	
	public static void dialNumber() throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Redmi_Sushma");
		cap.setCapability("udid", "5534de407d34");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion" ,"7.1.2");
		
		cap.setCapability("appPackage" ,"com.android.contacts");
		cap.setCapability("appActivity","com.android.contacts.TwelveKeyDialer");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
	
		appdriver = new AppiumDriver<MobileElement>(url, cap);
		
		Thread.sleep(2000);
		
		
		System.out.println("Application Started....");
		
		//appdriver.findElement(By.id("android:id/icon")).click();
		
		//dial 9324396136
		
		appdriver.findElement(By.id("com.android.contacts:id/nine")).click();
		appdriver.findElement(By.id("com.android.contacts:id/three")).click();
		appdriver.findElement(By.id("com.android.contacts:id/two")).click();
		appdriver.findElement(By.id("com.android.contacts:id/four")).click();
		appdriver.findElement(By.id("com.android.contacts:id/three")).click();
		appdriver.findElement(By.id("com.android.contacts:id/nine")).click();
		appdriver.findElement(By.id("com.android.contacts:id/six")).click();
		appdriver.findElement(By.id("com.android.contacts:id/one")).click();
		appdriver.findElement(By.id("com.android.contacts:id/three")).click();
		appdriver.findElement(By.id("com.android.contacts:id/six")).click();
		
		Thread.sleep(2000);
		
		appdriver.findElement(By.id("com.android.contacts:id/call_sim1")).click();
		
		Thread.sleep(3000);
		
		
		
       
	}


}
