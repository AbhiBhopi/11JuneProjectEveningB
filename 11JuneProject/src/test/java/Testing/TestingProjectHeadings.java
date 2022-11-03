package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Zerodha.Home;
import Zerodha.Login;
import Zerodha.LoginPIN;
import Zerodha.Logout;
import setup.Browser;
import utils.Utility;

public class TestingProjectHeadings extends Browser {
	int testID; 
	
	WebDriver driver;
	Login login;
	LoginPIN loginpin;
	Home home;
	Logout logout; 
	SoftAssert soft; 
	
	
	@Parameters ("browser")
	
	@BeforeTest
	public void openbrowser(String browserName) {
		System.out.println(browserName);
		
		if(browserName.equals("Chrome")) {
	
	
	driver =  ooenchromeBrowser();
	
		}
		

		if(browserName.equals("Firefox")) {
			
			driver=openFirefoxBrowser();
			
				}
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	@BeforeClass
	public void CreateObject() {
		login = new Login(driver);
		loginpin = new LoginPIN(driver);
		home = new Home(driver);
		logout = new Logout(driver);
		
	}
	
	
	@BeforeMethod
	public void logintoApllication() throws InterruptedException {
		
		System.out.println("Before Method");
		
		//driver.get("https://kite.zerodha.com/");
		
		
		login.enterUN();
		login.enterPWD();
		login.login();
		
		
		Thread.sleep(2000);
		loginpin.enterpin();
		loginpin.clicksubmit();
		
		
		
	}
	
	@Test
	public void test() {
		testID =233456;
		soft = new SoftAssert();
		
		System.out.println("test");
		
		home.order();
		
		String url = driver.getCurrentUrl();// Actual
		String title = driver.getTitle(); // Actual
		
		soft.assertEquals(url, "https://kite.zerodha.com/orders", "orders page URL not found");
		System.out.println("assert not run result not apply");
		soft.assertEquals(title, "Orders / Kite");
		
		
		
//		if(url.equals("https://kite.zerodha.com/orders")) {
//			System.out.println("Test Case Pass");
//			}
//		else {
//			System.out.println("Test Case Fail");
//		}
		soft.assertAll(); // to apply the results
	
		
	}
	
	@Test
	public void test1() {
		testID =233457;
		soft = new SoftAssert();
		System.out.println("test1");
		
		home.holdings();
		
		String url = driver.getCurrentUrl();// Actual
		String title = driver.getTitle(); // Actual
		
		soft.assertEquals(url, "https://kite.zerodha.com/holdings");
		soft.assertEquals(title, "Holdings / Kite");
//		if(url.equals("https://kite.zerodha.com/holdin")) {
//			System.out.println("Test Case Pass");
//			}
//		else {
//			System.out.println("Test Case Fail");
//		}
		soft.assertAll();
	}
	
	@Test
	public void test2() {
		soft = new SoftAssert();
		System.out.println("test2");
		
		home.positions();
		
		String url = driver.getCurrentUrl();// Actual
		String title = driver.getTitle(); // Actual
		
		soft.assertEquals(url, "https://kite.zerodha.com/positions");
		soft.assertEquals(title, "Positions / Kite");
		
//		if(url.equals("https://kite.zerodha.com/positions")) {
//			System.out.println("Test Case Pass");
//			}
//		else {
//			System.out.println("Test Case Fail");
//		}
		soft.assertAll();
	}
	
	

	@AfterMethod
	public void logout(ITestResult result) throws InterruptedException {
		
		if(ITestResult.FAILURE == result.getStatus()) {
			
			Utility.captureScreenshot(driver, testID);
			
		}
		
		
		
		
		
		
		System.out.println("After Method");
		
		home.logout();
		logout.clickuser();
		
	}
	
	@AfterClass
	public void Clearobject() {
		login = null;
		loginpin = null;
		home = null;
		logout = null;
		driver = null;
		
	}
	@AfterTest
	
	public void afterTest() {
		
		driver.close();
		System.gc();  // garbage collect and object clear delet
		
		
		
	}
	
	
	
	
	
}
