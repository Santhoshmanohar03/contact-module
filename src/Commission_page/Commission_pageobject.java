package Commission_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Commission_pageobject {


	@FindBy(xpath = "(//*[@class='mat-tab-labels'])[2]/div[5]")
	public static WebElement commission;
	
	
	@FindBy(xpath = "//*[@class='Newaddbtn']")
	public static WebElement addnewcommision;
	
	@FindBy(xpath = "//*[text()='Add Commission']")
	public static WebElement addnewcommisionpage;
	
	@FindBy(xpath = "//*[@id='commission']")
	public static WebElement commisionamount;
	
	@FindBy(xpath = "(//*[text()='Sales Consultant'])[2]/following::mat-form-field[1]/div")
	public static WebElement salesconsultant;
	
	@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/mat-option[1]")
	public static WebElement selectconsultant;
	
	@FindBy(xpath = "(//*[text()='Product'])[2]/following::mat-form-field[1]/div")
	public static WebElement product;
	
	@FindBy(xpath = "//*[@id='selectProduct']/following::mat-option[2]")
	public static WebElement selectproduct;
	
	@FindBy(xpath = "//*[@class='greenbtn ng-star-inserted Newsavebtn Newsavebtn_Onchange']")
	public static WebElement savebtn;
	
	@FindBy(xpath = "//*[@id='commision']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div[6]")
	public static WebElement folder;
	
	@FindBy(xpath = "//*[@id='commision']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div[6]/app-deliverychanges/label/i[1]")
	public static WebElement copybtn;
	
	@FindBy(xpath = "//*[text()='Copy Commission']")
	public static WebElement copycommisionpage;
	
	@FindBy(xpath = "//*[@class='Newsavebtn greenbtn ng-star-inserted']")
	public static WebElement pastebtn;
	
	@FindBy(xpath = "//*[@id='commision']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div[6]/app-deliverychanges/label/i[2]")
	public static WebElement deletebtn;
	
	@FindBy(xpath = "//*[@id='deletecomomnotfication']/div/div/div/div/span/following::button[1]")
	public static WebElement deleteokbtn;
	
}
