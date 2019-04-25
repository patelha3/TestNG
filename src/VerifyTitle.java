import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {

	
	WebDriver wd;
	
	
	@Parameters("browser")
	@Test
	public void getURL(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\Java\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
			wd = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\Java\\SeleniumWebDriver\\geckodriver-v0.21.0-win32\\geckodriver.exe");
			wd = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver","D:\\Java\\SeleniumWebDriver\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
			wd = new InternetExplorerDriver();
		}

		wd.get("https://www.yahoo.com/");
		wd.manage().window().maximize();
		
	}
}
