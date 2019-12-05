package sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoClass extends BaseClass {
	
public LoginPojoClass()
{
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//i[text()='settings']")
	private WebElement settings;
	
	@FindBy(linkText = "Sign in")
	private WebElement clk_login;
	
	public WebElement getSettings() {
		return settings;
	}

	public WebElement getClk_login() {
		return clk_login;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(id="submit-login")
	private WebElement login;
}
