package AssignmentQution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginWithfacebookTestng {
	
	WebDriver driver1;
	@BeforeTest
		public void beforetest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver1=new ChromeDriver(); 
		
		driver1.manage().window().maximize(); 
		driver1.get("https://www.facebook.com");
		Thread.sleep(2000);
		}
	@Test(priority = 0)
	  
	  public void username() throws InterruptedException {
			driver1.findElement(By.id("email")).sendKeys("Dilip@gmail.com");
			Thread.sleep(2000);
		}
		@Test(priority = 1)
		public void password() throws InterruptedException {
			driver1.findElement(By.id("pass")).sendKeys("Dilip@16");
			Thread.sleep(2000);
		}
		@Test(priority = 2  )
		public void clickloginbutton() throws InterruptedException {
			driver1.findElement(By.name("login")).click();
			Thread.sleep(2000);
			
		}
		@AfterTest
		public void aftertest() {
				System.out.println("bye...");
				driver1.close();
		}

}
