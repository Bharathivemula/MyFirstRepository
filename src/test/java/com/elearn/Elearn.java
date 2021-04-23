package com.elearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elearn {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Bharathi");
		driver.findElement(By.id("pass")).sendKeys("test");
		driver.findElement(By.name("login")).click();
		driver.close();
		
	}
}
