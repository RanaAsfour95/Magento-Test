package magentoTest;
import java.nio.file.WatchEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class magentoTestThree {
	
	
	
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	
	public void myBeforeTest()
	{
		
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void myThirdTest() 
	{
		driver.get("https://magento.softwaretestingboard.com/");
		
		WebElement myListOfItems = driver.findElement(By.xpath("//ol[@class='product-items widget-product-grid']"));
		
		
		List<WebElement> allItems = myListOfItems.findElements(By.tagName("li"));
		
		Random rand = new Random();
		int randomIndex = rand.nextInt(allItems.size());
		allItems.get(randomIndex).click();
		
//		for(int i=0 ; i<allItems.size(); i++)
//			
//		allItems.get(randomIndex).click();
//		
	}
	
	
	
	
	
	

}
