package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Prg2 {
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VSPICT\\Downloads\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("http://opensource-demo.orangehrmlive.com");
		
		WebElement item=d1.findElement(By.id("txtUsername"));
		//enter data in the field
		item.sendKeys("Admin");
		WebElement password=d1.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		//link text
		d1.get("http://www.seleniumhq.org");
		WebElement download= d1.findElement(By.linkText("Download"));
		download.click();		
	}
}
