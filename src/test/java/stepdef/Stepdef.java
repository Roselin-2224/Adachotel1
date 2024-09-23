package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.Baseclass;
import Execution.Excecution;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import locators.loginlocators;

public class Stepdef extends loginlocators {

@Given("User enters the username")
public void userEntersTheUsername() {
   
Execution.Excecution.getusername();
}
@Given("user enters the password")
public void userEntersThePassword() {
    
 Excecution.getpassword();
}
@When("user clicked the login")
public void userClickedTheLogin() {
	
    Excecution.loginclick();
}
@Then("user logged website successfully")
public void userLoggedWebsiteSuccessfully() {
    System.out.println("success");
    
}
}
