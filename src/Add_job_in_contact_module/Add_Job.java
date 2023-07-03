package Add_job_in_contact_module;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import Add_Appointment_contactmodule.Add_Appointment_from_contactmodule;
import Add_Task_in_Contact_module.Add_Task;
import Add_Task_in_Contact_module.Add_task_pageobject;
import Add_customer_scenario.Add_Customer_pageobject;
import Add_customer_scenario.Add_customer_info;
//import Add_customer_scenario.Contact_comparison_info_pageobject;
import Initilaizer.login_the_page;

public class Add_Job extends login_the_page {

	public static List<String> jobinfoshow = new ArrayList<String>();
	public static List<String> contactinfoinput = new ArrayList<String>();

	

	public static void open_the_Creat_job_page_from_contact_module() throws InterruptedException, IOException {
		
		PageFactory.initElements(driver, Add_job_pageobject.class);

		testcase = extents.createTest("Open_the_Creat_job_page_from_contact_module");

		Thread.sleep(8000);
		Actions action5 = new Actions(driver);
		action5.moveToElement(Add_job_pageobject.holder).click(Add_job_pageobject.holder).build().perform();
		testcase.log(Status.INFO, "Click the three dot button");

		Thread.sleep(1000);
		
		Actions action4 = new Actions(driver);
		action4.moveToElement(Add_job_pageobject.addjobbtn).click(Add_job_pageobject.addjobbtn).perform();
		testcase.log(Status.INFO, "After click three dot Click add job field ");
		Thread.sleep(8000);

		String jobtitle = "Jobs"; 
		if (driver.getTitle().equals(jobtitle)) {
			testcase.log(Status.PASS, "switch to contact page to job page-job title: " + driver.getTitle());
		} else {
			testcase.log(Status.FAIL, "Job title not matched");
		}

		String jobheadings = "Create Job";
		if (Add_job_pageobject.jobpageheading.getText().equals(jobheadings)) {
			testcase.log(Status.PASS, "Successfully create job page viewed");
		} else {
			testcase.log(Status.FAIL, "create job not viewed");
		}

		
		
		File f=new File("F:\\New folder (2)\\Add_Contact_module\\src\\Add_customer_scenario\\company.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop4=new Properties();
		prop4.load(fis);
		
		
//		Select selectlayout=new Select(Add_job_pageobject.chooselayout);
//		selectlayout.selectByVisibleText("Test");
//		log.info("select the layout 'test'.");

		Thread.sleep(2000);

		Thread.sleep(4000);
		PageFactory.initElements(driver, Create_job_pageobject.class);
		jobinfoshow.add(Create_job_pageobject.companyname.getAttribute("value"));

		Select select5 = new Select(Create_job_pageobject.salutation);
		jobinfoshow.add(select5.getFirstSelectedOption().getText());
		jobinfoshow.add(Create_job_pageobject.firstname.getAttribute("value"));
		jobinfoshow.add(Create_job_pageobject.lastname.getAttribute("value"));
		jobinfoshow.add(Create_job_pageobject.phone.getAttribute("value"));
		jobinfoshow.add(Create_job_pageobject.mobile.getAttribute("value"));
		jobinfoshow.add(Create_job_pageobject.email.getAttribute("value"));

		jobinfoshow.add(Create_job_pageobject.address1.getAttribute("value"));

		jobinfoshow.add(Create_job_pageobject.address2.getAttribute("value"));
		jobinfoshow.add(Create_job_pageobject.city.getAttribute("value"));

		jobinfoshow.add(Create_job_pageobject.state.getText());

		jobinfoshow.add(Create_job_pageobject.zipcode.getAttribute("value"));
		Select select6 = new Select(Create_job_pageobject.country);
		jobinfoshow.add(select6.getFirstSelectedOption().getText());

		
		testcase.log(Status.INFO, "get the infomation" + jobinfoshow);

		contactinfoinput.add((prop4.getProperty("companyname").substring(0, 1).toUpperCase())
				+ ((prop4.getProperty("companyname").substring(1))));
		contactinfoinput.add(propertyfile().getProperty("salutation"));
		contactinfoinput.add((propertyfile().getProperty("firstname").substring(0, 1).toUpperCase())
				+ ((propertyfile().getProperty("firstname").substring(1))));
		contactinfoinput.add((propertyfile().getProperty("lastname").substring(0, 1).toUpperCase())
				+ ((propertyfile().getProperty("lastname").substring(1))));
		contactinfoinput.add(propertyfile().getProperty("phoneno"));
		contactinfoinput.add(propertyfile().getProperty("mobileno"));
		contactinfoinput.add(propertyfile().getProperty("email"));

		contactinfoinput.add(propertyfile().getProperty("address1zip"));
		contactinfoinput.add(propertyfile().getProperty("address2zip"));
		contactinfoinput.add(propertyfile().getProperty("cityzip"));
		contactinfoinput.add(propertyfile().getProperty("state"));
		contactinfoinput.add(propertyfile().getProperty("zipcode"));
		contactinfoinput.add(propertyfile().getProperty("country"));

		int x = contactinfoinput.size();

		for (int i = 0; i <= x - 1; i++) {
			if (contactinfoinput.get(i).equals(jobinfoshow.get(i))) {
				
				testcase.log(Status.PASS, contactinfoinput.get(i) + "----" + jobinfoshow.get(i));
			} else {
				
				testcase.log(Status.FAIL, "not matched" + contactinfoinput.get(i) + "----" + jobinfoshow.get(i));
			}
		}

		if ((Create_job_pageobject.firstname.getAttribute("value") + " "
				+ Create_job_pageobject.lastname.getAttribute("value") + "-"
				+ Create_job_pageobject.companyname.getAttribute("value"))
				.equals(Add_job_pageobject.jobpagetitle.getAttribute("value"))) {
			testcase.log(Status.PASS,
					"Company title matched with given details" + Add_job_pageobject.jobpagetitle.getAttribute("value"));
		} else {
			testcase.log(Status.FAIL, "Company title * not matched with given details"
					+ Add_job_pageobject.jobpagetitle.getAttribute("value"));
		}

		Thread.sleep(2000);
		PageFactory.initElements(driver, Create_job_pageobject.class);

		Select select3 = new Select(Create_job_pageobject.salutation);
		select3.selectByIndex(3);

		if (Create_job_pageobject.firstname.getAttribute("value").isEmpty()) {
		
			testcase.log(Status.INFO, "First name field is empty we should enter the first name");
			Create_job_pageobject.firstname.sendKeys("santhosh");
		} else {
			
			testcase.log(Status.SKIP, "First name field is *not empty");

		}

		if (Create_job_pageobject.lastname.getAttribute("value").isEmpty()) {
			
			testcase.log(Status.INFO, "last name field is empty we should enter the last name");
			Create_job_pageobject.lastname.sendKeys("santhosh");
		} else {
			
			testcase.log(Status.SKIP, "last name field is *not empty");
		}

		
		if (Create_job_pageobject.address1.getAttribute("value").isEmpty()) {
			
			testcase.log(Status.INFO, " Address1 field is empty we should enter the address1");
			Create_job_pageobject.address1.sendKeys("sanfransic");
		} else {
			
			testcase.log(Status.SKIP, "Address1 field is not empty");
		}

		if (Create_job_pageobject.phone.getAttribute("value").isEmpty()) {
			
			testcase.log(Status.INFO, "Phone field is empty the photo no");
			Create_job_pageobject.phone.sendKeys("00101010");
		} else {
			
			testcase.log(Status.SKIP, "phone field is not empty");
		}

		if (Create_job_pageobject.address2.getAttribute("value").isEmpty()) {
			
			testcase.log(Status.INFO, "Address2 field is empty we should enter the address2");
			Create_job_pageobject.address2.sendKeys("united kingdom");
		} else {
			
			testcase.log(Status.SKIP, "Address2 field is not a empty");
		}
		if (Create_job_pageobject.mobile.getAttribute("value").isEmpty()) {
			
			testcase.log(Status.INFO, "Mobile field is empty we should enter the mobile no");
			Create_job_pageobject.mobile.sendKeys("97868");
		} else {
			
			testcase.log(Status.SKIP, "mobile field is not a empty");
		}

		if (Create_job_pageobject.email.getAttribute("value").isEmpty()) {
			
			testcase.log(Status.INFO, "Email fields is empty we should  enter the mail");
			Create_job_pageobject.email.sendKeys("santy@gmila.com");
		} else {
			
			testcase.log(Status.SKIP, "email fiels is *not empty");
		}

		if (Create_job_pageobject.city.getAttribute("value").isEmpty()) {
		
			testcase.log(Status.INFO, "Town/City field is empty enter the city");
			Create_job_pageobject.city.sendKeys("dertr");
		} else {
		
			testcase.log(Status.SKIP, "City field is *not empty");
		}

		if (Create_job_pageobject.zipcode.getAttribute("value").isEmpty()) {
			
			testcase.log(Status.INFO, "Zipcode is empty enter the zipcode");
			Create_job_pageobject.zipcode.sendKeys("Gu16 7h4");
			Thread.sleep(1000);
			
//			Create_job_pageobject.zipcodesearch.click();
			Thread.sleep(2000);
		} else {
			
			testcase.log(Status.SKIP, "Zipcode filed is *not empty");
		}

		if (Create_job_pageobject.source.getText().equals("Select")) {
			
			testcase.log(Status.INFO, "Zipcode is empty enter the zipcode");
			Create_job_pageobject.source.click();
			Create_job_pageobject.selectsource.click();

			Thread.sleep(2000);
		} else {
		
			testcase.log(Status.SKIP, "Source field show the desierd,selected value");
		}

		if (Create_job_pageobject.customerref.getAttribute("value").isEmpty()) {
			
			testcase.log(Status.INFO, "customeref filed is empty we should enter the cusomer ref");
			Create_job_pageobject.customerref.sendKeys("tn5656");
		} else {
			
			testcase.log(Status.SKIP, "customerref feild  is  Not empty");
		}

		if (Create_job_pageobject.additionalref.getAttribute("value").isEmpty()) {
			
			testcase.log(Status.INFO, "additionalref filed is empty  we should enter the additional ref");
			Create_job_pageobject.additionalref.sendKeys("sir123");
		} else {
			
			testcase.log(Status.SKIP, "additionalref feild  is  Not empty");
		}
		Thread.sleep(1000);
		if (Create_job_pageobject.statusnotes.getAttribute("value").isEmpty()) {
			
			testcase.log(Status.INFO, "statusnotes filed is empty  we should enter the statusnotes");
			Create_job_pageobject.statusnotes.sendKeys("sirtmhtty");
		} else {
			
			testcase.log(Status.SKIP, "statusnotes feild  is  Not empty");
		}

		if (Create_job_pageobject.checkbox5.isSelected()) {
			
			testcase.log(Status.INFO, "checkbox5 is already selected");
		} else {
			
			testcase.log(Status.SKIP, "checkbox5 is not selected");
			Create_job_pageobject.checkbox5.click();

		}

		if (Create_job_pageobject.checkbox4.isSelected()) {
			
			testcase.log(Status.INFO, "checkbox4 is already selected");
		} else {
			
			testcase.log(Status.SKIP, "checkbox4 is not selected");
			Create_job_pageobject.checkbox4.click();

		}

		Select selct2 = new Select(Create_job_pageobject.organisation);
		String actualString = selct2.getFirstSelectedOption().getText();
		List<WebElement> defaul = selct2.getOptions();
		String deString = defaul.get(0).getText();

		if (actualString.equals(deString)) {
			selct2.selectByIndex(0);
		}
		testcase.log(Status.INFO, "Select the organisation");

		Select selct3 = new Select(Create_job_pageobject.createdby);
		String actualString1 = selct3.getFirstSelectedOption().getText();
		List<WebElement> default1 = selct3.getOptions();
		String deString1 = default1.get(0).getText();

		if (actualString1.equals(deString1)) {
			selct3.selectByIndex(0);
		}
		testcase.log(Status.INFO, "Select the createdby");

		String jobrefno = Add_job_pageobject.jobrefno.getAttribute("value");
		if (jobrefno.isEmpty()) {
			
			testcase.log(Status.INFO, "jobrefno not created before save");
		} else {
			
		}

		Add_job_pageobject.savebtn.click();
		testcase.log(Status.INFO, "Click the hole save button");
		Thread.sleep(8000);

		String jobrefno2 = Add_job_pageobject.jobrefno.getAttribute("value");
		if (jobrefno2.isEmpty()) {
			
			testcase.log(Status.FAIL, "jobrefno not created");
		} else {
			
			testcase.log(Status.PASS, "jobref number generated after save the job jobrefno: " + jobrefno2);
		}

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("E:\\Testing Screenshots\\jabpage.PNG"));

//		Add_job_pageobject.contactinfobtn.click();
//		Thread.sleep(2000);
//		Add_job_pageobject.contactinfobtn.click();
	}

