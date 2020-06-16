package Sin;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import ClassCalcbasic.POMudemy;

public class TestPOM {
	
	WebDriver driver;
	String appURL = "https://app.classcalc.com/scientific-calculator";
	private static final Logger log = LogManager.getLogger(TestPOM.class.getName());


	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get(appURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	}
	
	@Test
  public void Sin30() throws InterruptedException {
		String ExpectedResult = "0.5";
		POMudemy.TrigButton(driver).click();
		POMudemy.SinButton(driver).click();
		POMudemy.Num3Button(driver).click();
		POMudemy.Num0Button(driver).click();
		Thread.sleep(2000);
		String actualText = driver.findElement(By.xpath("//div[@class='fadeout-wrapper ']//span[@class='base']")).getAttribute("innerText");
		System.out.println("Sin 30 = " + actualText);
		Assert.assertEquals(actualText, ExpectedResult);
		
	}
		
	@Test
	public void Sin67() throws InterruptedException {
		String ExpectedResult = "0.9205048535";
		POMudemy.TrigButton(driver).click();
		POMudemy.SinButton(driver).click();
		POMudemy.Num6Button(driver).click();
		POMudemy.Num7Button(driver).click();
		Thread.sleep(2000);
		String actualText = driver.findElement(By.xpath("//div[@class='fadeout-wrapper ']//span[@class='base']")).getAttribute("innerText");
		System.out.println("Sin 67 = " + actualText);
		Assert.assertEquals(actualText, ExpectedResult);
	}
	
	@Test
	public void Sin90() throws InterruptedException {
		String ExpectedResult = "1";
		POMudemy.TrigButton(driver).click();
		POMudemy.SinButton(driver).click();
		POMudemy.Num9Button(driver).click();
		POMudemy.Num0Button(driver).click();
		Thread.sleep(2000);
		String actualText = driver.findElement(By.xpath("//div[@class='fadeout-wrapper ']//span[@class='base']")).getAttribute("innerText");
		System.out.println("Sin 90 = " + actualText);
		Assert.assertEquals(actualText, ExpectedResult);
  }
	
	@AfterMethod
	public void clearInput() {
		POMudemy.clearButton(driver).click();
	}
	

	
}

 