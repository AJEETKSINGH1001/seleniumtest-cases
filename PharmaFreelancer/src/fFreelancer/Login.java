package fFreelancer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login {  
   public static void main(String[] a) throws InterruptedException {  
		//code for launching chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://pharma-freelancer.com/uat/";
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
     driver.get("https://pharma-freelancer.com/uat/login");
     
     System.out.println("welcome to login page");
     // Type username  
     WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div/form/div[1]/input"));  
     username.clear();  
     username.sendKeys("user@gmail.com");  
     
     //Type Password  
     WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div/form/div[2]/input"));  
     password.clear();  
     password.sendKeys("admin");  
     
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
     Assert.assertTrue(driver.getCurrentUrl().matches("https://pharma-freelancer.com/uat/candidate/dashboard"), "Invalid credentials");
     System.out.println("Login Successfully!!");
     //dashboard button

     driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[2]/li/a")).click();
     
     driver.findElement(By.xpath("//*[@id=\"userbox\"]/div/ul/li[3]/a")).click();
     System.out.println("Logout Successfully!!");
     //close browser  
     //driver.quit();  
   }  
 }