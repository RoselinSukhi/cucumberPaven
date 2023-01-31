package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver ldriver;

public LoginPage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

@FindBy (id ="Email") 
@CacheLookup
WebElement txtEmail;

@FindBy (id ="Password") 
@CacheLookup
WebElement txtPassword;

@FindBy (xpath="//button[@type='submit']") 
@CacheLookup
WebElement butLogin;

@FindBy (xpath="//a[text()='Logout']")
@CacheLookup
WebElement lnkLogout;


public void sendUserName(String uname)
{
	txtEmail.clear();
	txtEmail.sendKeys(uname);
}
public void sendPassword(String uPass)
{
	txtPassword.clear();
	txtPassword.sendKeys(uPass);
}
public void clickLoginBtton() 
{
		butLogin.click();
	
}
public void clickLogoutBtton()
{
	lnkLogout.click();
}

}