package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ruban\\eclipse-workspace\\SeleniumDay-1\\Driver\\chromedriver.exe");
	
//Question=2.1		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		driver.close();

//Question=2.2
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://gmail.com/");
		driver1.manage().window().maximize();
		driver1.close();

//Question=2.3		
		WebDriver driver2=new ChromeDriver();
		driver2.get("http://www.flipkart.com/");
		driver2.manage().window().maximize();
		driver2.close();

//Question=2.4		
		WebDriver driver3=new ChromeDriver();
		driver3.get("http://greenstech.in/selenium-course-content.html");
		driver3.manage().window().maximize();
		driver3.close();
		
		
		
		
		
		
		
		
	}

}
