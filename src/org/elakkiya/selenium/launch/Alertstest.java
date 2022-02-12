package org.elakkiya.selenium.launch;

import org.openqa.selenium.Alert;

public class Alertstest extends LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		browserlaunch("chrome");
		loadUrl("https://demoqa.com/alerts");
		/*
		findlementByID("alertButton").click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		findlementByID("confirmButton").click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = alert.getText();
		System.out.println(text);
		alert.dismiss();
		
		findlementByID("promtButton").click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.sendKeys("this is my prompt alert");
		alert.accept();
		*/
	}
	
}
