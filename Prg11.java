package demo;


import java.util.List;
import java.util.concurrent.TimeUnit;

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
			
			boolean item1 = driver.findElement(By.xpath("//a[contains(text(),'" + s + "')]")).isDisplayed();
			System.out.println(item1);
			
			boolean item2 = driver.findElement(By.xpath("//a[contains(text(),'" + s + "')]")).isEnabled();
			System.out.println(item2);
			
			if (item1 == true && item2 == true) {
				driver.findElement(By.xpath("//a[contains(text(),'"+s+"')]")).click();
				//driver.manage().timeouts().implicitlyWait(500000,TimeUnit.SECONDS) ;
			}
			driver.navigate().back();
		}
	}
}
