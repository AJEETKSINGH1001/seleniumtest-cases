package datadriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WecarescreenShot {
	

	@Test
	public void TakeScreenShot() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//goto url
		driver.get("https://pharma-freelancer.com/pharma/");
		//Call take screenshot function
		WecarescreenShot.takeSnapShot(driver, "E://test33.png");
		
	}

	static void takeSnapShot(WebDriver driver, String string) {
		// TODO Auto-generated method stub
		
	}
	}