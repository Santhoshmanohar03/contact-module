package Add_Appointment_contactmodule;

import java.awt.AWTException;
//import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

//import Add_Task_in_Contact_module.Add_task_pageobject;
//import Add_customer_scenario.Add_customer_info;
//import Add_customer_scenario.Customer_info_comparison;
//import Add_job_in_contact_module.Add_Job;
//import Add_job_in_contact_module.Add_job_pageobject;
//import Add_job_in_contact_module.Add_job_pageobject;
//import Initilaizer.login_pageobject;
import Initilaizer.login_the_page;

public class Add_Appointment_from_contactmodule extends login_the_page {


	public static List<String> appointmentinfo = new ArrayList<String>();
	public static List<String> contactinfoinput = new ArrayList<String>();
	public static List<String> appglobalinfo = new ArrayList<String>();

	public static void Add_appointment() throws InterruptedException, IOException, AWTException {
	
		PageFactory.initElements(driver, Add_Appointment_pageobject.class);

		Thread.sleep(5000);
		Actions action5 = new Actions(driver);
		action5.moveToElement(Add_Appointment_pageobject.holder).click(Add_Appointment_pageobject.holder).build()
				.perform();
		Thread.sleep(1000);
		Actions action4 = new Actions(driver);
		action4.moveToElement(Add_Appointment_pageobject.addappointment)
				.click(Add_Appointment_pageobject.addappointment).perform();
		Thread.sleep(8000);

	
		PageFactory.initElements(driver, Appointment_info_pageobject.class);

		String s = Appointment_info_pageobject.globalinfo.getAttribute("value");

		String[] arr = s.split("  ");
//		int t = arr.length;

		for (int i = 0; i <= 13; i++) {
			appglobalinfo.add(arr[i]);
		}
	

		contactinfoinput.add(propertyfile().getProperty("salutation"));
		contactinfoinput.add((propertyfile().getProperty("firstname").substring(0, 1).toUpperCase())+((propertyfile().getProperty("firstname").substring(1))));
		contactinfoinput.add((propertyfile().getProperty("lastname").substring(0, 1).toUpperCase())+((propertyfile().getProperty("firstname").substring(1))));
		contactinfoinput.add((propertyfile().getProperty("companyname").substring(0, 1).toUpperCase())+((propertyfile().getProperty("firstname").substring(1))));

		contactinfoinput.add(propertyfile().getProperty("address1zip"));
		contactinfoinput.add(propertyfile().getProperty("address2zip"));
		contactinfoinput.add(propertyfile().getProperty("cityzip"));
		contactinfoinput.add(propertyfile().getProperty("state"));
		contactinfoinput.add(propertyfile().getProperty("country"));
		contactinfoinput.add(propertyfile().getProperty("zipcode"));

		contactinfoinput.add(propertyfile().getProperty("phoneno"));
		contactinfoinput.add(propertyfile().getProperty("mobileno"));
		contactinfoinput.add((propertyfile().getProperty("role").substring(0, 1).toUpperCase())+((propertyfile().getProperty("firstname").substring(1))));
		contactinfoinput.add(propertyfile().getProperty("email"));

	

		int x = contactinfoinput.size();

		for (int i = 0; i <= x - 1; i++) {
			if (contactinfoinput.get(i).equals(appglobalinfo.get(i))) {
//				log.info(contactinfoinput.get(i) + "----" + appglobalinfo.get(i));
			} else {
//				log.error("not matched" + contactinfoinput.get(i) + "----" + appglobalinfo.get(i));
			}
		}

	}

