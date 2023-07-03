package Initilaizer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

//import Exits_Customer_page.Exits_customer_pageobject;

public class login_the_page {

public static  WebDriver driver;

public static ExtentReports extents;
public static ExtentHtmlReporter htmlReporter;
public static ExtentTest testcase;



public static Properties propertyfile() throws IOException {

	File f=new File("F:\\New folder (2)\\Add_Contact_module\\src\\Initilaizer\\add_information.properties");
	FileInputStream fis=new FileInputStream(f);
	Properties prop=new Properties();
	prop.load(fis);
	return prop;
}


	public static void login_the_application() throws IOException {
		
		PageFactory.initElements(driver, login_pageobject.class);
	
		testcase=extents.createTest("Login the page with valid values");
	
		login_pageobject.companyname.sendKeys(propertyfile().getProperty("companynamelogin"));
		
		testcase.log(Status.PASS, "Enter the company name");
		
	
		login_pageobject.username.sendKeys(propertyfile().getProperty("usenamelogin"));
		
		testcase.log(Status.PASS, "Enter the user name");
		
		
		login_pageobject.password.sendKeys(propertyfile().getProperty("passwordlogin"));
	
		testcase.log(Status.PASS, "Enter the Password");
		
		
		login_pageobject.loginbutton.click();;
	
		testcase.log(Status.PASS, "Click the login Button");
	}
	
	
	public static void switchto() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().to("https://curtainmatrix.co.uk/finaltesting/contacts");
	}
	
	public static void Move_To_Contact_module() throws InterruptedException {
		PageFactory.initElements(driver, login_pageobject.class);
		
		Thread.sleep(12000);
		login_pageobject.contactbtn.click();
	}
	
	
	public static void closecustomerpage() throws InterruptedException {
		PageFactory.initElements(driver, login_pageobject.class);
		Thread.sleep(2000);
		login_pageobject.leadscustomers.click();
		Thread.sleep(1000);
	}
	

}
