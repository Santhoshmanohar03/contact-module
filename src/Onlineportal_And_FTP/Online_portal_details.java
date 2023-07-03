package Onlineportal_And_FTP;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Commission_page.Commission;
import Initilaizer.login_the_page;

public class Online_portal_details extends login_the_page {


	public static void online_portal() throws InterruptedException {

		PageFactory.initElements(driver, Pageobject.class);
		Thread.sleep(3000);
		Pageobject.onlineportal.click();
		Thread.sleep(3000);

		Select select1 = new Select(Pageobject.alljob);
		select1.selectByValue("3");



		Pageobject.discount.clear();
		Pageobject.discount.sendKeys("12");

		Select select3 = new Select(Pageobject.language);
		select3.selectByValue("7");

		Select select4 = new Select(Pageobject.notification);
		select4.selectByValue("3");

		Pageobject.cuslogo.sendKeys("G:\\1624277123242 (1).png");

	}

}
