package E2E_Automation.E2E_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlaceOrder {
	
		WebDriver driver;
		WebDriverWait wait;
		public PlaceOrder(WebDriver driver,WebDriverWait wait) {
			this.driver=driver;
			this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		}
		
		By place_ord = By.xpath("//button[contains(text(),'Place Order')]");
		By name = By.xpath("//input[@id='name']");
		By country = By.xpath("//input[@id='country']");
		By city =	By.xpath("//input[@id='city']");
		By card= By.xpath("//input[@id='card']");
		By month= By.xpath("//input[@id='month']");
		By year= By.xpath("//input[@id='year']");
		By purchase = By.xpath("//button[contains(text(),'Purchase')]");
		By confirmation = By.xpath("//button[contains(text(),'OK')]");
		
		public void place_ordr() throws InterruptedException {
			driver.findElement(place_ord).click();
			Thread.sleep(2000);
			driver.findElement(name).clear();
			driver.findElement(name).sendKeys("test");
			Thread.sleep(2000);
			driver.findElement(country).clear();
			driver.findElement(country).sendKeys("canada");
			Thread.sleep(2000);
			driver.findElement(city).clear();
			driver.findElement(city).sendKeys("Pickering");
			Thread.sleep(2000);
			driver.findElement(card).clear();
			driver.findElement(card).sendKeys("4111111111111111");
			Thread.sleep(2000);
			driver.findElement(month).clear();
			driver.findElement(month).sendKeys("December");
			Thread.sleep(2000);
			driver.findElement(year).clear();
			driver.findElement(year).sendKeys("2031");
			Thread.sleep(2000);
			driver.findElement(purchase).click();
			Thread.sleep(2000);
			driver.findElement(confirmation).click();
			
			
		}
	

}
