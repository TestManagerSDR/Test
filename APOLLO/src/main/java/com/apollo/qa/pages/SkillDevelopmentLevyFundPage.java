package com.apollo.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apollo.qa.base.TestBase;

public class SkillDevelopmentLevyFundPage extends TestBase{

	//to find skill development levy fund label
	@FindBy(xpath = "//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav-content/div[1]/div/div[1]/h4")
	WebElement skillDevelopmentLevyFundLabel;
	
	//to find home label
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav-content/div[1]/div/div[1]/div/nav/ol/li[1]/a")
	WebElement homeLabel;
	
	//to find configuration label
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav-content/div[1]/div/div[1]/div/nav/ol/li[2]")
	WebElement configurationLabel;
	
	//to find grid container
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav-content/div[3]/div/div/div")
	WebElement gridContainer;

	//to find SDLF Formula label
	@FindBy(xpath="//*[@id=\"code\"]/div/span/div/div[1]")
	WebElement SDLFFormulaLabel;
	
	//to find description label
	@FindBy(xpath="//*[@id=\"description\"]/div/span/div/div[1]")
	WebElement descriptionLabel;
	
	//to find SDLF option label
	@FindBy(xpath="//*[@id=\"optionDescription\"]/div/span/div/div[1]")
	WebElement SDLFOptionLabel;
	
	//to find wages label
	@FindBy(xpath="//*[@id=\"wage\"]/div/span/div/div[1]")
	WebElement wageLabel;
	
	//to find contribution percentage label
	@FindBy(xpath="//*[@id=\"contributionPercentage\"]/div/span/div/div[1]")
	WebElement contributionPercentageLabel;
	
	//to find minimum contribution amount label
	@FindBy(xpath="//*[@id=\"minimumContribution\"]/div/span/div/div[1]")
	WebElement minimumContributionAmountLabel;
	
	//to find effective date label
	@FindBy(xpath="//*[@id=\"effectiveDate\"]/div/span/div/div[1]")
	WebElement effectiveDateLabel;
	
	//to find actions label
	@FindBy(xpath="//*[@id=\"Actions\"]/div/span")
	WebElement  actionsLabel;
	
	//to find pagination label
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav-content/div[3]/div/div/div/div/div/div/mat-paginator/div/div")
	WebElement paginationLabel;

	//to find add click
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav-content/div[1]/div/div[2]/div/a")
	WebElement addClick;
	
	//to find add SDLF label
	@FindBy(xpath="//*[@id=\"myModalLabel9\"]")
	WebElement addSDLFHeaderLabel;
		
	//to find remove icon label
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[1]/button/span")
	WebElement removeIcon;

	//to find add sdlf formula field label
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[2]/div/app-addeditsdfsettings/form/fieldset/div/div[1]/span")
	WebElement addSDLFFormulaLabel;
	
	//to find sdlf formula text box 
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[2]/div/app-addeditsdfsettings/form/fieldset/div/div[1]/input")
	WebElement addSDLFFormulaTextBox;
	
	//to find add sdlf option label
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[2]/div/app-addeditsdfsettings/form/fieldset/div/div[2]/span")
	WebElement addSDLFOptionLabel;
		
	//to find sdlf option drop down
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[2]/div/app-addeditsdfsettings/form/fieldset/div/div[2]/select")
	WebElement addSDLFDropDown;	
	
	//to find maximum wages label
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[2]/div/app-addeditsdfsettings/form/fieldset/div/div[3]/span")
	WebElement maximumWageLabel;
	
	//to find maximum wages TextBox
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[2]/div/app-addeditsdfsettings/form/fieldset/div/div[3]/input")
	WebElement maximumWagesTextBox;
	
	//to find upto wages label
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[2]/div/app-addeditsdfsettings/form/fieldset/div/div[3]/span")
	WebElement upToWagesLabel;
	
	//to find Upto Wages TextBox
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[2]/div/app-addeditsdfsettings/form/fieldset/div/div[3]/input")
	WebElement uptoWagesTextBox;
		
	//to find Contribution Percentage (%) label
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[2]/div/app-addeditsdfsettings/form/fieldset/div/div[4]/span")
	WebElement addContributionPercentageLabel;
	
	//to find Contribution Percentage (%) text box
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[2]/div/app-addeditsdfsettings/form/fieldset/div/div[4]/input")
	WebElement addContributionPercentageTextBox;
	
	//to find Minimum Contribution amount label
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[2]/div/app-addeditsdfsettings/form/fieldset/div/div[5]/span")
	WebElement minimumContributionAmountFieldLabel;
		
	//to find Minimum Contribution amount text box
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[2]/div/app-addeditsdfsettings/form/fieldset/div/div[5]/input")
	WebElement minimumContributionAmountFieldTextBox;	
	
