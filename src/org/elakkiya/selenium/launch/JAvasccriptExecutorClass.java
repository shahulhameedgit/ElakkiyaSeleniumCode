package org.elakkiya.selenium.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JAvasccriptExecutorClass extends LaunchBrowser {
public void me() {
	browserlaunch("chrome");
	windowMaximize();
	// diver.get()
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.location='https://en-gb.facebook.com/'");
	// instead of sendkeys
	WebElement usernma = driver.findElement(By.id("email"));
	WebElement password = driver.findElement(By.id("pass"));
	js.executeScript("arguments[0].setAttribute('value','shahul')", usernma);
	js.executeScript("arguments[0].setAttribute('value','hameed')", password);
	// instead of getAttribute
	String s = (String) js.executeScript("return arguments[0].getAttribute('value')", usernma);
	System.out.println(s);
	// findElement.click()
	WebElement login = driver
			.findElement(By.xpath("//button[@name='login']"));
	js.executeScript("arguments[0].click()", login);

}
	public static void main(String[] args) {

		browserlaunch("chrome");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.facebook.com/'");
		WebElement findElement = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('style','border:solid 2px red')", findElement);
		js.executeScript("arguments[0].setAttribute('style','background:yellow')", findElement);
		js.executeScript("arguments[0].setAttribute('style','color:red')", findElement);
	}
}
