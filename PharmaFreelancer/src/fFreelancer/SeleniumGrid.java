 package fFreelancer;
 import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
 import java.net.MalformedURLException;
 import java.net.URL;
 import org.openqa.selenium.remote.RemoteWebDriver;
 import org.testng.Assert;
 import org.testng.annotations.*;

 public class SeleniumGrid {

     WebDriver driver;
     String baseURL, nodeURL;

     @BeforeTest
     public void setUp() throws MalformedURLException {
         baseURL = "http://demo.guru99.com/test/guru99home/";
         nodeURL = "http://192.168.43.223:4446/wd/hub";
         DesiredCapabilities capability = DesiredCapabilities.chrome();
         capability.setBrowserName("chrome");
         System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe"); 
         System.setProperty("java.net.preferIPv4Stack" , "true");
         driver = new ChromeDriver();
         capability.setPlatform(Platform.WINDOWS);
         driver = new RemoteWebDriver(new URL(nodeURL), capability);
     }

     @AfterTest
     public void afterTest() {
         driver.quit();
     }
     @Test
     public void sampleTest() {
         driver.get(baseURL);
         

         if (driver.getPageSource().contains("MOBILE TESTING")) {
             Assert.assertTrue(true, "Mobile Testing Link Found");
         } else {
             Assert.assertTrue(false, "Failed: Link not found");
         }

     }

 }