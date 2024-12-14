package basketScenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.ElementActions;


public class MainPage {
	private WebDriver driver;
	ElementActions elementAction;

	public MainPage(WebDriver driver) {
		this.driver = driver; 
	}
	private By allowCockies =By.xpath("//button[contains(text(),'Povolit vše')] ");
	private By iphoneMobileBtn = By.xpath("(//a[@class='link-tile -has-arrow-icon'])[1]");
	private By iphoneAssertionTxt=By.xpath("//h1[text()='Apple iPhone']");
	
	//clickOnallowCockies function 

	public void  clickOnallowCockies() {
		
		elementAction = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(allowCockies));
		elementAction.clickButton(allowCockies);
		
	}
	//clickOnIphoneMobileBtn function 
public void  clickOnIphoneMobileBtn(){
		
		elementAction = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		elementAction.MoveTo(iphoneMobileBtn);// move to element function 
		wait.until(ExpectedConditions.elementToBeClickable(iphoneMobileBtn));
		elementAction.clickButton(iphoneMobileBtn);

	}

//function to used in assertion 

public String getiphoneAssertionTxt() {

	elementAction = new ElementActions(driver);
	return elementAction.getElementText(iphoneAssertionTxt);
}



	}


