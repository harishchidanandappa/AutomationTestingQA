import java.util.List;
import org.openqa.selenium.remote.http.HttpResponse;
import org.openqa.selenium.remote.http.HttpClient;
import org.seleniumhq.jetty9.http.Http1FieldPreEncoder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicAuthentication_Chrome 
{
    public static void main(String[] args) 
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HARISH C\\eclipse-workspace\\chromedriver.exe");

Webdriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get(“https://the-internet.herokuapp.com/basic_auth”);
driver.findElement(By.id(“username”));
WebElement username=driver.findElement(By.id(“username”));

driver.findElement(By.id(“password”));
 WebElement password=driver.findElement(By.id(“password”)); 

WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']")); 
  username.sendKeys("admin"); password.sendKeys("admin"); 
  login.click(); 
  }   }
