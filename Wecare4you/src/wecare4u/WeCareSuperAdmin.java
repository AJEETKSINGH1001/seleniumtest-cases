package wecare4u;

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

public class WeCareSuperAdmin {
    
    public static void main(String[] args) {
       // TODO Auto-generated method stub
    	
        String homePage = "http://wecare4u.co/uat/";
        String url = "";
        HttpURLConnection huc = null;
        int respCode = 200;
        // code for super admin link checkers
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");		
        WebDriver driver = new ChromeDriver();
        
		String baseUrl = "https://wecare4u.co/uat/";
		driver.get(baseUrl);
		driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Wecare4you";
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
     driver.get("https://wecare4u.co/uat/adminlogin");
     
     System.out.println("welcome to login page");
     // Type username  
     WebElement username = driver.findElement(By.name("email"));  
     username.clear();  
     username.sendKeys("admin@gmail.com");  
     
     //Type Password  
     WebElement password = driver.findElement(By.name("password"));  
     password.clear();  
     password.sendKeys("admin");  
     
     /*// get Math question  
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
     capta.sendKeys("" + summation);  */
     
     //Click on SignIn button  
     driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div")).click();
     
     //comparing url after login
     Assert.assertTrue(driver.getCurrentUrl().matches("https://wecare4u.co/uat/admin/index"), "Invalid credentials");
     System.out.println("Login to wecare4you superadmin Successfully!!");
     //dashboard button
       // driver.manage().window().maximize();
        
        driver.get("https://wecare4u.co/uat/admin/index");
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        Iterator<WebElement> it = links.iterator();
        
        while(it.hasNext()){
            
            url = it.next().getAttribute("href");
            
            System.out.println(url);
        
            if(url == null || url.isEmpty()){
          System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }
            
            if(url.startsWith(homePage)){
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }
            
            try {
                huc = (HttpURLConnection)(new URL(url).openConnection());
                
                huc.setRequestMethod("HEAD");
                
                huc.connect();
                
                respCode = huc.getResponseCode();
                
                if(respCode >= 400){
                    System.out.println(url+" is a broken link");
                }
                else{
                    System.out.println(url+" is a valid link");
                }
                    
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
       // driver.quit();

    }
}