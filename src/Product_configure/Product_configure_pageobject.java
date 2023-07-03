package Product_configure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product_configure_pageobject {

	
	@FindBy(xpath = "(//*[@class='mat-tab-labels'])[2]/div[9]")
	public static WebElement productconf;
	
	@FindBy(xpath = "//*[@id='headingOne']/h5/button")
	public static WebElement productenable;
	
	@FindBy(xpath = "//*[@id='product-enable-disble-col1']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div[2]/app-productdesktopcheckbox/label/span")
	public static WebElement product1;
	
	@FindBy(xpath = "//*[@id='product-enable-disble-col1']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[2]/div[2]/app-productdesktopcheckbox/label/span")
	public static WebElement product1online;
	
	@FindBy(xpath = "//*[@id='product-enable-disble-col1']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[3]/div[2]/app-productdesktopcheckbox/label/span")
	public static WebElement product2;

	@FindBy(xpath = "//*[@id='product-enable-disble-col2']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[3]/div[2]/app-productdesktopcheckbox/label/span")
	public static WebElement product2onlin;
	
	@FindBy(xpath = "//*[@id='product-enable-disble-col2']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[2]/div[2]/app-productdesktopcheckbox/label/span")
	public static WebElement product3;
	

	@FindBy(xpath = "//*[@id='product-enable-disble-col2']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div[2]/app-productdesktopcheckbox/label/span")
	public static WebElement product3online;
	
//	@FindBy(xpath = "//*[@id='product-enable-disble-col2']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[5]/div[2]/app-productdesktopcheckbox/label/span")
//	public static WebElement product4;

//	@FindBy(xpath = "//*[@id='product-enable-disble-col2']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[6]/div[2]/app-productdesktopcheckbox/label/span")
//	public static WebElement product4online;
//	
//	@FindBy(xpath = "//*[@id='product-enable-disble-col1']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[5]/div[2]/app-productdesktopcheckbox/label/span")
//	public static WebElement product5;
//
//	@FindBy(xpath = "//*[@id='product-enable-disble-col2']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[8]/div[2]/app-productdesktopcheckbox/label/span")
//	public static WebElement product5online;
//	
//	@FindBy(xpath = "//*[@id='product-enable-disble-col1']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[8]/div[2]/app-productdesktopcheckbox/label/span")
//	public static WebElement product6;
//	
	@FindBy(xpath = "(//*[@name='enabledesktop'])[1]")
	public static WebElement enable1;
	
	@FindBy(xpath = "(//*[@name='enabledesktop'])[2]")
	public static WebElement enable2;
	
	@FindBy(xpath = "(//*[@name='sellist1'])[1]")
	public static WebElement select1;
	
	@FindBy(xpath = "(//*[@name='sellist1'])[2]")
	public static WebElement select2;
	
	@FindBy(xpath = "(//*[@name='sellist1'])[3]")
	public static WebElement select3;
	
	@FindBy(xpath = "(//*[@name='sellist1'])[4]")
	public static WebElement select4;
	
	
	@FindBy(xpath = "//*[@id='headingtwo']/h5/button[1]")
	public static WebElement pricinggroup;
	
	
	
	@FindBy(xpath = "//*[@id='headingtwo']/h5/button[2]")
	public static WebElement adddiscountprice;
	
	@FindBy(xpath = "//*[@id='discount']")
	public static WebElement discountprice;
	
	@FindBy(xpath = "(//*[text()='Supplier'])[2]/following::mat-select[1]/div/div[1]")
	public static WebElement supplierprice;
	
	@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/div/mat-option[1]")
	public static WebElement selectsupplierprice;
	
	@FindBy(xpath = "//*[@id='pricetabledis']/div[2]/div/div/div/div[6]/mat-form-field/div/div/div/mat-select/div/div/span")
	public static WebElement productprice;
	
	@FindBy(xpath = "//*[@class='cdk-overlay-container']/div/div/div/div/div/mat-option[3]")
	public static WebElement selectproprice;
	
	@FindBy(xpath = "(//*[text()='Select Material Group'])[1]")
	public static WebElement materialprice;
	
	@FindBy(xpath = "(//*[@name='selectall'])[1]")
	public static WebElement selectmaterialprice;
	
	@FindBy(xpath = "//*[@id='pricetabledis']/div[3]/button[1]")
	public static WebElement savebtnprice;
	
	@FindBy(xpath = "//*[@id='pricetabledis']/div[3]/button[2]")
	public static WebElement cancelbtnprice;
	
	
}
	
	