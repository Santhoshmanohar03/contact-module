package Awnings_configure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fabric_pageobject {
	
	@FindBy(xpath = "//*[@id='materialFabric-modal']/div/div/div/h5")
	public static WebElement fabricheading;

	@FindBy(xpath = "//*[@placeholder='Fabric Name']")
	public static WebElement fabricname;
	
	
	@FindBy(xpath = "//*[@placeholder='Fabric Code']")
	public static WebElement fabriccode;
	
	
	@FindBy(xpath = "//*[@placeholder='Description']")
	public static WebElement description;
	
	
	@FindBy(xpath = "//*[text()='Material Fabric']/following::mat-select")
	public static WebElement supplier;
	
	@FindBy(xpath = "//*[@class='cdk-overlay-pane']/div/div/div/mat-option[3]")
	public static WebElement selectsupplier;
	
	@FindBy(xpath = "//*[@id='materialColor-modal']/div/div/div/h5")
	public static WebElement colorheading;
	
	@FindBy(xpath = "//*[@id='materialFabric-modal']/div/div/form/div[1]/div[2]/div/button")
	public static WebElement addcolour;
	
	@FindBy(xpath = "//*[@placeholder='Color Name']")
	public static WebElement colourname;
	
	@FindBy(xpath = "//*[@placeholder='Color Code']")
	public static WebElement colourcode;
	
	
	@FindBy(xpath = "//*[@placeholder='Customer Notes']")
	public static WebElement customernotes;
	
	
	@FindBy(xpath = "//*[text()='Color has Price']/following::label[1]/div")
	public static WebElement colorhasprice;
	
	
	@FindBy(xpath = "//*[@placeholder='Unit Cost']")
	public static WebElement unitcost;
	
	@FindBy(xpath = "//*[text()='Color has Stock']/following::label[1]/div")
	public static WebElement colorhasstock;
	
	@FindBy(xpath = "//*[@id='materialidform']/div[2]/div/button")
	public static WebElement coloursavebtn;
	
	@FindBy(xpath = "//*[@id='materialidform']/div[2]/button")
	public static WebElement colourcancelbtn;
	
	@FindBy(xpath = "//*[@id='allpricegrid']/div/div[2]/div[2]/div[1]/div[1]/div[1]/div/div[2]/div[2]")
	public static WebElement selectcheckbox;
	
	
	@FindBy(xpath = "//*[@id='materialFabric-modal']/div/div/form/div[2]/div/button[2]")
	public static WebElement savelinkarrow;
	
	@FindBy(xpath = "//*[@id='materialFabric-modal']/div/div/form/div[2]/div/div")
	public static WebElement linkandsave;
	
	
	@FindBy(xpath = "//*[@id='materialFabric-modal']/div/div/form/div[2]/button")
	public static WebElement fabricclose;
	
	
	
	@FindBy(xpath = "//*[@id='materialPriceGroup']/div/div/div[2]/div/div/div/button/i")
	public static WebElement priceggroupplusbtn;
	
	@FindBy(xpath = "//*[text()='Choose Supplier']/following::mat-select[1]")
	public static WebElement choosesupplier;
	
	@FindBy(xpath = "//*[@class='cdk-overlay-pane']/div/div/footer/button")
	public static WebElement addsupplier;
	
	@FindBy(xpath = "//*[@id='linkPriceSupplierpopup']/div/div/div[3]/button[1]")
	public static WebElement addnewsupplier;
	
	@FindBy(xpath = "//*[@placeholder='Supplier Name']")
	public static WebElement suppliername;
	
	@FindBy(xpath = "//*[@id='customform']/div[2]/button[1]")
	public static WebElement savesupplier;
	
	@FindBy(xpath = "(//*[@id='groupname'])[2]")
	public static WebElement pricegroupname;
	
	@FindBy(xpath = "//*[@id='priceForm']/div[2]/button[1]")
	public static WebElement pricegroupsave;
	
	@FindBy(xpath = "//*[text()='Select Pricing Group']/following::mat-select[1]/div/div[1]")
	public static WebElement selectpricegroup;
	
	@FindBy(xpath = "//*[@id='materialPriceGroup']/div/div/div[3]/button[1]")
	public static WebElement priceassignbtn;
	
	@FindBy(xpath = "(//*[@class='mat-tab-links'])[2]/a[1]")
	public static WebElement materials;
	
	
	
	@FindBy(xpath = "//*[text()=' Fields and Values table view  ']")
	public static WebElement fieldandvaluetag;
	
	
	@FindBy(xpath = "(//*[@class='mat-tab-links'])[2]/following::button[1]")
	public static WebElement addnewmaterials;
	
	
	@FindBy(xpath = "//*[@id='myGrid']/div/div[2]/div[2]/div[3]/div[4]/div/div/div/div/div[2]/div[2]/div[1]/div[3]/div/div[1]/div[3]/span/i")
	public static WebElement threedot;
	
	@FindBy(xpath = "(//*[@class='filtergirditem'])[2]")
	public static WebElement threedotuseexits;
	
	@FindBy(xpath = "(//*[@class='filtergirditem'])[1]")
	public static WebElement threedotaddnew;
	
	@FindBy(xpath = "//*[text()=' Create Recipe']")
	public static WebElement threedotcreaterecipe;
	
	
	
	
	@FindBy(xpath = "//*[@id='existingOptions']/div/div/div[3]/button[1]")
	public static WebElement addnewfabric;
	
	
	@FindBy(xpath = "//*[@id='existingOptions']/div/div/div[3]/button[2]")
	public static WebElement linkfabric;
	
}
