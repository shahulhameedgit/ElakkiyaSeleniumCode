package pagefactory.on;

import org.elakkiya.selenium.launch.LaunchBrowser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorPageFactory extends LaunchBrowser{
	
	public LocatorPageFactory() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="usernae")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath ="//input[@id='login']")
	private WebElement login;
	

	public WebElement getLogin() {
		return login;
	}
	

}
