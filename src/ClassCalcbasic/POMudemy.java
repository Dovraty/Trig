package ClassCalcbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMudemy {
	public static WebElement element = null;
	
	public static WebElement TrigButton(WebDriver driver){
		element = driver.findElement(By.id("__classcalc-trig-menu"));
		return element;
		
	}
	
	public static WebElement SinButton(WebDriver driver){
		element = driver.findElement(By.id("button-sin-soft"));
		return element;
		
	}
	
	public static WebElement Num0Button(WebDriver driver){
		element = driver.findElement(By.id("button-0"));
		return element;
		
	}
	
	public static WebElement Num1Button(WebDriver driver){
		element = driver.findElement(By.id("button-1"));
		return element;
		
	}
	
	public static WebElement Num2Button(WebDriver driver){
		element = driver.findElement(By.id("button-2"));
		return element;
		
	}
	
	public static WebElement Num3Button(WebDriver driver){
		element = driver.findElement(By.id("button-3"));
		return element;

	}
	
	public static WebElement Num4Button(WebDriver driver){
		element = driver.findElement(By.id("button-4"));
		return element;
		
	}
	
	public static WebElement Num5Button(WebDriver driver){
		element = driver.findElement(By.id("button-5"));
		return element;
		
	}
	
	public static WebElement Num6Button(WebDriver driver){
		element = driver.findElement(By.id("button-6"));
		return element;
		
	}
	
	public static WebElement Num7Button(WebDriver driver){
		element = driver.findElement(By.id("button-7"));
		return element;
		
	}
	
	public static WebElement Num8Button(WebDriver driver){
		element = driver.findElement(By.id("button-8"));
		return element;
		
	}
	
	public static WebElement Num9Button(WebDriver driver){
		element = driver.findElement(By.id("button-9"));
		return element;
		
	}
	
	public static WebElement divideButton(WebDriver driver){
		element = driver.findElement(By.id("button-divide"));
		return element;
		
	}
	
	public static WebElement piButton(WebDriver driver){
		element = driver.findElement(By.id("button-pi"));
		return element;
	
	}
	
	public static WebElement minusButton(WebDriver driver){
		element = driver.findElement(By.id("button-subtract"));
		return element;
		
	}
	
	public static WebElement enterButton(WebDriver driver){
		element = driver.findElement(By.id("button-equals"));
		return element;
	
	}
	
	public static WebElement clearButton(WebDriver driver){
		element = driver.findElement(By.className("button-clear-all"));
		return element;
		
	}
}


