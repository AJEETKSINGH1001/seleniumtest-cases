package fFreelancer;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CandidateDashboard {  
   public static void main(String[] a) throws InterruptedException {  
		//code for launching chrome browser
   	
       String homePage = "https://pharma-freelancer.com/login";
       String url = "";
       HttpURLConnection huc = null;
       int respCode = 200;
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://pharma-freelancer.com";
		driver.get(baseUrl);
		driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Apply for jobs in pharma | Jobs in pharma| Post resumes";
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
	      //Go to Page    
     driver.get("https://pharma-freelancer.com/login");
     
     System.out.println("welcome to login page");
     // Type username  
     WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div/form/div[1]/input"));  
     username.clear();  
     username.sendKeys("john@teleworm.us");  
     
     //Type Password  
     WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div/form/div[2]/input"));  
     password.clear();  
     password.sendKeys("123456");  
     
     // get Math question  
     String mathquestionvalue = driver.findElement(By.id("captchaText")).getText().trim();  
     
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
     
     //Click on SignIn button  
     driver.findElement(By.xpath("//*[@id=\"ddd\"]")).click();
     
     //comparing url after login
     Assert.assertTrue(driver.getCurrentUrl().matches("https://pharma-freelancer.com/candidate/dashboard"), "Invalid credentials");
     System.out.println("Login Successfully!!");
     //dashboard button

     //driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[2]/li/a")).click();
     
    // driver.findElement(By.xpath("//*[@id=\"userbox\"]/div/ul/li[3]/a")).click();
   //  System.out.println("Logout Successfully!!");
     //close browser  
     //driver.quit();  
     
     driver.get("https://pharma-freelancer.com/login");
     
     List<WebElement> links = driver.findElements(By.tagName("a"));
     
     Iterator<WebElement> it = links.iterator();
     
     while(it.hasNext()){
         
         String url1 = it.next().getAttribute("href");
         
         System.out.println(url1);
     
         if(url1 == null || url1.isEmpty()){
       System.out.println("URL is either not configured for anchor tag or it is empty");
             continue;
         }
         
        // String homePage="https://pharma-freelancer.com/uat/login";
		if(url1.startsWith(homePage)){
             System.out.println("URL belongs to home page , skipping it.");
             continue;
         }
         
         try {
             huc = (HttpURLConnection)(new URL(url1).openConnection());
             
             huc.setRequestMethod("HEAD");
             
             huc.connect();
             
             respCode = huc.getResponseCode();
             
             if(respCode >= 400){
                 System.out.println(url1+" is a broken link");
             }
             else{
                 System.out.println(url1+" is a valid link");
             }
                 
         } catch (MalformedURLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         } catch (IOException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
     }
     

   }  
 }