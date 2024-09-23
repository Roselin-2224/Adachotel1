package Execution;

import Base.Baseclass;
import locators.loginlocators;

public class Excecution extends loginlocators{

public static void getusername() {
	
	Baseclass.elements(loginlocators.username(), "mdibrahim");
	
}
public static void getpassword() {
	
	Baseclass.elements(loginlocators.password(), "Iburosy@1");
	
}
public static void loginclick() {
	
	Baseclass.click(loginlocators.login());
	
}
}
