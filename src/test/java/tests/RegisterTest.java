package tests;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.RegisterPage;
import pageobjects.SuccessPage;
import resources.Base;
@Test
public class RegisterTest extends Base {
	public WebDriver driver = null;
	HomePage homePage = null;
	RegisterPage register=null;
	
	public void RegisterWithValidDetails() {
		
		homePage = new HomePage(driver);
		
		homePage.clickOnMyAccount();
		homePage.selectRegisterOption();
		
		register= new RegisterPage(driver);
		
		register.entername(prop.getProperty("validfirstname"));
		register.enterlastname(prop.getProperty("validlastname"));
		register.enteremail("mahith"+getTimeStamp()+"@gmail.com");
		register.enterphone(prop.getProperty("validphonenumber"));
		register.enterpassword(prop.getProperty("validpassword"));
		register.enterconfirmpassword(prop.getProperty("validcpassword"));
		register.privacypolicy();
		register.continuebutton();
		
		SuccessPage successpage = new SuccessPage(driver);
		
		Assert.assertEquals(successpage.verifySuccessPageofYourAccount(),true);
		
		
	}
	@BeforeMethod
	public void setup() throws IOException {
		
		driver = initializeBrowser();
		
	    driver.get(prop.getProperty("url"));
	    
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
	public String getTimeStamp() {
		
		Date date = new Date();
		
		String dateString = date.toString(); 
		
		String timeStamp = dateString.replace(" ","_").replace(":","_");
		
		return timeStamp;
		
	}

}
