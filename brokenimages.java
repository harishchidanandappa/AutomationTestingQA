import java.util.List;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.http.HttpResponse;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class brokenimages {

private WebDriver driver;
private int invalidImageCount;

@BeforeMethod
public void setUp() {
driver = new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/broken images");
}

@Test
public void validateInvalidImages() {
try {
invalidImageCount = 0;
List<WebElement> imagesList = driver.findElements(By.tagName("img"));
System.out.println("Total no. of images are " + imagesList.size());
for (WebElement imgElement : imagesList) {
if (imgElement != null) {
verifyimgActive(imgElement);
}
}
System.out.println("Total no. of invalid images are " + invalidImageCount);
} catch (Exception e) {
e.printStackTrace();
System.out.println(e.getMessage());
}
}

public static void verifyimgActive(WebElement img)
{ 
  try
{ 
  HttpResponse response = new 
		  
  DefaultHttpClient().execute(new HttpGet(img.getAttribute("src"))); 
 if (response.getStatusLine().getStatusCode() != 200) 
{  
    invalidimg++;  
 } 
catch (Exception e)
 {
  e.printStackTrace();
   } 
  } 

@AfterClass
public void tearDown() {
if (driver != null)
driver.quit();
}


}
