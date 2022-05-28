package base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import common.CommonClass;
import elements.ConnectPage;
import elements.Homepage;
import elements.InsurancePage;
import elements.PolicyDetails;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public Homepage homepage;
	public CommonClass cm;
	public ConnectPage cP;
	public InsurancePage ip;
	public PolicyDetails pd;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amfam.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		initialization();

	}

	private void initialization() {
		homepage = new Homepage(driver);
		cm = new CommonClass();
		cP = new ConnectPage(driver);
		ip = new InsurancePage(driver);
		pd = new PolicyDetails(driver);
	}

	@AfterMethod
	public void tearUp() {
		// driver.quit();
	}

}
