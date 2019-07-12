//login
//logout
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
    
    driver.findElement(By.xpath("//a[@id='welcome']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
    }

}
