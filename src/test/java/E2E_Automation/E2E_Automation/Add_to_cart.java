package E2E_Automation.E2E_Automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_to_cart {
	WebDriver driver;
	WebDriverWait wait;
	public Add_to_cart(WebDriver driver,WebDriverWait wait) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));	
	}
	By addToCart = By.xpath("//a[contains(text(),'Add to cart')]");
	
	public void addtoCart() throws InterruptedException {
		driver.findElement(addToCart).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	


}
