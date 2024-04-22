package TestScenarios;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import E2E_Automation.E2E_Automation.Add_to_cart;
import E2E_Automation.E2E_Automation.Cart;
import E2E_Automation.E2E_Automation.LoginPage;
import E2E_Automation.E2E_Automation.PlaceOrder;
import E2E_Automation.E2E_Automation.Select_product;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Registered_Checkout {
	WebDriver driver;
	
	
	@BeforeTest
	
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
	}
	@Test(priority=0)
	public void LoginOperationO() throws InterruptedException {
		LoginPage login = new LoginPage(driver, null);
		login.loginBTN();
		login.uname("antestuser@gmail.com");
		login.passWord("123456");
		login.login();
		
	}
	@Test(priority=1)
	public void product() throws InterruptedException {
		Select_product product = new Select_product(driver, null);
		Thread.sleep(4000);
		product.clickRandomProduct();
		Thread.sleep(5000);
		
	}
	@Test(priority=2)
	public void addToCart() throws InterruptedException {
		Add_to_cart add = new Add_to_cart(driver, null);
		add.addtoCart();
	}
	@Test(priority=3)
	public void cart1() throws InterruptedException {
		Cart cart = new Cart(driver, null);
		cart.Cart_info();
	}
	@Test(priority=4)
	public void place_ORDER() throws InterruptedException {
		PlaceOrder order = new PlaceOrder(driver, null);
		order.place_ordr();

	}
	
	
	@AfterTest
	
	public void aftertest() {
		driver.close();
		driver.quit();
	}
	
	
	

}
