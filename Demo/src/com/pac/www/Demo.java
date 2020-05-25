package com.pac.www;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
       driver.get("http://amazon.in");
       driver.findElement(By.linkText("Pantry")).click();
      driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']")).sendKeys("surfexel");
      Actions a=new Actions(driver);
      a.sendKeys(Keys.ENTER).build().perform();
       
	}

}
