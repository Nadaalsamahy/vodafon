package util;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class ElementActions {
	private WebDriver driver;
	private WaitElements waitElements;

	public ElementActions(WebDriver driver) {
		this.driver = driver;
	}

	//Add general click function  to use it in all classes 
	public void clickButton(By element) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
	    waitElements.waitPresenceOfAllElementsLocatedBy(element);

		waitElements.waitClickabilityOfElement(element);
		driver.findElement(element).click();
		
	}
	//Add general move to element function  to use it in all classes 

	public void MoveTo(By element) {
		
		WebElement webelement =  driver.findElement(element);
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].scrollIntoView()", webelement); 
	}
	

	//Add general Assertion function  to use it in all classes 

	public String getElementText(By element) {
		waitElements = new WaitElements(driver);
		waitElements.waitVisibilityOfElement(element);
		return driver.findElement(element).getText();
	}

	}
