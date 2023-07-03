package Comapny_Info;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_company_info_pageobject {
	@FindBy(xpath = "(//*[@class='mat-tab-labels'])[2]/div[1]")
	public static WebElement company;
	
	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[1]/div/div[2]/app-dynamic-field/div/label/img")
	public static WebElement imageupload;
	
	

	@FindBy(xpath = "//*[@id='customform']/div[1]/div[1]/div/div[3]/div/div/div/div/div[7]/div/div[2]/app-dynamic-field/input")
	public static WebElement acccountref;
	
	
	@FindBy(xpath = "//*[@id='Company Name']")
	public static WebElement companyname;

	@FindBy(xpath = "//*[text()='Source']/following::mat-select[1]/div/div/span")
	public static WebElement source;
	
	@FindBy(xpath = "//*[@aria-label='dropdown search']")
	public static WebElement searchsource;
	
	@FindBy(xpath = "//*[@class='cdk-overlay-pane']/div/div/div/mat-option[3]")
	public static WebElement selectsource;

	@FindBy(xpath = "//*[@id='customform']/div[1]/div[1]/div/div[3]/div/div/div/div/div[4]/div/div[2]/app-dynamic-field/input")
	public static WebElement fax;
	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[1]/div/div[3]/div/div/div/div/div[4]/div/div[2]/app-dynamic-field/div/div")
	public static WebElement faxerrmsg;

	@FindBy(xpath = "//*[@id='customform']/div[1]/div[1]/div/div[3]/div/div/div/div/div[3]/div/div[2]/app-dynamic-field/input")
	public static WebElement phone;
	
//	@FindBy(xpath = "//*[@id='customform']/div[1]/div[1]/div/div[3]/div/div/div/div/div[5]/div/div[2]/app-dynamic-field/div/div")
//	public static WebElement phoneerrmsg;
	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[2]/div/div[3]/div/div/div/div/div[1]/div/div[2]/app-dynamic-field/textarea")
	public static WebElement address1;
	

	@FindBy(xpath = "//*[@id='customform']/div[1]/div[2]/div/div[3]/div/div/div/div/div[4]/div/div[2]/app-dynamic-field/div/mat-form-field/div/div[1]/div/mat-select/div/div[1]")
	public static WebElement state;
	
	
	
	@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/div/mat-option[12]")
	public static WebElement selectstate;
	
	@FindBy(xpath = "//*[@id='reminder']/igx-input-group/div[1]/igx-prefix/igx-icon")
	public static WebElement date;
	
	@FindBy(xpath = "//*[@class='igx-calendar__body-row']/following::div[1]/following::igx-day-item[2]/span")
	public static WebElement selectdate;
	
	@FindBy(xpath = "//*[@id='reminder']/igx-input-group/div[1]/div/input")
	public static WebElement selecteddate;
	

	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[2]/app-dynamic-field/textarea")
	public static WebElement address2;
	
	@FindBy(xpath = "//*[@id='customer_zipcodepostcode']")
	public static WebElement zipcode;
	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[2]/div/div[3]/div/div/div/div/div[3]/div/div[2]/app-dynamic-field/input")
	public static WebElement city;
	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[2]/div/div[3]/div/div/div/div/div[6]/div/div[2]/app-dynamic-field/select")
	public static WebElement country;
	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[1]/div/div[3]/div/div/div/div/div[8]/div/div[2]/app-dynamic-field/input")
	public static WebElement website;
	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[1]/div/div[3]/div/div/div/div/div[8]/div/div[2]/app-dynamic-field/div/div")
	public static WebElement websiteerrmsg;
	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[1]/div/div[3]/div/div/div/div/div[5]/div/div[2]/app-dynamic-field/input")
	public static WebElement email;
	

	@FindBy(xpath = "//*[@id='customform']/div[1]/div[1]/div/div[3]/div/div/div/div/div[7]/div/div[2]/app-dynamic-field/div/div")
	public static WebElement emailerrmsg;
	
	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[2]/div/div[3]/div/div/div/div/div[9]/div/div[2]/app-dynamic-field/ejs-datetimepicker/span/span[2]")
	public static WebElement datetime;
	
	@FindBy(xpath = "//*[@id='customform']/div[1]/div[2]/div/div[3]/div/div/div/div/div[9]/div/div[2]/app-dynamic-field/ejs-datetimepicker/span/span[3]")
	public static WebElement time;
	
	@FindBy(xpath = "//*[@id='yes']")
	public static WebElement holidayradiobtn;
	
	
	
	@FindBy(xpath = "/html/body/app-root/main/section/app-customer/div[1]/ul/li[2]/span")
	public static WebElement companyhead;
	
	
	
	
	
	
	@FindBy(xpath = "//*[@id='customform']/div[2]/button[1]")
	public static WebElement companysavebtn;
	

}
