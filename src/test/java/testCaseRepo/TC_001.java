package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import genericUtility.BaseClass;

@Listeners(genericUtility.ListenersImplementation.class)
public class TC_001 extends BaseClass
{
	@Test(groups = {"Smoke", "Sanity"})
	public void LE_OO1() throws EncryptedDocumentException, IOException
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadsPage lep = new LeadsPage(driver);
		lep.clickOnCreateNewLeadIcon();
		
		String fName = eUtil.getDataFromExcelFile("Leads", 2, 1);
		String lName = eUtil.getDataFromExcelFile("Leads", 2, 2);
		String company = eUtil.getDataFromExcelFile("Leads", 2, 3);
//		Assert.fail();
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.creatingNewLead(fName, lName, company);

	}
	@Test
	public void demo()
	{
		System.out.println("Hi");
	}
}
