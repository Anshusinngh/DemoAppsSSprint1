package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1Page {   
	public Login1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//div[text()='Registered successfully']")
	private WebElement regSuccessful;
	
	@FindBy(id="email")
	private WebElement emailTextField;
	
	@FindBy(id="password")
	private WebElement passwordTextField;
	
	@FindBy(tagName="button")
	private WebElement loginbtn;
	
	@FindBy(xpath="//div[@text()='Registered successfully']")
	private WebElement registerSuccessful;
	
	@FindBy(xpath="//div[@text()='Signin successful']")
	private WebElement loginSuccessful;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	
	public void loginUser(String email, String password)
	{
		emailTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		loginbtn.click();
	}
	public boolean verifyRegistrationSuccessful()
	{
	return registerSuccessful.isDisplayed();
	}
	public boolean verifyLoginSuccessful()
	{
		return registerSuccessful.isDisplayed();

	}

}
