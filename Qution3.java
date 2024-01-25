package AssignmentQution;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Qution3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver driver1=new ChromeDriver(); 
	
	driver1.manage().window().maximize(); 
	driver1.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	
//    simple alert 
//	driver1.findElement(By.name("alert")).click();
	
//	accept the alert,,ok button is click
//    Alert al=driver1.switchTo().alert();
//    Thread.sleep(2000);
//    System.out.println("msg is:"+al.getText());
//    al.accept();
//    driver1.close();
    
//    confirmation alert:
//    driver1.findElement(By.name("confirmation")).click();
//    Thread.sleep(2000);
//    
//    driver1.switchTo().alert().dismiss();
//    Thread.sleep(1000);
//    System.out.println("msg is:"+a1.setText());
//    Thread.sleep(2000);
//    a1.accept();
//    a1.dismiss();
//    driver1.close();
    
//    prompt alert
    
	
    driver1.findElement(By.name("prompt")).click();
    Thread.sleep(5000);
    
    Alert a1= driver1.switchTo().alert();
    driver1.switchTo().alert().sendKeys("133");
    Thread.sleep(10000);
    
    System.out.println("msg is"+a1.getText());
    a1.sendKeys("123");
    Thread.sleep(5000);
    a1.accept();
    Thread.sleep(2000);
    driver1.close();
    

	
}
}
