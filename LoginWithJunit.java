package AssignmentQution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithJunit {
	WebDriver driver1;
	@Before
		public void beforesetup() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
			driver1=new ChromeDriver(); 
			 
			driver1.manage().window().maximize(); 
			driver1.get("https://www.facebook.com");
			Thread.sleep(2000);
			
		}
	@Test
	public void login() throws InterruptedException {
		driver1.findElement(By.id("email")).sendKeys("Dilip@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.id("pass")).sendKeys("secret");
		Thread.sleep(2000);
		driver1.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		
	}
	@After
	public void aftersetup() {
		System.out.println("bye...");
		driver1.close();
	}
}
