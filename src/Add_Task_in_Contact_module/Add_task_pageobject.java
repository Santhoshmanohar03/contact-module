package Add_Task_in_Contact_module;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_task_pageobject {

	@FindBy(xpath = "//*[@id='cont_contact']/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div/div/div/div[2]")
	public static WebElement select;
	
	@FindBy(xpath = "//*[@id='cont_contact']/div/div[2]/div[2]/div[3]/div[3]/div[1]/div[1]/div/span")
	public static WebElement holder;
	
	@FindBy(xpath = "//*[@id='cont_contact']/div/div[2]/div[2]/div[3]/div[3]/div[1]/div[1]/div/span/app-contactlisticon/div/div/div/button/i")
	public static WebElement option;

	@FindBy(xpath = "//*[@id='cont_contact']/div/div[2]/div[2]/div[3]/div[3]/div[1]/div[1]/div/span/app-contactlisticon/div/div/div/div/button[3]")
	public static WebElement addtaskbtn;
	
	@FindBy(xpath = "(//*[text()='Add Task'])[2]/following::igx-icon[1]")
	public static WebElement changedate;
	
	@FindBy(xpath = "//*[@class='igx-calendar__body-row']/following::div[1]/following::igx-day-item[1]/span")
	public static WebElement selectdate;
	
	@FindBy(xpath = "(//*[@name='timepicker'])[2]/igx-input-group/div[1]/div/input")
	public static WebElement changetime;
	
	
	
	@FindBy(xpath = "(//*[@id='addtaskbody']/div[1]/div/div[3]/div[2]/div)[2]/select")
	public static WebElement selectstaff;
	
	@FindBy(xpath = "(//*[@id='addtaskbody']/div[1]/div/div[4]/div[2]/div/div/label/div)[2]")
	public static WebElement repeat;
	

	
	@FindBy(xpath = "//*[@id='RecurrenceEditor']/ejs-recurrenceeditor/div/div[1]/div")
	public static WebElement selectrepeat;
	
	@FindBy(xpath = "//*[@id='RecurrenceEditor']/ejs-recurrenceeditor/div/div[2]/table/tbody/tr/td[1]/div/input[1]")
	public static WebElement repeatevery;
	
	
	@FindBy(xpath = "//*[@id='RecurrenceEditor']/ejs-recurrenceeditor/div/div[2]/table/tbody/tr/td[1]/div/span[3]")
	public static WebElement dayrepeatincerment;
	
	@FindBy(xpath = "//*[@id='RecurrenceEditor']/ejs-recurrenceeditor/div/div[2]/table/tbody/tr/td[1]/div/span[2]")
	public static WebElement dayrepeatdecrement;
	
	@FindBy(xpath = "//*[@id='RecurrenceEditor']/ejs-recurrenceeditor/div/div[5]/div[2]/span")
	public static WebElement endday;
	
	@FindBy(xpath = "//*[@id='RecurrenceEditor']/ejs-recurrenceeditor/div/div[5]/div[3]/span/span[2]")
	public static WebElement enddayset;
	
	
	
	@FindBy(xpath = "//*[@id=\"RecurrenceEditor\"]/ejs-recurrenceeditor/div/div[5]/div[4]/span/input[1]")
	public static WebElement count;
	
	@FindBy(xpath = "//*[@id='RecurrenceEditor']/div/button[1]")
	public static WebElement savebtn;

	@FindBy(xpath = "//*[@id='RecurrenceEditor']/div/button[2]")
	public static WebElement cancelbtn;
	
	@FindBy(xpath = "//*[@id='toltp']")
	public static WebElement messageshow;
	
	@FindBy(xpath = "(//*[@id='addtaskbody']/div[1]/div/div[6]/div[2]/div/div/div/div/div/div[1]/div)[2]")
	public static WebElement statusdrop;
	
	
	
	@FindBy(xpath = "(//*[text()=' Inprogress'])[2]")
	public static WebElement selectstatus;
	
	@FindBy(xpath = "(//*[@id='taskdescription'])[2]")
	public static WebElement description;
	
	
	@FindBy(xpath = "//*[@id='inputPasswordtask']")
	public static WebElement addconduct;
	
	@FindBy(xpath = "//*[@id='addtaskbody']/div[2]/div/div[2]/div[3]/div/p[2]")
	public static WebElement seleectconduct;
	
	
	@FindBy(xpath = "(//*[@id='userdate2']/igx-input-group/div[1]/igx-prefix/igx-icon)[2]")
	public static WebElement enddate;
	
	@FindBy(xpath = "//*[@class='igx-calendar__body-row']/following::div[1]/following::igx-day-item[3]/span")
	public static WebElement selectenddate;
	
	@FindBy(xpath = "(//*[@placeholder='Enter the Number'])[1]")
	public static WebElement number;
	
	@FindBy(xpath = "(//*[@id='userdropdown1'])[2]")
	public static WebElement dropnumber;
	
	@FindBy(xpath = "(//*[@id='usertextbox0'])[2]")
	public static WebElement tasklist;
	
	@FindBy(xpath = "//*[@placeholder='Enter the see']")
	public static WebElement seefield;
	
	@FindBy(xpath = "(//*[@id='usertextbox3'])[1]")
	public static WebElement testtask;
	
	@FindBy(xpath = "(//*[@id='usertextbox4'])[1]")
	public static WebElement retre;
	
	@FindBy(xpath = "(//*[@id='addtaskbody']/div[1]/div/div[5]/div/div/div/span/i)[2]")
	public static WebElement notification;
	
	@FindBy(xpath = "//*[@id='notificationRadio0']")
	public static WebElement notificationradio;
	
	@FindBy(xpath = "//*[@id='notificationHH0']")
	public static WebElement notificationhrs;
	
	@FindBy(xpath = "//*[@id='notificationMM0']")
	public static WebElement notificationmins;
	
	@FindBy(xpath = "//*[@id='notificationTemplate0']")
	public static WebElement notificationtemplate;
	
	@FindBy(xpath = "//*[@id='addtasknotifiform']/div/div[2]/div/span[3]/i")
	public static WebElement notificationdeletElement;
	
	@FindBy(xpath = "(//*[@id='addtaskform']/div[4]/input)[2]")
	public static WebElement tasksavebtn;
	
	@FindBy(xpath = "(//*[@id='addtaskform']/div[4]/button)[2]")
	public static WebElement taskcancelbtn;
	
	@FindBy(xpath = "(//*[@class='ag-cell-value']/app-contactlisticon/label/i[1])[13]")
	public static WebElement viewbtn;
	
	@FindBy(xpath = "//*[@id='cont_contact']/div/div[2]/div[2]/div[3]/div[3]/div[15]/div[1]/div")
	public static WebElement holder2;
	
	@FindBy(xpath = "(//*[@class='ag-cell-value']/app-contactlisticon/label/i[2])[1]")
	public static WebElement addjobbtn;
	
	@FindBy(xpath = "//*[@id='cont_contact']/div/div[2]/div[2]/div[3]/div[3]/div[16]/div[1]/div")
	public static WebElement holder3;
	
	@FindBy(xpath = "(//*[@class='ag-cell-value']/app-contactlisticon/label/i[4])[16]")
	public static WebElement addappointbtn;
	
	@FindBy(xpath = "//*[@id='cont_contact']/div/div[2]/div[2]/div[3]/div[3]/div[17]/div[1]/div")
	public static WebElement holder4;
	
	@FindBy(xpath = "(//*[@class='ag-cell-value']/app-contactlisticon/label/i[5])[17]")
	public static WebElement deletebtn;
	
	@FindBy(xpath = "//*[@id=\"deletecomomnotfication\"]/div/div/div/div/div/button[1]")
	public static WebElement deleteokbtn;
	
	@FindBy(xpath = "//*[text()='Leads/Customers ']")
	public static WebElement back;
	
	
	@FindBy(xpath = "//*[@id='tasklistsmodal']/div/div/form/div[1]/span/i")
	public static WebElement closetaskhistoryorderpage;
	
	
	
	
}
