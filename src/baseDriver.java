import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseDriver {


	public static WebDriver wd;
	public static Webdriver wdd;

	public void getDriver(){
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get("https://www.google.com/");
		
}
}

