package basketScenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.ElementActions;

public class AddToBasketPage {
	private WebDriver driver;
	ElementActions elementAction;

	public AddToBasketPage(WebDriver driver) {
		this.driver = driver; 
	}
	private By addBasketBtn =By.xpath("//a[contains(text(), 'Koupit telefon')]");
	private By assertionAddBasketTxt =By.xpath(	"//h1[text()='Do košíku jste vložili novou položku']");

	//clickOnaAdBasketBtn function
	
	public void  clickOnaAdBasketBtn() {
		
		elementAction = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(addBasketBtn));
		elementAction.clickButton(addBasketBtn);
		
		
	}
	//function to used in assertion 

	public String getiassertionAddBasketTxt() {

		elementAction = new ElementActions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(assertionAddBasketTxt));

		return elementAction.getElementText(assertionAddBasketTxt);
	}


}
