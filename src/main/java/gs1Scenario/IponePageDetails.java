package basketScenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.ElementActions;

public class IponePageDetails {
	private WebDriver driver;
	ElementActions elementAction;

	public IponePageDetails(WebDriver driver) {
		this.driver = driver; 
	}
	
	private By inStockBtn =By.xpath("(//div[@class='table-cell'])[1]");
	private By inStockAssertionTxt =By.xpath("//a[contains(@class, 'add_to_cart_button')]");

	
	//clickOninStockBtn function 
	public void  clickOninStockBtn() {
		
		elementAction = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(inStockBtn));
		elementAction.clickButton(inStockBtn);
		
		
	}
	//function to used in assertion 

	public String getinStockAssertionTxt() {

		elementAction = new ElementActions(driver);
		return elementAction.getElementText(inStockAssertionTxt);
	}



}
