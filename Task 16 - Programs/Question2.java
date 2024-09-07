package guvitask16;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
/*
   2. Write a Selenium script that opens the Chrome browser, navigates to "https://www.demoblaze.com/", maximizes the browser window, 
      verifies if the title of the page is "STORE", and prints "Page landed on correct website" 
      if the title matches, else prints "Page not landed on correct website".
 
 */
public class Question2 {

	//Excepted variable
	static String exceptedtitle = "STORE";
	
	public static void main(String[] args) {

		// Creating the instance of chromedriver.
		WebDriver chrome = new ChromeDriver();
		// Implict wait
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// maximize
		chrome.manage().window().maximize();
		// Navigates to website
		chrome.get("https://www.demoblaze.com/");

		// Getting the title of the website as actual string
		String actualtitle = chrome.getTitle();
		// Condition to check the actual and expected value is equal.

		if (exceptedtitle.equals(actualtitle)) {
			
			System.out.println("Page landed on correct website"); //condition true
		
		} else {

			System.out.println("Page not landed on correct website"); // condition false
		
		}

	}

}
