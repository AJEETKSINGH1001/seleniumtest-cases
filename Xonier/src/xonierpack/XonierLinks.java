package xonierpack;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import java.util.List;		
import java.util.concurrent.TimeUnit;		
import org.openqa.selenium.*;		

public class XonierLinks {				
    		
    public static void main(String[] args) {									
        String baseUrl = "http://xoniertechnologies.com/school-erp/";	
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        String underConsTitle = "Under Construction:";					
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);					

			driver.get(baseUrl);					
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));							
        String[] linkTexts = new String[linkElements.size()];							
			     int i = 0;					

			//extract the link texts of each link element		
			for (WebElement e : linkElements) {							
			linkTexts[i] = e.getText();							
			i++;			
        }		

			//test each link		
			for (String t : linkTexts) {							
			driver.findElement(By.linkText(t)).click();					
			if (driver.getTitle().equals(underConsTitle)) {							
                System.out.println("\"" + t + "\""								
                        + " is under construction.");			
            } else {			
                System.out.println("\"" + t + "\""								
                        + " is working.");			
            }		
			driver.navigate().back();			
        }		
			driver.quit();			
    }		
}
