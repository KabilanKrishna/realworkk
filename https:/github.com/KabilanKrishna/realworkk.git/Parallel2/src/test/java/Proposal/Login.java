package Proposal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Login {

	
	
	@Test
	public static void login() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/kabilankrishna/eclipse-workspace/iclaim/ChromeDriver/chromedriver");

        // Optional: Configure ChromeOptions if needed (e.g., to run headless)
        ChromeOptions options = new ChromeOptions();
        // Uncomment the following line if you want to run Chrome in headless mode
        // options.addArguments("--headless");

        // Create a new instance of ChromeDriver with the specified options
        WebDriver driver = new ChromeDriver(options);

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the URL
        String URL = "https://uatnovacbs.shriramgi.com/uatnovacbs/GI.Common/Home/Login.aspx";
        driver.get(URL);

        Thread.sleep(15000);
        // Print a message after successful navigation
        System.out.println("Login Successful");
		
	}

}
