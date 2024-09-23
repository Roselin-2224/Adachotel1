package hook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.Baseclass;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HookClass {
	
	@Given("User enters URL to access the webpage")
	public void userEntersURLToAccessTheWebpage() {
		Baseclass.url();
	    
	    
	}

}
