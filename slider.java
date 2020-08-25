import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.Dimension;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sliderMovement {
	
		WebDriver driver;
		String url ="https://the-internet.herokuapp.com/horizontal_slider";
		
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HARISH C\\eclipse-workspace\\chromedriver.exe");	
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
				
	}
	@Test
	public void sliderMax(){
		
		driver.get(url);
		WebElement output = driver.findElement(By.id("range"));
		WebElement slider = driver.findElement(By.xpath("//input['@type=range']"));   
		assertTrue(slider.isDisplayed());
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(slider, 5, 0).build().perform();
		
		assertEquals(slider, 5);
		assertTrue(slider.equals(slider));	
		
		System.out.println("whats the outpt after increasing" +output.getText());
		
	}
	
	@Test
	public void slidermin() {
		driver.get(url);
		WebElement output = driver.findElement(By.id("range"));
		WebElement slider = driver.findElement(By.xpath("//input['@type=range']"));   
		assertTrue(slider.isDisplayed());
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(slider, 0, 0).build().perform();
		
		assertEquals(slider, 0);
		assertTrue(slider.equals(slider));	
		
		System.out.println("whats the outpt after decreasing" +output.getText());
		
		
		
		
	}
	
	
	
	
	
	
}
