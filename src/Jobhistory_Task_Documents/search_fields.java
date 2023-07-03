package Jobhistory_Task_Documents;

import org.openqa.selenium.support.PageFactory;

public class search_fields extends Documents_Add {

	
	public static void Searc_field_in_Customers_list() throws InterruptedException {
		
		PageFactory.initElements(driver, pageobject.class);
		Thread.sleep(3000);
		
		pageobject.firstnameseachfield.click();
		pageobject.firstnameseachfield.sendKeys("dada");
		Thread.sleep(2000);
		pageobject.companysearchfield.click();
		pageobject.companysearchfield.sendKeys("d");
	}
}
