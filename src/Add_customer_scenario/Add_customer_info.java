package Add_customer_scenario;

import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.security.PublicKey;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

//import Add_Supplier_Scenario.Add_Customer_pageobject;
import Add_Supplier_Scenario.Add_First_layout_pageobject;
import Check_View_Modification_fun.View_modification_Pageobject;
import Initilaizer.login_the_page;
import Pricing_configure.Pricing_configure_pageobject;

public class Add_customer_info extends login_the_page {
	

	public static void Check_new_contacttype() throws InterruptedException, IOException {
		

		PageFactory.initElements(driver, Add_Customer_pageobject.class);

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("E:\\Testing Screenshots\\contactmoduleopen.PNG"));

		testcase = extents.createTest("Click the add button to add new customer");
		Thread.sleep(10000);
		
		
		
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		WebElement scrollbar=driver.findElement(By.xpath("//*[@id=\"cont_contact\"]/div/div[2]/div[2]/div[3]"));
//			js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", scrollbar);
//		js.executeScript("window.scrollBy(0,250)");
		
		
		
		
		

		Add_Customer_pageobject.addbtn.click();
		
		testcase.log(Status.PASS, "Click Add button");

		Add_Customer_pageobject.customerbtn.click();
		Thread.sleep(3000);
		Add_Customer_pageobject.contacttype.click();
		Add_Customer_pageobject.selectcontacttrade.click();

		
		testcase.log(Status.PASS, "Select Tradee contact type ");

		Add_Customer_pageobject.nextbtn.click();
	
		testcase.log(Status.PASS, "Click the next button to Open the Trade contact type customer Add Page ");
	}

	public static void Add_New_Customer_info() throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver, Add_Customer_pageobject.class);
		Thread.sleep(4000);
