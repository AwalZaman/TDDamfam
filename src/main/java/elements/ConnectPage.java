package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonClass;

public class ConnectPage {

	public ConnectPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//span[text()='Get a Quote']")
	public WebElement getQuote;
	
	
	
	public void getQuoteMethod(CommonClass cm) {
		cm.clicking(getQuote);
	}
	
	
	
	
	
}
