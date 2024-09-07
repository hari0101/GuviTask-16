package guvitask16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 
 3. Write a Selenium script that opens the chrome browser, navigates to "https://www.wikipedia.org/", maximizes the browser window, searches for the query
	"Artificial Intelligence", clicks on the "History" section in the search results, and prints the title of the section. 
 
 */
public class Question3 {

	public static void main(String[] args) {

		// Creating the instance of chromedriver.
		WebDriver chrome = new ChromeDriver();
		// Implict wait
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// maximize
		chrome.manage().window().maximize();
		//navigate to website
		chrome.get("https://www.wikipedia.org/");
		
		//Sending locating and sending keys to input box.
		chrome.findElement(By.id("searchInput")).sendKeys("artificial intelligence");
		//clicking the search button.
		chrome.findElement(By.xpath("//button[@type='submit']")).click();
		//Selecting the History text.
		chrome.findElement(By.xpath("//span[text()='History']")).click();
		
		//Title of the website
		String title = chrome.getTitle(); 
		System.out.println("Title of the page : " + title + "\n");
	
		//Current Url
		String url = chrome.getCurrentUrl();
		System.out.println("URL : " + url);
	}

}
