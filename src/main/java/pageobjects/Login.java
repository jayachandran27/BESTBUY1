package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[@data-lid='hdr_signin']")
	WebElement acnt;
	@FindBy(xpath = "//a[text()='Sign In']")
	WebElement login;
	@FindBy(xpath = "//input[@type='email']")
	WebElement useremail;
	@FindBy(xpath = "//input[@type='password']")
	WebElement passwrd;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitbtn;
	
	public void account() {
		acnt.click();
	}

	public void login() {
		login.click();
	}

	public void email(String email) {
		useremail.sendKeys(email);

	}

	

	public void passwrd(String password) {
		passwrd.sendKeys(password);
	}

	public void submitbtn() {
		submitbtn.click();

	}

}
