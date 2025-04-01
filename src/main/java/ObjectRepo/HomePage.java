package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a Home page POM class
 * @author VISHAL
 * @version 25.03.10
 */

public class HomePage 
{

	@FindBy(xpath = "//a[text()='Leads' and @href='index.php?module=Leads&action=index']")
	private WebElement leadsMenu;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactsMenu;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountsIcon;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutOption;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getContactsMenu() {
		return contactsMenu;
	}

	public WebElement getAccountsIcon() {
		return accountsIcon;
	}

	public WebElement getSignOutOption() {
		return signOutOption;
	}
	
	/**
	 * This is a business library which clicks on leads Menu
	 */
	public void clickOnLeadsMenu()
	{
		getLeadsMenu().click();	
	}

	/**
	 * This is a business library which clicks on contacts Menu
	 */
	public void clickOnContactsMenu()
	{
		getContactsMenu().click();	
	}

	/**
	 * This is a business library to perform sign out operstion
	 * @param driver
	 */
	public void signOutOperation(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(getAccountsIcon()).perform();
		getSignOutOption().click();
	}
	
}
