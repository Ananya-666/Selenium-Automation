package E2E_Automation.E2E_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.Random;

public class Select_product {
	WebDriver driver;
	WebDriverWait wait;
	public Select_product(WebDriver driver,WebDriverWait wait) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));	
	}
	By productLocator = By.xpath("//a[@class='hrefch']");
	
    public List<WebElement> getAllProducts() {
        return driver.findElements(productLocator);
    }
    public void clickRandomProduct() {
        List<WebElement> productList = getAllProducts();
        if (!productList.isEmpty()) {
            WebElement randomProduct = getRandomElement(productList);
            randomProduct.click();
        } else {
            System.out.println("No products found on the page.");
        }
    }
    private WebElement getRandomElement(List<WebElement> elements) {
        Random rand = new Random();
        return elements.get(rand.nextInt(elements.size()));
    }



}

