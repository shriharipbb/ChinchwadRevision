package eCommerceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Snapdeal {
  @Test
  public void SnapdealTest() throws InterruptedException {
		  
		  WebDriver driver = new ChromeDriver ();
		  driver.get("https://www.snapdeal.com/");
		  Thread.sleep(3000);
		  driver.close();
   
  }
}
