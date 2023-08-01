package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajio {
  @Test
public void AjioTest() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver ();
	  driver.get("https://www.Ajio.com/");
	  driver.manage().deleteAllCookies();
	  Thread.sleep(7000);
	  driver.close();
  
}
  
}

