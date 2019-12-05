package sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPojoClass extends BaseClass
{
	public AddressPojoClass()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//span[text()='Cart']")
private WebElement clkCart;

@FindBy(xpath="//a[text()='View Cart'][1]")
private WebElement vwCart;

@FindBy(xpath="//a[text()='Proceed to checkout']")
private WebElement proceed;

@FindBy(name="confirm-addresses")
private WebElement contine;

public WebElement getClkCart() {
	return clkCart;
}

public WebElement getVwCart() {
	return vwCart;
}

public WebElement getProceed() {
	return proceed;
}

public WebElement getContine() {
	return contine;
}
}
