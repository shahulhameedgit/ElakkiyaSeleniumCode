package org.elakkiya.selenium.launch;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHanldesMethod extends LaunchBrowser {

		void implictyWait(){
			browserlaunch("chrome");
			loadUrl("https://www.facebook.com/");
			//implicit wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			// ananomus object
			driver.findElement(By.id("ema")).sendKeys("shahul");

		}
		
		void explictwait() {
			browserlaunch("chrome");
			loadUrl("https://www.facebook.com/");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement until = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ema")));
			
			// ananomus object
			driver.findElement(By.id("ema")).sendKeys("shahul");
		}
	
	public static void main(String[] args) {
		browserlaunch("chrome");
		loadUrl("https://www.facebook.com/");
		Wait wait = new FluentWait(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(10, TimeUnit.MILLISECONDS)
				.ignoring(Exception.class);
		
		WebElement until =(WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ema")));
		until.click();
		/*
		 * //referenced object WebElement findElement = driver.findElement(By.
		 * xpath("(//a[@title='SAMSUNG S20 FE 5G (Cloud Mint, 128 GB)'])[2]"));
		 * findElement.click();
		 
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li= new ArrayList<String>();
		li.addAll(windowHandles);
		
		driver.switchTo().window(li.get(1));
		*/
		//driver.switchTo().window(li.get(li.size()-1));
		
		/*
		for (String string : windowHandles) {
			if (!string.equals(windowHandle)) {
				driver.switchTo().window(string);
				try {
					driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
					break;
				} catch (Exception e) {
					System.out.println("element is not in this window hence moving to another");
				}
			}}*/
		
		}

	}


