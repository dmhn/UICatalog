package com.mavenios.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.mavenios.qa.base.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class UICatalog extends TestBase{
	
	public UICatalog (AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@iOSFindBy(xpath="//XCUIElementTypeApplication[@name='UICatalog']")
	public WebElement UICatalogView;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Action Sheets')]")
	public WebElement ActionSheetsNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Activity Indicators')]")
	public WebElement ActivityIndicatorNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Alert Views')]")
	public WebElement AlertViewsNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Buttons')]")
	public WebElement ButtonsNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Date Picker')]")
	public WebElement DatePickerNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Image View')]")
	public WebElement ImageViewNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Picker View')]")
	public WebElement PickerViewNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Progress Views')]")
	public WebElement ProgressViewsNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Segmented Controls')]")
	public WebElement SegmentedControlsNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Steppers')]")
	public WebElement SteppersNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Sliders')]")
	public WebElement SlidersNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Switches')]")
	public WebElement SwitchesNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Text Fields')]")
	public WebElement TextFieldsNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Text View')]")
	public WebElement TextViewNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Web View')]")
	public WebElement WebViewNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Search Bar')]")
	public WebElement SearchBarNav;
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[contains(@name,'Tool Bar')]")
	public WebElement ToolBarNav;
	

	

	public void UICatalogViewVerify() {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//XCUIElementTypeApplication[@name='UICatalog']")));
		String UI= driver.findElement(MobileBy.xpath("//XCUIElementTypeApplication[@name='UICatalog']")).getText();
		System.out.print(UI);
		 driver.navigate().back();
		//driver.findElement(By.xpath("//XCUIElementTypeApplication[@name='UICatalog']"))
		
		//PageFactory.initElements(driver, this);
		//System.out.println("UI Catalog Initialize");
	}
	
	
	public void verifyUICatalogView() {
		System.out.println("UI Catalog View test");
		//return UICatalogView.isDisplayed();
		
	}
	
	
			

}
