package xonierpack;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindBrokenImages {

public static void main(String[] args) {

// Telling Selenium to find Chrome Driver
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");			

// Initialize browser
WebDriver driver = new ChromeDriver();

// Maximize Browser Window
driver.manage().window().maximize();

// Launch school ERP
driver.get("http://xoniertechnologies.com/xonieruat/");

/*
//To launch xoniertechnologies.com
System.out.println("welcome to login page");
// Type username  
WebElement username = driver.findElement(By.name("email"));  
username.clear();  
username.sendKeys("admin@gmail.com");  

//Type Password  
WebElement password = driver.findElement(By.name("password"));  
password.clear();  
password.sendKeys("admin@123"); 

//Click on SignIn button 
driver.findElement(By.name("submit")).click();

System.out.println("login successfully");*/

// Storing all the 'img' tags in a Array List
List<WebElement> links = driver.findElements(By.tagName("img"));

// Displaying the total number of links in the Webpage
System.out.println("Total Image links are " + links.size());

for (int i = 0; i <= links.size(); i++) {
try {
// Iterating through the array list and getting the URL's
String nextHref = ((WebElement) links.get(i)).getAttribute("src");

// Getting the Response Code for URL
URL url = new URL(nextHref);
HttpURLConnection connection = (HttpURLConnection) url.openConnection();
connection.setRequestMethod("GET");
connection.connect();
int code = connection.getResponseCode();

// Condition to check whether the URL is valid or Invalid
if (code == 200) {
System.out.println("Valid Image:" + nextHref);
} else {
System.out.println("INVALID Image:" + nextHref);
}          
} catch (Exception e) {
System.out.println(e.getMessage());
}
}
//Close the browser
//driver.quit();
}
}