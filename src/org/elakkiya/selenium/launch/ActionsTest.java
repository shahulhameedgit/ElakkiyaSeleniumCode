package org.elakkiya.selenium.launch;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest extends LaunchBrowser {
	
	 void mousehover(){
		browserlaunch("chrome");
		loadUrl("https://www.doosan.com/en");
		windowMaximize();
		elementClick(findelementByXpath("//img[@alt='Close']"));
		WebElement aboutus = findelementByXpath("(//a[text()='About Us'])[1]");
		WebElement doosanstory = findelementByXpath("(//span[text()='Doosan Story'])[1]");
		Actions acc = new Actions(driver);
		acc.moveToElement(aboutus).build().perform();
		//doosanstory.click();
		acc.click(doosanstory).build().perform();
		
	}
	
	 void doubledontextclick() {
		 browserlaunch("chrome");
			loadUrl("https://demoqa.com/droppable/");
			windowMaximize();
			WebElement dragme = findelementByXpath("//div[text()='Drag me']");
			WebElement dropme = findelementByXpath("(//div[@class='drop-box ui-droppable'])[1]");
			Actions acc = new Actions(driver);
			//acc.dragAndDrop(dragme, dropme).build().perform();
			//acc.clickAndHold(dragme).build().perform();
			//acc.release(dropme).build().perform();
			WebElement droppable = findelementByXpath("//div[text()='Droppable']");
			// to double click on an element
			acc.doubleClick(droppable).build().perform();
			// to right click on the target element
			acc.contextClick(droppable).build().perform();
			// this is how we use Keys class.
			acc.sendKeys(droppable,Keys.ARROW_DOWN)
			.sendKeys(droppable,Keys.ARROW_DOWN)
			.sendKeys(droppable,Keys.ARROW_DOWN)
			.sendKeys(droppable,Keys.ARROW_DOWN).build().perform();
			acc.sendKeys(droppable,Keys.ENTER).build().perform();
		
	 }
	
	public static void main(String[] args) {
		//keydown and key up
		browserlaunch("chrome");
		loadUrl("https://www.facebook.com/");
		WebElement username = findlementByID("email");
		username.sendKeys("shahul");
//		Actions acc = new Actions(driver);
//		//acc.doubleClick(username).build().perform();
//		acc.keyDown(username, Keys.CONTROL)
//			.sendKeys("a").sendKeys("x").sendKeys("v").build().perform();
//		acc.keyUp(username, Keys.CONTROL).build().perform();
		// the above can be used through chord
//		String s = Keys.chord(Keys.CONTROL, "a");
//		username.sendKeys(s);
//		String s1 = Keys.chord(Keys.CONTROL, "x");
//		username.sendKeys(s1);
		// via send keys we can do the above execution
		username.sendKeys(Keys.CONTROL, "a");
		username.sendKeys(Keys.CONTROL, "x");
		
		
	}
	
	
}
