package basketScenarioTest;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class BasketSenarioTest extends BaseTest {
	
	//Added Assertion text as a variable because it's more easy for maintenance 
	private  String AppleIphoneAssertionText = "Apple iPhone";
	private  String inStockAssertionText ="Koupit telefon s tarifem";
	private  String AddToBasketAssertionText ="Do košíku jste vložili novou položku";


	
	@Test()
	public void validateAddToBasketSenarioTest() {
		mainPage.clickOnallowCockies();// click  to allow Cockies function
		mainPage.clickOnIphoneMobileBtn();// click on IphoneMobile function
		assertTrue(mainPage.getiphoneAssertionTxt().contains(AppleIphoneAssertionText));//assert to function click on IphoneMobile success
		iphonePageDetails.clickOninStockBtn();// click on iphonePageDetails function
		assertTrue(iphonePageDetails.getinStockAssertionTxt().contains(inStockAssertionText));//assert to function click on iphonePageDetails success
		addToBasketPage.clickOnaAdBasketBtn(); // click on addToBasket function
		assertTrue(addToBasketPage.getiassertionAddBasketTxt().contains(AddToBasketAssertionText));//assert to function addToBasket success		
	}
	
	}
	
		
	

	

