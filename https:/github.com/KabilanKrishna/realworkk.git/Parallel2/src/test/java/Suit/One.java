package Suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class One {
	
	
	@BeforeSuite
public static void Beforesuit() throws InterruptedException {
		
		System.out.println("1-BeforeSuit-Suit");
		Thread.sleep(5000);
		System.out.println("2-BeforeSuit-Suit");
		
		
	}

@AfterSuite
public static void Aftersuit() throws InterruptedException {
	
	System.out.println("1-AfterSuit-Suit");
	Thread.sleep(5000);
	System.out.println("2-AfterSuit-Suit");
	
	
}
	
	
	
	@BeforeTest
	public static void Before() throws InterruptedException {
		
		System.out.println("1-Before-Suit");
		Thread.sleep(5000);
		System.out.println("2-Before-Suit");
		
		
	}
	
	
	
	
	
	@AfterTest
	public static void After() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("1--After-Suit");
		Thread.sleep(5000);
		System.out.println("2--After-Suit");
		
	}

}
