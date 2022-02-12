package org.elakkiya.selenium.launch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot extends LaunchBrowser {

	public static void main(String[] args) throws IOException {
		browserlaunch("chrome");
		windowMaximize();
		loadUrl("http://napf.datamatics.com:8888/napf-ui/");
		TakesScreenshot ts = (TakesScreenshot)driver; 
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("./napfscreen.jpeg");
		FileUtils.copyFile(source, destination);
	}
}
