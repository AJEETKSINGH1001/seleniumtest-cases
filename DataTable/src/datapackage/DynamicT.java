package datapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicT {

	public static void main(String args[]) {
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");					
	    WebDriver driver = new ChromeDriver();	
	    String baseUrl = "https://www.redmine.org//projects//redmine//issues";
	    driver.get(baseUrl);
	    //Driver.get("https://www.redmine.org//projects//redmine//issues");
	
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//*[@id=\"content\"]/form[2]/div[2]")).click();
    int num_of_clicks = Integer.parseInt(driver.findElement(
            By.xpath(".//*[@id='content']/p[1]/a[3]")).getText());
    for (byte i = 1; i < num_of_clicks; i++) {
        List<WebElement> records_in_page = driver.findElements(By.xpath(".//*[@class='list issues']/tbody/tr"));
        for (byte j = 0; j < records_in_page.size(); j++) {
            String Issue_Subject = driver.findElement(
                    By.xpath(".//*[@class='list issues']/tbody/tr[" + (j+1)
                            + "]/td[5]")).getText();
            System.out.println(Issue_Subject);
        }
        driver.findElement(By.xpath(".//*[@class='next']")).click();
    }}

	}
//*[@id="content"]/form[2]/div[2]/table/thead/tr/th[5]
//*[@id="content"]/p[1]/a[4]
//*[@id="content"]/form[2]/div[2]