	public static void add_payment() throws InterruptedException {

		PageFactory.initElements(driver, Add_job_pageobject.class);
		Thread.sleep(5000);
  testcase= extents.createTest("Add payment from job page");
		Add_job_pageobject.payment.click();
		Thread.sleep(4000);
		testcase.log(Status.INFO, "Click payment tag in job page right side ");
		

		try {
			Add_job_pageobject.paymentaddbtn.click();
			testcase.log(Status.INFO, "Click add payment button");

		} catch (Throwable e) {
			Thread.sleep(2000);
			Add_job_pageobject.paymentaddplusbtn.click();
			testcase.log(Status.INFO, "Already paid Add payment plus button only visibale click the button");

		}

		
		Thread.sleep(2000);

		if (Add_job_pageobject.paymentpage.isDisplayed()) {
			
			testcase.log(Status.PASS, "payment page opened ");
		} else {
			
			testcase.log(Status.FAIL, "payment page not opened ");
		}

		Thread.sleep(2000);

		Add_job_pageobject.amount.sendKeys("sasa@");
		testcase.log(Status.INFO, "Enter alphapaters in amount field");
		String drop = Add_job_pageobject.amount.getAttribute("value");

		if (drop.isEmpty()) {
			
			testcase.log(Status.PASS, "alphapets not allowed in amount field &change ");
			Add_job_pageobject.amount.sendKeys("06");
			testcase.log(Status.PASS, "Enter current amount(number) in amount field");
		} else {
			
			testcase.log(Status.FAIL, "Enter current amount(number) in amount field");
		}
		Thread.sleep(2000);
		Select select = new Select(Add_job_pageobject.paymentmethod);
		List<WebElement> list = select.getOptions();
		int size = list.size();
		for (int i = 1; i <= size - 1; i++) {
			select.selectByIndex(i);
		}
		select.selectByIndex(3);
		testcase.log(Status.INFO, "select the payment method");
		

		Select select2 = new Select(Add_job_pageobject.paymenttype);
		List<WebElement> list1 = select2.getOptions();
		int size1 = list1.size();
		for (int i = 1; i <= size1 - 1; i++) {
			select2.selectByIndex(i);
		}
		select2.selectByIndex(1);
		testcase.log(Status.INFO, "select the payment type");
		

		Add_job_pageobject.paymentdate.click();
		testcase.log(Status.INFO, "Click payment date to select desierd date");
		Add_job_pageobject.selectpaymentdate.click();
		Thread.sleep(1000);
		testcase.log(Status.INFO, "Select desiered date");

		Add_job_pageobject.notes.sendKeys("1st payment");
		Thread.sleep(1000);
		
		testcase.log(Status.INFO, "Enter in the note field");

		Add_job_pageobject.savepayment.click();
		
		testcase.log(Status.INFO, "Click the save button to add a payment");

	}

