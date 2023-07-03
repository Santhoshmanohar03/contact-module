package Add_Appointment_contactmodule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_Appointment_pageobject {
	@FindBy(xpath = "//*[@id='cont_contact']/div/div[2]/div[2]/div[3]/div[3]/div[1]/div[1]/div/span")
	public static WebElement holder;
	
	@FindBy(xpath = "//*[@id='cont_contact']/div/div[2]/div[2]/div[3]/div[3]/div[1]/div[1]/div/span/app-contactlisticon/div/div/div/button/i")
	public static WebElement option;


	@FindBy(xpath = "//*[@id='cont_contact']/div/div[2]/div[2]/div[3]/div[3]/div[1]/div[1]/div/span/app-contactlisticon/div/div/div/div/button[4]")
	public static WebElement addappointment;
	
	@FindBy(xpath = "//*[@id='schedule_dialog_wrapper_title']/div")
	public static WebElement heading;

	@FindBy(xpath = "//*[@id='isConfirm']")
	public static WebElement confirmbtn;
	

	@FindBy(xpath = "//*[@id='formID']/div/div[2]/div[2]/img")
	public static WebElement editbtn;
	
	@FindBy(xpath = "(//*[@id='startDate_input'])[1]")
	public static WebElement startdate;
	
	@FindBy(xpath = "(//*[@id='startTime_input'])[1]")
	public static WebElement starttime;

	@FindBy(xpath = "(//*[@id='endDate_input'])[1]")
	public static WebElement enddate;
	
	@FindBy(xpath = "(//*[@id='endTime_input'])[1]")
	public static WebElement endtime;
	
	@FindBy(xpath = "(//*[@id='IsAllDay'])[1]/following::span[1]")
	public static WebElement alldaycheckbox;
	
	@FindBy(xpath = "(//*[@id='repeatflag']/div/div/label/div)[1]")
	public static WebElement repeatonoff;
	
	
	
	@FindBy(xpath = "//*[@id='RecurrenceEditor']/div/div[1]/div")
	public static WebElement selectrepeat;
	
	@FindBy(xpath = "//*[@id='RecurrenceEditor']/div/div[2]/table/tbody/tr/td[1]/div/input[1]")
	public static WebElement repeatevery;
	
	
	@FindBy(xpath = "//*[@id='RecurrenceEditor']/div/div[2]/table/tbody/tr/td[1]/div/span[3]")
	public static WebElement dayrepeatincerment;
	
	@FindBy(xpath = "//*[@id='RecurrenceEditor']/div/div[2]/table/tbody/tr/td[1]/div/span[2]")
	public static WebElement dayrepeatdecrement;
	
	@FindBy(xpath = "//*[@id='RecurrenceEditor']/div/div[5]/div[2]/span")
	public static WebElement endday;
	
	@FindBy(xpath = "//*[@id='RecurrenceEditor']/div/div[5]/div[3]/span/span[2]")
	public static WebElement enddayset;
	
	@FindBy(xpath = "//*[@id='RecurrenceEditor']/div/div[5]/div[3]/span/span[2]/preceding::input[1]")
	public static WebElement enddayinput;
	
	
	@FindBy(xpath = "//*[@id='RecurrenceEditor']/div/div[5]/div[4]/span/input[1]")
	public static WebElement count;
	
	@FindBy(xpath = "//*[@id='schedule_dialog_wrapper']/div[3]/button[2]")
	public static WebElement savebtn;

	@FindBy(xpath = "//*[@id='schedule_dialog_wrapper']/div[3]/button[3]")
	public static WebElement cancelbtn;
	
	
	
	
	
	@FindBy(xpath = "//*[@id='scheduleEditForm']/div[1]/div/div[2]/button[1]")
	public static WebElement repeatok;

	@FindBy(xpath = "//*[@id='scheduleEditForm']/div[1]/div/div[2]/button[1]")
	public static WebElement repeatcancel;
	
	
	@FindBy(xpath = "//*[@id='formID2']/div/div[2]/div[3]/span")
	public static WebElement repeatinfo;
	
	
	
	
	
	
	@FindBy(xpath = "(//*[@id='traveltime_hh'])[2]")
	public static WebElement traveltimehrs;
	
	@FindBy(xpath = "(//*[@id='traveltime_mm'])[2]")
	public static WebElement traveltimemins;
	
//	@FindBy(xpath = "(//*[@id='appointmentType'])[1]")
//	public static WebElement appointmenttype;
//	
	
	@FindBy(xpath = "//*[@id='appointmentType']/div/div[1]")
	public static WebElement appointmenttype;
	
	@FindBy(xpath = "//*[@id='appointmentType-panel']/div/mat-option[2]/span")
	public static WebElement appointmentselect;
	
	
	@FindBy(xpath = "//*[@id='employee']")
	public static WebElement staffdrop;
	
	@FindBy(xpath = "//*[@id='employee']/div/div[2]/ul[1]/li[1]/div")
	public static WebElement selectstaffdrop;
	
	@FindBy(xpath = "(//*[text()='Notification '])[1]/following::button[1]")
	public static WebElement notificationaddbtn;
	
	@FindBy(xpath = "(//*[@id='notificationRadio0'])[1]")
	public static WebElement notificationradio;
	
	@FindBy(xpath = "(//*[@id='notificationHH0'])[1]")
	public static WebElement notificationhrs;
	
	@FindBy(xpath = "(//*[@id='notificationMM0'])[1]")
	public static WebElement notificationmins;
	
	@FindBy(xpath = "(//*[@id='notificationTemplate0'])[1]")
	public static WebElement notificationtemplate;
	
	@FindBy(xpath = "//*[@id=\"formID2\"]/div/div[6]/div/div/div/div[2]/div[1]/div/span/i")
	public static WebElement notificationdelete;
	
	@FindBy(xpath = "(//*[@id='jobDescription'])[1]")
	public static WebElement descriptionbox;
	
	@FindBy(xpath = "//*[@id='formID2']/div/div[8]/div/div/label")
	public static WebElement upload;
	
	@FindBy(xpath = "//*[@id='formID2']/div/div[7]/div[2]/div/mat-form-field/div/div[1]/div/mat-select/div/div[2]")
	public static WebElement appointmentstatus;
	
	@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/div/mat-option[3]")
	public static WebElement selectappstatus;
	
	@FindBy(xpath = "//*[@id='15']")
	public static WebElement field;
	
	@FindBy(xpath = "//*[@id='deletecomomnotfication']/div/div/div/div/div/button[1]")
	public static WebElement warning;
	
}
