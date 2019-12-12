package indeedsearch;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Uploadresume {

	public static void main(String args[]){
		//code for launching chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://www.indeed.co.in/";
		driver.get(baseUrl);
		driver.getTitle();
		String expectedTitle = "Job Search India | Indeed";
		String actualTitle = "";
	    driver.get(baseUrl);
	   // get the actual value of the title
	    actualTitle = driver.getTitle();
	//matching the titles 
	    if (actualTitle.contentEquals(expectedTitle)){
	        System.out.println("Title matched");
	    } else {
	        System.out.println("Title not matched");
	    }
	    
	    //typing profile
	    WebElement text1 = driver.findElement(By.id("text-input-what"));
	    text1.clear();
	    text1.sendKeys("Manual Tester");
	    //typing place
	    WebElement text2 = driver.findElement(By.id("text-input-where"));
	    driver.findElement(By.id("text-input-where")).clear();
	    text2.sendKeys(" ");
	    System.out.println("Showing Search results");
	    //clicking on the search button 
	    WebElement button = driver.findElement(By.xpath("//*[@id=\"whatWhere\"]/div/div/form/div[3]/button"));
	    button.click();
	 
	//upload
	    WebElement button2 = driver.findElement(By.linkText("Upload Your Resume"));
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    button2.click();
	    driver.findElement(By.id("upload-resume-button")).sendKeys("C:\\Users\\a\\Desktop\\sample.pdf");
	    System.out.println("Resume Uploaded");
	     
	    //mail confirmation
	    WebElement text21 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div/div[2]/div/div[1]/div[2]/form/div/div/input"));
	    text21.clear();
	    text21.sendKeys("ajeet10jan@gmail.com");
	    WebElement button3 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[2]/div/div/div[2]/div/div[1]/div[3]/div/div[1]/form/button"));
	    button3.click();
	    System.out.println("Email Submitted");
	     driver.close();
}
} 