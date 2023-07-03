package Onlineportal_And_FTP;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Commission_page.Commission;
import Initilaizer.login_the_page;


public class FTP_configure extends login_the_page {
	

	public static void Add_FTP_configure() throws InterruptedException {

		PageFactory.initElements(driver, Pageobject.class);
		Thread.sleep(3000);
		Pageobject.FTP.click();
		Thread.sleep(2000);

		Pageobject.addtaskFTp.click();
		Thread.sleep(2000);
		Select select1 = new Select(Pageobject.format);
		select1.selectByIndex(1);

		Select select2 = new Select(Pageobject.choosestatus);
		select2.selectByValue("3");

		Pageobject.hostname.sendKeys("santhosh");

		Pageobject.username.sendKeys("SANThosh");

		Pageobject.password.sendKeys("1@df");

		Pageobject.path.sendKeys("google.com");

		Pageobject.port.sendKeys("userid");

		Select select3 = new Select(Pageobject.protocal);
		select3.selectByValue("2");

		Thread.sleep(2000);

		try {
			Pageobject.savetbtnftp.click();
		} catch (Throwable e) {
			Pageobject.canceltbtnftp.click();
		}

		try {
			Pageobject.canceltbtnftp.click();
		} catch (Throwable e) {

		}

//		if (Pageobject.errormess.isDisplayed()) {
//			Pageobject.canceltbtnftp.click();
//		}

	}


}
