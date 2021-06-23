package com.apollo.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.apollo.qa.pages.SkillDevelopmentLevyFundPage;
import com.apollo.qa.base.TestBase;
import com.apollo.qa.pages.HomePage;
import com.apollo.qa.pages.LoginPage;
import com.apollo.qa.utils.*;
import com.apollo.qa.utils.TestUtil;

public class SkillDevelopmentLevyFundPageTest extends TestBase {
   
	SkillDevelopmentLevyFundPage skillDevelopmentLevyFundPage;
	LoginPage loginPage;
	HomePage homePage;
	String expectedMessage="";
	String sheetName = "Add_SDF_Settings";
	String sheetName1 = "Unique_Validations";
	String sheetName2 = "Delete";
	String sheetName3 = "Edit";
	String sheetName4 = "Edit_Unique_Validations";
	
	public SkillDevelopmentLevyFundPageTest(){
		super();		
    }
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();		
		skillDevelopmentLevyFundPage = new SkillDevelopmentLevyFundPage();
		loginPage = new LoginPage();
		homePage = new HomePage();
		homePage = loginPage.login(prop.getProperty("Username"), prop.getProperty("Password"));		
		skillDevelopmentLevyFundPage = homePage.clickOnSDFSettings();
	}
	
	@Test(priority=1, enabled=true)
	public void verifySkillDevelopmentLevyFundLabelTest(){
		boolean skillDevelopmentLevyFundTitle = skillDevelopmentLevyFundPage.verifySkillDevelopmentLevyFundLabel();
		Assert.assertTrue(skillDevelopmentLevyFundTitle,"SDLF title not found");
	}
	
	@Test(priority=2, enabled=true)
	public void verifyhomeLabelTest(){
		boolean homeLabel = skillDevelopmentLevyFundPage.verifyHomeLabel();
		Assert.assertTrue(homeLabel,"Home Label not found");
	}
	
	@Test(priority=3, enabled=true)
	public void verifyConfigurationLabelTest(){
		boolean ConfigurationLabelPresence = skillDevelopmentLevyFundPage.verifySkillDevelopmentLevyFundLabel();
		Assert.assertTrue(ConfigurationLabelPresence,"Configuration label not found");
	}
	
	@Test(priority=4, enabled=true)
	public void verifyGridContainerTest(){
		boolean gridContainerPresence = skillDevelopmentLevyFundPage.verifyGridContainer();
		Assert.assertTrue(gridContainerPresence,"Grid Container not found");
	}
	
	@Test(priority=5, enabled=true)
	public void verifySDLFFormulaLabelTest(){
		boolean SDLFFormulaLabelPresence = skillDevelopmentLevyFundPage.verifySDLFFormulaLabel();
		Assert.assertTrue(SDLFFormulaLabelPresence,"SDLF Formula label not found");
	}
	
	@Test(priority=6, enabled=true)
	public void verifyDescriptionLabelTest(){
		boolean DescriptionLabelPresence = skillDevelopmentLevyFundPage.verifyDescriptionLabel();
		Assert.assertTrue(DescriptionLabelPresence,"Description label not found");
	}
	
	@Test(priority=7, enabled=true)
	public void verifySDLFOptionLabelTest(){
		boolean SDLFOptionLabelPresence = skillDevelopmentLevyFundPage.verifySDLFOptionLabel();
		Assert.assertTrue(SDLFOptionLabelPresence,"SDLF Option label not found");
	}
	
	@Test(priority=8, enabled=true)
	public void verifyWageLabelTest(){
		boolean WageLabelPresence = skillDevelopmentLevyFundPage.verifyWageLabel();
		Assert.assertTrue(WageLabelPresence,"Wage label not found");
	}
	
	@Test(priority=9, enabled=true)
	public void verifyContributionPercentageLabelTest(){
		boolean ContributionPercentageLabelLabelPresence = skillDevelopmentLevyFundPage.verifyContributionPercentageLabel();
		Assert.assertTrue(ContributionPercentageLabelLabelPresence,"Contribution Percentage label not found");
	}
	
	@Test(priority=10, enabled=true)
	public void verifyMinimumContributionAmountLabelTest(){
		boolean MinimumContributionAmountLabelPresence = skillDevelopmentLevyFundPage.verifyMinimumContributionAmountLabel();
		Assert.assertTrue(MinimumContributionAmountLabelPresence,"Minimum Contribution Amount label not found");
	}
	
	@Test(priority=11, enabled=true)
	public void verifyEffectiveDateLabelTest(){
		boolean EffectiveDateLabelPresence = skillDevelopmentLevyFundPage.verifyEffectiveDateLabel();
		Assert.assertTrue(EffectiveDateLabelPresence,"Effective Date label not found");
	}
	
	@Test(priority=12, enabled=true)
	public void verifyActionsLabelTest(){
		boolean ActionsLabelPresence = skillDevelopmentLevyFundPage.verifyActionsLabel();
		Assert.assertTrue(ActionsLabelPresence,"Actions label not found");
	}
	
	@Test(priority=13, enabled=true)
	public void verifyPaginationLabelTest(){
		boolean PaginationLabelPresence = skillDevelopmentLevyFundPage.verifyPaginationLabel();
		Assert.assertTrue(PaginationLabelPresence,"Pagination not found");
	}
	
	@Test(priority=14, enabled=true)
	public void verifyAddClickLabelPresenceTest(){
		boolean addClickLabelPresence = skillDevelopmentLevyFundPage.verifyAddClickLabelPresence();
		Assert.assertTrue(addClickLabelPresence,"Add button not found");
	}
	
	@Test(priority=15, enabled=true)
	public void verifyAddClickTest() throws InterruptedException{
	    skillDevelopmentLevyFundPage.verifyAddClick();
		
	}
	
	@Test(priority=16, enabled=true)
	public void verifyAddSDLFHeaderLabelTest() throws InterruptedException{
		skillDevelopmentLevyFundPage.verifyAddClick();
		boolean addSDLFHeaderLabelPresence = skillDevelopmentLevyFundPage.verifyAddSDLFHeaderLabel();
		Assert.assertTrue(addSDLFHeaderLabelPresence,"Add SDLF Header label not found");
	}
	
	@Test(priority=17, enabled=true)
	public void verifyRemoveIconLabelTest() throws InterruptedException{
		skillDevelopmentLevyFundPage.verifyAddClick();
		boolean removeIconLabelPresence = skillDevelopmentLevyFundPage.verifyRemoveIconLabel();
		Assert.assertTrue(removeIconLabelPresence,"Remove icon not found");
	}
	
	@Test(priority=18, enabled=true)
	public void verifyRemoveIconClickTest() throws InterruptedException{
		skillDevelopmentLevyFundPage.verifyAddClick();
		skillDevelopmentLevyFundPage.verifyRemoveIconClick();		
	}
	
	@Test(priority=19, enabled=true)
	public void verifyAddSDLFFormulaLabelTest() throws InterruptedException{
		skillDevelopmentLevyFundPage.verifyAddClick();
		skillDevelopmentLevyFundPage.verifyAddSDLFFormulaLabel();		
	}
	
	@Test(priority=20, enabled=true)
	public void verifyAddSDLFOptionLabelTest() throws InterruptedException{
		skillDevelopmentLevyFundPage.verifyAddClick();
		skillDevelopmentLevyFundPage.verifyAddSDLFOptionLabel();		
	}
	
	@Test(priority=21, enabled=true)
	public void verifyMaximumWageLabelTest() throws InterruptedException{
		skillDevelopmentLevyFundPage.verifyAddClick();
		skillDevelopmentLevyFundPage.verifyMaximumWageLabel();		
	}
	
	@Test(priority=22, enabled=true)
	public void verifyAddContributionPercentageLabelTest() throws InterruptedException{
		skillDevelopmentLevyFundPage.verifyAddClick();
		skillDevelopmentLevyFundPage.verifyAddContributionPercentageLabel();		
	}
	
	@Test(priority=23, enabled=true)
	public void verifyMinimumContributionAmountFieldLabelTest() throws InterruptedException{
		skillDevelopmentLevyFundPage.verifyAddClick();
		skillDevelopmentLevyFundPage.verifyMinimumContributionAmountFieldLabel();		
	}
	
	@Test(priority=24, enabled=true)
	public void verifyEffectiveDateFieldLabelTest() throws InterruptedException{
		skillDevelopmentLevyFundPage.verifyAddClick();
		skillDevelopmentLevyFundPage.verifyEffectiveDateFieldLabel();		
	}
	
	@Test(priority=25, enabled=true)
	public void verifyDescriptionFieldLabelTest() throws InterruptedException{
		skillDevelopmentLevyFundPage.verifyAddClick();
		skillDevelopmentLevyFundPage.verifyDescriptionFieldLabel();		
	}
	
	//to verify the sumit button is visibe
	@Test(priority=26, enabled=true)
	public void verifySubmitButtonPresenceTest() throws InterruptedException{
		skillDevelopmentLevyFundPage.verifyAddClick();
		skillDevelopmentLevyFundPage.verifySubmitButtonPresence();		
	}
	
	//to verify the close button is visibe
	@Test(priority=27, enabled=true)
	public void verifyCloseButtonPresenceTest() throws InterruptedException{
		skillDevelopmentLevyFundPage.verifyAddClick();
		skillDevelopmentLevyFundPage.verifyCloseButtonPresence();		
	}
	
	//to close the add modal window
	@Test(priority=28, enabled=true)
	public void verifyCloseButtonClickTest() throws InterruptedException{
		skillDevelopmentLevyFundPage.verifyAddClick();
		skillDevelopmentLevyFundPage.verifyCloseButtonClick();		
	}
	
	
	
	@DataProvider
	public Object[][] getApolloTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	//to add SDLF settings
	@Test(priority=29, enabled=true, dataProvider="getApolloTestData")
	public void verifyAddSDLFFormulaTextBoxTest(String SDLFFormula,String SDLFOption,String Wage,String ContributionPercentage,String MinimumContributionAmount,String EffectiveDate,String Description) throws InterruptedException{
		String functionSDLF = "add";
		addSDLFSettings(functionSDLF,SDLFFormula,SDLFOption,Wage,ContributionPercentage,MinimumContributionAmount,EffectiveDate,Description);
		TimeUnit.SECONDS.sleep(2);
		//boolean saveFeedBackMessageAlert = skillDevelopmentLevyFundPage.verifySaveFeedbackMessage();
		
		//Assert.assertEquals(saveFeedBackMessageAlert, "true","Skill Development Fund Settings not Saved!");
		String expectedMessage = "Skill Development Fund Settings Saved Successfully";
		String saveTestVerify = skillDevelopmentLevyFundPage.verifySaveFeedbackMessage();
		System.out.println(saveTestVerify);
		 Assert.assertTrue(saveTestVerify.contains(expectedMessage),"Error occured!");
	}
	
	public void addSDLFSettings(String functionSDLF,String SDLFFormula,String SDLFOption,String Wage,String ContributionPercentage,String MinimumContributionAmount,String EffectiveDate,String Description) throws InterruptedException{
		
		if(functionSDLF.equals("add")) {
		skillDevelopmentLevyFundPage.verifyAddClick();
		}
		skillDevelopmentLevyFundPage.verifyAddSDLFFormulaTextBox(SDLFFormula);
		skillDevelopmentLevyFundPage.verifyAddSDLFDropDown();
		//String DropDown = SDLFOption;
		if(SDLFOption.equals("Maximum Wages")) {
			skillDevelopmentLevyFundPage.verifyAddSDLFDropDownMaximumWages();
			skillDevelopmentLevyFundPage.verifyMaximumWagesTextBox(Wage);
		}
		else if(SDLFOption.equals("UpTo Wages")){
			skillDevelopmentLevyFundPage.verifyAddSDLFDropDownUpToWages();
			skillDevelopmentLevyFundPage.verifyUptoWagesTextBox(Wage);
		}
		else {
			System.out.println("Please enter valid look up");
		}
		
		skillDevelopmentLevyFundPage.verifyAddContributionPercentageTextBox(ContributionPercentage);
		skillDevelopmentLevyFundPage.verifyMinimumContributionAmountFieldTextBox(MinimumContributionAmount);
		skillDevelopmentLevyFundPage.verifyEffectiveDateFieldTextBox(EffectiveDate);
		skillDevelopmentLevyFundPage.verifyDescriptionFieldTextBox(Description);
		skillDevelopmentLevyFundPage.verifySubmitButtonClick();
		TimeUnit.SECONDS.sleep(2);
	
		
	}
	
	@DataProvider
	public Object[][] getApolloTestDataForUniqueValidations(){
		Object data[][] = TestUtil.getTestData(sheetName1);
		return data;
	}
	
	//to validate unique validations in add SDLF settings
		@Test(priority=30, enabled=true, dataProvider="getApolloTestDataForUniqueValidations")
		public void verifyUniqueValidationsInAddSDLFSettings(String SDLFFormula,String SDLFOption,String Wage,String ContributionPercentage,String MinimumContributionAmount,String EffectiveDate,String Description,String uniqueValidation) throws InterruptedException{
			String functionSDLF = "add";
			addSDLFSettings(functionSDLF,SDLFFormula,SDLFOption,Wage,ContributionPercentage,MinimumContributionAmount,EffectiveDate,Description);
			TimeUnit.SECONDS.sleep(2);
			//boolean saveFeedBackMessageAlert = skillDevelopmentLevyFundPage.verifySaveFeedbackMessage();
			
			//Assert.assertEquals(saveFeedBackMessageAlert, "true","Skill Development Fund Settings not Saved!");
			verifyUniqueValidations(uniqueValidation);			
			
		}
		
		public String verifyUniqueValidations(String uniqueValidation) throws InterruptedException{
			
			if(uniqueValidation.equals("SDLF formula Unique Validation")) {
				
				expectedMessage = "SDLF Formula already exists for another Skill Development Levy Fund Setting";
				}
				else if(uniqueValidation.equals("Effective date Unique Validation")) {
					expectedMessage = "Effective Date already exists for another Skill Development Levy Fund Setting";
					}
				else if(uniqueValidation.equals("SDLF formula and Effective Unique Validation")) {
					expectedMessage = "SDLF Formula and Effective Date already exists for another Skill Development Levy Fund Setting";
					}
				else {
					System.out.println("Invalid unique validation");
					}
			String saveTestVerify = skillDevelopmentLevyFundPage.verifySaveFeedbackMessage();
			System.out.println(saveTestVerify);
			Assert.assertTrue(saveTestVerify.contains(expectedMessage),"Error occured!");
			
			return expectedMessage;
		}
		
		@DataProvider
		public Object[][] getApolloTestDataForDelete(){
			Object data[][] = TestUtil.getTestData(sheetName2);
			return data;
		}
		 
		@Test(priority=31, enabled=true, dataProvider="getApolloTestDataForDelete")
		public void verifySearchSDLFFormulaClickTest(String sDLFFormula) throws InterruptedException{
			skillDevelopmentLevyFundPage.verifySearchSDLFFormulaClick(sDLFFormula);	
			skillDevelopmentLevyFundPage.verifyDeleteClick();
			String expectedMessage1 = "Skill Development Fund Setting deleted successfully";
			String saveTestVerify1 = skillDevelopmentLevyFundPage.verifySaveFeedbackMessage();
			System.out.println(saveTestVerify1);
			 Assert.assertTrue(saveTestVerify1.contains(expectedMessage1),"Error occured!");
		}
			
		@DataProvider
		public Object[][] getApolloTestDataForEdit(){
			Object data[][] = TestUtil.getTestData(sheetName3);
			return data;
		}
		
		@Test(priority=32, enabled=true, dataProvider="getApolloTestDataForEdit")
		public void verifyEditClickTest(String sDLFFormula,String SDLFFormula,String SDLFOption,String Wage,String ContributionPercentage,String MinimumContributionAmount,String EffectiveDate,String Description) throws InterruptedException{
			skillDevelopmentLevyFundPage.verifySearchSDLFFormulaClick(sDLFFormula);	
			skillDevelopmentLevyFundPage.verifyEditClick();
			String functionSDLF = "edit";
			addSDLFSettings(functionSDLF,SDLFFormula,SDLFOption,Wage,ContributionPercentage,MinimumContributionAmount,EffectiveDate,Description);
			String expectedMessage1 = "Skill Development Fund Settings Updated Successfully";
			String saveTestVerify1 = skillDevelopmentLevyFundPage.verifySaveFeedbackMessage();
			System.out.println(saveTestVerify1);
			 Assert.assertTrue(saveTestVerify1.contains(expectedMessage1),"Error occured!");
		}
		
		@DataProvider
		public Object[][] getApolloTestDataForEditUniqueValidations(){
			Object data[][] = TestUtil.getTestData(sheetName4);
			return data;
		}
		
		
		@Test(priority=33, enabled=true, dataProvider="getApolloTestDataForEditUniqueValidations")
		public void verifyEditUniqueValidationsTest(String sDLFFormula,String SDLFFormula,String SDLFOption,String Wage,String ContributionPercentage,String MinimumContributionAmount,String EffectiveDate,String Description,String uniqueValidation) throws InterruptedException{
			//verifyEditClickTest(sDLFFormula,SDLFFormula,SDLFOption,Wage,ContributionPercentage,MinimumContributionAmount,EffectiveDate,Description);
			skillDevelopmentLevyFundPage.verifySearchSDLFFormulaClick(sDLFFormula);	
			skillDevelopmentLevyFundPage.verifyEditClick();
			String functionSDLF = "edit";
			addSDLFSettings(functionSDLF,SDLFFormula,SDLFOption,Wage,ContributionPercentage,MinimumContributionAmount,EffectiveDate,Description);
			
			verifyUniqueValidations(uniqueValidation);			
		}
		
		
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
