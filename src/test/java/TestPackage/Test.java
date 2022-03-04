package TestPackage;


import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test {
	
	
	public AppiumDriver<MobileElement> driver;
	
	
	@BeforeClass
	public void setup() {
		
		try {
			DesiredCapabilities demo = new DesiredCapabilities();
		
			demo.setCapability("platformName", "Android");
			demo.setCapability("platformVersion", "12");
			demo.setCapability("deviceName", "emulator-5554");
			demo.setCapability("appPackage", "io.appium.android.apis");
			demo.setCapability("appActivity", "view.TextFields");
			demo.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			demo.setCapability("fullReset", false);
			demo.setCapability("noReset", true);
			
			
			URL urlName= new URL("http://127.0.0.1/	4723/wd/hub");
			
			driver = new AppiumDriver<MobileElement>(urlName,demo);
			
		}
		
		catch(Exception exp){
			
			System.out.println("Error is: " + exp.getCause());
			System.out.println("Message is: " + exp.getMessage());
			exp.printStackTrace();
			
		}
		
	}
	
		@AfterClass
		public void teardown() {
			driver.quit();
	
		
	}

}
