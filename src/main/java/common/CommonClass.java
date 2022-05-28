package common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import base.BaseClass;

public class CommonClass {

	 WebDriverWait wait=new WebDriverWait(BaseClass.driver, 20);
	 
	public void clicking(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}
	
	public void enterText(WebElement element,String value) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
   public void dropDown(WebElement element, String value) {
	   Select select=new Select(element);
			   select.selectByValue(value);
   }
   
   public void verifyText(WebElement element,String expected) {
	   String actualvalue= element.getText();
	  System.out.println(actualvalue);
	   
	    Assert.assertEquals(actualvalue, expected);
	  
   }
}
