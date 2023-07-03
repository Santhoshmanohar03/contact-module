package Check_View_Modification_fun;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Add_Task_in_Contact_module.Add_Task;
import Initilaizer.login_the_page;
import Jobhistory_Task_Documents.pageobject;

public class View_modification extends login_the_page {

	public static void Add_View_Page() throws InterruptedException, IOException {

		
		PageFactory.initElements(driver, View_modification_Pageobject.class);
		Thread.sleep(3000);
		View_modification_Pageobject.viewbtn.click();
		Thread.sleep(3000);
		View_modification_Pageobject.addviewbtn.click();

		Thread.sleep(3000);
		
		if(View_modification_Pageobject.addviewpageshow.isDisplayed()) {
			System.out.println("page opened");
		}
		
		View_modification_Pageobject.viewname.sendKeys("Automation test ");
		
		Thread.sleep(2000);
		View_modification_Pageobject.shareoption.click();

		Actions actions1 = new Actions(driver);

		actions1.moveToElement(View_modification_Pageobject.selecteduser)
				.click(View_modification_Pageobject.selecteduser).build().perform();

		actions1.moveToElement(View_modification_Pageobject.selectdrop).click(View_modification_Pageobject.selectdrop)
				.build().perform();

		actions1.moveToElement(View_modification_Pageobject.selectalluser)
				.click(View_modification_Pageobject.selectalluser).build().perform();
		
		actions1.moveToElement(View_modification_Pageobject.selecteduser)
		.click(View_modification_Pageobject.selecteduser).build().perform();

		Thread.sleep(3000);

		actions1.moveToElement(View_modification_Pageobject.checkbox1)
		.click(View_modification_Pageobject.checkbox1).build().perform();
		View_modification_Pageobject.checkbox1.click();

		View_modification_Pageobject.checkbox2.click();

		Thread.sleep(2000);
		Actions action = new Actions(driver);

		for (int i = 1; i <= 4; i++) {
			action.clickAndHold(View_modification_Pageobject.childcolumn)
					.moveToElement(View_modification_Pageobject.mobileview)
					.release(View_modification_Pageobject.parentcolumn).perform();
			Thread.sleep(1000);
		}
		View_modification_Pageobject.searchfield1.sendKeys("currency");
		Thread.sleep(1000);
		View_modification_Pageobject.searchfield2.sendKeys("currency");
		Thread.sleep(1000);
		action.moveToElement(View_modification_Pageobject.currency)
				.moveToElement(View_modification_Pageobject.currencyaddremove)
				.click(View_modification_Pageobject.currencyaddremove).build().perform();
		Thread.sleep(3000);

		action.moveToElement(View_modification_Pageobject.currency)
				.moveToElement(View_modification_Pageobject.currencyaddremove)
				.click(View_modification_Pageobject.currencyaddremove).build().perform();
		Thread.sleep(1000);
		View_modification_Pageobject.searchfield1.clear();
		Thread.sleep(1000);
		View_modification_Pageobject.searchfield2.clear();
		Thread.sleep(1000);
		View_modification_Pageobject.addfilter.click();

		Select selectfilter = new Select(View_modification_Pageobject.filterselect);
		List<WebElement> list = selectfilter.getOptions();
		int size = list.size();
		for (int i = 0; i <= size - 1; i++) {
			selectfilter.selectByIndex(i);
		}

		Thread.sleep(1000);
		Select selectsub = new Select(View_modification_Pageobject.filtersup);

		List<WebElement> list2 = selectsub.getOptions();
		int size2 = list2.size();

		for (int i = 0; i <= size2 - 1; i++) {

			selectsub.selectByIndex(i);

		}

		// View_modification_Pageobject.optionsaddbtn.sendKeys("12");

		View_modification_Pageobject.filterdelete.click();
		Thread.sleep(2000);
		File file3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file3, new File("E:\\Testing Screenshots\\View_modification_page.PNG"));
		View_modification_Pageobject.savebtn.click();

		try {
			View_modification_Pageobject.closebtn.click();
		} catch (Throwable e) {
			// TODO: handle exception
		}
		Thread.sleep(3000);
		View_modification_Pageobject.viewbtn.click();
		Thread.sleep(3000);
		View_modification_Pageobject.view1.click();
		Thread.sleep(3000);
	}

	public static void check_lock_the_view_flow() throws InterruptedException {
		PageFactory.initElements(driver, View_modification_Pageobject.class);
		Thread.sleep(3000);
		View_modification_Pageobject.viewbtn.click();
		Thread.sleep(3000);
		Actions action1 = new Actions(driver);
		try {
			action1.moveToElement(View_modification_Pageobject.deletebtn).click(View_modification_Pageobject.deletebtn)
					.perform();
			Thread.sleep(1000);
			View_modification_Pageobject.deleteok.click();

		} catch (Throwable e) {
			Actions action2 = new Actions(driver);
			action2.moveToElement(View_modification_Pageobject.editbtn).click().build().perform();
			Thread.sleep(4000);
			View_modification_Pageobject.checkbox2.click();
			Thread.sleep(2000);
			View_modification_Pageobject.savebtn.click();
			Thread.sleep(4000);
			View_modification_Pageobject.viewbtn.click();
			Thread.sleep(2000);
			action1.moveToElement(View_modification_Pageobject.deletebtn).click(View_modification_Pageobject.deletebtn)
					.perform();
			Thread.sleep(2000);
			View_modification_Pageobject.deleteok.click();

		}

	}
	
	public static void Add_View_Page_duplicat_check() throws InterruptedException, IOException {
		PageFactory.initElements(driver, View_modification_Pageobject.class);
		Thread.sleep(3000);
		View_modification_Pageobject.viewbtn.click();
		Thread.sleep(3000);
		View_modification_Pageobject.addviewbtn.click();
		Thread.sleep(3000);
	
		
		File file3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file3, new File("E:\\Testing Screenshots\\View_modification_page.PNG"));
		View_modification_Pageobject.savebtn.click();
Thread.sleep(4000);
		try {

			File file4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file4, new File("E:\\Testing Screenshots\\View_modification_page dupliacte formed.PNG"));
			View_modification_Pageobject.closebtn.click();
		} catch (Throwable e) {
			// TODO: handle exception
		}

	}

}
