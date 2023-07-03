package Comapny_Info;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Add_customer_scenario.Add_Customer_pageobject;
import Add_job_in_contact_module.Create_job_pageobject;
import Check_View_Modification_fun.View_modification;
//import Exits_Customer_page.Exits_customer_pageobject;
import Initilaizer.login_the_page;

public class Add_company_info_in_contact_module extends login_the_page{
	

	public static void company_info() throws InterruptedException, AWTException {

		PageFactory.initElements(driver, Add_company_info_pageobject.class);
		Thread.sleep(4000);
		Add_company_info_pageobject.company.click();
		Thread.sleep(2000);
		Add_company_info_pageobject.imageupload.click();
		Thread.sleep(3000);
	
		Robot rb = new Robot();
		StringSelection str = new StringSelection("G:\\1624277123242 (1).png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		

		Thread.sleep(3000);
		
		
		String companyname=Add_company_info_pageobject.companyname.getAttribute("value");
//		System.out.println("company name"+companyname);
		
		String companynamehead=Add_company_info_pageobject.companyhead.getText();
//	System.out.println("head name"+companynamehead);
		
//		Assert.assertEquals(companyname, companynamehead);
		
		
		
		if( Add_company_info_pageobject.phone.getAttribute("value").isEmpty()) {
			Add_company_info_pageobject.phone.sendKeys("12345");
		}else {

		}
		
		if( Add_company_info_pageobject.fax.getAttribute("value").isEmpty()) {
			Add_company_info_pageobject.fax.sendKeys("54897");
		}else {

		}
		
		if( Add_company_info_pageobject.email.getAttribute("value").isEmpty()) {
			Add_company_info_pageobject.email.sendKeys("asdsd@mail");
		}else {

		}
		
		
		
		Add_company_info_pageobject.source.click();
		
		Add_company_info_pageobject.searchsource.sendKeys("aut");
		
		Add_company_info_pageobject.selectsource.click();
		
		if( Add_company_info_pageobject.acccountref.getAttribute("value").isEmpty()) {
			Add_company_info_pageobject.acccountref.sendKeys("asdsd@mail");
		}else {

		}
		
		
		if( Add_company_info_pageobject.website.getAttribute("value").isEmpty()) {
			Add_company_info_pageobject.website.sendKeys("savrt.com");
		}else {

		}
		
		if( Add_company_info_pageobject.address1.getAttribute("value").isEmpty()) {
			Add_company_info_pageobject.address1.sendKeys("north street");
		}else {

		}
		

		if( Add_company_info_pageobject.address2.getAttribute("value").isEmpty()) {
			Add_company_info_pageobject.address2.sendKeys("uk.london");
		}else {

		}
		

		if( Add_company_info_pageobject.city.getAttribute("value").isEmpty()) {
			Add_company_info_pageobject.city.sendKeys("north street");
		}else {

		}
		

		if( Add_company_info_pageobject.address1.getAttribute("value").isEmpty()) {
			Add_company_info_pageobject.address1.sendKeys("north street");
		}else {

		}
		
		
//		Add_company_info_pageobject.state.click();
//		log.info("click state/country field");
//		Thread.sleep(2000);
//		Add_company_info_pageobject.selectstate.click();
//		String selectedstate= Add_company_info_pageobject.state.getAttribute("value");
//		log.info("select desierd state: "+selectedstate);
//		
		

		Select select=new Select(Add_company_info_pageobject.country);
		select.selectByVisibleText("UK");
		String selectedcountry= Add_company_info_pageobject.country.getAttribute("value");
		
		
		if( Add_company_info_pageobject.zipcode.getAttribute("value").isEmpty()) {
			Add_company_info_pageobject.zipcode.sendKeys("MK3 6FB");
		}else {

		}
		
		
		
		
//		Add_company_info_pageobject.acccountref.sendKeys("12450");
//		log.info("Enter the accountref");
//		
//		Add_company_info_pageobject.source.click();
//		log.info("click the source field");
//		
//		Add_company_info_pageobject.searchsource.sendKeys("aut");
//		log.info("enter in search field in source");
//		
//		Add_company_info_pageobject.selectsource.click();
//		log.info("select the desierd source");
//		
//		Add_company_info_pageobject.phone.sendKeys("A!@");
//		log.info("Enter Alphapates in phone text box");
//
//		if (Add_company_info_pageobject.phoneerrmsg.isDisplayed()) {
//			String text = Add_company_info_pageobject.phoneerrmsg.getText();
//			log.info("ErroR showns: " + text);
//			Add_company_info_pageobject.phone.clear();
//			log.info("Clear the invalid text in phone text box");
//			Add_company_info_pageobject.phone.sendKeys("12345");
//			log.info("Enter valid phone number");
//		} else {
//			log.error("invalid error message not shows/company");
//		}
//		
//		Add_company_info_pageobject.fax.sendKeys("@sds");
//		log.info("Enter Alphapates in fax text box");
//
//		if (Add_company_info_pageobject.faxerrmsg.isDisplayed()) {
//			String text = Add_company_info_pageobject.faxerrmsg.getText();
//			log.info("ErroR showns: " + text);
//			Add_company_info_pageobject.fax.clear();
//			log.info("Clear the invalid text in fax text box");
//			Add_company_info_pageobject.fax.sendKeys("001101");
//			log.info("Enter valid fax number");
//		} else {
//			log.error("invalid error message not shows");
//		}
//		Add_company_info_pageobject.email.clear();
//		Add_company_info_pageobject.email.sendKeys("adad");
//		Thread.sleep(1000);
//		if (Add_company_info_pageobject.emailerrmsg.isDisplayed()) {
//			String actualemailerror = Add_company_info_pageobject.emailerrmsg.getText();
//			log.info("Enter invalid mail id error shown:" + actualemailerror);
//			Add_company_info_pageobject.email.clear();
//			log.info("Clear the invalid mail ");
//			Add_company_info_pageobject.email.sendKeys("abcd@gmail");
//			log.info("Enter valid Mail id");
//		} else {
//			log.error("error message not shows");
//		}
				
//		Add_company_info_pageobject.website.clear();
//		Add_company_info_pageobject.website.sendKeys("wewe");
//		if (Add_company_info_pageobject.websiteerrmsg.isDisplayed()) {
//			String websiteerrormsg = Add_company_info_pageobject.websiteerrmsg.getText();
//			log.info("Enter invalid website error shown:" + websiteerrormsg);
//			Add_company_info_pageobject.website.clear();
//			log.info("Clear the invalid website ");
//			Add_company_info_pageobject.website.sendKeys("www.msd.com");
//			log.info("Enter valid Mail id");
//		} else {
//			log.error("error message not shows");
//		}
//		
//		
//		Add_company_info_pageobject.address1.sendKeys("asw@33");
//		log.info("Enter the address1");
//		
//		Add_company_info_pageobject.date.click();
//		log.info("click the date icon");
//		
//		
//		Add_company_info_pageobject.selectdate.click();
//		String selecteddate= Add_company_info_pageobject.selecteddate.getAttribute("value");
//		log.info("click desierd date: "+selecteddate);
		
//		Add_company_info_pageobject.state.click();
//		log.info("click state/country field");
//		
//		Add_company_info_pageobject.selectstate.click();
//		String selectedstate= Add_company_info_pageobject.state.getAttribute("value");
//		log.info("select desierd state: "+selectedstate);
//		
//		Add_company_info_pageobject.address2.sendKeys("near to");
//		log.info("Enter the address2");
//		
//		Add_company_info_pageobject.zipcode.sendKeys("tnf#4");
//		log.info("Enter the zipcode");
//		
//		Add_company_info_pageobject.city.sendKeys("Alaska");
//		
//		log.info("enter the city/town");
//		
//		
//		Select select=new Select(Add_company_info_pageobject.country);
//		select.selectByVisibleText("UK");
//		String selectedcountry= Add_company_info_pageobject.country.getAttribute("value");
//		log.info("select the country: "+selectedcountry);
//		
//		
//
//		Add_company_info_pageobject.datetime.click();
//		Robot robot1 = new Robot();
//		robot1.keyPress(KeyEvent.VK_RIGHT);
//		robot1.keyRelease(KeyEvent.VK_RIGHT);
//		robot1.keyPress(KeyEvent.VK_ENTER);
//		robot1.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		
//		Add_company_info_pageobject.time.click();
//		Robot robot2 = new Robot();
//		robot2.keyPress(KeyEvent.VK_DOWN);
//		robot2.keyRelease(KeyEvent.VK_DOWN);
//		robot2.keyPress(KeyEvent.VK_ENTER);
//		robot2.keyRelease(KeyEvent.VK_ENTER);
//		
//		Add_company_info_pageobject.holidayradiobtn.click();
//		
//		
		Add_company_info_pageobject.companysavebtn.click();
		Thread.sleep(2000);
	
	}
}
