package com.apollo.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apollo.qa.base.TestBase;
//import com.apollo.qa.pages.HomePage;

public class LoginPage extends TestBase {

	//Page Factory  or Object Repository
		//to find username element
		@FindBy(id="email")
		WebElement userName;
		
		//to find password element
		@FindBy(id="password")
		WebElement passWord;
		
		//to find login button element
		@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-login/main/div/div/div/div[2]/div/form/button")
		WebElement loginButton;
		
		//to find apollo logo element
		@FindBy(className="logo")
		WebElement logo;
		
		//to find login page image's element
		@FindBy(className="login-card-img")
		WebElement loginImage;
				
		//to find login label header element
		@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-login/main/div/div/div/div[2]/div/p[1]")
		WebElement loginHeader;		
		
		//to find forgot password's element
		@FindBy(className="forgot-password-link")
		WebElement forgotPassword;
		
		//to find Terms of use's element
		@FindBy(partialLinkText="Terms of use.")
		WebElement termsOfUse;
			
		//to find Privacy policy's element
		@FindBy(partialLinkText="Privacy policy")
		WebElement privacyPolicy;
			
		//Initializing the page objects
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		
		//Actions or methods
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}
		
		public boolean validateApolloLogo() {
			return logo.isDisplayed();
		}
		
		public boolean validateLoginPageImage() {
			return loginImage.isDisplayed();
		}
		
		public boolean validateLoginHeader() {
			return loginHeader.isDisplayed();
		}
		
		public boolean validateForgotPasswordLink() {
			return forgotPassword.isDisplayed();
		}
		
		public boolean validateTermsOfUseLink() {
			return termsOfUse.isDisplayed();
		}
		
		public boolean validatePrivacyPolicyLink() {
			return privacyPolicy.isDisplayed();
		}

		public HomePage login(String username, String password) {
		userName.sendKeys(username);
		passWord.sendKeys(password);
		loginButton.click();
			
		return new HomePage();
		}
}
