package pageexecution;

import org.elakkiya.selenium.launch.LaunchBrowser;

import pagefactory.on.LocatorPageFactory;

public class LoginPage extends LaunchBrowser{
	public void loginFucntion() {
		LaunchBrowser.browserlaunch("chrome");
		LaunchBrowser.loadUrl("https://adactinhotelapp.com/index.php");
		LocatorPageFactory lp= new LocatorPageFactory();
		LaunchBrowser.type(lp.username, "shahulhameed");
		
	}
	

}
