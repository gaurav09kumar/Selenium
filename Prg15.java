//dropdowns
package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VSPICT\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource-demo.orangehrmlive.com");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtUsername']/following::input[1]")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='txtUsername']/following::input[2]")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();

		Select dropUser = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		if (dropUser.isMultiple()) {
			System.out.println("We can select multiple items");
		} else {
			System.out.println("NO");
		}
		dropUser.selectByVisibleText("ESS");
		dropUser.selectByIndex(1);
		System.out.println(dropUser.getOptions());

	}

}
