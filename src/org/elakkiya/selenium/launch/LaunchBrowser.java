package org.elakkiya.selenium.launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchBrowser {
	public static WebDriver driver;

	public static void browserlaunch(String browser) {
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./JAr/chromedriver.exe");
			driver = new ChromeDriver();
			windowMaximize();
			break;
		case "firefox":
			System.setProperty("webdriver.chrome.driver", "./drivre/chromedriver.exe");
			driver = new ChromeDriver();
			windowMaximize();
			break;
		default:
			System.out.print("the given browser is not found.");
			break;
		}
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public static void navigateTo(String tourl) {
		driver.navigate().to(tourl);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateFwd() {
		driver.navigate().back();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	public static void browserClose() {
		driver.close();

	}

	/*
	 * 1. check the return type of that method 2. create a skeleton syn of resuable
	 * method based on the return type 3. check the inputs required for that method
	 * 4. if we have driver and predefined class object reference we dont consider
	 * that as input.. 5. after checking the left part before . of that method i go
	 * inside the () of that method and check any input is required on what data
	 * type.
	 */

	public static void elementclick(WebElement element) {

		element.click();
	}

	public static void type1(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static WebElement elementFindById(String data) {
		WebElement findElement = driver.findElement(By.id(data));
		return findElement;
	}

	public static WebElement elementFindByXpath(String data) {
		WebElement findElement = driver.findElement(By.xpath(data));

		return findElement;
	}

	public static WebElement elementFind(By locator) {
		WebElement findElement = driver.findElement(locator);

		return findElement;
	}

	public static WebElement findlementByID(String value) {
		WebElement findElement = driver.findElement(By.id(value));
		return findElement;
	}

	public static WebElement findelementByXpath(String path) {
		return driver.findElement(By.xpath(path));
	}

	public static void type(WebElement element, String data) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
			until.sendKeys(data);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("unable to find the element");
		}

	}

	public static void elementClick(WebElement element) {
		element.click();
	}

	void oldcode() {
		browserlaunch("chrome");
		loadUrl("https://www.facebook.com/");
		WebElement textElement = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		String text = textElement.getText();
		System.out.println(text);
		List<WebElement> hyperlink = driver
				.findElements(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']/li/a"));

		for (int i = 0; i < hyperlink.size(); i++) {
			WebElement ele = hyperlink.get(i);
			String text2 = ele.getText();
			System.out.println(text2);
		}

		List<WebElement> elew = driver.findElements(By.tagName("a"));
		for (int i = 0; i < elew.size(); i++) {
			WebElement ele = elew.get(i);
			String text2 = ele.getText();
			System.out.println(text2);
		}

		// reference object
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("shahul");
		String inputfeildvalue = username.getAttribute("value");
		System.out.println(inputfeildvalue);
		// ananomus object
		driver.findElement(By.id("pass")).sendKeys("Elakkiya@01");
		String attribute = driver.findElement(By.id("pass")).getAttribute("value");
		System.out.println(attribute);
		// driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//button[text()='Log In']")).click();

		// browserClose();
	}

//	public static void main(String[] args) {
//		browserlaunch("chrome");
//		loadUrl("https://adactinhotelapp.com/index.php");
//		type(findlementByID("username"), "shahulhameed");
//		type(findlementByID("password"), "Allah@01");
//		elementClick(findlementByID("login"));
//		type(findlementByID("location"), "London");
//		
//	}

}
