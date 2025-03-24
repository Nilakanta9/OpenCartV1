package testCases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	public static void main(String[] args) {
		
		
		//a[starts-with(text(),'eBay')and@class='thrd']
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> ele = driver.findElements(By.xpath("//a[starts-with(text(),'eBay')and@class='thrd']"));
		
		ArrayList<String> al = new ArrayList<String>();
		
		for(WebElement element:ele) {
			
		System.out.println(al.add(element.getAttribute("value")));
			
			
					
		}

	}

}
