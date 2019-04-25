import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class moneyRediff extends baseDriver{
	
	
	@BeforeTest
	public void rediff() throws IOException {
		
		baseDriver dc= new baseDriver();
		dc.getDriver();
	}
	
	@BeforeMethod
	public void openRediffLink(){
	
		wd.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
	}
	
	@Test
	public void list() {
		List<WebElement> ls= wd.findElements(By.xpath("//table[@class='dataTable']//tr//th"));
		System.out.println("Total number of columns are: "+ ls.size());
		
		List<WebElement> ls1 = wd.findElements(By.xpath("//table[@class='dataTable']//a"));
		System.out.println("Total number of records in column A are :" +ls1.size());
		
		for(int i = 0;i<ls1.size();i++) {
			System.out.println(ls1.get(i).getText());
		}
		
		List<WebElement> prices = wd.findElements(By.xpath("//table[@class='dataTable']//td[4]"));
		int totsize = prices.size();
		
	}	
	
}
