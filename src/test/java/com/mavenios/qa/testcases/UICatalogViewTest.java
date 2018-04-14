package com.mavenios.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.mavenios.qa.base.TestBase;

import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class UICatalogViewTest extends TestBase{
	/*
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='UICatalog']")
	WebElement UICatalogView;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Action Sheets')]")
	WebElement ActionSheetsNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Activity Indicators')]")
	WebElement ActivityIndicatorNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Alert Views')]")
	WebElement AlertViewsNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Buttons')]")
	WebElement ButtonsNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Date Picker')]")
	WebElement DatePickerNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Image View')]")
	WebElement ImageViewNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Picker View')]")
	WebElement PickerViewNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Progress Views')]")
	WebElement ProgressViewsNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Segmented Controls')]")
	WebElement SegmentedControlsNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Steppers')]")
	WebElement SteppersNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Sliders')]")
	WebElement SlidersNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Switches')]")
	WebElement SwitchesNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Text Fields')]")
	WebElement TextFieldsNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Text View')]")
	WebElement TextViewNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Web View')]")
	WebElement WebViewNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Search Bar')]")
	WebElement SearchBarNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Tool Bar')]")
	WebElement ToolBarNav;
	
	*/
	//Methods
	public UICatalogViewTest() {
		super();
	}
@Test(priority=1)
	public void UICatalogViewVerify() {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//XCUIElementTypeApplication[@name='UICatalog']")));
		String UI= driver.findElement(MobileBy.xpath("//XCUIElementTypeApplication[@name='UICatalog']")).getText();
		System.out.print(UI);
		 driver.navigate().back();
		//driver.findElement(By.xpath("//XCUIElementTypeApplication[@name='UICatalog']"))
		
		//PageFactory.initElements(driver, this);
		//System.out.println("UI Catalog Initialize");
	}
	
	@Test(priority=2)
	public void verifyUICatalogView() {
		System.out.println("UI Catalog View test");
		//return UICatalogView.isDisplayed();
		
	}
	
	
			

}


