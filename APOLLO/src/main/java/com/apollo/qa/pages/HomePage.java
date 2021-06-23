package com.apollo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apollo.qa.base.TestBase;

public class HomePage extends TestBase {
	
    //to find apollo logo in home page
	@FindBy(xpath ="//*[@id=\"main-wrapper\"]/app-root/app-header/header/nav/div[1]/a[1]/span/img[2]")
	WebElement apolloLogo;
	
	//to find  Dashboard label's element
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
	WebElement dashboardLink;
		
	//to find configuration look up's element
	@FindBy(xpath="/html/body/div/app-root/app-menu/nav/div/ul/li[2]/a")
	WebElement configurationsLabel;
	
	//to find configuration look up's element
	@FindBy(partialLinkText="SDF Settings")
	WebElement sdfSettingsClick;
		
	// Initializing the Page Objects:
	public HomePage() {
			PageFactory.initElements(driver, this);
		}	
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateApolloLogoHome(){
		return apolloLogo.isDisplayed();
	}
	
	public boolean validateDashboardLabel(){
		return dashboardLink.isDisplayed();
	}
	
	public boolean validateConfigurationsLabel(){		
		return configurationsLabel.isDisplayed();
		//configurationsLookUp.click();
	}
	
	public SkillDevelopmentLevyFundPage clickOnSDFSettings(){
		configurationsLabel.click();
		Actions action = new Actions(driver);
		action.moveToElement(sdfSettingsClick).build().perform();
		sdfSettingsClick.click();
		return new SkillDevelopmentLevyFundPage();
	}
}
