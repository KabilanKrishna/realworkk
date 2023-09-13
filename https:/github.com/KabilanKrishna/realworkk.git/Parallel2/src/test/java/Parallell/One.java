package Parallell;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class One {
	
	
	public static String KK ="Kabilan";
	
	
	@BeforeSuite
	public static void Beforesuit() throws InterruptedException {
		
		System.out.println("1-BeforeSuit-Parallel");
		Thread.sleep(5000);
		System.out.println("2-BeforeSuit-Parallel");
		
		
	}

@AfterSuite
	public static void Aftersuit() throws InterruptedException {
	
	System.out.println("1-AfterSuit-Parallel");
	Thread.sleep(5000);
	System.out.println("2-AfterSuit-Parallel");
	
	
}
	
	
	@BeforeTest
	public static void Before() throws InterruptedException {
		
		System.out.println("1-Before-Parallel");
		Thread.sleep(5000);
		System.out.println("2-Before-Parallel");
		
		
	}
	
	
	@AfterTest
	public static void After() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("1--After-Parallel");
		Thread.sleep(5000);
		System.out.println("2--After-Parallel");
		
	}

}
