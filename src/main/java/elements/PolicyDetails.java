package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonClass;

public class PolicyDetails {

	
	
	public PolicyDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//h1[contains(text(),'Policyholder Details')])[1]")
	WebElement policyText;
	
	@FindBy(id = "F_PH_FirstName_0")
	WebElement firstName;
	
	@FindBy(id = "F_PH_MiddleInitial_0")
	WebElement mName;
	
	@FindBy(id = "F_PH_LastName_0")
	WebElement lastName;

	@FindBy(id = "F_PH_DOB_0")
	WebElement dob;

	@FindBy(id = "F_PH_email_0")
	WebElement email;

	@FindBy(id = "F_street_0")
	WebElement address;
	
	@FindBy(id = "F_city_0")
	WebElement city;
	
	@FindBy(id = "F_state_0")
	WebElement state;

	@FindBy(id = "F_zipCode_0")
	WebElement zip3;

	@FindBy(id = "F_livingYear_0")
	WebElement yearSince;

	@FindBy(xpath = "//a[@id='Continue']")
	WebElement cont;
	
		
	
	public void policyTextVerification(CommonClass cm) {
		cm.verifyText(policyText, "Policyholder Details");
	}
	
	public void fnEntry(CommonClass cm) {
		cm.enterText(firstName, "John");
	}
	
	public void mnEntry(CommonClass cm) {
		cm.enterText(mName, "A");
	}
	
	public void lnEntry(CommonClass cm) {
		cm.enterText(lastName, "Peeks");
	}
	
	public void dobEntry(CommonClass cm) {
		cm.enterText(dob, "03121987");
	}
	
	public void emailEntry(CommonClass cm) {
		cm.enterText(email, "abc@abc.com");
	}
	
	public void addsEntry(CommonClass cm) {
		cm.enterText(address, "1063 van nest ave");
	}
	
	public void cityEntry(CommonClass cm) {
		cm.enterText(city, "Bronx");
	}
	
	public void stateEntry(CommonClass cm) {
		cm.dropDown(state, "NY");
	}
	
	public void zip3Entry(CommonClass cm) {
		cm.enterText(zip3, "10461");
	}
	
	public void yearEntry(CommonClass cm) {
		cm.enterText(yearSince, "2018");
	}
	
	public void continueClick(CommonClass cm) {
		cm.clicking(cont);
	}
	
	
	
}
