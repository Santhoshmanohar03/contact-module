package Add_customer_scenario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact_comparison_info_pageobject {
	
	@FindBy(xpath = "(//*[@col-id='Company Name'])[4]/div/span/span/a")                
	public static WebElement selectcompany;
	
	@FindBy(xpath = "(//*[@col-id='Contact Type'])[2]/div/span/span/a")                 
	public static WebElement selectcontact;
	
	
	
	@FindBy(xpath = "(//*[text()='Choose Contact Type']//following::mat-form-field[1]//following::div[3])[1]")
	public static WebElement contacttype;
	
	@FindBy(xpath = "/html/body/app-root/main/section/app-customer/div[1]/div/span")
	public static WebElement selectedlayout;
	
	
	@FindBy(xpath = "(//*[@id='leadcontactDynamicform']/select)[1]")
	public static WebElement salutation;
	
	
	
	@FindBy(xpath = "//*[@placeholder='First Name']")
	public static WebElement firstname;
	
	@FindBy(xpath = "//*[@placeholder='Last Name']")
	public static WebElement lastname;
	
	@FindBy(xpath = "//*[@placeholder='Mobile']")
	public static WebElement mobile;
	
	@FindBy(xpath = "(//*[@placeholder='Email'])[1]")
	public static WebElement email;
	
	@FindBy(xpath = "//*[@id='contactDynamicform']/div/div")
	public static WebElement emailerr;
	
	
	@FindBy(xpath = "(//*[@placeholder='Phone'])[1]")
	public static WebElement phone;
	
	@FindBy(xpath = "//*[text()='*Only number is allowed']")
	public static WebElement phoneerrormsg;
	
	@FindBy(xpath = "//*[@placeholder='Role']")
	public static WebElement role;
	
	
	@FindBy(xpath = "(//*[@placeholder='Account Ref'])[1]")
	public static WebElement accountref;
	
	
	@FindBy(xpath = "(//*[text()='Default Contact']/following::input[1])[1]")
	public static WebElement defcontact;
	
	@FindBy(xpath = "/html/body/app-root/main/section/app-customer/div[1]/ul/li[2]/span")
	public static WebElement companyname;
	
	
	
	
	
	@FindBy(xpath = "(//*[@id='leadcontactDynamicform']/textarea)[1]")
	public static WebElement address1;
	

	@FindBy(xpath = "(//*[@id='leadcontactDynamicform']/select)[2]")
	public static WebElement addresstype;
	
	
	@FindBy(xpath = "(//*[@id='leadcontactDynamicform']/textarea)[2]")
	public static WebElement address2;
	
	@FindBy(xpath = "(//*[text()='Town / City']/following::input[1])[1]")
	public static WebElement city;
	
//	@FindBy(xpath = "(//*[text()='Source']//following::mat-form-field[1]//following::div[3])[8]")
//	public static WebElement source;
//	
//	@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/div/mat-option[3]")
//	public static WebElement selectsource;
	
	@FindBy(xpath = "//*[@id='leadcontactDynamicform']/div/mat-form-field/div/div[1]/div/mat-select/div/div[1]")
	public static WebElement state;
	
	@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/div/mat-option[42]")
	public static WebElement selectstate;
	
	@FindBy(xpath = "(//*[@id='contact_zipcodepostcode'])[1]")
	public static WebElement zipcode;
	
	@FindBy(xpath = "//*[@id='contactDynamicform']/span/i")
	public static WebElement zipcodesearch;
	
	@FindBy(xpath = "(//*[@id='leadcontactDynamicform']/select)[3]")
	public static WebElement country;
	
	@FindBy(xpath = "//*[@id='leadcustform']/div[2]/button[2]")
	public static WebElement close;
	
	@FindBy(xpath = "(//*[@placeholder='Currency'])[1]")
	public static WebElement currency;
	
	@FindBy(xpath = "//*[@id='leadcustform']/div[2]/button[1]")
	public static WebElement savebtn;
	
	@FindBy(xpath = "(//*[@name='ismarketingemails'])[1]")
	public static WebElement mailcheckboxyes;
	
	@FindBy(xpath = "(//*[@name='isdocumentreceived'])[1]")
	public static WebElement documentcheckbox;
	
	@FindBy(xpath = "(//*[@name='isonlineportal'])[1]")
	public static WebElement onlinecheckbox;
	
	
	
	@FindBy(xpath = "//*[@id='yes1']/following::i")
	public static WebElement documentsetting;
	
	@FindBy(xpath = "//*[@id='dynamic0']")
	public static WebElement setting1;
	
	@FindBy(xpath = "//*[@id='dynamic1']")
	public static WebElement setting2;
	
	@FindBy(xpath = "//*[@id='dynamic2']")
	public static WebElement setting3;
	
	@FindBy(xpath = "//*[@id='dynamic3']")
	public static WebElement setting4;
	
	@FindBy(xpath = "//*[@id='dynamic4']")
	public static WebElement setting5;
	
	@FindBy(xpath = "//*[@id='dynamic5']")
	public static WebElement setting6;
	
	@FindBy(xpath = "//*[@placeholder='Enter Your Name']")
	public static WebElement username;
	
	@FindBy(xpath = "//*[@placeholder='Enter Your password']")
	public static WebElement password;
	
	@FindBy(xpath = "//*[@placeholder='Enter Your Conform password']")
	public static WebElement confirmpassword;
	
	@FindBy(xpath = "//*[text()='Set Configure ']")
	public static WebElement setconfigure;
	
	@FindBy(xpath = "//*[@id='custform']/div[2]/button[2]")
	public static WebElement cancelbtn;
	
	//@FindBy(xpath = "//*[@placeholder='Email Address1']")
	//public static WebElement emailaddress;
	
	@FindBy(xpath = "(//*[text()='Check Box1'])[1]/following::input[1]")
	public static WebElement checkbox1;
	
	
	@FindBy(xpath = "(//*[@id='yes'])[1]")
	public static WebElement radiobtn;
	
	@FindBy(xpath = "(//*[@id='no'])[1]")
	public static WebElement radiobtn1;
	
	@FindBy(xpath = "(//*[text()='Date & Time'])[1]/following::input[1]")
	public static WebElement date1;
	
	@FindBy(xpath = "//*[@class='igx-calendar__body-row']/following::div[1]/following::igx-day-item[3]/span")
	public static WebElement selectdate1;
	

	
//	//@FindBy(xpath = "//*[@id='custform']/div[1]/div/div[6]/div/div[9]/div/div[2]/app-dynamic-field/input")
//	public static WebElement number;
	
	@FindBy(xpath = "(//*[text()='Single Line'])[1]/following::input[1]")
	public static WebElement singleline;
	
	@FindBy(xpath = "//*[text()='*Only number is allowed']")
	public static WebElement numbererrmsg;
	
	@FindBy(xpath = "(//*[@class='e-input e-lib e-keyboard e-datetimepicker'])[1]")
	public static WebElement datetime;
	

	@FindBy(xpath = "(//*[@class='e-input e-lib e-keyboard e-datetimepicker']/following::span[3])[1]")
	public static WebElement time;
	
	@FindBy(xpath = "(//*[@id='leadcontactDynamicform']/select)[4]")
	public static WebElement dropdown;
	
	@FindBy(xpath = "(//*[text()='Multiple Line'])[1]/following::textarea[1]")
	public static WebElement multipleline;
	
	@FindBy(xpath = "//*[@id='contactDynamicform']/ng-multiselect-dropdown/div/div[1]/span")
	public static WebElement multipleselect;
	
	@FindBy(xpath = "//*[@id='contactDynamicform']/ng-multiselect-dropdown/div/div[2]/ul[2]/li[1]/div")
	public static WebElement selectmultipleselect;

	
	@FindBy(xpath = "//*[text()='Add New Source']")
	public static WebElement addnewsource;

	@FindBy(xpath = "(//*[@id='userdefinedoptionsdynamicForm']/div/div/div[2]/div[1]/div[2]/div/div[1]/button)[2]")
	public static WebElement addplusbtn;

	@FindBy(xpath = "//*[@id='addtext']")
	public static WebElement addnewtext;


	@FindBy(xpath = "//*[@id='userdefinedoptionsdynamicForm']/div/div/div[2]/div[2]/div/div[3]/div/button[1]")
	public static WebElement savenewsourcebtn;

	
	@FindBy(xpath = "//*[@id='userdefinedoptionsdynamicForm']/div/div/div[1]/span/i")
	public static WebElement closeaddsourcepage;

	@FindBy(xpath = "//*[@id='selectedoption']/option[6]")
	public static WebElement option6;

	@FindBy(xpath = "//*[@id='selectedoption']/option[5]")
	public static WebElement option5;

	

	@FindBy(xpath = "//*[@id='custform']/div[1]/div/div[4]/div[1]/div[1]/div/div[2]/div/div")
	public static WebElement companysuggetion;
	
	@FindBy(xpath = "//*[@id='custform']/div[1]/div/div[4]/div[1]/div[1]/div/div[2]/div/div/div/div/p[1]")
	public static WebElement companysuggselect;
	
	@FindBy(xpath = "//*[@class='alert-load ng-star-inserted']")
	public static WebElement newcompanytoast;

	

}
