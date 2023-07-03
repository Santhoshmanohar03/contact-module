package Awnings_configure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_Option_pageobject {
	
	@FindBy(xpath = "//*[@placeholder='Option Name']")
	public static WebElement optionname;
	
	@FindBy(xpath = "//*[@placeholder='Option Code']")
	public static WebElement optioncode;
	
	@FindBy(xpath = "//*[@placeholder='Description']")
	public static WebElement description;
	
	@FindBy(xpath = "//*[text()='Add Option']/following::mat-select")
	public static WebElement supplierdropdown;
	
	@FindBy(xpath = "//*[@class='cdk-overlay-pane']/div/div/div/mat-option[3]")
	public static WebElement selectsupplier;
	
	@FindBy(xpath = "//*[text()='Option has Price']/following::label[1]/div")
	public static WebElement optionhasprice;
	
	@FindBy(xpath = "//*[@placeholder='Unit Cost']")
	public static WebElement unitcost;
	
	@FindBy(xpath = "//*[text()='Option has Stock']/following::label[1]/div")
	public static WebElement optionhasstock;
	
	@FindBy(xpath = "//*[@id='optionPopupSave']")
	public static WebElement optionsavebtn;
	
	@FindBy(xpath = "//*[@id='addoptionsform']/div[2]/button[2]")
	public static WebElement optioncancelbtn;
	
	
	
	@FindBy(xpath = "//*[@id='optionmyGrids']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/div/div/div/div[2]/input")
	public static WebElement optioncheckboxs;
	

	@FindBy(xpath = "(//ag-grid-angular[@id='myGrid'])[2]/div/div[2]/div[2]/div[3]/div[2]/div/div/div/div[1]")
	public static WebElement linkedoptionname;
	
	@FindBy(xpath = "//*[@id='listOptions']/div/div/div[3]/button[2]")
	public static WebElement optionlistcancelbtn;
	
	
	
	@FindBy(xpath = "(//*[@col-id='Option Name'])[3]/span/a")
	public static WebElement suboptionname;
	
	
	@FindBy(xpath = "//*[@id='myGrid']/div/div[2]/div[2]/div[3]/div[4]/div/div/div/div/div[2]/div[2]/div[1]/div[3]/div/div[1]/div[3]/span/i")
	public static WebElement threedot;
	
	@FindBy(xpath = "(//*[@class='filtergirditem'])[2]")
	public static WebElement threedotuseexits;
	
	@FindBy(xpath = "(//*[@class='filtergirditem'])[1]")
	public static WebElement threedotaddnew;
	
	@FindBy(xpath = "//*[text()=' Create Recipe']")
	public static WebElement threedotcreaterecipe;
	
	
	
	
	
}
