package AssignmentQution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardevent {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver driver1=new ChromeDriver(); 
	
	driver1.manage().window().maximize(); 
	driver1.get("https://www.facebook.com");
	Thread.sleep(2000);
	
	WebElement email=driver1.findElement(By.id("email"));
	Actions act=new Actions(driver1);
	act.click();
	Thread.sleep(1000);
//	act.keyDown(email, Keys.SHIFT);
//	act.sendKeys("dilip");
//	act.keyUp(email, Keys.SHIFT);
//	act.doubleClick();
	act.contextClick(email);
	act.perform();
	Thread.sleep(3000);
	
	driver1.close();
}
}
