package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prg8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VSPICT\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement clickElement = driver.findElement(By.xpath("//a[1]//img[1]"));

		for (int i = 0; i < 3; i++) {
			clickElement.click();
			Thread.sleep(3000);
		}

		Set<String> allWindowHandles = driver.getWindowHandles();
		String lastWindow = "";
		System.out.println(allWindowHandles);
		for (String handle : allWindowHandles) {
			System.out.println("Switching to window - > " + handle);
			System.out.println("Navigating to google.com");
			// Switch to the desired window first and then execute commands using driver
			driver.switchTo().window(handle);
			//perform some action
			driver.get("http://google.com");
			//save the last opened window address
			lastWindow = handle;
		}
		// Switch to the parent window
		driver.switchTo().window(lastWindow);
		// close the parent window
		driver.close();
		// at this point there is no focused window, we have to explicitly switch back
		// to some window.
		driver.switchTo().window(lastWindow);
	}
}
