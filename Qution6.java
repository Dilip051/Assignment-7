package AssignmentQution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Qution6 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver driver1=new ChromeDriver(); 
	
	driver1.manage().window().maximize(); 
	driver1.get("https://demo.guru99.com/test/newtours/register.php");
	Thread.sleep(2000);
	
	WebElement e1=driver1.findElement(By.name("country"));
	Select s1=new Select(e1);
	
//	s1.selectByValue("ANGOLA");
//	Thread.sleep(2000);
	
	for (int i = 0; i <15; i++) {
		s1.selectByIndex(i);
		Thread.sleep(1000);
	}
	driver1.close();
}
}
