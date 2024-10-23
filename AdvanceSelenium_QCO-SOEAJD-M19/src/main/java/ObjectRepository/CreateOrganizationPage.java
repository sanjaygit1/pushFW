package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {

	public CreateOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "accountname")
	private WebElement orgName;

	@FindBy(id = "phone")
	private WebElement phnNum;

	@FindBy(id = "email1")
	private WebElement mailId;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getPhnNum() {
		return phnNum;
	}

	public WebElement getMailId() {
		return mailId;
	}

	public void enterOrgName(String Name) {
		orgName.sendKeys(Name);
	}

	public void enterPhnNum(String phnNumber) {
		phnNum.sendKeys(phnNumber);
	}

	public void enterMailId(String emailId) {
		mailId.sendKeys(emailId);
	}

	public void clickSaveButton() {
		saveButton.click();
	}
}
