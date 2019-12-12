package fFreelancer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Signup {
	
	 @Test
	    public void Register(){

	    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();
	        String baseUrl = "https://pharma-freelancer.com/registration";
	        driver.get(baseUrl);
	        driver.manage().window().maximize();

	        //By ID Text area1
	        WebElement s = driver.findElement(By.xpath("//*[@id=\"user_type\"]/option[2]"));
	        s.click();
	        
	        WebElement g = driver.findElement(By.xpath("//*[@id=\"gender\"]/option[2]"));
	        g.click();
	        
	        WebElement text2 = driver.findElement(By.id("display_name"));
	        text2.clear();
	        text2.sendKeys("test999");

	        WebElement text3 = driver.findElement(By.id("first_name"));
	        text3.clear();
	        text3.sendKeys("abcxyz");

	        WebElement text4 = driver.findElement(By.id("last_name"));
	        text4.clear();
	        text4.sendKeys("mnmnmn");

	        WebElement text5 = driver.findElement(By.id("email"));
	        text5.clear();
	        text5.sendKeys("aj1254@gmail.com");

	        WebElement text6 = driver.findElement(By.xpath("//*[@id=\"country\"]/option[101]"));
	        text6.click();
	        
	        WebElement text7 = driver.findElement(By.id("phone_number"));
	        text7.clear();
	        text7.sendKeys("8707840876");
	        
	        WebElement text8 = driver.findElement(By.id("password"));
	        text8.clear();
	        text8.sendKeys("55555");

	        WebElement text9 = driver.findElement(By.id("confirm_password"));
	        text9.clear();
	        text9.sendKeys("55555");
	        
	        WebElement text10 = driver.findElement(By.xpath("//*[@id=\"wantto\"]/option[2]"));
	        text10.click();
	        
	        driver.findElement(By.xpath("//*[@id=\"profile_attachment\"]")).sendKeys("C:\\Users\\a\\Desktop\\sample.pdf");
	        /*
	        WebElement text11 = driver.findElement(By.id("profile_attachment_description"));
	        text11.clear();
	        text11.sendKeys("test12345678");*/
	       /* WebDriverWait wait = new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"profile_attachment_description\"]")));   examining the xpath for a search     
	        box
	        driver.findElement(By.xpath("//*[@id=\"profile_attachment_description\"]")).sendKeys("TEXTcxcx");   enter text in search 
	        box*/
	        
            WebElement maleRadioBtn = driver.findElement (By.id("terms_cond"));
            maleRadioBtn.isSelected(); // this returns a Boolean value, if it returns true then said radio button is selected or it returns False
            
            WebElement maleRadioBtn2 = driver.findElement (By.id("privacy_policy"));
            maleRadioBtn2.isSelected();
            
            String capchavalue = driver.findElement(By.xpath("//*[@id=\"captchaText\"]")).getText();
            int firstinteger= Integer.parseInt(capchavalue.substring(0, 2));
            int secondinteger= Integer.parseInt(capchavalue.substring(5, 6));
            int calc= firstinteger+secondinteger;
            String final_value= String.valueOf(calc);
            driver.findElement(By.xpath("//*[@id=\"captchaInput\"]")).sendKeys(final_value);
            
            WebElement button = driver.findElement(By.xpath("//*[@id=\"proceed\"]"));
            button.click();
            System.out.println("registration proceeded!");
            
}
}