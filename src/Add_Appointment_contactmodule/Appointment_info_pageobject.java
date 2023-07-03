package Add_Appointment_contactmodule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Appointment_info_pageobject {

	@FindBy(xpath = "//*[@id='inputPassword']")
	public static WebElement globalinfo;
	
	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/select)[1]")
	public static WebElement salutation;

	
	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/select)[2]")
	public static WebElement country;
	
	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/select)[3]")
	public static WebElement conacttype;
	
	
	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/select)[4]")
	public static WebElement organisation;
	
	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/select)[5]")
	public static WebElement createdby;
	
	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/select)[6]")
	public static WebElement dropdown2;

	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/input)[1]")
	public static WebElement companyname;
	

	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/input)[2]")
	public static WebElement phone;
	

	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/input)[3]")
	public static WebElement firstname;
	
	

	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/input)[4]")
	public static WebElement lastname;
	

	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/input)[5]")
	public static WebElement mobile;
	

	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/input)[6]")
	public static WebElement email;
	

	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/input)[7]")
	public static WebElement website;
	
	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/input)[9]")
	public static WebElement zipcode;


	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/input)[8]")
	public static WebElement city;
	
	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/input)[10]")
	public static WebElement checkbox3;
	
	@FindBy(xpath = "//*[@id='cont_contact']/div/div[2]/div[2]/div[3]/div[3]/div[1]/div[1]/div")
	public static WebElement radiobutton2;

	
	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/input)[11]")
	public static WebElement customerref;
	
	
	
	
	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/input)[12]")
	public static WebElement statusnotes;
	
	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/input)[13]")
	public static WebElement additionalnotes;
	
	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/input)[14]")
	public static WebElement checkbox2;
	
	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/input)[15	]")
	public static WebElement singleline;
	
	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/textarea)[1]")
	public static WebElement address1;
	
	@FindBy(xpath = "(//*[@id='commonappointmentDynamicform']/textarea)[2]")
	public static WebElement address2;
	
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
	
	@FindBy(xpath = "//*[@id='commonappointmentDynamicform']/div/mat-form-field/div/div[1]/div/mat-select/div/div[1]")
	public static WebElement state;
	
	@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/div/mat-option[42]")
	public static WebElement stateselect;
	
	
	@FindBy(xpath = "//*[@id='commonappointmentDynamicform']/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span")
	public static WebElement source;
	
	@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/div/mat-option[4]")
	public static WebElement selectsource;
	
	@FindBy(xpath = "//*[@id='15']")
	public static WebElement field;
	
	
}
