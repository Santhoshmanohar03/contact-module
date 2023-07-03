package Blind_fabric_configure;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import initilizer.Login_the_page;

public class New_Blindfabric_formsetup extends Login_the_page{
	
	
	public static Properties formproperty() throws IOException {
		
		File f=new File("F:\\Product related project\\Product_Creation\\src\\Blind_fabric_configure\\FormSetup.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		return prop;
	}
	
	
	

	
	public static void numericXfield() throws InterruptedException, IOException {
		testcase = extents.createTest("Add New field ");
		PageFactory.initElements(driver, Add_product_pageobject.class);
		Thread.sleep(4000);
		Add_product_pageobject.addnewfieldbtn.click();
		Thread.sleep(2000);
		testcase.log(Status.INFO, "Click Add new button");
		Add_product_pageobject.fieldname.sendKeys(formproperty().getProperty("numericX"));
		Thread.sleep(1000);
		testcase.log(Status.INFO, "Enter field name:"+formproperty().getProperty("numericX"));
		Select select =new Select(Add_product_pageobject.fieldtype);
		select.selectByVisibleText("Numeric X");

		testcase.log(Status.INFO, "Select the field-"+	select.getFirstSelectedOption().getText());

		Add_product_pageobject.fieldsavebtn.click();
		testcase.log(Status.INFO, "Save the field");

		Thread.sleep(3000);
	
	}
	
public static void numericYfield() throws InterruptedException, IOException {
		
		PageFactory.initElements(driver, Add_product_pageobject.class);
		
		Add_product_pageobject.addnewfieldbtn.click();
		Thread.sleep(3000);
		testcase.log(Status.INFO, "Click Add new button");

		Add_product_pageobject.fieldname.sendKeys(formproperty().getProperty("numericY"));
	
		Thread.sleep(1000);
		testcase.log(Status.INFO, "Enter field name:"+formproperty().getProperty("numericY"));

		Select select =new Select(Add_product_pageobject.fieldtype);
		select.selectByVisibleText("Numeric Y");
		testcase.log(Status.INFO, "Select the field-"+	select.getFirstSelectedOption().getText());

		Add_product_pageobject.fieldsavebtn.click();
		Thread.sleep(2000);
		testcase.log(Status.INFO, "Save the field");

	}
	
public static void price_group() throws InterruptedException, IOException {
	
	PageFactory.initElements(driver, Add_product_pageobject.class);
	Thread.sleep(1000);
	Add_product_pageobject.addnewfieldbtn.click();
	Thread.sleep(2000);
	testcase.log(Status.INFO, "Click Add new button");

	Add_product_pageobject.fieldname.sendKeys(formproperty().getProperty("pricegroup"));
	
	testcase.log(Status.INFO, "Enter field name:"+formproperty().getProperty("pricegroup"));

	Thread.sleep(1000);
	Select select =new Select(Add_product_pageobject.fieldtype);
	select.selectByVisibleText("Pricing Group");
	testcase.log(Status.INFO, "Select the field-"+	select.getFirstSelectedOption().getText());

	Add_product_pageobject.fieldsavebtn.click();
	Thread.sleep(2000);
	testcase.log(Status.INFO, "Save the field");

}
	


public static void list_field() throws InterruptedException, IOException {
	
	PageFactory.initElements(driver, Add_product_pageobject.class);
	
	Add_product_pageobject.addnewfieldbtn.click();
	Thread.sleep(2000);
	testcase.log(Status.INFO, "Click Add new button");

	Add_product_pageobject.fieldname.sendKeys(formproperty().getProperty("list"));
	testcase.log(Status.INFO, "Enter field name:"+formproperty().getProperty("list"));

	Thread.sleep(1000);
	Select select =new Select(Add_product_pageobject.fieldtype);
	select.selectByVisibleText("List");
	
	testcase.log(Status.INFO, "Select the field-"+	select.getFirstSelectedOption().getText());

	
	Add_product_pageobject.fieldsavebtn.click();
	Thread.sleep(2000);
	testcase.log(Status.INFO, "Save the field");

}
public static void text_field() throws InterruptedException, IOException {
	
	PageFactory.initElements(driver, Add_product_pageobject.class);
	
	Add_product_pageobject.addnewfieldbtn.click();
	Thread.sleep(1000);
	testcase.log(Status.INFO, "Click Add new button");

	Add_product_pageobject.fieldname.sendKeys(formproperty().getProperty("Text"));
	testcase.log(Status.INFO, "Enter field name:"+formproperty().getProperty("Text"));
	Thread.sleep(1000);
	Select select =new Select(Add_product_pageobject.fieldtype);
	select.selectByVisibleText("Text");
	testcase.log(Status.INFO, "Select the field-"+	select.getFirstSelectedOption().getText());


	
	Add_product_pageobject.fieldsavebtn.click();
	Thread.sleep(3000);
	testcase.log(Status.INFO, "Save the field");

}

public static void locationlist() throws InterruptedException, IOException {
	
	PageFactory.initElements(driver, Add_product_pageobject.class);
	
	Add_product_pageobject.addnewfieldbtn.click();
	Thread.sleep(2000);
	testcase.log(Status.INFO, "Click Add new button");

	Add_product_pageobject.fieldname.sendKeys(formproperty().getProperty("locationlist"));
	testcase.log(Status.INFO, "Enter field name:"+formproperty().getProperty("locationlist"));

	Thread.sleep(1000);
	Select select =new Select(Add_product_pageobject.fieldtype);
	select.selectByVisibleText("Location_List");
	testcase.log(Status.INFO, "Select the field-"+	select.getFirstSelectedOption().getText());


	Add_product_pageobject.fieldsavebtn.click();
	Thread.sleep(2000);
	testcase.log(Status.INFO, "Save the field");

}

public static void numeric() throws InterruptedException, IOException {
	
	PageFactory.initElements(driver, Add_product_pageobject.class);
	
	Add_product_pageobject.addnewfieldbtn.click();
	Thread.sleep(1000);
	testcase.log(Status.INFO, "Click Add new button");

	Add_product_pageobject.fieldname.sendKeys(formproperty().getProperty("numeric"));
	testcase.log(Status.INFO, "Enter field name:"+formproperty().getProperty("numeric"));
	Thread.sleep(1000);
	Select select =new Select(Add_product_pageobject.fieldtype);
	select.selectByVisibleText("Numeric");
	testcase.log(Status.INFO, "Select the field-"+	select.getFirstSelectedOption().getText());
	
	
	Add_product_pageobject.fieldsavebtn.click();
	testcase.log(Status.INFO, "Save the field");
	Thread.sleep(2000);

}



public static void Blind_fabric_material() throws InterruptedException, IOException {
	
	PageFactory.initElements(driver, Add_product_pageobject.class);
	
	Add_product_pageobject.addnewfieldbtn.click();
	Thread.sleep(1000);
	testcase.log(Status.INFO, "Click Add new button");

	Add_product_pageobject.fieldname.sendKeys(formproperty().getProperty("material"));
	testcase.log(Status.INFO, "Enter field name:"+formproperty().getProperty("material"));

	Thread.sleep(1000);
	Select select =new Select(Add_product_pageobject.fieldtype);
	select.selectByVisibleText(formproperty().getProperty("blindfabric"));
	testcase.log(Status.INFO, "Select the field-"+	select.getFirstSelectedOption().getText());

	Add_product_pageobject.fieldsavebtn.click();
	Thread.sleep(3000);
	testcase.log(Status.INFO, "Save the field");
}

public static void Awnings_material() throws InterruptedException, IOException {
	
	PageFactory.initElements(driver, Add_product_pageobject.class);
	
	Add_product_pageobject.addnewfieldbtn.click();
	Thread.sleep(1000);
	testcase.log(Status.INFO, "Click Add new button");

	Add_product_pageobject.fieldname.sendKeys(formproperty().getProperty("Awningsmaterial"));
	testcase.log(Status.INFO, "Enter field name:"+formproperty().getProperty("Awningsmaterial"));

	Thread.sleep(1000);
	Select select =new Select(Add_product_pageobject.fieldtype);
	select.selectByVisibleText(formproperty().getProperty("awnings"));
	testcase.log(Status.INFO, "Select the field-"+	select.getFirstSelectedOption().getText());

	Add_product_pageobject.fieldsavebtn.click();
	Thread.sleep(3000);
	testcase.log(Status.INFO, "Save the field");
}


}
