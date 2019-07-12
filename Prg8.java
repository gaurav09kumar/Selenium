//check visibility of elements

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VSPICT\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource-demo.orangehrmlive.com");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtUsername']/following::input[1]")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='txtUsername']/following::input[2]")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		boolean checktext = driver.findElement(By.xpath("//tr[@class='even']//td[2]/a")).isDisplayed();
		boolean enable = driver.findElement(By.xpath("//tr[@class='even']//td[2]/a")).isEnabled();
		if (checktext == true && enable == true)
		{
			driver.findElement(By.xpath("//tr[@class='even']//td[2]/a")).click();
		}
		}
}
