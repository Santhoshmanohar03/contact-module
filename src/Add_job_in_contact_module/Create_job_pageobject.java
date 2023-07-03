package Add_job_in_contact_module;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Create_job_pageobject {

		@FindBy(xpath = "(//*[@id='Dynamicform']/select)[1]")
		public static WebElement salutation;

		
		@FindBy(xpath = "(//*[@id='Dynamicform']/select)[2]")
		public static WebElement country;
		
		@FindBy(xpath = "(//*[@id='Dynamicform']/select)[3]")
		public static WebElement conacttype;
		
		
		@FindBy(xpath = "(//*[@id='Dynamicform']/select)[4]")
		public static WebElement organisation;
		
		@FindBy(xpath = "(//*[@id='Dynamicform']/select)[5]")
		public static WebElement createdby;
		
		@FindBy(xpath = "(//*[@id='Dynamicform']/input)[1]")
		public static WebElement companyname;
		

		@FindBy(xpath = "(//*[@id='Dynamicform']/input)[2]")
		public static WebElement firstname;
		

		@FindBy(xpath = "(//*[@id='Dynamicform']/input)[7]")
		public static WebElement website;
		
		

		@FindBy(xpath = "(//*[@id='Dynamicform']/input)[3]")
		public static WebElement lastname;
		

		@FindBy(xpath = "(//*[@id='Dynamicform']/input)[4]")
		public static WebElement phone;
		

		@FindBy(xpath = "(//*[@id='Dynamicform']/input)[5]")
		public static WebElement mobile;
		

		@FindBy(xpath = "(//*[@id='Dynamicform']/input)[6]")
		public static WebElement email;
		
		@FindBy(xpath = "(//*[@id='Dynamicform']/input)[8]")
		public static WebElement city;
		
		@FindBy(xpath = "//*[@id='job_zipcodepostcode']")
		public static WebElement zipcode;
		
		@FindBy(xpath = "//*[@id='Dynamicform']/span/i")
		public static WebElement zipcodesearch;

		@FindBy(xpath = "(//*[@id='Dynamicform']/input)[10]")
		public static WebElement checkbox5;
		
		@FindBy(xpath = "(//*[@id='Dynamicform']/input)[12]")
		public static WebElement checkbox4;
		
		@FindBy(xpath = "(//*[@id='Dynamicform']/textarea)[1]")
		public static WebElement address1;
		
		@FindBy(xpath = "(//*[@id='Dynamicform']/textarea)[2]")
		public static WebElement address2;
		
//		@FindBy(xpath = "//*[@id='cont_contact']/div/div[2]/div[2]/div[3]/div[3]/div[1]/div[1]/div")
//		public static WebElement radiobutton2;

		
		@FindBy(xpath = "(//*[@id='Dynamicform']/input)[9]")
		public static WebElement customerref;
		
		
		
		
		@FindBy(xpath = "(//*[@id='Dynamicform']/input)[13]")
		public static WebElement statusnotes;
		
		@FindBy(xpath = "(//*[@id='Dynamicform']/input)[11]")
		public static WebElement additionalref;
		
//		@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/input)[14]")
//		public static WebElement checkbox2;
//		
//		@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/input)[15	]")
//		public static WebElement singleline;
		
		
		
		@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/textarea)[3]")
		public static WebElement multiline;
		
		@FindBy(xpath = "(//*[@id='yes'])[2]")
		public static WebElement radiobtn2yes;
		
		@FindBy(xpath = "(//*[@id='no'])[1]")
		public static WebElement radiobtn2no;
		
		
		@FindBy(xpath = "(//*[@id='ok'])[1]")
		public static WebElement radiobtn3ok;
		
		@FindBy(xpath = "(//*[@id='cancel'])[1]")
		public static WebElement radiobtn2cancel;
		
		@FindBy(xpath = "//*[@id='Dynamicform']/div/mat-form-field/div/div[1]/div/mat-select/div/div[1]")
		public static WebElement state;
		
		@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/div/mat-option[42]")
		public static WebElement stateselect;
		
		
		@FindBy(xpath = "//*[@id='Dynamicform']/mat-form-field/div/div[1]/div/mat-select/div/div[1]")
		public static WebElement source;
		
		@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/div/mat-option[3]")
		public static WebElement selectsource;
		
		@FindBy(xpath = "//*[@id='15']")
		public static WebElement field;
		
		
	}


