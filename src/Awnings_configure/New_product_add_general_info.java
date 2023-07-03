package Awnings_configure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.nio.file.StandardCopyOption;

import com.aventstack.extentreports.Status;

import initilizer.Login_the_page;

public class New_product_add_general_info extends Login_the_page {
	
	





	public static void open_setting() throws InterruptedException {
		PageFactory.initElements(driver,Add_product_pageobject.class);
		testcase = extents.createTest("open setting page& Create new product(Blind Fabric");
		
		Actions actions=new Actions(driver);
		actions.moveToElement(Add_product_pageobject.admin).click(Add_product_pageobject.admin).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(Add_product_pageobject.settings).click(Add_product_pageobject.settings).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(Add_product_pageobject.productcol).click(Add_product_pageobject.productcol).build().perform();
			
	}
	
	public static void Create_new_Awnings_product() throws InterruptedException, IOException {
        Thread.sleep(5000);
		
		File f=new File("F:\\Product related project\\Product_Creation\\src\\initilizer\\file.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop2=new Properties();
		prop2.load(fis);
		
		String productname=prop2.getProperty("blindfabricproductname");
		
		
		PageFactory.initElements(driver,Add_product_pageobject.class);
		Add_product_pageobject.addproductbtn.click();
		testcase.log(Status.INFO, "Click Add New product button");
		Thread.sleep(3000);
		Add_product_pageobject.productname.sendKeys(prop2.getProperty("awningsproductname"));
		testcase.log(Status.INFO, "Enter the  product name");
		
		
       
		String productnamenumber =prop2.getProperty("awningsproductname").replaceAll("[^0-9]", ""); 
		int nameInt = Integer.parseInt(productnamenumber);
		nameInt++; 
		String nameplus = prop2.getProperty("awningsproductname").replaceAll("[0-9]", "") + String.format("%02d", nameInt); 
		System.out.println(nameplus);
		
		prop2.setProperty("awningsproductname", nameplus);
        

		
		Add_product_pageobject.productcode.sendKeys(prop2.getProperty("awningsproductcode"));
		testcase.log(Status.INFO, "Enter the product code");
		
		String productdcodenumer = prop2.getProperty("awningsproductcode").replaceAll("[^0-9]", ""); 
		int codeint = Integer.parseInt(productdcodenumer);
		codeint++; 
		String codeplus = prop2.getProperty("awningsproductcode").replaceAll("[0-9]", "") + String.format("%02d", codeint); 
		System.out.println(codeplus);
		
		prop2.setProperty("awningsproductcode", codeplus);
		
		
		
		Add_product_pageobject.productdescription.sendKeys(prop2.getProperty("productdescription"));
		testcase.log(Status.INFO, "Enter the product description");
		
		Add_product_pageobject.productcategory.click();
		Thread.sleep(2000);
		
	String procat="(//*[text()='"+propertyfile().getProperty("3")+"'])[2]";
	
		
		WebElement selectproduct = driver.findElement(By.xpath(procat));
		selectproduct.click();
		testcase.log(Status.INFO, "Select the product category");
		
		
		Select select=new Select(Add_product_pageobject.costpricecomes);
		select.selectByIndex(0);
		String CPC= select.getFirstSelectedOption().getText();
		testcase.log(Status.INFO, "Select the Cost Price comes from-"+CPC);

		
		Select select2 =new Select(Add_product_pageobject.sellingpricecomes);
		select2.selectByIndex(0);
		String SPC= select2.getFirstSelectedOption().getText();
		testcase.log(Status.INFO, "Select the Selling Price comes from-"+SPC);
		
		Add_product_pageobject.newproductsavebtn.click();
		testcase.log(Status.INFO, "Save the product");
		Thread.sleep(5000);
		
		String Heading= Add_product_pageobject.heading.getText();
		
		if(Heading.equals(productname)) {
			testcase.log(Status.PASS, "Successfully product created  "+Heading);
			
		}else {
			testcase.log(Status.FAIL, "product not properly created");
		}
		
		 FileOutputStream outputStream = new FileOutputStream(f);
		 prop2.store(outputStream, prop2.getProperty(""));
		 outputStream.close();
		
	}
	
	
	
	
	
	
	
	

}
