package Add_Supplier_Scenario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_First_layout_pageobject {
	@FindBy(xpath = "(//*[@class='dropdown'])[3]/button")
	public static WebElement addbtn;
	
	@FindBy(xpath = "/html/body/app-root/main/section/app-contacts/div[1]/div[2]/div[4]/div/a[2]")
	public static WebElement supplierbtn;
	
	@FindBy(xpath = "//*[text()=' Add New Supplier']")
	public static WebElement supplierpage;
	
	
	@FindBy(xpath = "//*[@id='addNewCompany']/div/div/div[1]/div/select")
	public static WebElement layout;
	

	@FindBy(xpath = "//*[@id='customform']/div[1]/div[1]/div/div[2]/app-dynamic-field/div/label/img")
	public static WebElement image;
	
	
	@FindBy(xpath = "//*[text()='Supplier Name']/following::input[1]")
	public static WebElement suppliername;
	
	@FindBy(xpath = "//*[text()='Supplier No']/following::input[1]")
	public static WebElement supplierno;
	

	@FindBy(xpath = "//*[@id=\"customform\"]/div[1]/div[1]/div/div[3]/div/div/div/div/div[3]/div/div[2]/app-dynamic-field/ng-multiselect-dropdown/div/div[1]/span")
	public static WebElement assignto;
	
	
	@FindBy(xpath = "//*[@id=\"customform\"]/div[1]/div[1]/div/div[3]/div/div/div/div/div[3]/div/div[2]/app-dynamic-field/ng-multiselect-dropdown/div/div[2]/ul[1]/li[2]/input")
	public static WebElement assigntosearch;

	@FindBy(xpath = "//*[@id='customform']/div[1]/div[1]/div/div[3]/div/div/div/div/div[3]/div/div[2]/app-dynamic-field/ng-multiselect-dropdown/div/div[2]/ul[2]/li/div")
	public static WebElement assigntoselect;
	
	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[1]/div/div[3]/div/div/div/div/div[3]/div/div[2]/app-dynamic-field/ng-multiselect-dropdown/div/div[2]/ul[2]/li[1]/div")
	public static WebElement assigntoselect1;
	
	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[1]/div/div[3]/div/div/div/div/div[3]/div/div[2]/app-dynamic-field/ng-multiselect-dropdown/div/div[2]/ul[2]/li[2]/div")
	public static WebElement assigntoselect2;
	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[1]/div/div[3]/div/div/div/div/div[3]/div/div[2]/app-dynamic-field/ng-multiselect-dropdown/div/div[2]/ul[2]/li[3]/div")
	public static WebElement assigntoselect3;
	
	@FindBy(xpath = "//*[@id=\"customform\"]/div[1]/div[1]/div/div[3]/div/div/div/div/div[3]/div/div[2]/app-dynamic-field/ng-multiselect-dropdown/div/div[1]/span/span[1]/a")
	public static WebElement assigntoselectdelete;
	
	@FindBy(xpath = "//*[text()='Account Number']/following::input[1]")
	public static WebElement accountnumber;
	
	@FindBy(xpath = "//*[text()='expected date']/following::igx-icon[1]")
	public static WebElement expecteddate;
	
	@FindBy(xpath = "//*[@class='igx-calendar__body-row']/following::div[1]/following::igx-day-item[3]/span")
	public static WebElement selectdate;
	
	

	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[1]/div/div[3]/div/div/div/div/div[7]/div/div[2]/app-dynamic-field/input")
	public static WebElement number;
	
	
	@FindBy(xpath = "(//*[@id='yes'])[1]")
	public static WebElement radiobtn2yes;
	
	
	@FindBy(xpath = "(//*[@id='no'])[1]")
	public static WebElement radiobtn2no;
	
	@FindBy(xpath = "(//*[@id='no'])[2]")
	public static WebElement radiobtn3;
	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[2]/div/div[3]/div/div/div/div/div[1]/div/div[2]/app-dynamic-field/input")
	public static WebElement checkbox2;
	
	@FindBy(xpath = "//*[@id='YES']")
	public static WebElement radiobtn1;
	
	
	
	
	@FindBy(xpath = "//*[text()='Supplier Info']/following::textarea[1]")
	public static WebElement address1;
	
	@FindBy(xpath = "//*[text()='Supplier Info']/following::textarea[2]")
	public static WebElement address2;
	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[2]/div/div[3]/div/div/div/div/div[3]/div/div[2]/app-dynamic-field/input")
	public static WebElement city;
	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[2]/div/div[3]/div/div/div/div/div[7]/div/div[2]/app-dynamic-field/input")
	public static WebElement website;
	
	@FindBy(xpath = "//*[@id=\"customform\"]/div[1]/div[2]/div/div[3]/div/div/div/div/div[4]/div/div[2]/app-dynamic-field/div/mat-form-field/div/div[1]/div/mat-select/div/div[1]")
	public static WebElement state;
	
	@FindBy(xpath = "//*[contains(text(),'Alabama')]")
	public static WebElement selectstate;
	
	@FindBy(xpath = "//*[@id='customer_zipcodepostcode']")
	public static WebElement zipcode;
	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[2]/div/div[3]/div/div/div/div/div[5]/div/div[2]/app-dynamic-field/span/i")
	public static WebElement zipcodesearch;
	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[2]/div/div[3]/div/div/div/div/div[6]/div/div[2]/app-dynamic-field/select")
	public static WebElement country;
	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[2]/div/div[3]/div/div/div/div/div[9]/div/div[2]/app-dynamic-field/input")
	public static WebElement singleline;
	
	@FindBy(xpath = "//*[text()='Date1']/following::igx-icon[1]")
	public static WebElement date1;
	
	@FindBy(xpath = "//*[@class='igx-calendar__body-row']/following::div[1]/following::igx-day-item[2]/span")
	public static WebElement selectdate1;

	@FindBy(xpath = "//*[@id='customform']/div[2]/button[1]")
	public static WebElement savebtn;
	
	@FindBy(xpath = "//*[@id='customform']/div[2]/button[2]")
	public static WebElement cancelbtn;

}
