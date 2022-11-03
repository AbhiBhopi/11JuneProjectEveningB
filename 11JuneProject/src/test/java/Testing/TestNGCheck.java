package Testing;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGCheck {
	
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
	
	
	@Test 
	   public void test4() {
			
			System.out.println("test4");
			
			
		}
	
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("after Method");
		
	}
	
	@AfterClass
	public void afterclass() {
		
		System.out.println("after class");
		
	}


}
