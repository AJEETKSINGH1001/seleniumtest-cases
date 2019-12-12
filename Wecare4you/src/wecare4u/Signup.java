package wecare4u;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Signup {
	
	 @Test
	    public void Register(){

	    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();
	        String baseUrl = "https://wecare4u.co/beta/sign-up";
	        driver.get(baseUrl);
	        driver.manage().window().maximize();

	        //Selecting the radio buttons
	        WebElement radio1 = driver.findElement(By.id("individual"));							
	        WebElement radio2 = driver.findElement(By.id("findcaregivers"));
	      //Radio Button1 is selected		
	        radio1.click();			
	        System.out.println("individual Option 1 Selected");					
	        		
	        //Radio Button1 is de-selected and Radio Button2 is selected		
	        radio2.click();			
	        System.out.println("findcaregivers Option 2 Selected");
	        
	        WebElement text2 = driver.findElement(By.id("firstname"));
	        text2.clear();
	        text2.sendKeys("test999");

	        WebElement text3 = driver.findElement(By.id("lastname"));
	        text3.clear();
	        text3.sendKeys("abcxyz");

	        WebElement text4 = driver.findElement(By.id("email"));
	        text4.clear();
	        text4.sendKeys("aj1254@gmail.com");

	        WebElement text5 = driver.findElement(By.xpath("//*[@id=\"select2-phonecode-container\"]"));
	        text5.click();
	      

	        WebElement text6 = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
	        text6.sendKeys("9806754328");
	        
	        WebElement text7 = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
	        text7.clear();
	        text7.sendKeys("8707840876");
	        
	        WebElement text8 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	        text8.clear();
	        text8.sendKeys("555556");

	        WebElement text9 = driver.findElement(By.xpath("//*[@id=\"confirm_password\"]"));
	        text9.clear();
	        text9.sendKeys("555556");
	        
	        WebElement text10 = driver.findElement(By.xpath("//*[@id=\"address\"]"));
	        text10.clear();
	        text10.sendKeys("noida");
	        
	        new Select(driver.findElement(By.xpath("//*[@id=\"errorcountry\"]/span/span[1]/span/span[2]"))).deselectByVisibleText("India");
	        /*WebElement country = driver.findElement(By.id("select2-country-container"));
	        Select dropdown = new Select(country);

	        dropdown.selectByVisibleText("India"); */
	        
	       /* WebElement dropdown = driver.findElement(By.id("select2-country-container"));
	        dropdown.click();
	        List<WebElement> options = dropdown.findElements(By.className("select2-results__option"));
	        ((WebElement) options).click();*/
	        /*
	        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).click();
	        System.out.println("You are able to click on Dropdown");

	        driver.findElement(By.id("select2-country-container")).sendKeys("India");*/

	        
	        WebElement text12 = driver.findElement(By.xpath("//*[@id=\"state\"]/option[39]"));
	        text12.click();
	           
	        WebElement text13 = driver.findElement(By.xpath("//*[@id=\"city\"]/option[493]"));
	        text13.click();
	        
	        WebElement text14 = driver.findElement(By.id("postalcode"));
	        text14.clear();
	        text14.sendKeys("245674");
	        
	        WebElement text15 = driver.findElement(By.xpath("//*[@id=\"howdidyouhear\"]/option[6]"));
	        text15.click();
	        
	        WebElement radio3 = driver.findElement(By.name("termsconditions"));
	        radio3.click();			
	        System.out.println("terms conditions Selected");
	        
	        //submit button
	        WebElement text16 = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
	        text16.click();
	        System.out.println("submitted succesfully");
	     	        
}
}