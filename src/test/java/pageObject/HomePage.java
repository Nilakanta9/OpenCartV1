package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{

	public HomePage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(xpath="")
	WebElement lnkMyAccount;
	
	@FindBy(xpath="")
	WebElement lnkRegister;
	
	public void clickMyAccount()
	{
		lnkMyAccount.click();
		
	}
	
	public void clickRegister()
	{
		lnkRegister.click();
		System.out.print("Hello");
	}

}
