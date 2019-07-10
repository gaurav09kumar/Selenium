import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Prg1 {

	public static void main(String[] args) {
		
		//how to launch a browser 
		//set chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VSPICT\\Downloads\\chromedriver.exe");
		//set IE
		System.setProperty("webdriver.ie.driver","C:\\Users\\VSPICT\\Downloads\\IEDriverServer.exe");
		//initialize chrome browser
		WebDriver driver = new ChromeDriver();
		//open libk
		driver.get("http://www.google.com");
		// Maximize browser
		driver.manage().window().maximize();
		//initialize IE
		WebDriver driver2=new InternetExplorerDriver();
		//open link
		driver2.get("http://www.google.com");
		//maximize the window
		driver2.manage().window().maximize();
		//close browser
		driver.close();
		driver2.close();
	}
}
