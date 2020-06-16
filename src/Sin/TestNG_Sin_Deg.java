package Sin;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class TestNG_Sin_Deg {
		public WebDriver driver = new ChromeDriver();
		String appURL = "https://app.classcalc.com/scientific-calculator";
	
	
	@Test
  public void Sin30() throws InterruptedException {
		driver.get(appURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		String ExpectedResult = "0.5";
		driver.findElement(By.id("__classcalc-trig-menu")).click();
		driver.findElement(By.id("button-sin-soft")).click();
		driver.findElement(By.id("button-3")).click();
		driver.findElement(By.id("button-0")).click();
		Thread.sleep(4000);
		//finding the output text
		String actualText = driver.findElement(By.xpath("//div[@class='fadeout-wrapper ']//span[@class='base']")).getAttribute("innerText");
		System.out.println("Sin 30 = " + actualText);
		Assert.assertEquals(actualText, ExpectedResult);
		driver.findElement(By.className("button-clear-all")).click();

	}		

	
	@Test
  public void Sin67() throws InterruptedException {
		String ExpectedResult = "0.9205048535";
		driver.findElement(By.id("__classcalc-trig-menu")).click();
		driver.findElement(By.id("button-sin-soft")).click();
		driver.findElement(By.id("button-6")).click();
		driver.findElement(By.id("button-7")).click();
		Thread.sleep(4000);
		String actualText = driver.findElement(By.xpath("//div[@class='fadeout-wrapper ']//span[@class='base']")).getAttribute("innerText");
		System.out.println("Sin 67 = " + actualText);
		Assert.assertEquals(actualText, ExpectedResult);
		driver.findElement(By.className("button-clear-all")).click();
		
	}
}
	
	