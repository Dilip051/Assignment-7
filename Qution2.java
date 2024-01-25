package AssignmentQution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Qution2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver driver1=new ChromeDriver(); 
	
	driver1.manage().window().maximize(); 
	driver1.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	
	WebElement e1=driver1.findElement(By.cssSelector("select.col-lg-3"));
    Select s1=new Select(e1);
    
    s1.selectByIndex(0);
    Thread.sleep(1000);
    
    s1.selectByValue("donut");
    Thread.sleep(1000);
    
    s1.selectByVisibleText("Bonda");
    Thread.sleep(1000);
    
    driver1.close();
    
}
}
