//short code of prg3

package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Prg2 {
	public static void main(String [] args) {System.setProperty("webdriver.chrome.driver", "C:\\Users\\VSPICT\\Downloads\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("http://opensource-demo.orangehrmlive.com");
		//enter data into the fields
		d1.findElement(By.id("txtUsername")).sendKeys("Admin");
		d1.findElement(By.id("txtPassword")).sendKeys("admin123");
		//link text
		d1.get("http://www.seleniumhq.org");
		d1.findElement(By.linkText("Download")).click();
		//in orange hrm
		d1.findElement(By.linkText("Forgot your password?")).click();
	}
}
