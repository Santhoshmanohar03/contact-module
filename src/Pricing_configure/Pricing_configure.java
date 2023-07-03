package Pricing_configure;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

//import Exits_Customer_page.Exits_customer_pageobject;
import Initilaizer.login_the_page;
import Onlineportal_And_FTP.Online_portal_details;

public class Pricing_configure extends login_the_page{


	public static void Add_Pricing_Configuration() throws InterruptedException, IOException {
		

		PageFactory.initElements(driver, Pricing_configure_pageobject.class);
		Thread.sleep(2000);
		// Exits_customer_pageobject.selectcustomer.click();

		Pricing_configure_pageobject.pricing.click();
		Thread.sleep(1000);

		Pricing_configure_pageobject.VATrate.clear();
		Pricing_configure_pageobject.VATrate.sendKeys("as##");
		String VATrate = Pricing_configure_pageobject.VATrate.getAttribute("value");
		if (VATrate.isEmpty()) {
			Pricing_configure_pageobject.VATrate.sendKeys("10");
		} else {
		}

		Pricing_configure_pageobject.VATregnumber.clear();
		Pricing_configure_pageobject.VATregnumber.sendKeys("288");

		Pricing_configure_pageobject.surcharge.clear();
		Pricing_configure_pageobject.surcharge.sendKeys("as@");
		String surcharge = Pricing_configure_pageobject.surcharge.getAttribute("value");

		if (surcharge.isEmpty()) {
			Pricing_configure_pageobject.surcharge.sendKeys("15");
		} else {
		}

		Pricing_configure_pageobject.defaultdeliverycost.clear();
		Pricing_configure_pageobject.defaultdeliverycost.sendKeys("ds@#");
		String defaultdeliverycost = Pricing_configure_pageobject.defaultdeliverycost.getAttribute("value");

		if (defaultdeliverycost.isEmpty()) {
			Pricing_configure_pageobject.defaultdeliverycost.sendKeys("100");
		} else {
		}


		Thread.sleep(1000);
		Pricing_configure_pageobject.defaultappointtype.click();
		Thread.sleep(1000);
		
		Pricing_configure_pageobject.defaultappointtype.click();
		Thread.sleep(1000);
		
		Pricing_configure_pageobject.defaultappointtypesearch.sendKeys("a");
		Thread.sleep(2000);
		
		Pricing_configure_pageobject.selectappointtype.click();

		Thread.sleep(1000);

		Pricing_configure_pageobject.defaultsatff.click();
		Thread.sleep(1000);
		
		

		Pricing_configure_pageobject.selectstaff.click();
		Thread.sleep(1000);
		
//		
//		String s=driver.switchTo().alert().getText();;
//		System.out.println(s);
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("E:\\Testing Screenshots\\pricingpage.PNG"));
	
//		Exits_customer_pageobject.paymentinfo.click();

	}

}
