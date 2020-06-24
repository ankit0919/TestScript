package appium_tests.appium_tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {
	
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
		
		cap.setCapability("appPackage" ,"com.miui.calculator");
		cap.setCapability("appActivity","com.miui.calculator.cal.CalculatorActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
	
		appdriver = new AppiumDriver<MobileElement>(url, cap);
		
		Thread.sleep(2000);
		
		
		System.out.println("Application Started....");
		
		
        MobileElement seven = appdriver.findElement(By.id("com.miui.calculator:id/btn_7_s"));
		
		MobileElement plus = appdriver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
		
		MobileElement three = appdriver.findElement(By.id("com.miui.calculator:id/btn_3_s"));
		
		MobileElement equals = appdriver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
		
		
		
		seven.click();
		plus.click();
		three.click();
		equals.click();
		
		Thread.sleep(3000);
		
		MobileElement result = appdriver.findElement(By.id("com.miui.calculator:id/result"));
		
		
		
		String res = result.getText();
		

		if(result.equals("10"))
		{
			System.out.println("Test Passed...");
			
		}
		else
		{
			System.out.println("Test Failed..");
		}
		
		
		appdriver.quit();
		
		
	}

}
