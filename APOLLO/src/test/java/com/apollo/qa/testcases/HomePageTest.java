package com.apollo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apollo.qa.base.TestBase;
import com.apollo.qa.pages.HomePage;
import com.apollo.qa.pages.LoginPage;
import com.apollo.qa.pages.SkillDevelopmentLevyFundPage;


public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	SkillDevelopmentLevyFundPage skillDevelopmentLevyFundPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		skillDevelopmentLevyFundPage = new SkillDevelopmentLevyFundPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("Username"), prop.getProperty("Password"));
	}
	
	@Test(priority=1, enabled=true)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Apollo","Home page title not matched");
	}
	
	@Test(priority=2, enabled=true)
	public void validateApolloLogoHomeTest(){		
		Assert.assertTrue(homePage.validateApolloLogoHome(),"Apollo logo not found in home page!");
	}
	
	@Test(priority=3, enabled=true)
	public void validateDashboardLabelTest(){		
		Assert.assertTrue(homePage.validateDashboardLabel(),"Dashboard label not found in home page!");
	}
	
	@Test(priority=4, enabled=true)
	public void validateConfigurationsLabelTest(){		
		Assert.assertTrue(homePage.validateConfigurationsLabel(),"Configurations label not found in home page!");
	}
	
	@Test(priority=5, enabled=true)
	public void clickOnSDFSettingsTest(){		
		skillDevelopmentLevyFundPage = homePage.clickOnSDFSettings();
	}
	
	//@AfterMethod
	//public void tearDown(){
	//	driver.quit();
	//}
	
}
