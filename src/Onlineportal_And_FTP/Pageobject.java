package Onlineportal_And_FTP;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pageobject {
	@FindBy(xpath = "(//*[@class='mat-tab-labels'])[2]/div[10]")
	public static WebElement onlineportal;

	@FindBy(xpath = "//*[@id='alljobview']")
	public static WebElement alljob;

	
	
	@FindBy(xpath = "//*[@id='discountorder']")
	public static WebElement discount;
	
	@FindBy(xpath = "//*[@id='orderlanguage']")
	public static WebElement language;
	
	@FindBy(xpath = "//*[@id='Notification']")
	public static WebElement notification;
	
	@FindBy(xpath = "(//*[@name='logo'])[1]")
	public static WebElement cuslogo;
	
	
	
	
	@FindBy(xpath = "(//*[@class='mat-tab-labels'])[2]/div[11]")
	public static WebElement FTP;
	
	@FindBy(xpath = "//*[@class='Newaddbtn']")
	public static WebElement addtaskFTp;
	
	
	
	@FindBy(xpath = "//*[@id='for_mat']")
	public static WebElement format;
	
	@FindBy(xpath = "//*[@id='status']")
	public static WebElement choosestatus;
	
	@FindBy(xpath = "//*[@id='hostname']")
	public static WebElement hostname;
	
	@FindBy(xpath = "//*[@id='username1']")
	public static WebElement username;
	
	@FindBy(xpath = "//*[@id='password1']")
	public static WebElement password;
	
	@FindBy(xpath = "//*[@id='path']")
	public static WebElement path;
	
	@FindBy(xpath = "//*[@id='port']")
	public static WebElement port;
	
	@FindBy(xpath = "//*[@id='protocol']")
	public static WebElement protocal;
	
	@FindBy(xpath = "//*[@id='ftppopup']/div/div/form/div[3]/button[1]")
	public static WebElement savetbtnftp;
	
	@FindBy(xpath = "//*[@id='ftppopup']/div/div/form/div[3]/button[2]")
	public static WebElement canceltbtnftp;
	

	@FindBy(xpath = "//*[@id='status']/following::text()[1]")
	public static WebElement errormess;
	
	

	@FindBy(xpath = "//*[@id='ftpdetails']/div/div[2]/div[2]/div[3]/div[2]/div/div/div/div[7]/app-ftpdelete")
	public static WebElement deletebtnFTp;
	
	
	
	

}
