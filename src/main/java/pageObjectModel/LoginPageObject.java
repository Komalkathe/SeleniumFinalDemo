package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	public WebDriver driver;
	By username=By.cssSelector("input[id=user_email]");
	By password=By.cssSelector("input[id=user_password]");
	By Login=By.cssSelector("input[value='Log In']");
public LoginPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}

public WebElement EnterUsername() {
		return driver.findElement(username);
	}
		
	public WebElement Enterpassword() {
		return driver.findElement(password);
	}
	public WebElement clicklogin() {
		return driver.findElement(Login);
	}
	
	
	
	}
		
	
	
	