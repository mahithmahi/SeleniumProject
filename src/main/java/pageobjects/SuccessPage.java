package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessPage {
	
	WebDriver driver;
	
	public SuccessPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(css="div[id='content'] h1")
	WebElement YourAccounthasbeencreated;
	
	public boolean verifySuccessPageofYourAccount() {
		
		boolean displayStatus = YourAccounthasbeencreated.isDisplayed();
		
		return displayStatus;
		
	}

}
