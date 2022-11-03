package Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
// 	@BeforeSuite
// 	public void beforeSuite() {
		
// 		System.out.println("Before suit from TestNG1");
		
// 	}
	
// 	@BeforeTest
// 	public void beforeTest() {
		
// 		System.out.println("Before test from TestNG1");
		
// 	}
	
	
 	@BeforeClass
 	public void beforeClass() {
		
 		System.out.println("Before class");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Before Method");
		
	}
	
	@Test 
	public void test1() {
		
		System.out.println("test1");
		
	}
	@Test  
   public void test2()  {
		
		System.out.println("test2");
		
	}
	
	@Test 
	   public void test3() {
			
			System.out.println("test3");
			
		}

	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("after Method");
		
	}
	
	@AfterClass
	public void afterclass() {
		
		System.out.println("after class");
		
	}
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("After test from TestNG1");
		
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("After suit from TestNG1");
		
	}


}
