package testPackage;

import org.testng.annotations.Test;

import base.BaseClass;

public class QuotationTest extends BaseClass {

	
	
	
	@Test
	public void autoQuoteTest() {
		homepage.carClicking(cm);
		homepage.zipMethod(cm);
		homepage.startQuoteMethod(cm);
		cP.getQuoteMethod(cm);
		ip.zipcode2Method(cm);
		ip.typeSelection(cm);
		ip.submitQuoteMethod(cm);
		pd.policyTextVerification(cm);
		pd.fnEntry(cm);
		pd.mnEntry(cm);
		pd.lnEntry(cm);
		pd.dobEntry(cm);
		pd.emailEntry(cm);
		pd.addsEntry(cm);
		pd.cityEntry(cm);
		pd.stateEntry(cm);
		pd.zip3Entry(cm);
		pd.yearEntry(cm);
		pd.continueClick(cm);
	}
	
}