	public static void move_account() throws InterruptedException {

		PageFactory.initElements(driver, Add_job_pageobject.class);
		Thread.sleep(5000);
		String oldwindow = driver.getWindowHandle();
		Add_job_pageobject.options.click();
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.moveToElement(Add_job_pageobject.viewaccount).click(Add_job_pageobject.viewaccount).build().perform();
		Set<String> handle = driver.getWindowHandles();

		for (String newwindow : handle) {
			driver.switchTo().window(newwindow);
		}

		Thread.sleep(5000);
	}

	public static void add_appointment_from_jobpage() throws InterruptedException, AWTException, IOException {

		PageFactory.initElements(driver, Add_job_pageobject.class);
		Thread.sleep(5000);
		testcase=extents.createTest("Add_appointment_from job page");
		
		Add_job_pageobject.appointment.click();
testcase.log(Status.INFO, "Click the appointment tag in right side on job page ");
		Thread.sleep(3000);

		try {
			Add_job_pageobject.appointmentplusbtn.click();
			testcase.log(Status.INFO, "Click add appointment button in appointment field");
		} catch (Throwable e) {
			testcase.log(Status.INFO, "Add appointment button not able to intract  due to already appointment list available ");
		}

		try {
			Add_job_pageobject.appointmentplusbtn2.click();
			testcase.log(Status.INFO, "Click add appointment plus + button in appointment field");

		} catch (Throwable e) {
			testcase.log(Status.INFO, "Add appointment plus+ button not able to intract because  appointment list not available ");
		}

		Thread.sleep(4000);

	}

