package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BasePage{


	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn;
	
	public void setUsername(String name) {
		username.sendKeys(name);
		
	}
	public void setPassword(String pswrd) {
		password.sendKeys(pswrd);
	}
	public void clickLogin() {
		btn.click();
	}
}
