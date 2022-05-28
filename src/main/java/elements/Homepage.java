package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonClass;

public class Homepage {
	
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);  //homepage.class(or "this" keyword)
	}
	
	
	@FindBy(xpath = "(//button[@class='LeadRouting__select a'])[1]") 
	WebElement car;

	@FindBy(xpath = "(//input[@name='zipCode' and  @inputmode='text' and @placeholder='Zip Code'])[1]") 
	WebElement zipCode;
	
	
	@FindBy(xpath = "(//span[@class='LoadingButton__content'])[1]")
	WebElement startQuote;
	
	public void carClicking(CommonClass cm) {
		cm.clicking(car);
		
	}
	
	public void zipMethod(CommonClass cm) {
		
		cm.enterText(zipCode, "10472");
	}
	
	public void startQuoteMethod(CommonClass cm) {
		cm.clicking(startQuote);
	}
}
