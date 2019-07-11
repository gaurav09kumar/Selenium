//using css selector
package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Prg3 {
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VSPICT\\Downloads\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.makemytrip.com/");
		d1.findElement(By.cssSelector("li.makeFlex.hrtlCenter.font10.makeRelative.lhUser")).click();}
}
