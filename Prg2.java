import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Prg2 {
	public static void main(String [] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\VSPICT\\Downloads\\geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		d1.get("http://www.google.com");
	}
}
