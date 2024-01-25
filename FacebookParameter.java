package AssignmentQution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FacebookParameter {
  
	  WebDriver driver1;
	  @Test
	  @Parameters({"username","password"})
	  public void f(String username,String password) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
			driver1=new ChromeDriver(); 
			
			driver1.manage().window().maximize(); 
			driver1.get("https://www.facebook.com");
			Thread.sleep(2000);
			
			driver1.findElement(By.id("email")).sendKeys(username);
			Thread.sleep(2000);
			driver1.findElement(By.id("pass")).sendKeys(password);
			Thread.sleep(2000);
			driver1.findElement(By.name("login")).click();
			Thread.sleep(2000);
			
			driver1.close();
			
	  
  }
}
