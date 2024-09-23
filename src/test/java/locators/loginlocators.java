package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.Baseclass;

public class loginlocators extends Baseclass {

	
	public static WebElement username() {
		return driver.findElement(By.xpath("//input[@id='username']"));
		}
	
	public static WebElement password() {
		return driver.findElement(By.xpath("//input[@id='password']"));
		}
	
	public static WebElement login() {
		return driver.findElement(By.xpath("//input[@id='login']"));
		
}
}
