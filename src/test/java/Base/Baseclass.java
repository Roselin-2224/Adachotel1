package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	
	

	public static WebDriver driver;
	
	
	public static void url() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://adactinhotelapp.com/");
	    driver.manage().window().maximize();
	}
	
	public static void elements (WebElement dummy, String value) {
		
		dummy.sendKeys(value);
		
		
	}
public static void click (WebElement dummy) {
		
		dummy.click();
		
		
	}
}
