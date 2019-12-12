package xonierpack;
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

public class SchoolERP_sign_in {  
   public static void main(String[] a) throws InterruptedException {  
		//code for launching chrome browser
   	
       String homePage = "http://xoniertechnologies.com/school-erp/";
       String url = "";
       HttpURLConnection huc = null;
       int respCode = 200;
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://xoniertechnologies.com/school-erp/login";
		driver.get(baseUrl);
		driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Log In | Global - School Management System";
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
     driver.get("http://xoniertechnologies.com/school-erp/login");
     
     System.out.println("welcome to login page");
     // Type username  
     WebElement username = driver.findElement(By.xpath("//*[@id=\"login\"]/div[1]/input"));  
     username.clear();  
     username.sendKeys("admin@gmail.com");  
     
     //Type Password  
     WebElement password = driver.findElement(By.xpath("//*[@id=\"inputSuccess2\"]"));  
     password.clear();  
     password.sendKeys("admin@123");  
     
     //Click on SignIn button  
     driver.findElement(By.xpath("//*[@id=\"login\"]/div[3]/input")).click();
     
     //comparing url after login
     Assert.assertTrue(driver.getCurrentUrl().matches("http://xoniertechnologies.com/school-erp/dashboard"), "Login failed");
     System.out.println("Login Successfully!!");
     //dashboard button

     //driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[2]/li/a")).click();
     
    // driver.findElement(By.xpath("//*[@id=\"userbox\"]/div/ul/li[3]/a")).click();
   //  System.out.println("Logout Successfully!!");
     //close browser  
     //driver.quit();  
     
     /*driver.get("https://pharma-freelancer.com/login");
     
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
     

   }  */
     driver.close();
     
     
 }}