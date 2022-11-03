package Zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Utility;

public class Login {
	
	// Step 1 To declare the global variable (Data Member)
	
	@FindBy (xpath="//input[@type='text']")
	private WebElement username;
	
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	
	// Step 2 Initialisation of variable
	
	public Login(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
		// Step 3 Method create
		
		public void enterUN() {
			
			String data =Utility.getDataFromExcel(Sheet1, 4, 6)
			username.sendKeys(data);
		}
		
		public void enterPWD() {
			password.sendKeys("ZAQ1234567");
		}
		
		public void login() {
			loginButton.click();
		}
		
		
		
	}
	


