package AssignmentQution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseevent {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver driver1=new ChromeDriver(); 
	
	driver1.manage().window().maximize(); 
	driver1.get("https://demo.guru99.com/test/newtours/");
	Thread.sleep(1000);
	
	WebElement home=driver1.findElement(By.linkText("Home"));
	WebElement hotels=driver1.findElement(By.linkText("Hotels"));
	WebElement flight=driver1.findElement(By.linkText("Flights"));
	
	Actions actions=new Actions(driver1);
//	Action a1=actions.moveToElement(home).build();
    actions.moveToElement(hotels).perform();
//	a1.perform();
	Thread.sleep(2000);
	
	Actions actions2=new Actions(driver1);
//	Action a2=actions2.moveToElement(hotels).build();   
	actions2.moveToElement(flight).perform();
//	a2.perform(); 
	Thread.sleep(1000);
		
	driver1.close();
	
}
}
