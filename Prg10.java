//displaying a particular item 
package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prg5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VSPICT\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource-demo.orangehrmlive.com");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtUsername']/following::input[1]")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='txtUsername']/following::input[2]")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();

		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
		System.out.println(rows.size());
		String s;
		for (int i = 1; i < rows.size(); i++) {
			s = driver.findElement(By.xpath("//tbody/tr[" + (i + 1) + "]/td[2]")).getText();
			System.out.println(s);
		}
    }
}
