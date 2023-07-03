package Blind_fabric_configure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_product_pageobject {

	@FindBy(xpath = "//*[@class='mb-0 mx-2']")
	public static WebElement admin;


	@FindBy(xpath = "//*[text()=' Settings ']")
	public static WebElement settings;
	
	
	@FindBy(xpath = "//*[@id='settingscroll']/div[2]/div/div/div/div[2]/div[1]/div/a")
	public static WebElement productcol;
	

	@FindBy(xpath = "/html/body/app-root/main/section/app-product/div[1]/div/button")
	public static WebElement addproductbtn;
	
	@FindBy(id = "productname")
	public static WebElement productname;
	
	
	@FindBy(id = "pcode")
	public static WebElement productcode;
	
	
	@FindBy(id = "productdescription")
	public static WebElement productdescription;
	
	@FindBy(xpath = "//*[@name='category']/div/div[1]")
	public static WebElement productcategory;
	
	@FindBy(name = "costpricecomesfrom")
	public static WebElement costpricecomes;
	
	@FindBy(name = "netpricecomesfrom")
	public static WebElement sellingpricecomes;
	
	@FindBy(id = "savegeneralinfoButton")
	public static WebElement newproductsavebtn;
	
	@FindBy(xpath = "//*[@id='generalinfoform']/div[2]/button[2]")
	public static WebElement newproductcancelbtn;
	
	@FindBy(xpath = "//*[@class='header']/ul/li[1]/span")
	public static WebElement productheading;
	
	@FindBy(xpath = "//*[text()='Add New Field']")
	public static WebElement addnewfieldbtn;
	
	
	@FindBy(id = "feildName_id")
	public static WebElement fieldname;
	
	
	
	
	@FindBy(xpath = "//*[@id='fieldModal']/div/div/form/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/select")
	public static WebElement fieldtype;
	
	
	@FindBy(xpath = "//*[text()='Add New Field']")
	public static WebElement selectfield;
	
	@FindBy(xpath = "//*[@class='dropdown-menu show']/div/div[1]")
	public static WebElement listfield;
	
	@FindBy(xpath = "//*[@class='dropdown-menu show']/div/div[]")
	public static WebElement numericfield;
	
	@FindBy(xpath = "//*[@class='dropdown-menu show']/div/div[3]")
	public static WebElement qtyfield;
	
	@FindBy(xpath = "//*[@class='dropdown-menu show']/div/div[4]")
	public static WebElement pricinggroupfield;
	
	@FindBy(xpath = "//*[@class='dropdown-menu show']/div/div[5]")
	public static WebElement supplierfield;
	
	@FindBy(xpath = "//*[@class='dropdown-menu show']/div/div[6]")
	public static WebElement blindfabricfield;
	
	@FindBy(xpath = "//*[@class='dropdown-menu show']/div/div[7]")
	public static WebElement numericXfeild;
	
	@FindBy(xpath = "//*[@class='dropdown-menu show']/div/div[8]")
	public static WebElement numericYfield;
	
	@FindBy(xpath = "//*[@class='dropdown-menu show']/div/div[9]")
	public static WebElement locationlistfield;
	
	@FindBy(xpath = "//*[@class='dropdown-menu show']/div/div[10]")
	public static WebElement locationtextfield;
	
	@FindBy(xpath = "//*[@class='dropdown-menu show']/div/div[11]")
	public static WebElement textfeild;
	
	@FindBy(xpath = "//*[@class='dropdown-menu show']/div/div[12]")
	public static WebElement blindsopenwidthfield;
	
	@FindBy(xpath = "//*[@id='fieldModal']/div/div/form/div[3]/button[1]")
	public static WebElement fieldsavebtn;
	
	@FindBy(xpath = "//*[@id='fieldModal']/div/div/form/div[3]/button[2]")
	public static WebElement feildcancelbtn;
	
	
	@FindBy(xpath = "//*[@id='fieldModal']/div/div/form/div[2]/div/div[1]/div[4]/div[2]/div/ng-multiselect-dropdown/div/div[1]/span")
	public static WebElement optiondefaultmulti;
	
	
	@FindBy(xpath = "//*[@id='single']")
	public static WebElement singelselect;
	
	
	@FindBy(xpath = "//*[@id='single_1']")
	public static WebElement multiselect;
	
	
	
	@FindBy(xpath = "//*[@id='fieldModal']/div/div/form/div[2]/div/div[1]/div[4]/div[2]/div/select")
	public static WebElement optiondefaultsingle;
	
	@FindBy(xpath = "//*[@id='fieldModal']/div/div/form/div[2]/div/div[1]/div[4]/div[2]/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li[1]/div")
	public static WebElement selectdefaultoption;
	
	
	
	@FindBy(xpath = "//*[@id='fieldModal']/div/div/form/div[2]/div/div[1]/div[3]/div[2]/div/div[1]/div")
	public static WebElement linkoptionbox;
	
	@FindBy(xpath = "//*[@id='fieldModal']/div/div/form/div[2]/div/div[1]/div[3]/div[2]/div/div[1]/button")
	public static WebElement linkoptionplus;
	
	@FindBy(xpath = "//*[@id='existingOptions']/div/div/div[3]/button[1]")
	public static WebElement addnewoption;
	
	
	@FindBy(xpath = "//*[@id='existingOptions']/div/div/div[3]/button[2]")
	public static WebElement linkoption;
	
	
	@FindBy(xpath = "//*[@id='optionmyGrids']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div/div/div/div/div[2]/input")
	public static WebElement optionselectcheckbox;
	
	
	
	@FindBy(xpath = "//*[@class='mat-menu-trigger']/i")
	public static WebElement optionplusbtn;
	
	@FindBy(xpath = "//*[@class='cdk-overlay-pane']/div/div/li[1]")
	public static WebElement jobplus;
	
	@FindBy(xpath = "(//*[text()='Contact Info'])[2]")
	public static WebElement contactinfo;
	

	@FindBy(xpath = "//*[@id='dropdownMenuLink']")
	public static WebElement selectproduct;
	
	@FindBy(xpath = "/html/body/app-root/main/section/app-job/div[11]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div/div[2]/a[1]")
	public static WebElement selectnewproduct;
	
	@FindBy(xpath = "//*[@id='selectProductcustom']")
	public static WebElement searchfield;
	
	@FindBy(xpath = "/html/body/app-root/main/section/app-product-new/div[1]/ul/li[1]/span")
	public static WebElement heading;
	
	
	@FindBy(xpath = "//*[@placeholder='Location Name']")
	public static WebElement locationname;

	@FindBy(xpath = "//*[@id='optionPopupSave']")
	public static WebElement locationsave;
	

	
}
