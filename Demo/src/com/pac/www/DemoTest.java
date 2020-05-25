package com.pac.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
  @Test
  public void search() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://ebay.com");
	 WebElement wb=driver.findElement(By.id("gh-cat"));
	 Select s=new Select(wb);
	 s.selectByVisibleText("Books");
	 driver.findElement(By.id("gh-ac")).sendKeys("Selenium");
	 driver.findElement(By.id("gh-btn")).click();
	 Reporter.log("Ebay product search test sucessfull....",true);
	 
			
	  
  }
}
