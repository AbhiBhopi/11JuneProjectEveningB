package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Zerodha.Home;
import Zerodha.Login;
import Zerodha.Login2;
import Zerodha.LoginPIN;

public class TestBase {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		//ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
	
	

		Login login = new Login(driver);
		
		login.enterUN();
		login.enterPWD();
		login.login();
		
		
		
		LoginPIN loginPIN = new LoginPIN(driver);
		Thread.sleep(5000);
		
		loginPIN.enterpin();
		loginPIN.clicksubmit();
		
		
		
		Home home = new Home(driver);
		
		home.order();
		
		
		
		
		
		
		
		
		
}
}