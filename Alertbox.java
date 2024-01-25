package AssignmentQution;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver driver1=new ChromeDriver(); 
	
	driver1.manage().window().maximize(); 
	driver1.get("https://demo.guru99.com/test/delete_customer.php");
	
	driver1.findElement(By.name("cusid")).sendKeys("232523");
	Thread.sleep(2000);
	
	driver1.findElement(By.name("submit")).click();
	Thread.sleep(2000);
	
	Alert a1=driver1.switchTo().alert();  

	System.out.println("msg is:"+a1.getText());
	Thread.sleep(2000);
    a1.accept();
	driver1.close();
}
}
