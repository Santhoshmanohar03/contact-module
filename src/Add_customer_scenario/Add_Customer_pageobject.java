package Add_customer_scenario;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Add_Customer_pageobject {
	
	@FindBy(xpath = "(//*[@class='dropdown'])[2]/button")
	public static WebElement addbtn;
	

	@FindBy(xpath = "//*[@class='search']")
	public static WebElement search;
	
	@FindBy(xpath = "//div/a[contains(text(),'Lead/Customer')]")
	public static WebElement customerbtn;
	
	
	
	@FindBy(xpath = "(//*[text()='Choose Contact Type']//following::mat-form-field[1]//following::div[3])[1]")
	public static WebElement contacttype;
	
	
	
	@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/div/mat-option[3]")
	public static WebElement selectcontactcontract;
	
	

	@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/div/mat-option[2]")
	public static WebElement selectcontactdomestic;
	
	@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/div/mat-option[4]")
	public static WebElement selectcontacttrade;
	

	@FindBy(xpath = "//*[@id='contacttypemodel']/div/div/form/div[3]/button[1]")
	public static WebElement nextbtn;
	
	@FindBy(xpath = "(//*[@name='contactlayoutselect'])[2]")
	public static WebElement chooselayout;
	
	
	@FindBy(xpath = "//*[text()='Contact Type ']/following::mat-form-field[1]/div/div/div[1]/mat-select/div/div[1]")
	public static WebElement contacttypedefault;
	
	
	
	@FindBy(xpath = "//*[@id='addNewContact']/div/div/div/h5")
	public static WebElement addcustomerheading;
	
	@FindBy(xpath = "//*[@id='custform']/div[1]/div/div[2]/div[1]/div[1]/div/div[2]/app-dynamic-field/select")
	public static WebElement salutation;
	
	@FindBy(xpath = "//*[@id='custform']/div[1]/div/div[2]/div[2]/div/div/div[2]/mat-form-field/div/div[1]/div/mat-select/div/div[1]")
	public static WebElement contacttypeshow;
	
	
	@FindBy(xpath = "//*[@placeholder='First Name']")
	public static WebElement firstname;
	
	@FindBy(xpath = "//*[@placeholder='Last Name']")
	public static WebElement lastname;
	
	@FindBy(xpath = "//*[@placeholder='Mobile']")
	public static WebElement mobile;
	
	@FindBy(xpath = "(//*[@placeholder='Email'])[2]")
	public static WebElement email;
	
	@FindBy(xpath = "//*[@id='contactDynamicform']/div/div")
	public static WebElement emailerr;
	
	
	@FindBy(xpath = "(//*[@placeholder='Phone'])[2]")
	public static WebElement phone;
	
	@FindBy(xpath = "//*[text()='*Only number is allowed']")
	public static WebElement phoneerrormsg;
	
	@FindBy(xpath = "//*[@placeholder='Role']")
	public static WebElement role;
	
	
	@FindBy(xpath = "(//*[@placeholder='Account Ref'])[2]")
	public static WebElement accountref;
	
	
	@FindBy(xpath = "(//*[text()='Default Contact']/following::input[1])[1]")
	public static WebElement defcontact;
	
	@FindBy(xpath = "//*[text()='Company Name ']/following::input[1]")
	public static WebElement companyname;
	
	@FindBy(xpath = "//*[@id='custform']/div[1]/div/div[4]/div[1]/div[1]/div/div[2]/div/div/div/div/div/span")
	public static WebElement suggestion;
	
	@FindBy(xpath = "//*[@id='custform']/div[1]/div/div[4]/div[1]/div[1]/div/div[2]/div/div/div/div/div/p[1]")
	public static WebElement selectcompany;
	
	
	
	@FindBy(xpath = "//*[text()='Contact Info ']/following::textarea[1]")
	public static WebElement address1;
	

	@FindBy(xpath = "//*[@id='custform']/div[1]/div/div[4]/div[2]/div[1]/div/div[2]/app-dynamic-field/select")
	public static WebElement addresstype;
	
	
	@FindBy(xpath = "//*[text()='Contact Info ']/following::textarea[2]")
	public static WebElement address2;
	
	@FindBy(xpath = "(//*[text()='Town / City']/following::input[1])[2]")
	public static WebElement city;
	
	@FindBy(xpath = "(//*[text()='Source']//following::mat-form-field[1]//following::div[3])[8]")
	public static WebElement source;
	
	@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/div/mat-option[3]")
	public static WebElement selectsource;
	
	@FindBy(xpath = "//*[@id='contactDynamicform']/div/mat-form-field/div/div[1]/div/mat-select/div/div/span")
	public static WebElement state;
	
	@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/div/mat-option[42]")
	public static WebElement selectstate;
	
	@FindBy(xpath = "//*[@id='contact_zipcodepostcode']")
	public static WebElement zipcode;
	
	@FindBy(xpath = "//*[@id='contactDynamicform']/span/i")
	public static WebElement zipcodesearch;
	
	@FindBy(xpath = "(//*[@id='contactDynamicform']/select)[3]")
	public static WebElement country;
	
	@FindBy(xpath = "//*[@id='addNewContact']/div/div/div/span/i")
	public static WebElement close;
	
	@FindBy(xpath = "//*[@placeholder='Currency']")
	public static WebElement currency;
	
	@FindBy(xpath = "//*[@id='custform']/div[2]/button[1]")
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
	
	@FindBy(xpath = "//*[@placeholder='Enter Your Password']")
	public static WebElement password;
	
	@FindBy(xpath = "//*[@placeholder='Enter Your Confirm Password']")
	public static WebElement confirmpassword;
	
	@FindBy(xpath = "//*[text()='Set Configure ']")
	public static WebElement setconfigure;
	
	@FindBy(xpath = "//*[@id='custform']/div[2]/button[2]")
	public static WebElement cancelbtn;
	
	//@FindBy(xpath = "//*[@placeholder='Email Address1']")
	//public static WebElement emailaddress;
	
	@FindBy(xpath = "(//*[@id='contactDynamicform']/input)[12]")
	public static WebElement checkbox1;
	
	
	@FindBy(xpath = "(//*[@id='yes'])[1]")
	public static WebElement radiobtn;
	
	@FindBy(xpath = "(//*[@id='no'])[1]")
	public static WebElement radiobtn1;
	
	@FindBy(xpath = "(//*[@id='reminder']/igx-input-group/div[1]/igx-prefix/igx-icon)[2]")
	public static WebElement date1;
	
	@FindBy(xpath = "//*[@class='igx-calendar__body-row']/following::div[1]/following::igx-day-item[3]/span")
	public static WebElement selectdate1;
	

	
//	//@FindBy(xpath = "//*[@id='custform']/div[1]/div/div[6]/div/div[9]/div/div[2]/app-dynamic-field/input")
//	public static WebElement number;
	
	@FindBy(xpath = "(//*[@id='contactDynamicform']/input)[11]")
	public static WebElement singleline;
	
	@FindBy(xpath = "//*[text()='*Only number is allowed']")
	public static WebElement numbererrmsg;
	
	@FindBy(xpath = "(//*[@class='e-input e-lib e-keyboard e-datetimepicker'])[1]")
	public static WebElement datetime;
	

	@FindBy(xpath = "(//*[@class='e-input e-lib e-keyboard e-datetimepicker']/following::span[3])[1]")
	public static WebElement time;
	
	@FindBy(xpath = "(//*[@id=\"contactDynamicform\"]/select)[4]")
	public static WebElement dropdown;
	
	@FindBy(xpath = "(//*[@id='contactDynamicform']/textarea)[3]")
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
