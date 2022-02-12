package org.elakkiya.selenium.launch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

public class DropdownFunc extends LaunchBrowser {

	public static void main(String[] args) throws AWTException, InterruptedException {
		browserlaunch("chrome");
		loadUrl("https://demoqa.com/select-menu");
		List<String> li = new ArrayList<String>();
		driver.findElement(By.xpath("//div[@class=' css-tlfecz-indicatorContainer']")).click();
		// robot class - this is used to do all keyboard activities
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		String text = driver.findElement(By.xpath("//div[@class=' css-1uccc91-singleValue']")).getText();
		li.add(text);
		for (int i = 0; i < li.size(); i++) {
			driver.findElement(By.xpath("//div[@class=' css-tlfecz-indicatorContainer']")).click();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			String data = driver.findElement(By.xpath("//div[@class=' css-1uccc91-singleValue']")).getText();
			if (li.contains(data)) {
				break;
			}
			li.add(data);
		}
		
//		Select carMDS = new Select(findlementByID("cars"));
//		carMDS.selectByIndex(1);
//		carMDS.selectByValue("volvo");
//		carMDS.selectByVisibleText("Audi");
//		
//		WebElement firstSelectedOption = carMDS.getFirstSelectedOption();
//		System.out.println(firstSelectedOption.getText());
//		
//		List<WebElement> allSelectedOptions = carMDS.getAllSelectedOptions();
//		for (WebElement ele : allSelectedOptions) {
//			System.out.println(ele.getText());
//		}
//		// to deselect all selected value in a single shot
//		carMDS.deselectAll();
//		
//		// to deselect one by one
//		carMDS.deselectByIndex(1);
//		carMDS.deselectByValue("volvo");
//		carMDS.deselectByVisibleText("Audi");
//		

//		loadUrl("https://adactinhotelapp.com/index.php");
//		type(findlementByID("username"), "shahulhameed");
//		type(findlementByID("password"), "Allah@01");
//		elementClick(findlementByID("login"));
		// to find the dropdown is a single r multi dropdown
//		Select location = new Select(findlementByID("location"));
//		boolean multiple = location.isMultiple();
//		System.out.println(multiple);

		// to print all values in a dropdown
//		Select location = new Select(findlementByID("location"));
//		List<WebElement> options = location.getOptions();
//		for (WebElement ele : options) {
//			String text = ele.getText();
//			System.out.println(text);
//		}

//		Select location = new Select(findlementByID("location"));
//		location.selectByIndex(5);
//		
//		Select hotels = new Select(findlementByID("hotels"));
//		hotels.selectByValue("Hotel Sunshine");
//		
//		Select Room_Type = new Select(findlementByID("room_type"));
//		Room_Type.selectByVisibleText("Standard");

	}

}
