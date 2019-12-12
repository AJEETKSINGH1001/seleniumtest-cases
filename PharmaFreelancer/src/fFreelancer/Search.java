package fFreelancer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.JavascriptExecutor;


public class Search{
	@Test
	public void searchboxhome() {

	//code for launching chrome browser
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String baseUrl = "https://pharma-freelancer.com/";
	driver.get(baseUrl);
	driver.getTitle();
	driver.manage().window().maximize();
	String expectedTitle = "Online jobs in pharma | Jobs in pharma| Post resumes";
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
    

WebElement img = driver.findElement(By.xpath("/html/body/div[2]/div[1]/nav/div/div[1]/a/img[2]"));
String src = img.getAttribute("src");

System.out.println("logo detected");
//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,250)");


//searching through the serch box 1

WebElement s1 = driver.findElement(By.xpath("//*[@id=\"search\"]"));
s1.sendKeys("doctor");
WebElement bt = driver.findElement(By.xpath("//*[@id=\"categorySearch\"]/button"));
bt.click();

System.out.println("search reesults!!");


//searching through the serch box 2

WebElement s2 = driver.findElement(By.xpath("//*[@id=\"search_candidate\"]"));
s2.sendKeys("abc");
WebElement bt2 = driver.findElement(By.xpath("//*[@id=\"candidateSearch\"]/button"));
bt2.click();

System.out.println("search candidates!!");

//driver.close();

}}