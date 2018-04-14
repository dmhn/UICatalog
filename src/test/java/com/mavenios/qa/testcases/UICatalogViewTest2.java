package com.mavenios.qa.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mavenios.qa.base.TestBase;
import com.mavenios.qa.pages.UICatalog;
import com.mavenios.qa.util.TestUtil;

public class UICatalogViewTest2 extends TestBase{
	
	UICatalog uiCatalog=new UICatalog(driver); 
	
	
	//Methods
	//public UICatalogViewTest2() {
	//	super();
	//}
	
	//@BeforeMethod
	//public void setUp() {
	//	uiCatalog=new UICatalog(driver);
		
				
	//}
@Test(priority=1)
	public void UICatalogViewVerify() {
	Assert.assertTrue(uiCatalog.UICatalogView.isDisplayed(), "False");
		
}
		//driver.findElement(By.xpath("//XCUIElementTypeApplication[@name='UICatalog']"))
		
		//PageFactory.initElements(driver, this);
		//System.out.println("UI Catalog Initialize");
	
	
	@Test(priority=2)
	public void verifyUICatalogView() {
		System.out.println("UI Catalog View test");
		//return UICatalogView.isDisplayed();
		
	}
	
	
			

}


