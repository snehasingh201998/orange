package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends BasePage{

	public Dashboard(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//h6[normalize-space()='Dashboard']")
	WebElement board;
	
	public String checkDash() {
		
		try {
			return board.getText();
		}catch(Exception e){
			return e.getMessage();
		}
		
	}
}
