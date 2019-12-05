package sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPojoClass extends BaseClass{
	
	public CartPojoClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Garmin Vivoactive 3 GPS smartwatch Stainless steel']")
	private WebElement watchclick;
	
	@FindBy(xpath="//button[@data-button-action='add-to-cart'][1]")
	private WebElement addtocart;

	public WebElement getWatchclick() {
		return watchclick;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

}
