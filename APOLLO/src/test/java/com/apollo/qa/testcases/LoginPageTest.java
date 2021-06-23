package com.apollo.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apollo.qa.base.TestBase;
import com.apollo.qa.pages.LoginPage;
import com.apollo.qa.pages.HomePage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		 loginPage = new LoginPage();
	}
	
	@Test(priority=1, enabled=true)
	public void validateLoginPageTitleTest() {
		String pageTitle = loginPage.validateLoginPageTitle();
		Assert.assertEquals(pageTitle, "Apollo","Page title not found!");
		
	}
	
	@Test(priority=2, enabled=true)
	public void validateApolloLogoTest() {
		boolean logoPresence = loginPage.validateApolloLogo();
		Assert.assertTrue(logoPresence, "Logo not found!");
		
	}
	
	@Test(priority=3, enabled=true)
	public void validateLoginPageImageTest() {
		boolean imagePresence = loginPage.validateLoginPageImage();
		Assert.assertTrue(imagePresence, "Image not found!");
		
	}
	
	@Test(priority=4, enabled=true)
	public void validateLoginHeaderTest() {
		boolean loginHeaderPresence = loginPage.validateLoginHeader();
		Assert.assertTrue(loginHeaderPresence, "Login header not found!");
		
	}
	
	@Test(priority=5, enabled=true)
	public void validateForgotPasswordLinkTest() {
		boolean forgotPasswordLinkPresence = loginPage.validateForgotPasswordLink();
		Assert.assertTrue(forgotPasswordLinkPresence, "Forgot Password Link not found!");
		
	}
	

	@Test(priority=6, enabled=true)
	public void validateTermsOfUseLinkTest() {
		boolean termsOfUseLinkPresence = loginPage.validateForgotPasswordLink();
		Assert.assertTrue(termsOfUseLinkPresence, "Terms of Use Link not found!");
		
	}
	

	@Test(priority=7, enabled=true)
	public void validatePrivacyPolicyLinkTest() {
		boolean privacyPolicyLinkPresence = loginPage.validateForgotPasswordLink();
		Assert.assertTrue(privacyPolicyLinkPresence, "Privacy policy Link not found!");
		
	}
	
	@Test(priority=8, enabled=true)
	public void loginTest() throws InterruptedException {
		homePage = loginPage.login(prop.getProperty("Username"), prop.getProperty("Password"));
		Thread.sleep(40);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
