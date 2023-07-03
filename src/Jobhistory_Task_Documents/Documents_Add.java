package Jobhistory_Task_Documents;

import java.awt.AWTException;


import org.openqa.selenium.support.PageFactory;

import Comapny_Info.Add_company_info_in_contact_module;
//import Exits_Customer_page.Exits_customer_pageobject;
import Initilaizer.login_the_page;

public class Documents_Add extends login_the_page {

	public static void add_document() throws InterruptedException, AWTException {

		PageFactory.initElements(driver, pageobject.class);
		Thread.sleep(3000);
		pageobject.documents.click();
		Thread.sleep(1000);
		pageobject.addnewdocu.click();
		Thread.sleep(1000);
		pageobject.descriptionnotes.sendKeys("testing team");
		Thread.sleep(1000);
		pageobject.reminder.click();
		Thread.sleep(1000);
		pageobject.selectreminder.click();

		Thread.sleep(1000);
		pageobject.attachment.sendKeys("G:\\T38_TEST_PAGES.pdf");

		Thread.sleep(2000);
		pageobject.completed.click();
		Thread.sleep(2000);
		pageobject.noselect.click();

		Thread.sleep(1000);
		pageobject.savebtnnote.click();
		Thread.sleep(2000);
		try {
			pageobject.cancelnote.click();
		} catch (Throwable e) {

		}

	}

}
