package xonierpack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;


public class XonierHome{
	@Test
	public void HomePage() {

		//code for launching chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://xoniertechnologies.com/";
		driver.get(baseUrl);
		driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Xonier";
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
	    WebElement ImageFile = driver.findElement(By.xpath("//*[@id=\"undefined-sticky-wrapper\"]/nav/div/div[1]/a/img"));
	    Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
	    if (!ImagePresent) {
	    	System.out.println("Image not displayed.");
	      } else {
	    	System.out.println("Image displayed.");
	    }
	//This  will scroll down the page by  1000 pixel vertical		
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,250)");

	WebElement h = driver.findElement(By.xpath("//*[@id=\"undefined-sticky-wrapper\"]/nav/div/div[3]/ul/li[1]/a"));
	h.click();
	//This  will scroll down the page by  1000 pixel vertical		
	JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	jse1.executeScript("window.scrollBy(0,250)");

	System.out.println("home Page Verified");

//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse11 = (JavascriptExecutor)driver;
jse11.executeScript("window.scrollBy(0,250)");

WebElement h1 = driver.findElement(By.xpath("//*[@id=\"undefined-sticky-wrapper\"]/nav/div/div[3]/ul/li[2]/a"));
h1.click();
//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse111 = (JavascriptExecutor)driver;
jse111.executeScript("window.scrollBy(0,250)");

System.out.println("About Page Verified");

WebElement j = driver.findElement(By.xpath("//*[@id=\"top\"]/nav/div/div[3]/ul/li[3]/a"));
j.click(); //*[@id="top"]/nav/div/div[3]/ul/li[3]/a
//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse2 = (JavascriptExecutor)driver;
jse2.executeScript("window.scrollBy(0,250)");

System.out.println("Capability Page Verified");
WebElement c = driver.findElement(By.xpath("//*[@id=\"top\"]/nav/div/div[3]/ul/li[4]/a"));
c.click();  //*[@id="top"]/nav/div/div[3]/ul/li[4]/a

//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse3 = (JavascriptExecutor)driver;
jse3.executeScript("window.scrollBy(0,250)");

System.out.println("career Page Verified");
WebElement e = driver.findElement(By.xpath("//*[@id=\"top\"]/nav/div/div[3]/ul/li[4]/a"));
e.click();  //*[@id="top"]/nav/div/div[3]/ul/li[4]/a  //*[@id="top"]/nav/div/div[3]/ul/li[4]/a

//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse4 = (JavascriptExecutor)driver;
jse4.executeScript("window.scrollBy(0,250)");

System.out.println("Blog Page Verified");
WebElement b = driver.findElement(By.xpath("//*[@id=\"top\"]/nav/div/div[3]/ul/li[6]/a"));
b.click();

//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse5 = (JavascriptExecutor)driver;
jse5.executeScript("window.scrollBy(0,250)");

System.out.println("contact Page Verified");


}
}