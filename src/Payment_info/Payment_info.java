package Payment_info;

import static org.testng.Assert.assertNotEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import Exits_Customer_page.Exits_customer_pageobject;
import Initilaizer.login_the_page;
import Onlineportal_And_FTP.Online_portal_details;

public class Payment_info extends login_the_page {
	

	public static void Payment_info() throws InterruptedException, AWTException, IOException {

		
		PageFactory.initElements(driver, Payment_info_pageobject.class);
		Thread.sleep(3000);
		Payment_info_pageobject.paymentinfo.click();
		Thread.sleep(4000);
		
		
		
		
		Payment_info_pageobject.accountinfo.click();
		Thread.sleep(2000);
		
		
		
		Payment_info_pageobject.addcredit.sendKeys("asas((*");
		String addcredit = Payment_info_pageobject.addcredit.getAttribute("value");
		if (addcredit.isEmpty()) {
			Payment_info_pageobject.addcredit.sendKeys("1000");
		} else {
		}
		
		Payment_info_pageobject.addcreditplusbtn.click();
		Thread.sleep(2000);
			
		
		
		

		Payment_info_pageobject.creditlimit.sendKeys("asas");
		String creditlimit = Payment_info_pageobject.creditlimit.getAttribute("value");

		if (creditlimit.isEmpty()) {
			Payment_info_pageobject.creditlimit.sendKeys("251");
		} else {
		}

		Payment_info_pageobject.creditavailable.sendKeys("sdsd%");
		String creditavailable = Payment_info_pageobject.creditavailable.getAttribute("value");
		if (creditavailable.isEmpty()) {
			Payment_info_pageobject.creditavailable.sendKeys("2548");
		} else {
		}
		
		

		Payment_info_pageobject.overdue.sendKeys("asw");
		String overdue = Payment_info_pageobject.overdue.getAttribute("value");
		if (overdue.isEmpty()) {
			Payment_info_pageobject.overdue.sendKeys("2548");
		} else {
		}

		Payment_info_pageobject.dayradiobtn.click();

		Payment_info_pageobject.dayterm.sendKeys("78945");
		

		Payment_info_pageobject.monthradiobtn.click();

		Select select = new Select(Payment_info_pageobject.monthterm);
		select.selectByValue("5");

		Payment_info_pageobject.description.sendKeys("payment done");
		

		Payment_info_pageobject.onholdradiobtn.click();
		Thread.sleep(3000);
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("E:\\Testing Screenshots\\accountinfopage.PNG"));

		Payment_info_pageobject.paymentinfosub.click();
		Thread.sleep(2000);

		

		Payment_info_pageobject.awaitingradiobtn.click();

		Thread.sleep(2000);
		Select select2 = new Select(Payment_info_pageobject.datefilter);
		List<WebElement> list2 = select2.getOptions();
		int size2 = list2.size();
		for (int i = 0; i <= size2 - 1; i++) {
			select2.selectByIndex(i);
		}
		Thread.sleep(3000);

		Payment_info_pageobject.amount.click();
		Thread.sleep(1000);
		Payment_info_pageobject.amountsend.sendKeys("10");
		Thread.sleep(1000);
			
		
		

		Payment_info_pageobject.paymentmethod.click();
		Payment_info_pageobject.paymentmethod.click();
//		Robot robot2 = new Robot();
//		robot2.keyPress(KeyEvent.VK_DOWN);
//		robot2.keyRelease(KeyEvent.VK_DOWN);
//		robot2.keyPress(KeyEvent.VK_ENTER);
//		robot2.keyRelease(KeyEvent.VK_ENTER);
		
		Actions action4 = new Actions(driver);
		action4.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		Thread.sleep(2000);
		Payment_info_pageobject.paymenttype.click();
		Payment_info_pageobject.paymenttype.click();
//		Robot robot1 = new Robot();
//		robot1.keyPress(KeyEvent.VK_DOWN);
//		robot1.keyRelease(KeyEvent.VK_DOWN);
//		robot1.keyPress(KeyEvent.VK_ENTER);
//		robot1.keyRelease(KeyEvent.VK_ENTER);
		
		Actions action5 = new Actions(driver);
		action5.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		Actions actions2=new Actions(driver);
		actions2.clickAndHold(Payment_info_pageobject.paymentscrollbar).moveByOffset(350, 0).perform();
		Thread.sleep(2000);
		Payment_info_pageobject.paiddate.click();
		Thread.sleep(1000);
		
		Actions action6 = new Actions(driver);
		action6.sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		Payment_info_pageobject.paidradiobtn.click();
		Thread.sleep(2000);
		
		Actions actions=new Actions(driver);
		actions.clickAndHold(Payment_info_pageobject.paidscrollbar).moveByOffset(350, 0).perform();
		Thread.sleep(2000);
		File file2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file2, new File("E:\\Testing Screenshots\\paymentpaidpage.PNG"));
		
//		Payment_info_pageobject.jobhistory.click();

	}

	public static void bulk_payment() throws InterruptedException {
		PageFactory.initElements(driver, Payment_info_pageobject.class);
		Thread.sleep(2000);
		Payment_info_pageobject.bulkpay.click();

		Thread.sleep(2000);
		Select select = new Select(Payment_info_pageobject.bpaymentmethod);
		select.selectByIndex(2);
		Thread.sleep(1000);
		Select select1 = new Select(Payment_info_pageobject.bpaymenttype);
		select1.selectByIndex(2);
		Thread.sleep(2000);
		
		Select select2 = new Select(Payment_info_pageobject.jobstatus);
		select2.selectByValue("6");
		Thread.sleep(2000);
//		Payment_info_pageobject.bpaymentdate.click();
//		Thread.sleep(1000);
//		Payment_info_pageobject.bselectdate.click();
//		Thread.sleep(1000);
		Payment_info_pageobject.selectalljob.click();

		Thread.sleep(2000);
		String actualamount = Payment_info_pageobject.actualamount.getAttribute("value");

		Payment_info_pageobject.paymentamount.sendKeys(actualamount);

		Payment_info_pageobject.paymentsave.click();

	}

}
