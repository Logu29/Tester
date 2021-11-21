package org.logu;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conformalert {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\eclipse-workspace\\Loganathan\\driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http//demo.automation testing.in/alerts.html");
		
		WebElement okbtn = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	okbtn.click();
	
	Alert al=driver.switchTo().alert();
	al.accept();
	
	
	
	}

}
