package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Prg1 {

	public static void main(String[] args) {

		// how to launch a browser
		
		
		// set chrome path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VSPICT\\Downloads\\chromedriver.exe");
		
		// set IE path
		System.setProperty("webdriver.ie.driver", "C:\\Users\\VSPICT\\Downloads\\IEDriverServer.exe");
		
		// setup Edge path
		System.setProperty("webdriver.edge.driver", "C:\\Users\\VSPICT\\Downloads\\MicrosoftWebDriver.exe");
		
		// initialize chrome path
		WebDriver driver = new ChromeDriver();
		// open link
		driver.get("http://www.google.com");
		// Maximize browser
		driver.manage().window().maximize();
		
		
		
		// initialize IE path
		WebDriver driver2 = new InternetExplorerDriver();
		// open link
		driver2.get("http://www.google.com");
		// maximize the window
		driver2.manage().window().maximize();
		
		
		// initialize Edge path
		WebDriver driver3 = new EdgeDriver();
		// open link
		driver3.get("http://www.google.com");
		// maximize the window
		driver3.manage().window().maximize();
		
		
		// close browsers
		driver.close();
		driver2.close();
		driver3.close();
	}

}