	public static void add_task_from_jobpage() throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver, Add_job_pageobject.class);
		Thread.sleep(5000);
		Add_job_pageobject.task.click();

		Thread.sleep(2000);

		try {
			Add_job_pageobject.addtaskplus.click();
		} catch (Throwable e) {
			// TODO: handle exception
		}

		try {
			Add_job_pageobject.addtaskplus2.click();

		} catch (Throwable e) {
			// TODO: handle exception
		}

		Thread.sleep(5000);

	}

	public static void job_date_validation() throws InterruptedException {

		PageFactory.initElements(driver, Add_job_pageobject.class);

		Thread.sleep(3000);
		testcase = extents.createTest("Jobpage_date_validation & check invoice status");

		Add_job_pageobject.dates.click();
		Thread.sleep(1000);
		Add_job_pageobject.datesshow.click();
		Thread.sleep(1000);

		String invoiceno = Add_job_pageobject.invoiceno.getAttribute("value");
		if (invoiceno.isEmpty()) {
			
			testcase.log(Status.PASS, "invoice not created based on the job status");
		} else {
			
			testcase.log(Status.FAIL, "invoice number generated-invoice no: " + invoiceno);
		}

		// order date validation

		String orderdatebefore = Add_job_pageobject.orderdate.getAttribute("value");

		Select select5 = new Select(Add_job_pageobject.jobstatus);
		String jobstatus = select5.getFirstSelectedOption().getText();
		if (jobstatus.equalsIgnoreCase("Order")) {
			if (orderdatebefore.isEmpty()) {

				testcase.log(Status.PASS, "order date field is empty");
			} else {
				String orderdate = Add_job_pageobject.orderdate.getAttribute("value");

				testcase.log(Status.FAIL, "*order date create before order stage moved  Order date:" + orderdate);
			}

		} else {

			testcase.log(Status.INFO, "job status not in order stage(" + jobstatus
					+ ") that why we change to order stage the create order date");
			Select select = new Select(Add_job_pageobject.jobstatus);
			select.selectByVisibleText("Order");
			testcase.log(Status.INFO, "job status change to order");
			Thread.sleep(1000);
			String orderdateafter = Add_job_pageobject.orderdate.getAttribute("value");
			if (orderdateafter.isEmpty()) {
				testcase.log(Status.FAIL, "order date field is empty after order stage");
			} else {

				testcase.log(Status.PASS, "order date create after move to order stage" + orderdateafter);
			}
		}
		String orderdateafter = Add_job_pageobject.orderdate.getAttribute("value");

		// invoice date validation

		String invoicedatebefore = Add_job_pageobject.invoicedate.getAttribute("value");

		Select select6 = new Select(Add_job_pageobject.jobstatus);
		String jobstatus2 = select6.getFirstSelectedOption().getText();
		if (jobstatus2.equalsIgnoreCase("Invoiced")) {
			if (invoicedatebefore.isEmpty()) {

				testcase.log(Status.PASS, "invoice date field is empty");
			} else {
				String invoice = Add_job_pageobject.invoicedate.getAttribute("value");

				testcase.log(Status.FAIL, "*invoice date create before order stage moved  invoice date:" + invoice);
			}

		} else {

			testcase.log(Status.INFO, "job status not in invoice stage(" + jobstatus
					+ ") that why we change to invoice stage the create invoice date");
			Select select = new Select(Add_job_pageobject.jobstatus);
			select.selectByVisibleText("Invoiced");
			testcase.log(Status.INFO, "job status change to invoice");
			Thread.sleep(1000);
			String invoicedateafter = Add_job_pageobject.invoicedate.getAttribute("value");
			if (invoicedateafter.isEmpty()) {
				testcase.log(Status.FAIL, "invoice date field is empty after invoice stage");
			} else {

				testcase.log(Status.PASS, "invoice date create after move to invoice stage" + invoicedateafter);
			}
		}
		String invoicedateafter = Add_job_pageobject.invoicedate.getAttribute("value");

		String createddate = Add_job_pageobject.createddate.getAttribute("value");

		String completeddate = Add_job_pageobject.completeddate.getAttribute("value");

		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String currentdate = dateFormat.format(date);

		if ((createddate == currentdate) && (orderdateafter == currentdate) && (invoicedateafter == currentdate)) {
			testcase.log(Status.PASS, "Created date,order date&invoice date same" + createddate);
		}

		Add_job_pageobject.duedate.click();
		Thread.sleep(1000);
		Add_job_pageobject.selectcurrentdate.click();
		Thread.sleep(1000);
		Add_job_pageobject.orderdate.click();
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ENTER).perform();

		Select select2 = new Select(Add_job_pageobject.orderstatus);
		select2.selectByValue("2");
		
		testcase.log(Status.INFO, "Order status change to Ordered");
		Thread.sleep(2000);

		Add_job_pageobject.savebtn.click();
		testcase.log(Status.INFO, "After change the job status ,Click the hole save button");
		Thread.sleep(4000);

		String invoicenoafter = Add_job_pageobject.invoiceno.getAttribute("value");
		if (invoicenoafter.isEmpty()) {
			
			testcase.log(Status.FAIL, "invoice number not created after save with invoice job status");
		} else {
			
			testcase.log(Status.PASS,
					"invoice number created after save with invoice job status-invoice No: " + invoicenoafter);
		}

	}

}
