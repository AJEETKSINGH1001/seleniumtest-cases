package wecare4u;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNG;

public class Spellchecker extends TestNG{

static String text1 = "is an ingenious tool to find out";
static String url = "https://pharma-freelancer.com/uat/blog-detail/healthcare-marketing---get-to-know-these-10-valuable-tools-";
static WebElement Whole ;
/**
  * @param args
  */
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
try{
driver.get(url);
Thread.sleep(3000);
Whole= driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div/div/div[1]"));
System.out.println("Whole Text------------->" +Whole.getText());
if(Whole.getText().contains(text1)){
System.out.println("It is working...");
}
  }catch(InterruptedException e){
e.printStackTrace();
}
}
}