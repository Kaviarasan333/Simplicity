package sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PyamentPojoClass extends BaseClass {
	
	public PyamentPojoClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="confirmDeliveryOption")
	private WebElement cont;
	
	@FindBy(id="payment-option-2")
	private WebElement payoptin2;
	
	@FindBy(name="conditions_to_approve[terms-and-conditions]")
	private WebElement chckbox;

	public WebElement getCont() {
		return cont;
	}

	public WebElement getPayoptin2() {
		return payoptin2;
	}

	public WebElement getChckbox() {
		return chckbox;
	}
	
	

}
