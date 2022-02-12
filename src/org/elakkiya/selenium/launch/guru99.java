package org.elakkiya.selenium.launch;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99 {

	static WebDriver driver;

	public static void browserlaunch(String browser) {
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./drivre/chromedriver.exe");
			driver = new ChromeDriver();
//			Options manage = driver.manage();
//			Window window = manage.window();
//			window.maximize();
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
	
	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void main(String[] args) throws Exception {
		browserlaunch("chrome");
		loadUrl("https://www.guru99.com/");
			List<WebElement> findElements2 = driver.findElements(By.xpath("//div[@class='col-md-3']/div/h4"));
			for (int j = 0; j < findElements2.size(); j++) {
				String string = findElements2.get(j).getText();
				System.out.println(string);
				String oldpath="(//ul[@class='menu1'])[";
				String newpath="]/li/a";
				int a=j+1;
				String originalpath= oldpath+a+newpath;
				List<WebElement> findElements = driver.findElements(By.xpath(originalpath));
				for (WebElement ulelement : findElements) {
					String text = ulelement.getText();
					System.out.println(text);
					ulelement.click();
					navigateBack();
					Thread.sleep(2000);
					driver.navigate().refresh();
					Thread.sleep(2000);
				}
			}
	}
}
