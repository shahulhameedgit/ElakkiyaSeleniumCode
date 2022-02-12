package org.elakkiya.selenium.launch;

import org.openqa.selenium.By;

public class partiallinktext extends LaunchBrowser{

	public static void main(String[] args) {
		browserlaunch("chrome");
		loadUrl("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.linkText("Log In")).click();
	}
}