	//to find effective date label
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[2]/div/app-addeditsdfsettings/form/fieldset/div/div[6]/span")
	WebElement effectiveDateFieldLabel;
			
	//to find effective date text box
	@FindBy(xpath="//*[@id=\"mat-input-0\"]")
	WebElement effectiveDateFieldTextBox;	
		
	//to find description label
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[2]/div/app-addeditsdfsettings/form/fieldset/div/div[7]/span")
	WebElement descriptionFieldLabel;
				
	//to find description text box
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[2]/div/app-addeditsdfsettings/form/fieldset/div/div[7]/input")
	WebElement descriptionFieldTextBox;		
	
	//to find submit button
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[2]/div/app-addeditsdfsettings/form/fieldset/div/div[8]/input[1]")
	WebElement submitButtonClick;
					
	//to find close button
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[2]/div/app-addeditsdfsettings/form/fieldset/div/div[8]/input[2]")
	WebElement closeButtonClick;		
		
	//to find maximum wages look up
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[2]/div/app-addeditsdfsettings/form/fieldset/div/div[2]/select/option[1]")
	WebElement maximumWagesLookUp;
	
	//to find up to wages lookup
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav/div/div[2]/div/app-addeditsdfsettings/form/fieldset/div/div[2]/select/option[2]")
	WebElement UpToWagesLookUp;
	
	//to find saved successfully feedback message
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav-content/div[2]/app-messagepanel/div/div")
	WebElement saveFeedbackMessage;
	
	
	//to find saved successfully feedback message
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav-content/div[3]/div/div/div/div/div/table/thead/tr[2]/th[1]/div/input")
	WebElement searchSDLFFormula;
	
	//to find delete button
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav-content/div[3]/div/div/div/div/div/table/tbody/tr/td[8]/button[2]")
	WebElement deleteClick;
	
	
	//to find delete -OK button
	@FindBy(xpath="//html/body/ngb-modal-window/div/div/app-confirmation-modal-popup/div/div/div[3]/button[1]")
	WebElement okClick;
	

	//to find edit button
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/app-root/app-sdfsettings/mat-sidenav-container/mat-sidenav-content/div[3]/div/div/div/div/div/table/tbody/tr/td[8]/button[1]")
	WebElement editClick;
	
		
	// Initializing the Page Objects:
	public SkillDevelopmentLevyFundPage() {
			PageFactory.initElements(driver, this);
	}
	
	public boolean verifySkillDevelopmentLevyFundLabel(){
		return skillDevelopmentLevyFundLabel.isDisplayed();
	}
		
	public boolean verifyHomeLabel(){
		return homeLabel.isDisplayed();
	}
	
	public boolean verifyConfigurationLabel(){
		return configurationLabel.isDisplayed();
	}
	
	public boolean verifyGridContainer(){
		return gridContainer.isDisplayed();
	}
	
	public boolean verifySDLFFormulaLabel(){
		return SDLFFormulaLabel.isDisplayed();
	}
	
	public boolean verifySDLFOptionLabel(){
		return SDLFOptionLabel.isDisplayed();
	}
	
	public boolean verifyDescriptionLabel(){
		return descriptionLabel.isDisplayed();
	}
	
	public boolean verifyWageLabel(){
		return wageLabel.isDisplayed();
	}
	
	public boolean verifyContributionPercentageLabel(){
		return contributionPercentageLabel.isDisplayed();
	}
	
	public boolean verifyMinimumContributionAmountLabel(){
		return minimumContributionAmountLabel.isDisplayed();
	}
	
	public boolean verifyEffectiveDateLabel(){
		return effectiveDateLabel.isDisplayed();
	}
	
	public boolean verifyActionsLabel(){
		return actionsLabel.isDisplayed();
	}
	
	public boolean verifyPaginationLabel(){
		return paginationLabel.isDisplayed();
	}
	
	public boolean verifyAddClickLabelPresence(){
		return addClick.isDisplayed();
	}
	
	public void verifyAddClick() throws InterruptedException{
		addClick.click();
		TimeUnit.SECONDS.sleep(10);
	}
		
	public boolean verifyAddSDLFHeaderLabel(){
		return addSDLFHeaderLabel.isDisplayed();
	}
	
	public boolean verifyRemoveIconLabel(){
		return removeIcon.isDisplayed();
	}
	
	public void verifyRemoveIconClick() throws InterruptedException{
		removeIcon.click();
		TimeUnit.SECONDS.sleep(5);
	}
	
	public boolean verifyAddSDLFFormulaLabel(){
		return addSDLFFormulaLabel.isDisplayed();
	}
	
	public boolean verifyAddSDLFOptionLabel(){
		return addSDLFOptionLabel.isDisplayed();
	}
	
