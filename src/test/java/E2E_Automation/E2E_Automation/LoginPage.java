package E2E_Automation.E2E_Automation;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	WebDriver driver;
	WebDriverWait wait;

	public LoginPage(WebDriver driver,WebDriverWait wait) {
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	
	By loginbtn = By.xpath("//a[@id='login2']");
	By Username = By.xpath("//input[@id='loginusername']");
	By Password = By.xpath("//input[@id='loginpassword']");
	By loginbtn2 = By.xpath("//button[contains(text(),'Log in')]");
	By logintxt = By.xpath("//a[contains(text(),'About us')]");
	
	public void loginBTN()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginbtn));
		driver.findElement(loginbtn).click();;
	}
	
	
	public void uname(String unameInput) throws InterruptedException
	{
		driver.findElement(Username).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Username));
		Thread.sleep(2000);
		driver.findElement(Username).sendKeys(unameInput);
	}
	public void passWord(String passInput) throws InterruptedException

	{
		driver.findElement(Password).clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Password));
		Thread.sleep(2000);
		driver.findElement(Password).sendKeys(passInput);
	}
	public void login() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginbtn2));
		driver.findElement(loginbtn2).click();
	}

	
}
