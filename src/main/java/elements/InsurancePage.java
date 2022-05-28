package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonClass;

public class InsurancePage {

	public InsurancePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='uid_34']")
	WebElement zipCode2;
	
	@FindBy(xpath = "//select[@id='uid_37']")
	WebElement insuranceType;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
      WebElement submitQuote;
	
	public void zipcode2Method(CommonClass cm) {
		cm.enterText(zipCode2, "10472");
		
	}
	
	public void typeSelection(CommonClass cm) {
		cm.dropDown(insuranceType, "A" );
	}
	
	public void submitQuoteMethod(CommonClass cm) {
		cm.clicking(submitQuote);
	}
	
	
	
	
	
}
