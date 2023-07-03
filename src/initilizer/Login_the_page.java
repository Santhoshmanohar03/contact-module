package initilizer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Login_the_page {
	public static  WebDriver driver;

	public static ExtentReports extents;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest testcase;

public static String file="F:\\Product related project\\Product_Creation\\src\\initilizer\\Login_information.properties";

	public static Properties propertyfile() throws IOException {

		File f=new File(file);
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		return prop;
	}

public static FileOutputStream outputStream() throws FileNotFoundException {
	  FileOutputStream outputStream = new FileOutputStream(file);
	return outputStream;

	
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
			driver.navigate().to("https://blindmatrix.software/product/form-setup/52/view-table-format");
		}
	
		
	

}
