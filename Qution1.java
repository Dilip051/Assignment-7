package AssignmentQution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qution1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver driver1=new ChromeDriver(); 
	
	driver1.manage().window().maximize(); 
	driver1.get("https://www.geeksforgeeks.org/");
	Thread.sleep(3000);

	driver1.findElement(By.partialLinkText("Data")).click();
	Thread.sleep(3000);
	
	driver1.close();
	
}
}
