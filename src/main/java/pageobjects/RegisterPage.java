package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
    	
	}
	@FindBy(id="input-firstname")
	WebElement EnterFirstName;
	
	@FindBy(id="input-lastname")
	WebElement EnterLastName;
	
	@FindBy(id="input-email")
	WebElement EnterEmail;
	
	@FindBy(id="input-telephone")
	WebElement EnterTelephone;

	@FindBy(id="input-password")
	WebElement EnterPassword;
	
	@FindBy(id="input-confirm")
	WebElement EnterConfirmPassword;
	
	@FindBy(name="agree")
	WebElement privacy;
	
	@FindBy(css="input[value='Continue']")
	WebElement ContinueButton;
	
	
	public void entername(String firstname1)
	{
		EnterFirstName.sendKeys(firstname1);
	}
	public void enterlastname(String lastname1)
	{
		EnterLastName.sendKeys(lastname1);
	}
	public void enteremail(String emailid1)
	{
		EnterEmail.sendKeys(emailid1);
	}
	public void enterphone(String phonenumber1)
	{
		EnterTelephone.sendKeys(phonenumber1);
	}
	public void enterpassword(String password1)
	{
		EnterPassword.sendKeys(password1);
	}
	public void enterconfirmpassword(String cpassword1)
	{
		EnterConfirmPassword.sendKeys(cpassword1);
	}
	public void privacypolicy()
	{
		privacy.click();
	}
	public void continuebutton()
	{
		ContinueButton.click();
	}
}
