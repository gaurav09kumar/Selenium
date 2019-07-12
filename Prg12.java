package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Prg6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VSPICT\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement download3 = driver.findElement(By.cssSelector("#txtUsername"));
		download3.sendKeys("Admin");
		WebElement item1 = driver.findElement(By.name("txtPassword"));
		item1.sendKeys("admin123");
		WebElement download1 = driver.findElement(By.xpath("//span[contains(text(),'( Username : Admin | Password : admin123 )')]"));
		String downloadcolor = download1.getCssValue("color");
		System.out.println("submit button Color is: " + downloadcolor);
		//download1.click();
	}
}
