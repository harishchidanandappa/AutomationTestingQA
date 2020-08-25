import java.util.List;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.Test;

public class hoverImages {


public static void main()  throws Exception {
	
WebDriver  driver = new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/hovers");

Actions actions = new Actions(driver);

WebElement main = driver.findElement(By.xpath("//div['@class=figure']"));

actions.moveToElement(main);

try {
	
	Thread.sleep(5000);
	actions.click().build().perform();
}catch(Exception e) {
	System.out.println(e);
}
	
}
		


}
