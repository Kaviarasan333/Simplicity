package sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPojaClass extends BaseClass
{
	public SearchPojaClass()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//i[@class='material-icons search'][1]")
private WebElement searchBox;
@FindBy(xpath="//input[@class='ui-autocomplete-input']")
private WebElement searchtext;
public WebElement getSearchBox() {
	return searchBox;
}
public WebElement getSearchtext() {
	return searchtext;
}




}
