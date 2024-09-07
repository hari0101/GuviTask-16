package guvitask16;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
/*
	1. 	Write a Selenium script that opens the Firefox browser, maximizes the browser window, navigates to "http://google.com", 
		prints the URL of the current page, reloads the page,and closes the browser.
*/

public class Question1 {

	public static void main(String[] args) {

		// Creating instance of the Firefox browser
		WebDriver fox = new FirefoxDriver();
		// Implicity wait to make element default wait globally.
		fox.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Maximizing the browser window
		fox.manage().window().maximize();

		// Navigating to url
		fox.navigate().to("https://www.google.com/");

		// Storing the current url in string type
		String url = fox.getCurrentUrl();
		// Printing
		System.out.println("The URL of current webpage is : " + url);

		// This will reload the current webpage
		fox.navigate().refresh();

		fox.close();
	}

}
