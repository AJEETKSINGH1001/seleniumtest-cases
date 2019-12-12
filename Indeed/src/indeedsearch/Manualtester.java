package indeedsearch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.NoSuchElementException;


public class Manualtester{

	public static void main(String args[]){
	//code for launching chrome browser
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String baseUrl = "https://www.indeed.co.in/";
	driver.get(baseUrl);
	driver.getTitle();
	String expectedTitle = "Job Search India | Indeed";
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
    
    //typing profile
    WebElement text1 = driver.findElement(By.id("text-input-what"));
    text1.clear();
    text1.sendKeys("Manual Tester");
    //typing place
    WebElement text2 = driver.findElement(By.id("text-input-where"));
    driver.findElement(By.id("text-input-where")).clear();
    text2.sendKeys(" ");
    //clicking on the search button 
    WebElement button = driver.findElement(By.xpath("//*[@id=\"whatWhere\"]/div/div/form/div[3]/button"));
    button.click();
    
    //actions on  the manual tester search results profile 1
    
    WebElement text3 = driver.findElement(By.linkText("Quality Analyst (QA) Tester"));
    text3.click();
    System.out.println("Profile 1 visited");
    driver.get(baseUrl);
   // driver.quit();
}
}