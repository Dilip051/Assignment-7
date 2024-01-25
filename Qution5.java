package AssignmentQution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qution5 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver driver1=new ChromeDriver(); 
	
	driver1.manage().window().maximize(); 
	driver1.get("https://demo.guru99.com/test/radio.html");
	
	for (int i = 1; i <=3; i++) {
		driver1.findElement(By.id("vfb-7-"+i)).click();
		Thread.sleep(1000);
	}
	
	Thread.sleep(2000);
	
	driver1.close();
}
}
