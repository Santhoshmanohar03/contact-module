package Add_Task_in_Contact_module;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Add_job_in_contact_module.Add_Job;
import Add_job_in_contact_module.Add_job_pageobject;
import Check_View_Modification_fun.View_modification_Pageobject;
import Initilaizer.login_the_page;

public class Add_Task extends login_the_page {

	public static void Switchto_add_task() throws InterruptedException, AWTException, IOException {

		Thread.sleep(4000);
		PageFactory.initElements(driver, Add_task_pageobject.class);
	
		try {
			Add_task_pageobject.select.click();
			Thread.sleep(1000);
			Actions action = new Actions(driver);

			action.moveToElement(Add_task_pageobject.holder).click(Add_task_pageobject.holder).build().perform();
			Thread.sleep(1000);
			Actions action4=new Actions(driver);
			action4.moveToElement(Add_task_pageobject.addtaskbtn).click(Add_task_pageobject.addtaskbtn).perform();
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
		}
			

	
//		for(int i=1;i<=21;i++) {
//			
//			Add_task_pageobject.changedate.click();
//			WebElement f=driver.findElement(By.xpath("//*[@class='igx-calendar__body-row']/following::div[1]/following::igx-day-item["+i+"]/span"));
//			f.click();
//			Thread.sleep(1000);
//		}
		
	}
	public static void add_task_fields() throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver, Add_task_pageobject.class);
		Thread.sleep(3000);
		Add_task_pageobject.changedate.click();

		Thread.sleep(1000);
		Add_task_pageobject.selectdate.click();
		Thread.sleep(1000);
		Add_task_pageobject.changetime.click();

		Add_task_pageobject.changetime.sendKeys("0844PM");
		Thread.sleep(2000);
		Select select = new Select(Add_task_pageobject.selectstaff);

		List<WebElement> list = select.getOptions();
		int size1 = list.size();
		for (int i = 0; i <= size1 - 1; i++) {
			select.selectByIndex(i);

		}
		Add_task_pageobject.repeat.click();

		Add_task_pageobject.selectrepeat.click();
Thread.sleep(3000);
Actions action4=new Actions(driver);
action4.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

		Add_task_pageobject.repeatevery.sendKeys("20");
		Add_task_pageobject.repeatevery.clear();

		Actions actions = new Actions(driver);

		actions.click(Add_task_pageobject.dayrepeatincerment).perform();

		Add_task_pageobject.dayrepeatdecrement.click();

		Add_task_pageobject.endday.click();
		Actions action5=new Actions(driver);
		action5.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();



		Add_task_pageobject.savebtn.click();
		try {
			Add_task_pageobject.cancelbtn.click();
		} catch (Throwable e) {

		}
		Thread.sleep(1000);
//		String repeatmessage=Add_task_pageobject.messageshow.getAttribute("title");
//		System.out.println(repeatmessage);

		for (int i = 1; i <= 4; i++) {
			Add_task_pageobject.statusdrop.click();
			WebElement status = driver.findElement(By.xpath("(//*[@class='calappoinmentdrop'])[2]//label[" + i + "]"));
			status.click();
		}

		try {
			Add_task_pageobject.addconduct.click();
			Add_task_pageobject.addconduct.sendKeys("sa");
			Thread.sleep(3000);
			Actions action1 = new Actions(driver);

			action1.moveToElement(Add_task_pageobject.seleectconduct).click(Add_task_pageobject.seleectconduct).build()
					.perform();

		} catch (Throwable e) {
		}

		Add_task_pageobject.description.sendKeys("matrix");

//		for(int i=1;i<=25;i++) {
//		
//				Add_task_pageobject.enddate.click();
//				WebElement f=driver.findElement(By.xpath("//*[@class='igx-calendar__body-row']/following::div[1]/following::igx-day-item["+i+"]/span"));
//				f.click();
//			Thread.sleep(1000);
//		}
//		
	
		try {
			Thread.sleep(1000);
			Add_task_pageobject.enddate.click();
			Add_task_pageobject.selectdate.click();
			Thread.sleep(1000);
			
		} catch (Throwable e) {
			// TODO: handle exception
		}

//		Add_task_pageobject.number.sendKeys("1234567");
//		log.info("Enter the the number");
//		Add_task_pageobject.testtask.sendKeys("complete");
//		log.info("Enter in test task field");
//		Add_task_pageobject.retre.sendKeys("sggs");
//		log.info("Enter in the retre field");

	
		try {
			Select select3 = new Select(Add_task_pageobject.dropnumber);
			List<WebElement> list3 = select3.getOptions();
			int size3 = list3.size();
			for (int i = 0; i <= size3 - 1; i++) {
				select3.selectByIndex(i);
			}
			
			
		} catch (Throwable e) {
			// TODO: handle exception
		}
		
		
	try {
Add_task_pageobject.tasklist.sendKeys("santyyt");
		
//		Add_task_pageobject.seefield.sendKeys("12345");
		
	} catch (Throwable e) {
	}
		Add_task_pageobject.notification.click();

		Select select4 = new Select(Add_task_pageobject.notificationradio);
		select4.selectByVisibleText("Email");

		Add_task_pageobject.notificationhrs.sendKeys("10");

		Add_task_pageobject.notificationmins.sendKeys("45");

		Select select5 = new Select(Add_task_pageobject.notificationtemplate);
		List<WebElement> list4 = select5.getOptions();
		int size4 = list4.size();
		for (int i = 0; i <= size4 - 1; i++) {
			select5.selectByIndex(i);
		}
		Add_task_pageobject.notification.click();

		Add_task_pageobject.notificationdeletElement.click();
		
		Thread.sleep(2000);
		File file3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file3, new File("E:\\Testing Screenshots\\Add_task_page.PNG"));

		Add_task_pageobject.tasksavebtn.click();

		try {
			Thread.sleep(2000);
			
			
			Add_task_pageobject.taskcancelbtn.click();
			File file4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file4, new File("E:\\Testing Screenshots\\Add_task_page not able to save.PNG"));
		} catch (Exception e) {

			// TODO: handle exception
		}
		
		try {
			Thread.sleep(3000);
			Add_job_pageobject.closetaskhistoryorderpage.click();
		} catch (Throwable e) {
			// TODO: handle exception
		}
		
		
	}

}
