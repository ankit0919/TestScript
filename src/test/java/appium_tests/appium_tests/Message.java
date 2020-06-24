package appium_tests.appium_tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Message 
{
	WebDriver driver;
	static AppiumDriver<MobileElement> appdriver;
	AndroidDriver adbdriver;

	public static void main(String[] args) 
	{
		
		try {
			openCalculator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
			
	}
	
	
	public static void openCalculator() throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Redmi_Sushma");
		cap.setCapability("udid", "5534de407d34");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion" ,"7.1.2");
		
		cap.setCapability("appPackage" ,"com.android.mms");
		cap.setCapability("appActivity","com.android.mms.ui.ComposeMessageRouterActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
	
		appdriver = new AppiumDriver<MobileElement>(url, cap);
		
		Thread.sleep(2000);
		
		
		System.out.println("Application Started....");
		
		
		Thread.sleep(3000);
		
		appdriver.findElement(By.id("com.android.mms:id/recipients_editor")).sendKeys("9324396136");
		
		appdriver.findElement(By.id("com.android.mms:id/name")).click();
		
		appdriver.findElement(By.id("com.android.mms:id/embedded_text_editor")).sendKeys("Hi!");

		appdriver.findElement(By.id("com.android.mms:id/send_button")).click();
		
		Thread.sleep(3000);
		
		appdriver.quit();
		
		System.out.println("Message sent successfully");

  }
}
