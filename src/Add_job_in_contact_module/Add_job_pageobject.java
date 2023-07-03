package Add_job_in_contact_module;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_job_pageobject {

	@FindBy(xpath = "//*[@id='cont_contact']/div/div[2]/div[2]/div[3]/div[3]/div[1]/div[1]/div/span")
	public static WebElement holder;
	
	@FindBy(xpath = "//*[@id='cont_contact']/div/div[2]/div[2]/div[3]/div[3]/div[1]/div[1]/div/span/app-contactlisticon/div/div/div/button/i")
	public static WebElement option;

	@FindBy(xpath = "//*[@id='cont_contact']/div/div[2]/div[2]/div[3]/div[3]/div[1]/div[1]/div/span/app-contactlisticon/div/div/div/div/button[2]")
	public static WebElement addjobbtn;

	@FindBy(xpath = "//*[@name='template']")
	public static WebElement chooselayout;
	
	@FindBy(xpath = "/html/body/app-root/main/section/app-job/div[1]/ul/li/span")
	public static WebElement jobpageheading;
	
	@FindBy(xpath = "/html/body/app-root/main/section/app-job/div[11]/div/div[1]/div[1]/form/div/div[1]/div/div[2]/div/input")
	public static WebElement jobpagetitle;

	@FindBy(xpath = "/html/body/app-root/main/section/app-job/div[11]/div/div[1]/div[2]/div[2]/button[1]")
	public static WebElement savebtn;

	@FindBy(xpath = "(//*[text()='Job Status']/following::select[1])[2]")
	public static WebElement jobstatus;

	@FindBy(xpath = "(//*[text()='Order Status']/following::select[1])[2]")
	public static WebElement orderstatus;

	@FindBy(xpath = "//*[text()='Invoice No']/following::input[1]")
	public static WebElement invoiceno;

	@FindBy(xpath = "(//*[text()='Job Ref No']/following::input[1])[2]")
	public static WebElement jobrefno;

	@FindBy(xpath = "(//*[text()='Select Product'])[1]")
	public static WebElement selectproduct;

	@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/mat-option[1]/span")
	public static WebElement selectnewproduct;

	@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/input")
	public static WebElement searchfield;

	@FindBy(xpath = "(//*[@class='slider round'])[2]")
	public static WebElement readybutn;

	@FindBy(xpath = "//*[@id='mat-border']/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]/div")
	public static WebElement heading;

	@FindBy(xpath = "(//*[text()='Unit Type']/following::select[1])[1]")
	public static WebElement unittype;

	@FindBy(xpath = "(//*[text()='Supplier']/following::select[1])[2]")
	public static WebElement supplier;

	@FindBy(xpath = "(//*[text()='Room'])[1]//following::input[1]")
	public static WebElement room;

	@FindBy(xpath = "(//*[text()='Pricing Groups'])[1]//following::select[1]")
	public static WebElement pricinggroup;

	@FindBy(xpath = "//*[text()='Quantity']/following::input[1]")
	public static WebElement quantity;

	@FindBy(xpath = "(//*[text()='Width']/following::input[1])[2]")
	public static WebElement width;

	@FindBy(xpath = "(//*[text()='Drop']/following::input[1])[2]")
	public static WebElement drop;

	@FindBy(xpath = "(//*[text()='Multi Select List']/following::input[1])")
	public static WebElement multiselect;

	@FindBy(xpath = "//*[@id='exampleModalbk']/div/div/div/div[1]/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/div/div/div/div[2]")
	public static WebElement multiselect1;

	@FindBy(xpath = "//*[@id='exampleModalbk']/div/div/div/div[1]/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]")
	public static WebElement multiselect2;

	@FindBy(xpath = "//*[@id='modalsave']")
	public static WebElement save;

	@FindBy(xpath = "//*[@id='modalcancel']")
	public static WebElement cancel;

	@FindBy(xpath = "(//*[text()='Default List']/following::input[1])")
	public static WebElement defaultlist;

	@FindBy(xpath = "(//*[text()='Single Select List']/following::input[1])")
	public static WebElement singlelist;

	@FindBy(xpath = "//*[@id='exampleModalbk']/div/div/div/div[1]/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]")
	public static WebElement singleselect1;

	@FindBy(xpath = "(//*[text()='Special Instruction']/following::input[1])")
	public static WebElement specialinst;

//	@FindBy(xpath = "(//*[@id='subgrid8'])[1]")
//	public static WebElement added;
//	
//	@FindBy(xpath = "//*[@id='exampleModalbk']/div/div/div/div[1]/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/div/div/div/div[2]")
//	public static WebElement selectaddded;
//	
//	
//	@FindBy(xpath = "//*[@id='modalsave']")
//	public static WebElement saveadded;
//	
//	@FindBy(xpath = "//*[@id='modalcancel']")
//	public static WebElement canceladded;

	@FindBy(xpath = "(//*[@class='addnext'])[2]/button[1]")
	public static WebElement saveproduct;

	@FindBy(xpath = "(//*[text()='Payments'])[2]")
	public static WebElement payment;

	@FindBy(xpath = "//*[@id='pricedet']/div/mat-tab-body[2]/div/div/div/button")
	public static WebElement paymentaddbtn;
	

	@FindBy(xpath = "//*[@id='pricedet']/div/mat-tab-body[2]/div/div[2]/span")
	public static WebElement paymentaddplusbtn;

	@FindBy(xpath = "//*[text()='Add Payment']")
	public static WebElement paymentpage;

	@FindBy(xpath = "//*[text()=' Amount ']/following::input[1]")
	public static WebElement amount;

	@FindBy(xpath = "//*[text()=' Payment Method']/following::select[1]")
	public static WebElement paymentmethod;

	@FindBy(xpath = "//*[text()=' Payment Type']/following::select[1]")
	public static WebElement paymenttype;

	@FindBy(xpath = "//*[@id='paiddate']/igx-input-group/div[1]/div/input")
	public static WebElement paymentdate;

	@FindBy(xpath = "//*[@class='igx-calendar__date igx-calendar__date--selected igx-calendar__date--current igx-calendar__date--single ng-star-inserted']/span")
	public static WebElement selectpaymentdate;

	@FindBy(xpath = "//*[@name='decription']")
	public static WebElement notes;

	@FindBy(xpath = "(//*[text()='Save'])[1]")
	public static WebElement savepayment;

	@FindBy(xpath = "(//*[@class='btn-group'])[2]/button")
	public static WebElement options;

	@FindBy(xpath = "(//*[text()='View Account'])[2]")
	public static WebElement viewaccount;

	@FindBy(xpath = "(//*[text()='Phone'])[2]/following::input[1]")
	public static WebElement phone;

	@FindBy(xpath = "(//*[text()='Email'])[1]/following::input[1]")
	public static WebElement mail;

	@FindBy(xpath = "(//*[text()='Contact Info'])[2]")
	public static WebElement contactinfobtn;

	@FindBy(xpath = "(//*[@id='Dynamicform']/input)[14]")
	public static WebElement checkbox;
	
	@FindBy(xpath = "//*[@id='datessection']/mat-tab-header/div[2]/div/div/div[2]/div")
	public static WebElement appointment;
	
	
	@FindBy(xpath = "//*[@id='datessection']/div/mat-tab-body[2]/div/div/div/button")
	public static WebElement appointmentplusbtn;
	

	@FindBy(xpath = "//*[@id='datessection']/div/mat-tab-body[2]/div/div[2]/span/i")
	public static WebElement appointmentplusbtn2;
	
	
	@FindBy(xpath = "//*[@id='datessection']/mat-tab-header/div[2]/div/div/div[3]/div")
	public static WebElement task;
	
	
	@FindBy(xpath = "//*[@id='datessection']/div/mat-tab-body[3]/div/div/div/button")
	public static WebElement addtaskplus;
	

	@FindBy(xpath = "//*[@id='datessection']/div/mat-tab-body[3]/div/div[2]/span/i")
	public static WebElement addtaskplus2;
	

	
	@FindBy(xpath = "//*[@id='tasklistsmodal']/div/div/form/div[1]/span/i")
	public static WebElement closetaskhistoryorderpage;
	


	@FindBy(xpath = "//*[@id='datessection']/mat-tab-header/div[2]/div/div/div[1]/div")
	public static WebElement dates;
	

	@FindBy(xpath = "//*[@id='datessection']/div/mat-tab-body[1]/div/div[2]/button")
	public static WebElement datesshow;
	
	
	@FindBy(xpath = "(//*[@id='jobinput']/igx-input-group/div[1]/div/input)[1]")
	public static WebElement createddate;
	
	@FindBy(xpath = "(//*[@id='jobinput']/igx-input-group/div[1]/div/input)[2]")
	public static WebElement orderdate;
	
	@FindBy(xpath = "(//*[@id='jobinput']/igx-input-group/div[1]/div/input)[3]")
	public static WebElement duedate;
	
	@FindBy(xpath = "(//*[@id='jobinput']/igx-input-group/div[1]/div/input)[4]")
	public static WebElement invoicedate;
	
	@FindBy(xpath = "(//*[@id='jobinput']/igx-input-group/div[1]/div/input)[5]")
	public static WebElement completeddate;
	
	@FindBy(xpath = "//*[@class='igx-calendar__date igx-calendar__date--current igx-calendar__date--single ng-star-inserted']/span")
	public static WebElement selectcurrentdate;
	
	
}
