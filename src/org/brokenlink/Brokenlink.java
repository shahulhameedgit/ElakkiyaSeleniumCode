package org.brokenlink;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.elakkiya.selenium.launch.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Brokenlink extends LaunchBrowser {

	static void brokenlinkcode() throws Exception {
		browserlaunch("chrome");
		loadUrl("https://www.google.com/");
		// to get all link present present in a web page
		// <a href="url">
		List<WebElement> atag = driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = atag.iterator();
		while (it.hasNext()) {
			String url = it.next().getAttribute("href");
			System.out.println(url);
			if (url == null || url.isEmpty()) {
				System.out.println("url is empty");

			}
			if (!url.startsWith("https://www.flipkart.com/")) {
				System.out.println("this is related to another domain");
			}

			try {
				/*
				 * URL hrefurl= new URL(url); URLConnection openConnection =
				 * hrefurl.openConnection(); HttpURLConnection
				 * ul=(HttpURLConnection)openConnection;
				 */
				HttpURLConnection ul = (HttpURLConnection) (new URL(url).openConnection());
				ul.setRequestMethod("HEAD");
				ul.connect();
				int responseCode = ul.getResponseCode();
				String responseMessage = ul.getResponseMessage();
				System.out.println(responseCode);
				System.out.println(responseMessage);
				if (responseCode < 400) {
					System.out.println("the give url is non broken");
				} else {
					System.out.println("the given url is broken : " + url);
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) throws Exception {
		brokenlinkcode();
	}
}
