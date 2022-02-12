package org.delta.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commonutils {
	
	// resuablity codes for selenium methods
static WebDriver driver;
	
	public static void browserlaunch(String browser) {
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./JAr/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "firefox":
			System.setProperty("webdriver.chrome.driver", "./drivre/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		default:
			System.out.print("the given browser is not found.");
			break;
		}
	}
	
	public void loadUrl(String url) {
		driver.get(url);
	}
	
	public WebDriverWait webdriverwait() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait;
	}
	
	public WebElement findingAnElement(By locator) {
		WebDriverWait webdriverwait = webdriverwait();
		WebElement until = null;
		try {
			until = webdriverwait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("the element is not found..");
		}
		
		return until;
	}
	
	public WebElement findElementById(String locator) {
		
		return driver.findElement(By.id(locator));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}

}
