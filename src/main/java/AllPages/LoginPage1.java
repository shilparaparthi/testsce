package AllPages;

import org.openqa.selenium.By;

import BaseP1.BaseC1;



public class LoginPage1 extends BaseC1
{
	public static By EmailInputBox= By.id("email");
	public static By PassswordInputBox= By.name("pass");
	public static By LoginButton=By.name("login");
	public static By countryDropdown=By.xpath("xpath");
	//static generiCC GenObj= new generiCC();
	public static By Errormessage= By.xpath("//div[text()='Is this your account?']");
	
	public static void Enter_Emaild(String EmailID)
	{
		driver.findElement(EmailInputBox).sendKeys(EmailID);
		
	}
	public static void Enter_password(String passwordID)
	{
		driver.findElement(PassswordInputBox).sendKeys(passwordID);
		
	}
	public static void Login()
	{		
		driver.findElement(LoginButton).click();
		
	}

}
