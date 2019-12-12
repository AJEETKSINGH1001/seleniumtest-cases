package fFreelancer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;


public class HomePage{
	@Test
	public void HomeePage() {

	//code for launching chrome browser
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String baseUrl = "https://pharma-freelancer.com/uat/";
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
//String img2 = img.getAttribute("src");

System.out.println("logo detected");
//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,250)");

WebElement h = driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[1]/a"));
h.click();
//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse1 = (JavascriptExecutor)driver;
jse1.executeScript("window.scrollBy(0,250)");

System.out.println("home Page Verified");

WebElement j = driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[2]/a"));
j.click();
//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse2 = (JavascriptExecutor)driver;
jse2.executeScript("window.scrollBy(0,250)");

System.out.println("job Page Verified");
WebElement c = driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[3]/a"));
c.click();

//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse3 = (JavascriptExecutor)driver;
jse3.executeScript("window.scrollBy(0,250)");

System.out.println("candidate Page Verified");
WebElement e = driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[4]/a"));
e.click();

//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse4 = (JavascriptExecutor)driver;
jse4.executeScript("window.scrollBy(0,250)");

System.out.println("employee Page Verified");
WebElement b = driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[5]/a"));
b.click();

//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse5 = (JavascriptExecutor)driver;
jse5.executeScript("window.scrollBy(0,250)");

System.out.println("blog Page Verified");
WebElement r = driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[1]/li[6]/a"));
r.click();

//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse6 = (JavascriptExecutor)driver;
jse6.executeScript("window.scrollBy(0,250)");

System.out.println("rpo Page Verified");
WebElement l = driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[2]/li[1]/a"));
l.click();

//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse7 = (JavascriptExecutor)driver;
jse7.executeScript("window.scrollBy(0,250)");

System.out.println("signin Page Verified");
WebElement s = driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/ul[2]/li[2]/a"));
s.click();

//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse8 = (JavascriptExecutor)driver;
jse8.executeScript("window.scrollBy(0,250)");

System.out.println("sign up Page Verified");
}
}