package AssignmentQution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver driver1=new ChromeDriver(); 
	
	driver1.manage().window().maximize(); 
	driver1.get("https://demo.guru99.com/test/web-table-element.php");
	
	List<WebElement> n_col =driver1.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	System.out.println("colum size:"+n_col.size());
	
	List<WebElement> n_row =driver1.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
	System.out.println("row size:"+n_row.size());
	
	Thread.sleep(1000);
	
	for (int i = 1; i <n_row.size(); i++) {
		for (int j = 1; j <n_col.size(); j++) {
			String data=driver1.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print("     |      "+data);
			Thread.sleep(100);
			
		}
		System.out.println();
	}
	driver1.close();
}
}
