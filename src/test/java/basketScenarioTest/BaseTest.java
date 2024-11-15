package basketScenarioTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import basketScenario.AddToBasketPage;
import basketScenario.IponePageDetails;
import basketScenario.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public static ChromeOptions option;
	protected MainPage mainPage;
	protected IponePageDetails iphonePageDetails;
	protected AddToBasketPage addToBasketPage;
	
	

	@BeforeSuite
	public void startDriver()  {
		
		
		
		ChromeOptions co =new ChromeOptions();	
		WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
		driver.get("https://www.vodafone.cz/");
		driver.manage().window().maximize();
		mainPage = new MainPage(driver);
		iphonePageDetails = new IponePageDetails(driver);
		addToBasketPage = new AddToBasketPage(driver);
	}
	
	        @AfterSuite
	public void stopDriver() {
	        	driver.quit();

	}


	}

