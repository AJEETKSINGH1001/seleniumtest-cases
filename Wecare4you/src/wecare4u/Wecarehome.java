package wecare4u;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;


public class Wecarehome{
	@Test
	public void HomePage() {

	//code for launching chrome browser
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
    WebElement ImageFile = driver.findElement(By.xpath("/html/body/header/div/div/div/div[1]/div/a/img"));
    Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
    if (!ImagePresent) {
    	System.out.println("Image not displayed.");
      } else {
    	System.out.println("Image displayed.");
    }
//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,250)");

WebDriverWait wait1 = new WebDriverWait(driver, 10);
wait1.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Home")));
//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse1 = (JavascriptExecutor)driver;
jse1.executeScript("window.scrollBy(0,250)");

System.out.println("home Page Verified");

/*WebElement j = driver.findElement(By.partialLinkText("Child Care"));
j.click();*/
//This  will scroll down the page by  1000 pixel vertical		
/*JavascriptExecutor jse2 = (JavascriptExecutor)driver;
jse2.executeScript("window.scrollBy(0,250)");*/

WebDriverWait wait2 = new WebDriverWait(driver, 10);
wait2.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Child Care")));

System.out.println("childcare Page Verified");
/*WebElement c = driver.findElement(By.partialLinkText("Tutors"));
c.click();*/
WebDriverWait wait3 = new WebDriverWait(driver, 10);
wait3.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Tutors")));


//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse3 = (JavascriptExecutor)driver;
jse3.executeScript("window.scrollBy(0,250)");

System.out.println("tutor Page Verified");
/*WebElement e = driver.findElement(By.partialLinkText("//*[@id=\"navbar-menu\"]/ul[1]/li[4]/a"));
e.click();*/

WebDriverWait wait4 = new WebDriverWait(driver, 10);
wait4.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Special Needs Care")));

//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse4 = (JavascriptExecutor)driver;
jse4.executeScript("window.scrollBy(0,250)");

/*WebElement r = driver.findElement(By.partialLinkText("Senior Care"));
r.click();*/


WebDriverWait wait5 = new WebDriverWait(driver, 10);
wait5.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Special Needs Care")));

//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse6 = (JavascriptExecutor)driver;
jse6.executeScript("window.scrollBy(0,250)");

System.out.println("senior care Page Verified");
/*WebElement l = driver.findElement(By.partialLinkText("/html/body/div[3]/div/div/div/div/div[1]/nav/ul/li[6]/a"));
l.click();

//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse7 = (JavascriptExecutor)driver;
jse7.executeScript("window.scrollBy(0,250)");

*//*System.out.println("pet care Page Verified");
WebElement s = driver.findElement(By.partialLinkText("/html/body/div[3]/div/div/div/div/div[1]/nav/ul/li[7]/a"));
s.click();

//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse8 = (JavascriptExecutor)driver;
jse8.executeScript("window.scrollBy(0,250)");

System.out.println("housekeepers Page Verified");

WebElement sa = driver.findElement(By.partialLinkText("/html/body/div[3]/div/div/div/div/div[1]/nav/ul/li[8]/a"));
sa.click();

//This  will scroll down the page by  1000 pixel vertical		
JavascriptExecutor jse9 = (JavascriptExecutor)driver;
jse9.executeScript("window.scrollBy(0,250)");

System.out.println("see all Page Verified");*/
}
}