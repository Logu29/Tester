package org.logu;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScritexecutor {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\eclipse-workspace\\Loganathan\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
WebElement drop = driver.findElement(By.xpath("//a[@title='Visit our Help Centre.']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", drop);
		Thread.sleep(2000);
		WebElement scrollup = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrollup);
	scrollup.sendKeys("candy");

	}

}
