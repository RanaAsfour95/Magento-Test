package magentoTest;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class magentoTestTwo {

	WebDriver driver = new ChromeDriver();
	@BeforeTest
	
	public void myBeforeTest()
	{
		
		driver.manage().window().maximize();
	}
	@Test
	public void myTest() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/");
		
		//driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		Thread.sleep(2000);
		WebElement theForrmmm = driver.findElement(By.id("form-validate"));
		
		List<WebElement> myInputField = theForrmmm.findElements(By.tagName("input"));
		
		System.out.println(myInputField.size());
		
	for(int i=0 ; i<myInputField.size() ; i++)
	{
		
		if (myInputField.get(i).getAttribute("type").equals("hidden"))
				{
			continue;
				}
			
		myInputField.get(i).sendKeys("ahmad");
		
	}

		
		
	}


	
	
	
}
