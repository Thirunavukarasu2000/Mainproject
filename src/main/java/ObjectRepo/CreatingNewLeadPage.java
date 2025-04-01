package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Locating the WebElements
 */
public class CreatingNewLeadPage 
{

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstNameTextField;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath = "//input[@name='company']")
	private WebElement companyTextField;
	
	@FindBy(xpath = "//input[@name='designation']")
	private WebElement titleTextField;
	
	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobileTextField;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath = "//select[@name='leadsource']")
	private WebElement leadSourceDropdown;
	
	@FindBy(xpath = "//input[@id='noofemployees']")
	private WebElement noOfEmployeesTextField;
	
	@FindBy(xpath = "//input[@id='city']")
	private WebElement cityTextField;
	
	@FindBy(xpath = "//input[@id='country']")
	private WebElement countryTextField;
	
	@FindBy(xpath = "//input[@id='state']")
	private WebElement stateTextField;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Getter Methods
	 * @return
	 */

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getCompanyTextField() {
		return companyTextField;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getLeadSourceDropdown() {
		return leadSourceDropdown;
	}

	public WebElement getNoOfEmployeesTextField() {
		return noOfEmployeesTextField;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public WebElement getCountryTextField() {
		return countryTextField;
	}

	public WebElement getStateTextField() {
		return stateTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * This is a business library to create new lead
	 * @param fName
	 * @param lName
	 * @param company
	 */
	public void creatingNewLead(String fName, String lName, String company)
	{
		getFirstNameTextField().sendKeys(fName);
		getLastNameTextField().sendKeys(lName);
		getCompanyTextField().sendKeys(company);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new lead
	 * @param fName
	 * @param lName
	 * @param company
	 * @param title
	 * @param mobile
	 * @param email
	 */
	public void creatingNewLead(String fName, String lName, String company, String title, String mobile, String email)
	{
		getFirstNameTextField().sendKeys(fName);
		getLastNameTextField().sendKeys(lName);
		getCompanyTextField().sendKeys(company);
		getTitleTextField().sendKeys(title);
		getMobileTextField().sendKeys(mobile);
		getEmailTextField().sendKeys(email);
		getSaveButton().click();
	}
	
	/**
	 * This is a business to library to create a new lead
	 * @param lName
	 * @param company
	 * @param leadSource
	 * @param noOFEmployees
	 * @param city
	 * @param country
	 * @param state
	 */
	public void creatingNewLead(String lName, String company, String leadSource, String noOFEmployees, String city, String country, String state)
	{
		getLastNameTextField().sendKeys(lName);
		getCompanyTextField().sendKeys(company);
		Select sel = new Select(getLeadSourceDropdown());
		sel.selectByValue(leadSource);
		getNoOfEmployeesTextField().sendKeys(noOFEmployees);
		getCityTextField().sendKeys(city);
		getCountryTextField().sendKeys(country);
		getStateTextField().sendKeys(state);
		getSaveButton().click();

	}
	
	
	
	
}
