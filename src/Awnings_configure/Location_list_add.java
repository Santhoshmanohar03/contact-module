package Awnings_configure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Blind_fabric_configure.Add_Fabric;

public class Location_list_add extends Add_Fabric{

	
	public static void add_location_list() throws IOException, InterruptedException {
		File f=new File("F:\\Product related project\\Product_Creation\\src\\Blind_fabric_configure\\option and fabric.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop4 =new Properties();
		prop4.load(fis);
		
		String bg = "//*[text()=' " + formproperty().getProperty("locationlist") + "  ']";

		WebElement element = driver.findElement(By.xpath(bg));
		element.click();
		Thread.sleep(4000);
		PageFactory.initElements(driver,Add_product_pageobject.class);
		
		Add_product_pageobject.linkoptionplus.click();
		Thread.sleep(4000);
		Add_product_pageobject.addnewoption.click();
		Thread.sleep(2000);
		Add_product_pageobject.locationname.sendKeys(prop4.getProperty("location"));
		
		String fabricnamestring =prop4.getProperty("location").replaceAll("[^0-9]", ""); 
		int nameInt = Integer.parseInt(fabricnamestring);
		nameInt++; // Increment the numeric value
		String nameplus = prop4.getProperty("location").replaceAll("[0-9]", "") + String.format("%02d", nameInt); 
		
		prop4.setProperty("location", nameplus);
		
		Add_product_pageobject.locationsave.click();
		Thread.sleep(2000);
		FileOutputStream outputStream = new FileOutputStream(f);
		 prop4.store(outputStream, prop4.getProperty(""));
		 outputStream.close();
		Add_product_pageobject.optionselectcheckbox.click();
		
		Add_product_pageobject.linkoption.click();
		Thread.sleep(2000);
		Add_product_pageobject.fieldsavebtn.click();
		
	
		
	}
	
	
	
	
	
	
	

	
}
