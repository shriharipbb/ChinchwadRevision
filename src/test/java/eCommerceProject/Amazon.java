package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void AmazonTest() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver ();
	  driver.get("https://www.Amazon.com/");
	  driver.manage().deleteAllCookies();
	  Thread.sleep(7000);
	  driver.close();
}
}