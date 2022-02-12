package org.test.javasc;

import org.elakkiya.selenium.launch.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascripTest extends LaunchBrowser {
	
	public static void main(String[] args) throws InterruptedException {

		LaunchBrowser.browserlaunch("chrome");
		LaunchBrowser.loadUrl("https://www.facebook.com/");
		
		/*WebElement username = LaunchBrowser.elementFindById("email");
		LaunchBrowser.type(username, "shahulhamed");*/
		
		LaunchBrowser.type(LaunchBrowser.elementFindById("email"), "shahulhamed");
		
		LaunchBrowser.type(LaunchBrowser.elementFind(By.xpath("//input[@id='pass']")), "shahu");
		
	}
}
