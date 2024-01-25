package AssignmentQution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qution4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver driver1=new ChromeDriver(); 

	driver1.manage().window().maximize(); 

	driver1.get("https://www.facebook.com/");
	
	driver1.findElement(By.cssSelector("input#email")).sendKeys("makvanadilip051@gmail.com");
	Thread.sleep(2000);
	
	driver1.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("Dilip@16112002");
	Thread.sleep(2000);
	driver1.close();
}
}
