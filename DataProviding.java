package AssignmentQution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviding {
	WebDriver driver1;
	@DataProvider(name="Dilip")
	public Object[][] Input() {
		return new Object[][] {{"standard_user","secret_sauce"},{"problem_user","secret_sauce"}};
		
	}
	@Test(dataProvider = "Dilip")
		public void test(String username,String password) throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
				driver1=new ChromeDriver(); 
				
				driver1.manage().window().maximize(); 
				driver1.get("https://www.saucedemo.com");
				Thread.sleep(2000);
				
			
				driver1.findElement(By.id("user-name")).sendKeys(username);
				Thread.sleep(2000);
			
				driver1.findElement(By.id("password")).sendKeys(password);
				Thread.sleep(2000);
			
				driver1.findElement(By.id("login-button")).click();
				Thread.sleep(2000);
				
				driver1.findElement(By.id("react-burger-menu-btn")).click();
				Thread.sleep(2000);
				
				driver1.findElement(By.id("logout_sidebar_link")).click();
				Thread.sleep(2000);
				
			
			
				
					driver1.close();
		}
}