	public boolean verifyMaximumWageLabel(){
		return maximumWageLabel.isDisplayed();
	}
	
	public boolean verifyAddContributionPercentageLabel(){
		return addContributionPercentageLabel.isDisplayed();
	}
	
	public boolean verifyMinimumContributionAmountFieldLabel(){
		return minimumContributionAmountFieldLabel.isDisplayed();
	}
	
	public boolean verifyEffectiveDateFieldLabel(){
		return effectiveDateFieldLabel.isDisplayed();
	}
	
	public boolean verifyDescriptionFieldLabel(){
		return descriptionFieldLabel.isDisplayed();
	}
	
	public boolean verifySubmitButtonPresence(){
		return submitButtonClick.isDisplayed();
	}
	
	public boolean verifyCloseButtonPresence(){
		return closeButtonClick.isDisplayed();
	}
	
	public void verifyCloseButtonClick() throws InterruptedException{
		closeButtonClick.click();	
		TimeUnit.SECONDS.sleep(2);
	}
	
	public void verifyAddSDLFFormulaTextBox(String sdlfFormula) throws InterruptedException{
		addSDLFFormulaTextBox.clear();
		addSDLFFormulaTextBox.sendKeys(sdlfFormula);		
		TimeUnit.SECONDS.sleep(2);
	}
	
	public void verifyAddSDLFDropDown() throws InterruptedException{
		//addSDLFDropDown.sendKeys(sdlfFormula);	
		Actions action = new Actions(driver);
		action.moveToElement(addSDLFDropDown).build().perform();
		addSDLFDropDown.click();
		TimeUnit.SECONDS.sleep(2);
	}
	
	public void verifyAddSDLFDropDownMaximumWages() throws InterruptedException{
		maximumWagesLookUp.click();
		TimeUnit.SECONDS.sleep(2);
	}
	
	public void verifyAddSDLFDropDownUpToWages() throws InterruptedException{
		UpToWagesLookUp.click();
		TimeUnit.SECONDS.sleep(2);
	}
	
	public void verifyMaximumWagesTextBox(String maximumWages) throws InterruptedException{
		maximumWagesTextBox.clear();
		maximumWagesTextBox.sendKeys(maximumWages);		
		TimeUnit.SECONDS.sleep(2);
	}
	
	public void verifyUptoWagesTextBox(String upToWages) throws InterruptedException{
		uptoWagesTextBox.clear();
		uptoWagesTextBox.sendKeys(upToWages);		
		TimeUnit.SECONDS.sleep(2);
	}
	
	
	public void verifyAddContributionPercentageTextBox(String contributionPercentage) throws InterruptedException{
		addContributionPercentageTextBox.clear();
		addContributionPercentageTextBox.sendKeys(contributionPercentage);		
		TimeUnit.SECONDS.sleep(2);
	}
	
	public void verifyMinimumContributionAmountFieldTextBox(String minimumContributionAmount) throws InterruptedException{
		minimumContributionAmountFieldTextBox.clear();
		minimumContributionAmountFieldTextBox.sendKeys(minimumContributionAmount);		
		TimeUnit.SECONDS.sleep(2);
	}
	
	public void verifyEffectiveDateFieldTextBox(String effectiveDate) throws InterruptedException{
		TimeUnit.SECONDS.sleep(2);
		//effectiveDateFieldTextBox.click();
		effectiveDateFieldTextBox.sendKeys("");
		System.out.println("clread ");
		TimeUnit.SECONDS.sleep(5);
		effectiveDateFieldTextBox.sendKeys(effectiveDate);		
		TimeUnit.SECONDS.sleep(2);
	}
	
	public void verifyDescriptionFieldTextBox(String descriptionBox) throws InterruptedException{
		//descriptionFieldTextBox.click();
		descriptionFieldTextBox.clear();
		descriptionFieldTextBox.sendKeys(descriptionBox);		
		TimeUnit.SECONDS.sleep(2);
		
	}
	
	public void verifySubmitButtonClick() throws InterruptedException{
		submitButtonClick.click();
		TimeUnit.SECONDS.sleep(2);

	}
	
	public String verifySaveFeedbackMessage(){
		 String saveText = saveFeedbackMessage.getText();
		 return saveText;
  
	}
	
	public void verifySearchSDLFFormulaClick(String sDLFFormula) throws InterruptedException{
		TimeUnit.SECONDS.sleep(10);
		searchSDLFFormula.sendKeys(sDLFFormula);
		TimeUnit.SECONDS.sleep(10);

	}
	
	public void verifyDeleteClick() throws InterruptedException{
		deleteClick.click();
		okClick.click();
		TimeUnit.SECONDS.sleep(5);

	}
	
	public void verifyEditClick() throws InterruptedException{
		editClick.click();		
		TimeUnit.SECONDS.sleep(5);

	}
	
}