	public static void add_appointment_fields() throws InterruptedException, AWTException, IOException {

		PageFactory.initElements(driver, Add_Appointment_pageobject.class);
		
		String headingappointment=Add_Appointment_pageobject.heading.getText();
		if(Add_Appointment_pageobject.heading.isDisplayed()) {
			testcase.log(Status.PASS, "New Appointment page opened sucessfully tittle: "+headingappointment);
		}else {
			testcase.log(Status.FAIL, "New Appointment page tittle changed");
		}
		
		
		
		Add_Appointment_pageobject.confirmbtn.click();
		
		testcase.log(Status.INFO, "Click the confirm checkbox button");
		Thread.sleep(1000);
		
		if (Add_Appointment_pageobject.confirmbtn.isSelected()) {
			testcase.log(Status.PASS, "successfully confirm checkbox selected");
		}else {
			testcase.log(Status.FAIL, "confirm checkbox not selected");

		}
		
		
		
		
			Thread.sleep(1000);

			Add_Appointment_pageobject.editbtn.click();
			Thread.sleep(1000);
		
			testcase.log(Status.INFO, "Click the pencile simple edit button");
			
			
			
		
			String startdatebefore = Add_Appointment_pageobject.startdate.getAttribute("value");
//		Add_Appointment_pageobject.startdate.click();
			Add_Appointment_pageobject.startdate.clear();
		Add_Appointment_pageobject.startdate.sendKeys("22-Jun-2023");
		Thread.sleep(1000);
	
		testcase.log(Status.INFO, "Click the startdate field to select the date");
//		Actions action4 = new Actions(driver);
//		action4.sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		

		testcase.log(Status.INFO, "Select the  starting date ");
		Thread.sleep(1000);
		
		String startdateafter = Add_Appointment_pageobject.startdate.getAttribute("value");
		if(startdatebefore.equals(startdateafter)) {
			testcase.log(Status.FAIL, "starting date not changed after modify  current date");
		}else {
			testcase.log(Status.PASS, "Starting date successfully changed from current date");
		}
		
		String startdate = Add_Appointment_pageobject.startdate.getAttribute("value");
		String enddate = Add_Appointment_pageobject.enddate.getAttribute("value");

		if (startdate.equalsIgnoreCase(enddate)) {
			
			testcase.log(Status.PASS, "End date changed as per start date");
		} else {
			
			testcase.log(Status.PASS, "End date *not* changed as per start date");
		}

		
		
		String starttimebefore = Add_Appointment_pageobject.starttime.getAttribute("value");
		Add_Appointment_pageobject.starttime.click();
		Thread.sleep(1000);
		testcase.log(Status.INFO, "Click the starttime field to select the time");
		Actions action5 = new Actions(driver);
		action5.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		testcase.log(Status.INFO, "Select the  starting time ");
		String starttimeafter = Add_Appointment_pageobject.starttime.getAttribute("value");
		if(starttimebefore.equals(starttimeafter)) {
			testcase.log(Status.FAIL, "starting time not changed after modify  current time");
		}else {
			testcase.log(Status.PASS, "Starting time successfully changed from current time");
		}
		

		String starttime = Add_Appointment_pageobject.starttime.getAttribute("value");
		String endtime = Add_Appointment_pageobject.endtime.getAttribute("value");

		if (starttime != endtime) {
			
			testcase.log(Status.PASS, "End time changed as per start time");
		} else {
			
			testcase.log(Status.FAIL, "end time *not* changed as per start time");
		}
		
		
		
		
		String enddatebefore = Add_Appointment_pageobject.enddate.getAttribute("value");
		Add_Appointment_pageobject.enddate.click();
		Thread.sleep(1000);
		testcase.log(Status.INFO, "Click the enddate field to select the date");
		Actions action6 = new Actions(driver);
		action6.sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		testcase.log(Status.INFO, "select the end date");
		String enddateafter = Add_Appointment_pageobject.enddate.getAttribute("value");
		if(enddatebefore.equals(enddateafter)) {
			testcase.log(Status.FAIL, "End date not changed after modify  current date");
		}else {
			testcase.log(Status.PASS, "End date successfully changed from current date");
		}
		
		String endtimebefore = Add_Appointment_pageobject.endtime.getAttribute("value");
		Add_Appointment_pageobject.endtime.click();
		testcase.log(Status.INFO, "Click the endtime field to select the time");
		Thread.sleep(1000);
		Actions action7 = new Actions(driver);
		action7.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		testcase.log(Status.INFO, "select the end time");
		
		String endtimeafter = Add_Appointment_pageobject.endtime.getAttribute("value");
		if(endtimebefore.equals(endtimeafter)) {
			testcase.log(Status.FAIL, "End time not changed after modify  current time");
		}else {
			testcase.log(Status.PASS, "End time successfully changed from current time");
		}
		
		

		Add_Appointment_pageobject.alldaycheckbox.click();
		
		testcase.log(Status.INFO, "Click the all day checkbox to select");
		Thread.sleep(1000);
		if(Add_Appointment_pageobject.alldaycheckbox.isEnabled()) {
			testcase.log(Status.PASS, "All day check box selected successfully");
		}else {
			testcase.log(Status.FAIL, "All day check box not selected");
		}
		try {
			if(Add_Appointment_pageobject.starttime.isDisplayed() && Add_Appointment_pageobject.endtime.isDisplayed()) {
//				System.out.println("time field not hidded after select the check box");
				testcase.log(Status.FAIL, "time field not hidded after select the check box");
			}
		} catch (Throwable e) {
//			System.out.println("time field is hidded successfully after click the all check box");
			testcase.log(Status.PASS, "time field is hidded successfully after click the all check box");
		}
		
		
	
		
	
		Add_Appointment_pageobject.alldaycheckbox.click();
	
		testcase.log(Status.INFO, "Again Click the all day checkbox to deselect the field");
		Thread.sleep(1000);
		if(Add_Appointment_pageobject.alldaycheckbox.isSelected()) {
			testcase.log(Status.FAIL, "All day check box not deselected ");
		}else {
			testcase.log(Status.PASS, "All day check box  deselected successfully");
		}
		try {
			if(Add_Appointment_pageobject.starttime.isDisplayed()) {
//				System.out.println("time field displayed after deselect the check box");
				testcase.log(Status.PASS, "time field displayed after deselect the check box");
			}
		} catch (Throwable e) {
//			System.out.println("time field not displayed after deselected the check box");
			testcase.log(Status.FAIL, "time field not displayed after deselected the check box");
		}
	
			
		
		
		Add_Appointment_pageobject.repeatonoff.click();
		Thread.sleep(1000);
		
		testcase.log(Status.INFO, "Click repeat button");
		Add_Appointment_pageobject.selectrepeat.click();

	testcase.log(Status.INFO, "Click the repeat dropdown field");
		Thread.sleep(2000);

		Actions action8 = new Actions(driver);
		action8.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		testcase.log(Status.INFO, "Select the repeat condition ");
		
		Actions actions = new Actions(driver);
		actions.click(Add_Appointment_pageobject.dayrepeatincerment).perform();
		testcase.log(Status.INFO, "Click repeat day increment button to increase");
		

		Add_Appointment_pageobject.dayrepeatdecrement.click();

		Add_Appointment_pageobject.repeatevery.clear();
		
		testcase.log(Status.INFO, "Click the repeat every field & clear the value");
		Add_Appointment_pageobject.repeatevery.sendKeys("2");
		
		testcase.log(Status.INFO, "Enter repeat every day filed");
		Thread.sleep(2000);
//		Add_Appointment_pageobject.endday.click();
//
//		Actions action9=new Actions(driver);
//		action9.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

		String beforedate = Add_Appointment_pageobject.enddayinput.getAttribute("value");
		// System.out.println(before);
		Add_Appointment_pageobject.enddayset.click();
		testcase.log(Status.INFO, "Click end day set date field to select the date");
		Actions action11 = new Actions(driver);
		action11.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		testcase.log(Status.INFO, "Select the desierd date");
		Thread.sleep(1000);
		String afterdate = Add_Appointment_pageobject.enddayinput.getAttribute("value");
		// System.out.println(after);
		if (beforedate == afterdate) {
			
			testcase.log(Status.FAIL, "Date not changed before date & after selected date are equal");
		} else {
			
			testcase.log(Status.PASS, "default date changed to desierd date"+afterdate);
			// System.out.println(after);
		}

		Add_Appointment_pageobject.repeatok.click();
	
		testcase.log(Status.PASS, "Click the save button");
		
		Thread.sleep(2000);

		if(Add_Appointment_pageobject.repeatinfo.isDisplayed()) {
			String info=Add_Appointment_pageobject.repeatinfo.getText();
			Add_Appointment_pageobject.repeatinfo.click();
			Thread.sleep(1000);
			Add_Appointment_pageobject.repeatcancel.click();
			testcase.log(Status.PASS, "Successfully repeat mode saved :"+info);
		}else {
			testcase.log(Status.FAIL, " repeat mode  not saved ");
		}
		
		
//		Select select = new Select(Add_Appointment_pageobject.appointmenttype);
//		select.selectByIndex(2);
//		Thread.sleep(2000);
		Add_Appointment_pageobject.appointmenttype.click();
		Thread.sleep(2000);
		Add_Appointment_pageobject.appointmentselect.click();
		
		
		String appointmenttype=Add_Appointment_pageobject.appointmenttype
				.getText();
		
		testcase.log(Status.INFO, "Appointment type selected -"+appointmenttype);
		try {
			Add_Appointment_pageobject.staffdrop.click();
			Thread.sleep(2000);
			Add_Appointment_pageobject.selectstaffdrop.click();
			Thread.sleep(1000);
			
			testcase.log(Status.INFO, "Select the staff on multiselect");
		} catch (Throwable e) {
			Select select1 = new Select(Add_Appointment_pageobject.staffdrop);
			select1.selectByIndex(1);
			Thread.sleep(1000);
			testcase.log(Status.INFO, "Select the staff on single select");
			
		}

		

		Thread.sleep(1000);
		
		Add_Appointment_pageobject.traveltimehrs.sendKeys("400");
		testcase.log(Status.INFO, "Enter travel time hrs with out of boundry vlaue");
		String travelhrs=Add_Appointment_pageobject.traveltimehrs.getAttribute("value");
		
		int i=Integer.parseInt(travelhrs);
		if(i<24) {
			testcase.log(Status.PASS, "traveltime  hours field get with in the 24 hrs only");
			
			Add_Appointment_pageobject.traveltimehrs.clear();
			Add_Appointment_pageobject.traveltimehrs.sendKeys("15");
			testcase.log(Status.INFO, "Enter travel time hrs with in hrs value(correcr)");
		}else {
			testcase.log(Status.FAIL, "traveltime  hours field not properly work");
		}


		
		
		Add_Appointment_pageobject.traveltimemins.sendKeys("100");
		testcase.log(Status.INFO, "Enter travel time mins with out of boundry vlaue");
		
		
		String travelmin=Add_Appointment_pageobject.traveltimemins.getAttribute("value");
		int j=Integer.parseInt(travelmin);
		if(j<60) {
			testcase.log(Status.PASS, "traveltime  mins field get with in the 60 mins only");
			
			Add_Appointment_pageobject.traveltimemins.clear();
			Add_Appointment_pageobject.traveltimemins.sendKeys("29");
			testcase.log(Status.INFO, "Enter travel time mins with in hrs value(correct)");
		}else {
			testcase.log(Status.FAIL, "traveltime  mins field not properly work");
		}
		Thread.sleep(1000);

		Add_Appointment_pageobject.notificationaddbtn.click();
		
		Select selectradio = new Select(Add_Appointment_pageobject.notificationradio);
		selectradio.selectByVisibleText("Email");

		Add_Appointment_pageobject.notificationhrs.sendKeys("01");

		Add_Appointment_pageobject.notificationmins.sendKeys("25");

		Select selecttemplate = new Select(Add_Appointment_pageobject.notificationtemplate);
		selecttemplate.selectByIndex(1);

		Add_Appointment_pageobject.notificationaddbtn.click();

		Add_Appointment_pageobject.notificationdelete.click();
		Thread.sleep(1000);
		Add_Appointment_pageobject.notificationdelete.click();
		Thread.sleep(1000);
		
		Add_Appointment_pageobject.appointmentstatus.click();
	
		Thread.sleep(1000);
		Add_Appointment_pageobject.selectappstatus.click();
		
		Add_Appointment_pageobject.upload.click();
		Thread.sleep(2000);
		Robot rb = new Robot();

		StringSelection str = new StringSelection("G:\\1624277123242 (1).png"); // SCREENSHOT
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		

		Add_Appointment_pageobject.descriptionbox.sendKeys("Testing description");
		Thread.sleep(3000);

		Add_Appointment_pageobject.savebtn.click();
		Thread.sleep(3000);
		
		
		
		
		try {
			Add_Appointment_pageobject.warning.click();
			Thread.sleep(1000);
		} catch (Throwable e) {
			
		}
		
		
		
//	Add_Appointment_pageobject.savebtn.click();
		// Add_Appointment_pageobject.cancelbtn.click();
		
//
//		try {
//			Thread.sleep(1000);
//			Add_Appointment_pageobject.cancelbtn.click();
//		} catch (Throwable e) {
//			// TODO: handle exception
//		}

	}

}
