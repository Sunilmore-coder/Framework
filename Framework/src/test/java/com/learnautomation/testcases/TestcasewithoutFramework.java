package com.learnautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestcasewithoutFramework {

	@Test
	public void test1() {

		System.setProperty("Webdriver.chrome.driver", "D:\\selenium\\Chrome driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("email")).sendKeys("sunilmore.talentrecruit@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Sunil@123");
		driver.findElement(By.xpath("//body/div[@id='ui']/div[1]/div[1]/form[1]/div[1]/div[3]")).click();

		driver.quit();
	}

}
