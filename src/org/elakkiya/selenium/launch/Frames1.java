package org.elakkiya.selenium.launch;

public class Frames1 extends LaunchBrowser{

	public static void main(String[] args) {
		browserlaunch("chrome");
		loadUrl("https://demoqa.com/frames");
		/*
		driver.switchTo().frame(1);
		String text = findlementByID("sampleHeading").getText();
		System.out.println(text);
		*/
		driver.switchTo().frame(findlementByID("sampleHeading"));
		String text = findlementByID("sampleHeading").getText();
		System.out.println(text);
		// this is used to reach the parent window
		driver.switchTo().defaultContent();
	}
}
