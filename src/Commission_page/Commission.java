package Commission_page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Comapny_Info.Add_company_info_in_contact_module;
//import Exits_Customer_page.Exits_customer_pageobject;
import Initilaizer.login_the_page;

public class Commission extends login_the_page{

	public static void commission_page() throws InterruptedException, AWTException, IOException {

		PageFactory.initElements(driver, Commission_pageobject.class);
		Thread.sleep(3000);
		Commission_pageobject.commission.click();
		Thread.sleep(1000);
		Commission_pageobject.addnewcommision.click();
		Thread.sleep(1000);
		
		if(Commission_pageobject.addnewcommisionpage.isDisplayed()) {
		}else {
		}
		
		
		
		Commission_pageobject.commisionamount.sendKeys("wewee!@#");
		Thread.sleep(1000);
		String commisionamount = Commission_pageobject.commisionamount.getAttribute("value");

		if (commisionamount.isEmpty()) {
			Commission_pageobject.commisionamount.sendKeys("12");
		} else {
		}
		
	
		Thread.sleep(1000);
		Commission_pageobject.salesconsultant.click();
		Thread.sleep(1000);
		Commission_pageobject.selectconsultant.click();
		Thread.sleep(1000);
		Commission_pageobject.product.click();
		Thread.sleep(1000);
		// WebElement
		// select=driver.findElement(By.xpath("//*[@id='selectProduct']/following::mat-option[10]"));
		for (int i = 1; i <= 3; i++) {
			WebElement select = driver
					.findElement(By.xpath("//*[@id='selectProduct']/following::mat-option[" + i + "]"));
			select.click();
			Thread.sleep(1000);
			String selectproduct=select.getText();
		}

		// Commission_pageobject.selectproduct.click();
		Thread.sleep(2000);

//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_TAB);
		Actions action4 = new Actions(driver);
		action4.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		Commission_pageobject.savebtn.click();
		Thread.sleep(3000);
		
//		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file, new File("E:\\Testing Screenshots\\commissionpageadd.PNG"));
//		
//		Actions action = new Actions(driver);
//		action.moveToElement(Commission_pageobject.folder).moveToElement(Commission_pageobject.copybtn)
//				.click(Commission_pageobject.copybtn).build().perform();
//		log.info("Click copy icon button");
//		Thread.sleep(2000);
//		if(Commission_pageobject.copycommisionpage.isDisplayed()) {
//			log.info("copy commision page is open");
//		}else {
//			log.error("copy commision page is not open");
//		}
//	
//		Commission_pageobject.pastebtn.click();
//		Thread.sleep(3000);
//		log.info("click paste button ");
//		
//		
//		
//		action.moveToElement(Commission_pageobject.folder).moveToElement(Commission_pageobject.deletebtn)
//				.click(Commission_pageobject.deletebtn).build().perform();
//		Thread.sleep(1000);
//		
//		log.info("click delete icon button");
//		
//		Commission_pageobject.deleteokbtn.click();
		
	}


}
