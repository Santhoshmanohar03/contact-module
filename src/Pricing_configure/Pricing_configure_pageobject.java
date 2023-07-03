package Pricing_configure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pricing_configure_pageobject {
	
	@FindBy(xpath = "(//*[@class='mat-tab-labels'])[2]/div[3]")
	public static WebElement pricing;
	
	@FindBy(xpath = "//*[text()='Customer-Specific VAT Rate']/following::input[1]")
	public static WebElement VATrate;
	
	@FindBy(xpath = "//*[text()='VAT Registration Number']/following::input[1]")
	public static WebElement VATregnumber;
	
	@FindBy(xpath = "//*[text()='Customer Surcharge(%)']/following::input[1]")
	public static WebElement surcharge;
	
	@FindBy(xpath = "//*[text()='Default Delivery Cost']/following::input[1]")
	public static WebElement defaultdeliverycost;
	
	@FindBy(xpath = "//*[text()='Default Appointment Type']/following::mat-form-field[1]/div/div[1]/div/mat-select/div")
	public static WebElement defaultappointtype;
	
	@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/input")
	public static WebElement defaultappointtypesearch;
	
	@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/div/mat-option[2]")
	public static WebElement selectappointtype;
	
	@FindBy(xpath = "(//*[@class='col-xl-8 col-lg-6 col-md-8']/following::mat-select[1]/div)[2]/div[1]")
	public static WebElement defaultsatff;
	
	@FindBy(xpath = "(//*[@class='col-xl-8 col-lg-6 col-md-8']/following::mat-select[1]/div)[2]/div[1]")
	public static WebElement defaultsatffsearch;
	
	@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/div/mat-option[2]")
	public static WebElement selectstaff;
	
	@FindBy(xpath = "//*[@class='alert-load ng-star-inserted']")
	public static WebElement popup;
	
//	@FindBy(xpath = "//*[@class=\"alert-load ng-star-inserted\"]")
//	public static WebElement popup;

}
