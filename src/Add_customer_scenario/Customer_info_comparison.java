package Add_customer_scenario;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import Add_job_in_contact_module.Ordering_page;
import Initilaizer.login_the_page;



public class Customer_info_comparison extends login_the_page {
	public static List<String> contactinfo2= new ArrayList<String>();
	public static List<String> contactinfoinput= new ArrayList<String>();
	
	
	
	
	public static void get_the_customer_info() throws InterruptedException, IOException {
		PageFactory.initElements(driver, Contact_comparison_info_pageobject.class);
		Thread.sleep(8000);
		testcase = extents.createTest("Get_the_customer_info and compare given details agains showing");
	
		
		File f=new File("F:\\New folder (2)\\Add_Contact_module\\src\\Add_customer_scenario\\company.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop4=new Properties();
		prop4.load(fis);
		
		
		
//	try {
////		String company = "//*[contains(text(),'" + propertyfile().getProperty("companyname") + "')]";
//		
//		String company = "//*[text()=' " + propertyfile().getProperty("companyname") + " ']";
//		
//		
//		
//		WebElement select = driver.findElement(By.xpath(company));
//		select.click();
//	} catch (Throwable e) {
//		Thread.sleep(2000);
////		Contact_comparison_info_pageobject.selectcontact.click();
//	}
	
	try {
		Thread.sleep(2000);
		Contact_comparison_info_pageobject.selectcompany.click();
	} catch (Throwable e) {
		Contact_comparison_info_pageobject.selectcontact.click();
	}
	testcase.log(Status.INFO, "Select company to view the contact details");
	
	Thread.sleep(8000);
	contactinfo2.add(Contact_comparison_info_pageobject.selectedlayout.getText());
	contactinfo2.add(Contact_comparison_info_pageobject.companyname.getText());
	
	Select select = new Select(Contact_comparison_info_pageobject.salutation);
	contactinfo2.add(select.getFirstSelectedOption().getText());
	contactinfo2.add(Contact_comparison_info_pageobject.firstname.getAttribute("value"));
	contactinfo2.add(Contact_comparison_info_pageobject.lastname.getAttribute("value"));
	contactinfo2.add(Contact_comparison_info_pageobject.phone.getAttribute("value"));
	contactinfo2.add(Contact_comparison_info_pageobject.mobile.getAttribute("value"));
	contactinfo2.add(Contact_comparison_info_pageobject.email.getAttribute("value"));
	contactinfo2.add(Contact_comparison_info_pageobject.role.getAttribute("value"));
	
	contactinfo2.add(Contact_comparison_info_pageobject.address1.getAttribute("value"));

	contactinfo2.add(Contact_comparison_info_pageobject.address2.getAttribute("value"));
	contactinfo2.add(Contact_comparison_info_pageobject.city.getAttribute("value"));

	contactinfo2.add(Contact_comparison_info_pageobject.state.getText().trim());

	contactinfo2.add(Contact_comparison_info_pageobject.zipcode.getAttribute("value"));
	Select select2 = new Select(Contact_comparison_info_pageobject.country);
	contactinfo2.add(select2.getFirstSelectedOption().getText());
	

	
	testcase.log(Status.INFO, "get the infomation"+contactinfo2);
	
	contactinfoinput.add(propertyfile().getProperty("layout"));
	contactinfoinput.add((prop4.getProperty("companyname").substring(0, 1).toUpperCase())+((prop4.getProperty("companyname").substring(1))));
	contactinfoinput.add(propertyfile().getProperty("salutation"));
	contactinfoinput.add((propertyfile().getProperty("firstname").substring(0, 1).toUpperCase())+((propertyfile().getProperty("firstname").substring(1))));
	contactinfoinput.add((propertyfile().getProperty("lastname").substring(0, 1).toUpperCase())+((propertyfile().getProperty("lastname").substring(1))));
	contactinfoinput.add(propertyfile().getProperty("phoneno"));
	contactinfoinput.add(propertyfile().getProperty("mobileno"));
	contactinfoinput.add(propertyfile().getProperty("email"));
	contactinfoinput.add((propertyfile().getProperty("role").substring(0, 1).toUpperCase())+((propertyfile().getProperty("role").substring(1))));
	contactinfoinput.add(propertyfile().getProperty("address1zip"));
	contactinfoinput.add(propertyfile().getProperty("address2zip"));
	contactinfoinput.add(propertyfile().getProperty("cityzip"));
	contactinfoinput.add(propertyfile().getProperty("state").trim());
	contactinfoinput.add(propertyfile().getProperty("zipcode"));
	contactinfoinput.add(propertyfile().getProperty("country"));
	
	

	int x = contactinfoinput.size();
	for (int i = 0; i <= x - 1; i++) {
		if (contactinfoinput.get(i).equals(contactinfo2.get(i))) {
			
			testcase.log(Status.PASS, contactinfoinput.get(i) + "----" + contactinfo2.get(i));
		} else {
			
			testcase.log(Status.FAIL, "not matched" + contactinfoinput.get(i) + "----" + contactinfo2.get(i));
		}
	}
Thread.sleep(2000);
	
	driver.navigate().back();
	testcase.log(Status.INFO, "navigate to back ");


	}
	

}
