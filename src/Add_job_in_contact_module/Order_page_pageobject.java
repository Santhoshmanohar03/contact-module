package Add_job_in_contact_module;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Order_page_pageobject {

	@FindBy(xpath = "//*[@id='dropdownMenuLink']")
	public static WebElement selectproduct;
	
	@FindBy(xpath = "/html/body/app-root/main/section/app-job/div[11]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div/div[2]/a[1]")
	public static WebElement selectnewproduct;
	
	@FindBy(xpath = "//*[@id='selectProductcustom']")
	public static WebElement searchfield;
	
	@FindBy(xpath = "//*[@id='mat-border']/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]/div")
	public static WebElement heading;
	
	
	
	
	@FindBy(xpath = "(//*[text()='Unit Type']/following::select[1])[1]")
	public static WebElement unittype;
	
	@FindBy(xpath = "(//*[text()='Width']/following::span[1])[2]")
	public static WebElement widthunit;
	
	@FindBy(xpath = "(//*[text()='Drop']/following::span[1])[2]")
	public static WebElement dropunit;
	

	
	
	
	
	
	
	@FindBy(xpath = "//*[text()='Quantity']/following::input[1]")
	public static WebElement quantity;
	
	@FindBy(xpath = "//*[@id='productstatus']/div/div[1]/span")
	public static WebElement productstatus;
	
	
	@FindBy(xpath = "//*[@id='productstatus']/div/div[2]/ul[2]/li[1]/div")
	public static WebElement selectproductstatus;
	
	@FindBy(xpath = "(//*[text()='Supplier']/following::select[1])[2]")
	public static WebElement supplier;
	
	@FindBy(xpath = "(//*[text()='Default List']/following::input[1])")
	public static WebElement defaultlist;
	
	@FindBy(xpath = "(//*[text()='Single Select List']/following::input[1])")
	public static WebElement singlelist;
	
	@FindBy(xpath = "(//*[text()='Multi Select List']/following::input[1])")
	public static WebElement multiselect;
	
	@FindBy(xpath = "(//*[@col-id='optionname'])[2]")
	public static WebElement selectoption1;
	
	@FindBy(xpath = "(//*[@col-id='optionname'])[3]")
	public static WebElement selectoption2;
	
	@FindBy(xpath = "(//*[text()='Width'])[2]//following::input[1]")
	public static WebElement width;
	
	@FindBy(xpath = "(//*[text()='Exact Or Recess'])[1]//following::input[1]")
	public static WebElement recess;
	
	@FindBy(xpath = "(//*[text()='Product Type'])[2]//following::select[1]")
	public static WebElement producttype;
	
	@FindBy(xpath = "(//*[text()='Pricing Groups'])[1]//following::select[1]")
	public static WebElement pricinggroup;

	@FindBy(xpath = "(//*[text()='Special Instruction']/following::input[1])")
	public static WebElement specialinst;
	
	@FindBy(xpath = "(//*[text()='Location List'])[1]//following::select[1]")
	public static WebElement locationlist;
	
	@FindBy(xpath = "//*[text()='Room']/following::input[1]")
	public static WebElement room;
	
	@FindBy(xpath = "//*[@id='exampleModalbk']/div/div/div/div[1]/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/div/div/div/div[2]")
	public static WebElement multiselect1;
	
	@FindBy(xpath = "//*[@id='exampleModalbk']/div/div/div/div[1]/ag-grid-angular/div/div[2]/div[2]/div[3]/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]")
	public static WebElement multiselect2;
	

	@FindBy(xpath = "//*[@id='modalsave']")
	public static WebElement save;
	
	@FindBy(xpath = "//*[@id='modalcancel']")
	public static WebElement cancel;
	
	
	@FindBy(xpath = "(//*[text()='Drop'])[2]//following::input[1]")
	public static WebElement drop;
	
	@FindBy(xpath = "(//*[text()='Awnings Materials'])[1]//following::input[1]")
	public static WebElement awningmaterials;
	
	@FindBy(xpath = "(//*[text()='Fabric'])[2]//following::input[1]")
	public static WebElement fabric;
	
	@FindBy(xpath = "//*[text()='Color']")
	public static WebElement colourfield;
	
	@FindBy(xpath = "(//*[text()='Color'])[1]//following::input[1]")
	public static WebElement colour;
	
	
	@FindBy(xpath = "(//*[text()='Bracket Covers'])[1]//following::input[1]")
	public static WebElement bracketcovers;
	
	 	
	
	
	@FindBy(xpath = "(//*[text()='Location'])[2]//following::input[1]")
	public static WebElement location;
	
	
	@FindBy(xpath = "//*[@id='sampleModal1']/div/div/div[2]/div/div[2]/div[2]/button[1]")
	public static WebElement productsave;
	
	
	@FindBy(xpath = "//*[@id='sampleModal1']/div/div/div[2]/div/div[2]/div[2]/button[2]")
	public static WebElement productcancel;
	
	@FindBy(xpath = "(//*[text()='Control Side'])[1]//following::input[1]")                  //venetains
	public static WebElement controlside;
	
	

	@FindBy(xpath = "(//*[text()='Location'])[2]//following::input[1]")
	public static WebElement location2;
	
	

	@FindBy(xpath = "(//*[text()='Fabric N'])[1]//following::select[1]")
	public static WebElement fabricN;
	

	@FindBy(xpath = "(//*[text()='Location Text'])[1]//following::input[1]")
	public static WebElement locationtext;
	

	@FindBy(xpath = "(//*[text()='New Item'])[1]//following::input[1]")
	public static WebElement newitem;
	
	
	
	@FindBy(xpath = "(//*[text()='Extra'])[1]//following::input[1]")              //awnings
	public static WebElement extra;
	
	
	@FindBy(xpath = "(//*[text()='X Square Meterage'])[1]//following::input[1]")              //shutter
	public static WebElement xsqure;
	
	@FindBy(xpath = "(//*[text()='Y Square Meterage'])[1]//following::input[1]")              //shutter
	public static WebElement ysqure;
	
	@FindBy(xpath = "(//*[text()='Tilt Rods'])[1]//following::input[1]")              //shutter
	public static WebElement tiltrods;
	
	@FindBy(xpath = "(//*[text()='Shutter Types'])[1]//following::input[1]")              //shutter
	public static WebElement shuttertype;
	

	@FindBy(xpath = "(//*[text()='Pair Single'])[1]//following::select[1]")            //curtains
	public static WebElement pairsingle;
	
	
	@FindBy(xpath = "(//*[text()='Lining Colors'])[1]//following::input[1]")         
	public static WebElement liningcolors;
	
	
	@FindBy(xpath = "(//*[text()='Blackout Linings Colors'])[1]//following::input[1]")             
	public static WebElement blackoutline;
	
	
	@FindBy(xpath = "(//*[text()='Sub'])[1]//following::input[1]")              
	public static WebElement sub;
	
	

	@FindBy(xpath = "(//*[text()='Soft Furnishing Materials'])[1]//following::input[1]")              
	public static WebElement softfurnishing;
	
	
	@FindBy(xpath = "(//*[text()='Lining Type'])[1]//following::input[1]")         
	public static WebElement liningtype;
	
	
	
	
	@FindBy(xpath = "//*[@id='jobproduct_grid']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/span/a")              
	public static WebElement Edit1;
	
	@FindBy(xpath = "//*[@id='jobproduct_grid']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[2]/div[1]/span/a")              
	public static WebElement Edit2;
	
	
	@FindBy(xpath = "//*[@id='jobproduct_grid']/div/div[2]/div[2]/div[3]/div[3]/div[1]/div[1]/app-moreoptionsrender/div/button/i")              
	public static WebElement option1;
	
	@FindBy(xpath = "//*[@id='jobproduct_grid']/div/div[2]/div[2]/div[3]/div[3]/div[2]/div[1]/app-moreoptionsrender/div/button/i")             
	public static WebElement option2;
	
	@FindBy(xpath = "//*[@id='jobproduct_grid']/div/div[2]/div[2]/div[3]/div[3]/div[3]/div[1]/app-moreoptionsrender/div/button/i")             
	public static WebElement option3;
	
	
	@FindBy(xpath = "//*[@id='jobproduct_grid']/div/div[2]/div[2]/div[3]/div[3]/div[1]/div[1]/app-moreoptionsrender/div/div/a[1]")              
	public static WebElement copy;
	
	
	@FindBy(xpath = "//*[@id='jobproduct_grid']/div/div[2]/div[2]/div[3]/div[3]/div[3]/div[1]/app-moreoptionsrender/div/div/a[1]")            
	public static WebElement copy2;
	
	@FindBy(xpath = "//*[@id='jobproduct_grid']/div/div[2]/div[2]/div[3]/div[3]/div[2]/div[1]/app-moreoptionsrender/div/div/a[2]")            
	public static WebElement hold;
	
	@FindBy(xpath = "//*[@id='jobproduct_grid']/div/div[2]/div[2]/div[3]/div[3]/div[2]/div[1]/app-moreoptionsrender/div/div/a[1]")            
	public static WebElement unhold;
	
	@FindBy(xpath = "//*[@id='jobproduct_grid']/div/div[2]/div[2]/div[3]/div[3]/div[1]/div[1]/app-moreoptionsrender/div/div/a[3]")             
	public static WebElement delete;
	
	@FindBy(xpath = "//*[@id='jobproduct_grid']/div/div[2]/div[2]/div[3]/div[3]/div[3]/div[1]/app-moreoptionsrender/div/div/a[3]")             
	public static WebElement delete2;
	
	@FindBy(xpath = "//*[@id='deletecomomnotfication']/div/div/div/div/div/button[1]")             
	public static WebElement deleteok;
	
	
	@FindBy(xpath = "//*[@id='jobproduct_grid']/div/div[2]/div[2]/div[3]/div[3]/div[1]/div[2]/div/div/span")             
	public static WebElement pp1;
	
	@FindBy(xpath = "//*[@id='jobproduct_grid']/div/div[2]/div[2]/div[3]/div[3]/div[2]/div[2]/div/div/span")              
	public static WebElement pp3;
	
	
	@FindBy(xpath = "(//*[@col-id='productname']/span/a)[1]")              
	public static WebElement productroller1;
	
	@FindBy(xpath = "//*[text()=' Rollers -blind fabrics ']")              
	public static WebElement productroller2;
	
	@FindBy(xpath = "(//*[@col-id='productname']/span/a)[2]")              
	public static WebElement productvenitian1;
	
	@FindBy(xpath = "//*[text()=' Venitians-Blind slats ']")              
	public static WebElement productvenitian2;
	
	@FindBy(xpath = "(//*[@col-id='productname']/span/a)[2]")              
	public static WebElement productshutter1;
	
	@FindBy(xpath = "//*[text()=' Shutters ']")              
	public static WebElement productshutter2;

	
	@FindBy(xpath = "(//*[@col-id='productname']/span/a)[2]")              
	public static WebElement productawnings1;
	
	@FindBy(xpath = "//*[text()=' Awnings ']")              
	public static WebElement productawnings2;

	
	@FindBy(xpath = "//*[text()='Update']")              
	public static WebElement waringcancel;


}
