package xonierpack;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class SchoolERP {
	public static void main(String[] args) throws InterruptedException {
		//Instantiating chromedriver
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");					
	      WebDriver driver = new ChromeDriver();	
		//Maximize the browser
		driver.manage().window().maximize();
		//Implicit wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//To launch xoniertechnologies.com
		driver.get("https://pharma-freelancer.com/");
		//Wait for 5 seconds
		Thread.sleep(5000);
	
	   /*  System.out.println("welcome to login page");
	     // Type username  
	     WebElement username = driver.findElement(By.name("email"));  
	     username.clear();  
	     username.sendKeys("admin@gmail.com");  
	     
	     //Type Password  
	     WebElement password = driver.findElement(By.name("password"));  
	     password.clear();  
	     password.sendKeys("admin@123"); 
	     
	   //Click on SignIn button s
	     driver.findElement(By.name("submit")).click();
	     //login confirmation
	     System.out.println("login successfully");*/
	     
		//Used tagName method to collect the list of items with tagName "a"
		//findElements - to find all the elements with in the current page. It returns a list of all webelements or an empty list if nothing matches
		List<WebElement> links = driver.findElements(By.tagName("a"));	
		//To print the total number of links
		System.out.println("Total links are "+links.size());	
		//used for loop to 
		for(int i=0; i<links.size(); i++) {
			WebElement element = links.get(i);
			//By using "href" attribute, we could get the url of the requried link
			String url=element.getAttribute("href");
			//calling verifyLink() method here. Passing the parameter as url which we collected in the above link
			//See the detailed functionality of the verifyLink(url) method below
			verifyLink(url);			
		}	
	}
	
	// The below function verifyLink(String urlLink) verifies any broken links and return the server status. 
	public static void verifyLink(String urlLink) {
        //Sometimes we may face exception "java.net.MalformedURLException". Keep the code in try catch block to continue the broken link analysis
        try {
			//Use URL Class - Create object of the URL Class and pass the urlLink as parameter 
			URL link = new URL(urlLink);
			// Create a connection using URL object (i.e., link)
			HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
			//Set the timeout for 2 seconds
			httpConn.setConnectTimeout(2000);
			//connect using connect method
			httpConn.connect();
			//use getResponseCode() to get the response code. 
				if(httpConn.getResponseCode()== 200) {	
					System.out.println(urlLink+" - "+httpConn.getResponseMessage());
				}
				if(httpConn.getResponseCode()== 404) {
					System.out.println(urlLink+" - "+httpConn.getResponseMessage());
				}
			}
			//getResponseCode method returns = IOException - if an error occurred connecting to the server. 
		catch (Exception e) {
			//e.printStackTrace();
		}
    } 
}