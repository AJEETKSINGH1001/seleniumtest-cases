package datadriven;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class DDTExcel
{
 ChromeDriver driver;
  
 @Test(dataProvider="testdata")
 public void DemoProject(String username, String password) throws InterruptedException
 {
    System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
  
 driver.get("https://wecare4u.co/beta/login");
  
 driver.findElement(By.name("email")).sendKeys(username);
 driver.findElement(By.name("password")).sendKeys(password);
 driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/button")).click();
 
  
 Thread.sleep(5000);
  
 Assert.assertTrue(driver.getCurrentUrl().matches("https://wecare4u.co/beta/my-account"), "Invalid credentials");
 System.out.println("Login successful");
 WecarescreenShot.takeSnapShot(driver, "c://test.png");
 }
  
 
@DataProvider(name="testdata")
 public Object[][] TestDataFeed()
 {
  
 ReadExcelFile config = new ReadExcelFile("C:\\Users\\a\\Desktop\\LoginCredentials.xlsx");
  
 int rows = config.getRowCount(0);
  
 Object[][] credentials = new Object[rows][2];
 
for(int i=0;i<rows;i++)
 {
 credentials[i][0] = config.getData(0, i, 0);
 credentials[i][1] = config.getData(0, i, 1);
 }
 return credentials;
 }
}