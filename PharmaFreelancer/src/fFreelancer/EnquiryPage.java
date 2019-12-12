package fFreelancer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class EnquiryPage {
	
	 @Test
	    public void EnquiryFrom(){

	    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();
	        String baseUrl = "https://pharma-freelancer.com/pharma/jobs-details/3046/associate-director-marketing-operations";
	        driver.get(baseUrl);
	        driver.manage().window().maximize();
	        JavascriptExecutor jse = (JavascriptExecutor)driver;
	        jse.executeScript("window.scrollBy(0,250)");

	        //By ID Text area1
	        WebElement s = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
	        s.sendKeys("test1111");
	        
	        WebElement g = driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
	        g.sendKeys("ghghg");
	        
	        WebElement text2 = driver.findElement(By.xpath("//*[@id=\"company\"]"));
	        text2.clear();
	        text2.sendKeys("xonier");

	        WebElement text3 = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	        text3.clear();
	        text3.sendKeys("abcxyz@bbb.kk");

	        WebElement text4 = driver.findElement(By.xpath("//*[@id=\"phone_number\"]"));
	        text4.clear();
	        text4.sendKeys("76544645646jhjh");
	        {
	        System.out.println("Accepting alphanumeric");
	        }

	        WebElement text5 = driver.findElement(By.xpath("//*[@id=\"zipcode\"]"));
	        text5.clear();
	        text5.sendKeys("87657765hgb");
	        {
		        System.out.println("Accepting alphanumeric");
		    }


	        WebElement text6 = driver.findElement(By.xpath("//*[@id=\"country\"]"));
	        text6.sendKeys("india");
	        
	       /* WebElement text7 = driver.findElement(By.xpath("phone_number"));
	        text7.clear();
	        text7.sendKeys("8707840876");*/
	        
	        WebElement text8 = driver.findElement(By.xpath("//*[@id=\"website\"]"));
	        text8.clear();
	        text8.sendKeys("www.jkjiu");

	        WebElement text9 = driver.findElement(By.xpath("//*[@id=\"subject\"]"));
	        text9.clear();
	        text9.sendKeys("ssubject");
	        
	        WebElement text10 = driver.findElement(By.xpath("//*[@id=\"description\"]"));
	        text10.sendKeys("ssubject");
	        

	        // get Math question  
	       String mathquestionvalue = driver.findElement(By.xpath("//*[@id=\"captchaText\"]")).getText().trim();  

	        // remove space if exist  
	        String removespace = mathquestionvalue.replaceAll("\\s+", "");  
	        // get two numbers   
	        String[] parts = removespace.split("\\+");  
	        String part1 = parts[0];  
	        String part2 = parts[1];  
	        String[] parts1 = part2.split("\\=");  
	        String part11 = parts1[0];  

	        // sum two numbers  
	       int summation = Integer.parseInt(part1) + Integer.parseInt(part11);  

	        // Math Capcha value
	        WebElement capta = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
	        capta.clear();  
	        capta.sendKeys("" + summation); 
	        //code for implicit wait 
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        //handling disable button
	        WebElement yourButton= driver.findElement(By.id("send_alert"));

	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].removeAttribute('disabled','disabled')",yourButton);

	        WebDriverWait wait = new WebDriverWait(driver, 20);
	       // wait.until(ExpectedConditions.elementToBeClickable(yourButton));

	        yourButton.click();
	        
	       //Click on SignIn button  
	       // driver.findElement(By.id("send_alert")).click();
	      //*[@id="send_alert"]
            
            driver.close();

}
}