//		Select select = new Select(Add_Customer_pageobject.chooselayout);
//		select.selectByVisibleText("Automation");
		Thread.sleep(2000);

		testcase = extents.createTest("Add new customer information");

		if (Add_Customer_pageobject.addcustomerheading.isDisplayed()) {
			String heading = Add_Customer_pageobject.addcustomerheading.getText();

			
			testcase.log(Status.PASS, "Add Customer page is displayed successfully: " + heading);
		} else {
		
			testcase.log(Status.FAIL, "Add Customer page is not displayed ");
		}

		if (propertyfile().getProperty("contact_type").equals(Add_Customer_pageobject.contacttypeshow.getText())) {
			String contactty = Add_Customer_pageobject.contacttypeshow.getText();
			testcase.log(Status.PASS, "Selected Contact type show currectly:  " + contactty);
		} else {
			testcase.log(Status.FAIL, "Selected Contact type *not show currectly ");
		}

		Select select = new Select(Add_Customer_pageobject.chooselayout);
		select.selectByVisibleText(propertyfile().getProperty("layout"));

		Thread.sleep(1000);
		Select seselect = new Select(Add_Customer_pageobject.salutation);
		List<WebElement> list1 = seselect.getOptions();
		int size1 = list1.size();
		for (int i = 0; i <= size1 - 1; i++) {
			seselect.selectByIndex(i);
		}
		
		seselect.selectByVisibleText(propertyfile().getProperty("salutation"));
		
		testcase.log(Status.PASS, "Select salutation");

		Add_Customer_pageobject.firstname.sendKeys(propertyfile().getProperty("firstname"));
		
		testcase.log(Status.INFO, "Enter the first name");
		Thread.sleep(1000);
		String firstname = Add_Customer_pageobject.firstname.getAttribute("value");
		if (firstname.toUpperCase().charAt(0) == firstname.charAt(0)) {
			testcase.log(Status.PASS, "Firstname Firstcharater change to upper case");
			
		} else {
			
			testcase.log(Status.PASS, "Firstname Firstcharater not change to upper case");
		}

		Add_Customer_pageobject.lastname.sendKeys(propertyfile().getProperty("lastname"));
		
		testcase.log(Status.INFO, "Enter the last name");
		Thread.sleep(1000);
		String lastname = Add_Customer_pageobject.lastname.getAttribute("value");
		if (lastname.toUpperCase().charAt(0) == lastname.charAt(0)) {
			
			testcase.log(Status.PASS, "lastname Firstcharater change to upper case");
		} else {
			
			testcase.log(Status.FAIL, "lastname Firstcharater not change to upper case");
		}

		Add_Customer_pageobject.email.sendKeys("shalini");
	
		testcase.log(Status.INFO, "lastname Firstcharater not change to upper case");
		if (Add_Customer_pageobject.emailerr.isDisplayed()) {
			String actualemailerror = Add_Customer_pageobject.emailerr.getText();
			
			testcase.log(Status.PASS, "Enter invalid mail id error shown:" + actualemailerror);

		} else {
			
			testcase.log(Status.FAIL, "error message not shows");
		}
		Add_Customer_pageobject.email.clear();
		
		testcase.log(Status.INFO, "Clear the invalid mail ");
		Add_Customer_pageobject.email.sendKeys(propertyfile().getProperty("email"));
		
		testcase.log(Status.INFO, "Enter valid Mail id");

		Add_Customer_pageobject.accountref.sendKeys(propertyfile().getProperty("accountref"));
		
		testcase.log(Status.INFO, "Enter Account ref");
		Thread.sleep(1000);
		String accountref = Add_Customer_pageobject.accountref.getAttribute("value");
		if (accountref.toUpperCase().charAt(0) == accountref.charAt(0)) {
			
			testcase.log(Status.PASS, "accountref Firstcharater change to upper case");
		} else {
			
			testcase.log(Status.FAIL, "lastname Firstcharater not change to upper case");
		}

		Add_Customer_pageobject.phone.sendKeys("sds");
		
		testcase.log(Status.INFO, "Enter invalid text not a number enter to check error message showing or not");
		Thread.sleep(1000);
		if (Add_Customer_pageobject.phoneerrormsg.isDisplayed()) {
			String text = Add_Customer_pageobject.phoneerrormsg.getText();
			
			testcase.log(Status.PASS, "ErroR showns: " + text);

		} else {
			
			testcase.log(Status.FAIL, "invalid error message not shows");
		}
		Add_Customer_pageobject.phone.clear();
		
		testcase.log(Status.INFO, "Clear the invalid text in phone text box");
		Add_Customer_pageobject.phone.sendKeys(propertyfile().getProperty("phoneno"));
		
		testcase.log(Status.INFO, "Enter valid phone number");

		Add_Customer_pageobject.mobile.sendKeys("sds");
		Thread.sleep(1000);
		
		testcase.log(Status.INFO, "Enter invalid text not a number enter to check error message showing or not");

		if (Add_Customer_pageobject.phoneerrormsg.isDisplayed()) {
			String text = Add_Customer_pageobject.phoneerrormsg.getText();
			
			testcase.log(Status.PASS, " if enter alphapate in mobile field ErroR showns: " + text);

		} else {
			
			testcase.log(Status.FAIL, "invalid error message not shows");
		}
		
		
		Add_Customer_pageobject.mobile.clear();
		
		testcase.log(Status.INFO, "Clear the invalid text in mobile text box");

		Add_Customer_pageobject.mobile.sendKeys(propertyfile().getProperty("mobileno"));
		
		testcase.log(Status.INFO, "Enter the mobile nuber after clear invalid mobile number");

		Add_Customer_pageobject.role.sendKeys(propertyfile().getProperty("role"));
		
		testcase.log(Status.INFO, "Enter the role on text field");

		Thread.sleep(1000);
		String role = Add_Customer_pageobject.role.getAttribute("value");
		if (role.toUpperCase().charAt(0) == role.charAt(0)) {
		
			testcase.log(Status.PASS, "role Firstcharater change to upper case");
		} else {
			
			testcase.log(Status.FAIL, "role Firstcharcater not change to upper case");
		}

		String s = "yes";
		if (propertyfile().getProperty("default_contact").equals(s)) {
			Add_Customer_pageobject.defcontact.click();
			
			testcase.log(Status.INFO, "click the defcontact");
		} else {

			String d = propertyfile().getProperty("default_contact");
			testcase.log(Status.INFO, "not click the defcontact");
		}

		if (Add_Customer_pageobject.defcontact.isSelected()) {
			
			testcase.log(Status.PASS, "Default contact selected succesfully");
		} else {
			
			testcase.log(Status.FAIL, "Default contact not able to click ");
		}


		File f=new File("F:\\New folder (2)\\Add_Contact_module\\src\\Add_customer_scenario\\company.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop4=new Properties();
		prop4.load(fis);
		
		
		Add_Customer_pageobject.companyname.sendKeys(prop4.getProperty("companyname")); // ***company name
		Thread.sleep(5000);

		
		String companystring =prop4.getProperty("companyname").replaceAll("[^0-9]", ""); 
		int nameInt = Integer.parseInt(companystring);
		nameInt++;
		String nameplus = prop4.getProperty("companyname").replaceAll("[0-9]", "") + String.format("%02d", nameInt); 
		System.out.println(nameplus);
		prop4.setProperty("companyname", nameplus);
	
		
		testcase.log(Status.INFO, "Enter the company name");
		String companyname = Add_Customer_pageobject.companyname.getAttribute("value");
		if (companyname.toUpperCase().charAt(0) == companyname.charAt(0)) {
			
			testcase.log(Status.PASS, "companyname Firstcharater change to upper case");
		} else {
			
			testcase.log(Status.FAIL, "companyname Firstcharater not change to upper case");
		}

		try {
			if (Add_Customer_pageobject.suggestion.isDisplayed()) {
				
				testcase.log(Status.INFO, "Already this company exits suggestion showed");
			
//				Add_Customer_pageobject.selectcompany.click();
			} else {
				testcase.log(Status.INFO, "this company name is new");
			}
		} catch (Throwable e) {

		}

		Add_Customer_pageobject.source.click();
		
		testcase.log(Status.INFO, "Click the Source field");
		
		
		String sourcepath = "//*[contains(text(),'" + propertyfile().getProperty("source") + "')]";

		WebElement source = driver.findElement(By.xpath(sourcepath));
		source.click();
		

//		Add_Customer_pageobject.selectsource.click();
//		log.info("Select the source 'santhosh'");
//		testcase.log(Status.INFO, "Select the source 'santhosh'");

		Thread.sleep(2000);

		Select addressselect = new Select(Add_Customer_pageobject.addresstype);
		List<WebElement> list2 = addressselect.getOptions();
		int size2 = list2.size();
		for (int i = 0; i <= size2 - 1; i++) {
			addressselect.selectByIndex(i);
		}
		
		testcase.log(Status.INFO, "Select Address Type");

		Add_Customer_pageobject.address1.sendKeys(propertyfile().getProperty("address1"));
		
		testcase.log(Status.INFO, "Enter the Address1 in text box");

		Add_Customer_pageobject.address2.sendKeys(propertyfile().getProperty("address2"));
	
		testcase.log(Status.INFO, "Enter the Address2 in text box");

		Add_Customer_pageobject.city.sendKeys(propertyfile().getProperty("city"));
		
		testcase.log(Status.INFO, "Enter the city in text box");

		Add_Customer_pageobject.zipcode.sendKeys(propertyfile().getProperty("zipcode"));
		
		testcase.log(Status.INFO, "Enter the Zipcode in text box");

		Thread.sleep(2000);
		Add_Customer_pageobject.zipcodesearch.click();
		
		testcase.log(Status.INFO, "Click zipcode search field");

//		
//		Add_Customer_pageobject.source.click();
//		log.info("Click the Source field");
//		Thread.sleep(4000);
//		Add_Customer_pageobject.addnewsource.click();
//		Thread.sleep(6000);
//		Add_Customer_pageobject.addplusbtn.click();
//		Thread.sleep(4000);
//		Add_Customer_pageobject.addnewtext.sendKeys("automation");
//		Thread.sleep(1000);
//		Add_Customer_pageobject.savenewsourcebtn.click();
//		Actions action=new Actions(driver);
//		
//		action.clickAndHold(Add_Customer_pageobject.option5)
//		.moveToElement(Add_Customer_pageobject.option6)
//		.release(Add_Customer_pageobject.option6).perform();
//		

		Select coselect = new Select(Add_Customer_pageobject.country);
		coselect.selectByVisibleText(propertyfile().getProperty("country"));
		
		testcase.log(Status.INFO, "Select the country");
		Thread.sleep(3000);

		Add_Customer_pageobject.state.click();
		
		testcase.log(Status.INFO, "Click the state field");
		Thread.sleep(2000);
//		Add_Customer_pageobject.selectstate.click();
//		String statpath = "(//*[contains(text(),'" + propertyfile().getProperty("state") + "')])[2]";

		String statepath="//*[text()='"+propertyfile().getProperty("state")+"']";
		
		
		WebElement state = driver.findElement(By.xpath(statepath));
		
		
	
		
		
		state.click();

		
		testcase.log(Status.INFO, "Select the desierd state");
		Thread.sleep(2000);

//		List<WebElement> list3 = coselect.getOptions();
//		int size3 = list3.size();
//
//		for (int i = 0; i <= size3 - 1; i++) {
//
//			coselect.selectByIndex(i);
//
//		}

		String verify = Add_Customer_pageobject.currency.getAttribute("value");

		
		testcase.log(Status.INFO, "currency shown; " + verify);

		// Add_Customer_pageobject.emailaddress.sendKeys("san@gmail");

		Thread.sleep(1000);

		Add_Customer_pageobject.radiobtn.click();
		testcase.log(Status.INFO, "Click the radio button");

		Add_Customer_pageobject.radiobtn1.click();
		testcase.log(Status.INFO, "Click the radio button1");
		Add_Customer_pageobject.checkbox1.click();
		testcase.log(Status.INFO, "Click the Checkbox1");

//		Add_Customer_pageobject.date.click();
//		Thread.sleep(1000);
//		Add_Customer_pageobject.selectdate.click();
//		Thread.sleep(1000);

//		Add_Customer_pageobject.date1.click();
//		Thread.sleep(1000);
//		Add_Customer_pageobject.selectdate1.click();
//		Thread.sleep(1000);

		Add_Customer_pageobject.datetime.click();

		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		Add_Customer_pageobject.time.click();
		Actions action2 = new Actions(driver);
		action2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		testcase.log(Status.INFO, "Select Date &Time");

		Thread.sleep(2000);
		

		Add_Customer_pageobject.singleline.sendKeys(propertyfile().getProperty("singleline"));
		Thread.sleep(1000);
		Add_Customer_pageobject.multipleline.sendKeys(propertyfile().getProperty("multiline"));

		Select select3 = new Select(Add_Customer_pageobject.dropdown);
		select3.selectByIndex(1);

		Add_Customer_pageobject.multipleselect.click();
		Thread.sleep(1000);
		Add_Customer_pageobject.selectmultipleselect.click();

		Add_Customer_pageobject.mailcheckboxyes.click();

		

		Add_Customer_pageobject.documentcheckbox.click();
		

		Add_Customer_pageobject.documentsetting.click();
		
		Thread.sleep(3000);
		Actions action1 = new Actions(driver);
		action1.moveToElement(Add_Customer_pageobject.setting3).click().perform();
		action1.moveToElement(Add_Customer_pageobject.setting2).click().perform();
		action1.moveToElement(Add_Customer_pageobject.setting1).click().perform();
		action1.moveToElement(Add_Customer_pageobject.setting4).click().perform();
		action1.moveToElement(Add_Customer_pageobject.setting5).click().perform();
		action1.moveToElement(Add_Customer_pageobject.setting6).click().release().perform();

		Thread.sleep(3000);
		
		Add_Customer_pageobject.onlinecheckbox.click();
		action1.moveToElement(Add_Customer_pageobject.setconfigure).click().perform();
		
		action1.moveToElement(Add_Customer_pageobject.username).click().sendKeys(prop4.getProperty("username")).perform();
		
		action1.moveToElement(Add_Customer_pageobject.password).click().sendKeys("12345").perform();
		
		action1.moveToElement(Add_Customer_pageobject.confirmpassword).click().sendKeys("12345").perform();
		
		String userstring =prop4.getProperty("username").replaceAll("[^0-9]", ""); 
		int userInt = Integer.parseInt(userstring);
		userInt++;
		String userplus = prop4.getProperty("username").replaceAll("[0-9]", "") + String.format("%02d", userInt); 
		System.out.println(userplus);
		prop4.setProperty("username", userplus);
		
		Thread.sleep(2000);
		Add_Customer_pageobject.savebtn.click();
		Thread.sleep(2000);
		FileOutputStream outputStream = new FileOutputStream(f);
		 prop4.store(outputStream, prop4.getProperty(""));
		 outputStream.close();
	}
public static void conductsave() throws InterruptedException {
	PageFactory.initElements(driver, Add_Customer_pageobject.class);

		Add_Customer_pageobject.savebtn.click();
		Thread.sleep(2000);
		
}
		
	
		


	}


