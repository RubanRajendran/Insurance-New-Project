package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ruban\\eclipse-workspace\\SeleniumDay-1\\Driver\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("http://google.co.in");
		d.findElement(By.name("q")).sendKeys("facebook");
		
		
	}

}
