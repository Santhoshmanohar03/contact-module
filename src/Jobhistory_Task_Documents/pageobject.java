package Jobhistory_Task_Documents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageobject {
	
	
	@FindBy(xpath = "(//*[@class='mat-tab-labels'])[2]/div[6]")
	public static WebElement jobhistory;
	
	@FindBy(xpath = "//*[@id='orderhistory']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div[2]/div/span/span/a")
	public static WebElement selectjobref;
	
	@FindBy(xpath = "(//*[text()='Order Status']/following::select[1])[2]")
	public static WebElement orderstatus;
	
	@FindBy(xpath = "(//*[text()='Select Product'])[1]")
	public static WebElement selectproduct;
	
	@FindBy(xpath = "/html/body/app-root/main/section/app-job/div[11]/div/div[1]/div[1]/form/div/div[3]/div/div[2]/div/input")
	public static WebElement jobrefno;
	
	@FindBy(xpath = "/html/body/app-root/main/section/app-job/div[11]/div/div[1]/div[1]/form/div/div[6]/div/div[2]/div/input")
	public static WebElement invoiceno;
	
//	@FindBy(xpath = "//*[text()='Invoice No']/following::input[1]")
//	public static WebElement invoiceno2;
	
	@FindBy(xpath = "//*[@id='orderhistory']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div[6]/div/span/span/a")
	public static WebElement selectinvoice;
	
	
	
	
	@FindBy(xpath = "(//*[@class='mat-tab-labels'])[2]/div[7]")
	public static WebElement task;
	
	@FindBy(xpath = "//*[@class='Newaddbtn']")
	public static WebElement addtask;
	
	
	@FindBy(xpath = "//*[text()='Leads/Customers ']")
	public static WebElement leadscustomers;
	
	
	
	
	
	@FindBy(xpath = "(//*[@class='mat-tab-labels'])[2]/div[8]")
	public static WebElement documents;
	
	
	@FindBy(xpath = "//*[@class='Newaddbtn']")
	public static WebElement addnewdocu;
	
	@FindBy(xpath = "//*[@name='text']")
	public static WebElement descriptionnotes;
	
	@FindBy(xpath = "(//*[@title='Change Date'])[2]")
	public static WebElement reminder;
	
	@FindBy(xpath = "//*[@class='igx-calendar__body-row']/following::div[1]/following::igx-day-item[5]/span")
	public static WebElement selectreminder;
	
	@FindBy(xpath = "//*[@id='addnotesdocform']/div[2]/div/div[2]/div/div[2]/div/input")
	public static WebElement attachment;
	
	@FindBy(xpath = "//*[@id='addnotesdocform']/div[2]/div/div[3]/div/div[2]/mat-form-field/div/div[1]/div/mat-select/div/div[1]")
	public static WebElement completed;
	
	@FindBy(xpath = "//*[text()=' No']")
	public static WebElement noselect;
	
	@FindBy(xpath = "//*[@id='addnotesdocform']/div[3]/button[1]")
	public static WebElement savebtnnote;
	
	@FindBy(xpath = "//*[@id='addnotesdocform']/div[3]/button[2]")
	public static WebElement cancelnote;
	
	
	
	
	
	@FindBy(xpath = "(//*[@aria-label='Company Name Filter Input'])[2]")
	public static WebElement companysearchfield;
	
	
	@FindBy(xpath = "(//*[@aria-label='First Name Filter Input'])[3]")
	public static WebElement firstnameseachfield;
	
	@FindBy(xpath = "(//*[@aria-label='Last Name Filter Input'])")
	public static WebElement lastnamesearchfield;

}
