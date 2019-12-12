package signUp;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.support.ui.Select;
    import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by san on 4/18/17.
 */
public class Gmail_signup {

    @Test
    public void GoogleSignup(){

    	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default";
        driver.get(baseUrl);

        //By ID Text area1
        WebElement text1 = driver.findElement(By.id("firstName"));
        text1.clear();
        text1.sendKeys("San ");

        WebElement text2 = driver.findElement(By.id("lastName"));
        text2.clear();
        text2.sendKeys("P");

        WebElement text3 = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        text3.clear();
        text3.sendKeys("s200779078");

        WebElement text4 = driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input"));
        text4.clear();
        text4.sendKeys("123abcdxy");

        WebElement text5 = driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input"));
        text5.clear();
        text5.sendKeys("123abcdxy");

        WebElement text6 = driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/span/span"));
        text6.click();
        
        WebElement text7 = driver.findElement(By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div[1]/div/div[2]/div[1]/div/div[1]/div"));
        text7.clear();
        text7.sendKeys("870784001");
        
      //*[@id="phoneNumberId"] //*[@id="view_container"]/form/div[2]/div/div[1]/div/div[2]/div[1]/div/div[1]/div

    }
}