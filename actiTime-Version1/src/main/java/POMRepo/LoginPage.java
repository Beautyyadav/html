package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "username")
	private WebElement usernameTextfield;
	
	@FindBy(name = "pwd")
	private WebElement passwordTextFeild;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginButton;

	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	public WebElement getPasswordTextFeild() {
		return passwordTextFeild;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	public void loginAction(String usernmae,String password) {
		usernameTextfield.sendKeys("admin");
		passwordTextFeild.sendKeys("manager");
		loginButton.click();
	}
}