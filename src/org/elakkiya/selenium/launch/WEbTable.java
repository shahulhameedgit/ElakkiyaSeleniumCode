package org.elakkiya.selenium.launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WEbTable extends LaunchBrowser {

	void webtable() {
		browserlaunch("chrome");
		loadUrl("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement> tRow = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tRow.size(); i++) {
			List<WebElement> tHeader = tRow.get(i).findElements(By.tagName("th"));
			for (int j = 0; j < tHeader.size(); j++) {
				String text = tHeader.get(j).getText();
				System.out.println(text);
			}

			List<WebElement> tdata = tRow.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < tdata.size(); j++) {
				String text = tdata.get(j).getText();
				System.out.println(text);
			}
		}
	}
	
	void singlerowdata() {
		browserlaunch("chrome");
		loadUrl("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement> tRow = driver.findElements(By.tagName("tr"));
		
		List<WebElement> tdata = tRow.get(tRow.size()-1).findElements(By.tagName("td"));
		for (int j = 0; j < tdata.size(); j++) {
			String text = tdata.get(j).getText();
			System.out.println(text);
		}
	}
	
	static void resuable(String companyName) {
		browserlaunch("chrome");
		loadUrl("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement> tRow = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tRow.size(); i++) {
			List<WebElement> tData = tRow.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < tData.size(); j++) {
				String text = tData.get(j).getText();
				if (text.equalsIgnoreCase(companyName)) {
					String text2 = tData.get(0).getText();
					String text3 = tData.get(1).getText();
					String text4 = tData.get(2).getText();
					String text5 = tData.get(3).getText();
					String text6 = tData.get(4).getText();
					System.out.println(text2);
					System.out.println(text3);
					System.out.println(text4);
					System.out.println(text5);
					System.out.println(text6);
					
				}
			}
		}
	
	}

	public static void main(String[] args) {
		resuable("Bajaj Corp Ltd.");
	}
}
