package fFreelancer;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CV_upload {

	public static void main(String args[]){
		//code for launching chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://pharma-freelancer.com/pharma/login");
	     
	     System.out.println("welcome to login page");
	     // Type username  
	     WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div/form/div[1]/input"));  
	     username.clear();  
	     username.sendKeys("testing1ajeet@gmail.com");  
	     
	     //Type Password  
	     WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div/form/div[2]/input"));  
	     password.clear();  
	     password.sendKeys("12345");  
	     
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
	     //wait
	    // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     //Click on SignIn button  
	     //driver.findElement(By.xpath("//*[@id=\"ddd\"]")).click();
	     WebElement element = driver.findElement(By.xpath("//*[@id=\"ddd\"]"));
	     Actions actions = new Actions(driver);
	     actions.moveToElement(element).click().build().perform();
	     
        //Go to Page    
        driver.get("https://pharma-freelancer.com/pharma/candidate/dashboard");
	    //clicking profile
        driver.get("https://pharma-freelancer.com/pharma/candidate/add-profile");
	    System.out.println("Profiles Clicked");
	    
	  //This  will scroll down the page by  1000 pixel vertical		
	    JavascriptExecutor jse6 = (JavascriptExecutor)driver;
	    jse6.executeScript("window.scrollBy(0,500)");
	    //typing place
	    WebElement text2 = driver.findElement(By.xpath("/html/body/section/div[2]/section/div/div/div[2]/section[7]/label"));
	    text2.click();
	    System.out.println("Upload CV");	 
	   //upload 
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.findElement(By.id("profile_attachment")).sendKeys("C:\\Users\\a\\Desktop\\sample.pdf");
	    System.out.println("CV Uploaded");
	     
	    //mail confirmation
	    WebElement text21 = driver.findElement(By.xpath("//*[@id=\"tinymce\"]"));
	    text21.clear();
	    text21.sendKeys("test");
	    WebElement button3 = driver.findElement(By.id("profile_portfolio_btn"));
	    button3.click();
	    System.out.println("Saved");
	    // driver.close();
}
} 