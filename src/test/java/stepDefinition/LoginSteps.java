package stepDefinition;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.listener.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

//@SuppressWarnings("deprecation")
public class LoginSteps {
	
	public WebDriver driver;
	public LoginPage lp;
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\cbdd\\Driver\\chromedriver.exe");
		   driver=new ChromeDriver();
			lp=new LoginPage(driver);
	}

	@When("user opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("user sends emailid as {string} and password as {string}")
	public void user_sends_emailid_as_and_password_as(String email, String password) {
	   lp.sendUserName(email);
	   lp.sendPassword(password);
	}

	@SuppressWarnings("deprecation")
	@When("click on login")
	public void click_on_login() {
	    lp.clickLoginBtton();
	   // click_on_login();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	

	@When("user clicks on logout link")
	public void user_clicks_on_logout_link() throws InterruptedException {
		 lp.clickLogoutBtton();
		 Thread.sleep(3000);
	}


	@Then("Close Browser")
	public void close_browser() {
		 driver.close();
	}
	
}
