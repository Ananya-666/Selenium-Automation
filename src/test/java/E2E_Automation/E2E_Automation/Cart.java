package E2E_Automation.E2E_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {
	WebDriver driver;
	WebDriverWait wait;
	public Cart(WebDriver driver,WebDriverWait wait) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));	
	}
	By cart = By.xpath("//a[@id='cartur']");
	
	public void Cart_info() throws InterruptedException {
		driver.findElement(cart).click();
		Thread.sleep(3000);
	}

}
