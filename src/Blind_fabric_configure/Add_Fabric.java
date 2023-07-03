package Blind_fabric_configure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

public class Add_Fabric extends New_Blindfabric_formsetup{

	public static List<String> beforelinkedfabric=new ArrayList<String>();
 	public static List<String> afterlinkedfabric=new ArrayList<String>();
 	
 	
 	public static Properties prop4;
 	public static String fabricString;
 	public static String pricestring;
 	
	public static Properties options() throws IOException {

		File f=new File("F:\\Product related project\\Product_Creation\\src\\Blind_fabric_configure\\option and fabric.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop4=new Properties();
		prop4.load(fis);
		
		return prop4;
		
	}
 	
	
	public static void Add_new_fabric() throws InterruptedException, IOException {
		
		File f=new File("F:\\Product related project\\Product_Creation\\src\\Blind_fabric_configure\\option and fabric.properties");
		FileInputStream fis=new FileInputStream(f);
		prop4=new Properties();
		prop4.load(fis);
		
		PageFactory.initElements(driver, Fabric_pageobject.class);
		Thread.sleep(3000);
		testcase = extents.createTest("Add New Fabric And link ");
		Fabric_pageobject.materials.click();
		testcase.log(Status.INFO, "Click material tag  to open the page");

		Thread.sleep(7000);
		
		Fabric_pageobject.addnewmaterials.click();
		testcase.log(Status.INFO, "Click Add new material button");

		Thread.sleep(5000);
		
		if(Fabric_pageobject.fabricheading.isDisplayed()) {
			testcase.log(Status.PASS, "Add fabric popup page opened");
		}else {
			testcase.log(Status.FAIL, "Add fabric popup page not opened");

		}
		
		
		Fabric_pageobject.fabricname.sendKeys(prop4.getProperty("fabricname"));
		
		String fabricnamestring =prop4.getProperty("fabricname").replaceAll("[^0-9]", ""); 
		int nameInt = Integer.parseInt(fabricnamestring);
		nameInt++;
		String nameplus = prop4.getProperty("fabricname").replaceAll("[0-9]", "") + String.format("%02d", nameInt); 
		System.out.println(nameplus);
		prop4.setProperty("fabricname", nameplus);
	
		 fabricString=prop4.getProperty("fabricname");
		 
			testcase.log(Status.INFO, "enter the fabric name");

		
		Fabric_pageobject.fabriccode.sendKeys(prop4.getProperty("fabriccode"));
		
		String fabriccodestring =prop4.getProperty("fabriccode").replaceAll("[^0-9]", ""); 
		int codeInt = Integer.parseInt(fabriccodestring);
		codeInt++; 
		String codeplus = prop4.getProperty("fabriccode").replaceAll("[0-9]", "") + String.format("%02d", codeInt); 
		System.out.println(codeplus);
		
		prop4.setProperty("fabriccode", codeplus);
		testcase.log(Status.INFO, "enter the fabric code");

		
		Fabric_pageobject.description.sendKeys(prop4.getProperty("fabricdescription"));
		testcase.log(Status.INFO, "enter the fabric description");

		Fabric_pageobject.supplier.click();
		Thread.sleep(2000);
		Fabric_pageobject.selectsupplier.click();
		Thread.sleep(2000);
		testcase.log(Status.INFO, "Select fabric supplier");

		Fabric_pageobject.addcolour.click();
		testcase.log(Status.INFO, "click add color button");

		FileOutputStream outputStream = new FileOutputStream(f);
		 prop4.store(outputStream, prop4.getProperty(""));
		 outputStream.close();
		Thread.sleep(7000);
		
		if(Fabric_pageobject.colorheading.isDisplayed()) {
			testcase.log(Status.PASS, "Add color popup page opened");
		}else {
			testcase.log(Status.FAIL, "Add color popup page not opened");

		}
		Thread.sleep(3000);
		
		Fabric_pageobject.colourname.sendKeys(prop4.getProperty("colourname"));
		testcase.log(Status.INFO, "Enter the color name");
String colorname=prop4.getProperty("colourname");
		
		String colornamestring =prop4.getProperty("colourname").replaceAll("[^0-9]", ""); 
		int colornameInt = Integer.parseInt(colornamestring);
		colornameInt++; 
		String colornameplus = prop4.getProperty("colourname").replaceAll("[0-9]", "") + String.format("%02d", colornameInt); 
		System.out.println(colornameplus);
		prop4.setProperty("colourname", colornameplus);
	
		
		
		Fabric_pageobject.colourcode.sendKeys(prop4.getProperty("colourcode"));
		testcase.log(Status.INFO, "Enter the color code");
		String colourcodestring =prop4.getProperty("colourcode").replaceAll("[^0-9]", ""); 
		int colorcodeInt = Integer.parseInt(colourcodestring);
		colorcodeInt++; 
		String colorcodeplus = prop4.getProperty("colourcode").replaceAll("[0-9]", "") + String.format("%02d", colorcodeInt); 
		System.out.println(colorcodeplus);
		
		prop4.setProperty("colourcode", colorcodeplus);
		
		
		Fabric_pageobject.customernotes.sendKeys(prop4.getProperty("customernotes"));
		testcase.log(Status.INFO, "Enter the customer notes");
		
		
		Fabric_pageobject.colorhasprice.click();
		Thread.sleep(1000);
		testcase.log(Status.INFO, "Click color has price toggole button");
		Fabric_pageobject.unitcost.sendKeys(prop4.getProperty("colourunitcost"));
		testcase.log(Status.INFO, "Enter the unit cost");
		Thread.sleep(1000);
		
		Fabric_pageobject.colorhasstock.click();
		testcase.log(Status.INFO, "Click color has stock toggole button");
		Fabric_pageobject.coloursavebtn.click();
		testcase.log(Status.INFO, "Click save to save the color");
		Thread.sleep(4000);
		
		
		
		
		String color="//*[text()=' "+colorname+" ']";
		WebElement elementc=driver.findElement(By.xpath(color));
		if(elementc.isDisplayed()) {
			testcase.log(Status.PASS, "Color successfully added");
		}else {
			testcase.log(Status.FAIL, "Color not displayed");

		}
		
		FileOutputStream outputStreamc = new FileOutputStream(f);
		 prop4.store(outputStreamc, prop4.getProperty(""));
		 outputStreamc.close();
		 
		Fabric_pageobject.selectcheckbox.click();
		
		Fabric_pageobject.savelinkarrow.click();
		
		Actions actions=new Actions(driver);
		actions.moveToElement(Fabric_pageobject.linkandsave).click(Fabric_pageobject.linkandsave).build().perform();
		Thread.sleep(3000);
		
		Fabric_pageobject.priceggroupplusbtn.click();
		Thread.sleep(2000);
		Fabric_pageobject.choosesupplier.click();
		
		Fabric_pageobject.addsupplier.click();
		Thread.sleep(3000);
		Fabric_pageobject.addnewsupplier.click();
		Thread.sleep(3000);
	
		
		Fabric_pageobject.suppliername.sendKeys(prop4.getProperty("supplier"));
		
		
		Fabric_pageobject.savesupplier.click();
		Thread.sleep(2000);
		
		 
		 
		
		Fabric_pageobject.choosesupplier.click();
		Thread.sleep(2000);
		String supp="//*[text()=' "+prop4.getProperty("supplier")+" ']";
	
		
		WebElement element=driver.findElement(By.xpath(supp));
		element.click();
		
		
		String supplierstring =prop4.getProperty("supplier").replaceAll("[^0-9]", ""); 
		int supplierInt = Integer.parseInt(supplierstring);
		supplierInt++; 
		String supplierplus = prop4.getProperty("supplier").replaceAll("[0-9]", "") + String.format("%02d", supplierInt); 
		System.out.println(supplierplus);
		prop4.setProperty("supplier", supplierplus);
		
		
		Fabric_pageobject.pricegroupname.sendKeys(prop4.getProperty("addpricegroup"));

		Fabric_pageobject.pricegroupsave.click();
		
		Thread.sleep(2000);

		 pricestring=prop4.getProperty("addpricegroup");
		
		Fabric_pageobject.selectpricegroup.click();
		Thread.sleep(1000);
String group="//*[text()=' "+prop4.getProperty("addpricegroup")+" ']";
		
		WebElement element2=driver.findElement(By.xpath(group));
		element2.click();
		
		
		String pricerstring =prop4.getProperty("addpricegroup").replaceAll("[^0-9]", ""); 
		int pricerInt = Integer.parseInt(pricerstring);
		pricerInt++; 
		String priceplus = prop4.getProperty("addpricegroup").replaceAll("[0-9]", "") + String.format("%02d", pricerInt); 
		System.out.println(priceplus);
		prop4.setProperty("addpricegroup", priceplus);

		Thread.sleep(1000);
		
		
		Actions actions2 = new Actions(driver);
		actions2.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(3000);
		
		Fabric_pageobject.priceassignbtn.click();
		
		Thread.sleep(5000);
		FileOutputStream outputStream2 = new FileOutputStream(f);
		 prop4.store(outputStream2, prop4.getProperty(""));
		 outputStream2.close();
	
	}
	
	
	public  static void verify_and_link_the_fabric() throws InterruptedException, IOException {
		
		
		
		PageFactory.initElements(driver, Fabric_pageobject.class);
		
		
		try {
			Fabric_pageobject.fieldandvaluetag.click();
		} catch (Throwable e) {
			// TODO: handle exception
		}
		Thread.sleep(5000);
		
		String substring="//*[text()=' "+formproperty().getProperty("material")+"  ']";

		WebElement subelement=driver.findElement(By.xpath(substring));
		
		Actions actions=new Actions(driver);
		
		actions.moveToElement(subelement).moveToElement(subelement,-65 , 0).click().build().perform();
		Thread.sleep(3000);

		
		try {
			String fabric="//*[text()=' "+fabricString+"  ']";	
			WebElement element=driver.findElement(By.xpath(fabric));
			
			if(element.isDisplayed()) {
				System.out.println("fabric linked successfully"+element.getText() );
				Actions actions2=new Actions(driver);
				actions2.moveToElement(element).click(element).build().perform();
				Thread.sleep(4000);
				Fabric_pageobject.fabricclose.click();
			}else {
				System.out.println("fabric not linked");
			}
			
		} catch (Throwable e) {
			
		}
		
		try {
			String fabric="//*[text()=' "+prop4.getProperty("fabricname")+"  ']";	
			WebElement element=driver.findElement(By.xpath(fabric));
			
			if(element.isDisplayed()) {
				System.out.println("fabric linked successfully"+element.getText() );
				Actions actions2=new Actions(driver);
				actions2.moveToElement(element).click(element).build().perform();
				Thread.sleep(4000);
				Fabric_pageobject.fabricclose.click();
			}else {
				System.out.println("fabric not linked");
			}
			
			
			
		} catch (Throwable e) {
			// TODO: handle exception
		}
		
		
		
		
		
		Thread.sleep(2000);
		
		Fabric_pageobject.threedot.click();
		
		Thread.sleep(2000);
		
		Actions actions2=new Actions(driver);
		actions2.moveToElement(Fabric_pageobject.threedotuseexits).click(Fabric_pageobject.threedotuseexits).build().perform();
		
		Thread.sleep(3000);
		
	
		for(int i=1;i<=4;i++) {
			String check="//*[@id='optionmyGrids']/div/div[2]/div[2]/div[3]/div[2]/div/div/div["+i+"]/div[1]/div/div/div/div[2]/input";
		WebElement element2=driver.findElement(By.xpath(check));
		element2.click();
		}
		
		
		
		for(int k=2;k<=5;k++) {
		
		String fabriccol="(//*[@col-id='Fabric Name'])["+k+"]";
		WebElement element3=driver.findElement(By.xpath(fabriccol));
       String linkfabric= element3.getText();
		beforelinkedfabric.add(linkfabric);
		}
		System.out.println(beforelinkedfabric);
		
		
		
		Fabric_pageobject.linkfabric.click();
		
		Thread.sleep(2000);
		
		Fabric_pageobject.selectpricegroup.click();
		Thread.sleep(1000);

		
		try {
			String group="//*[text()=' "+prop4.getProperty("addpricegroup")+" ']";
			
			WebElement element2=driver.findElement(By.xpath(group));
			element2.click();
		} catch (Throwable e) {
			// TODO: handle exception
		}
		
		try {
			String group="//*[text()=' "+pricestring+" ']";
			
			WebElement element2=driver.findElement(By.xpath(group));
			element2.click();
		} catch (Throwable e) {
			// TODO: handle exception
		}		
		
		
		
		
		
		
		Thread.sleep(1000);
		
		
		Actions actions3 = new Actions(driver);
		actions3.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		
		Fabric_pageobject.priceassignbtn.click();
		
		
		
		Thread.sleep(4000);
		
		

		
		
		try {
			for(int j=2;j<=5;j++) {
				
				String fabriccol="(//*[@col-id='name'])["+j+"]/span";
				WebElement element5=driver.findElement(By.xpath(fabriccol));
		       String linkfabric= element5.getText();
		       afterlinkedfabric.add(linkfabric);
				}
		} catch (Throwable e) {
			
		}
		
System.out.println("form page:   "+afterlinkedfabric);
	
	
	int x = beforelinkedfabric.size();
	for (int i = 0; i <= x - 1; i++) {
		if (beforelinkedfabric.get(i).equals(afterlinkedfabric.get(i))) {
			System.out.println("matched"+beforelinkedfabric.get(i) + "----" + afterlinkedfabric.get(i));
//			testcase.log(Status.PASS, contactinfoinput.get(i) + "----" + contactinfo2.get(i));
		} else {
			System.out.println("not matched"+beforelinkedfabric.get(i) + "----" + afterlinkedfabric.get(i));
//			testcase.log(Status.FAIL, "not matched" + contactinfoinput.get(i) + "----" + contactinfo2.get(i));
		}
	}
	
	
	
	System.out.println("aafter linked fabric:   "+afterlinkedfabric);
	
	Actions actions4=new Actions(driver);
	
	actions4.moveToElement(subelement).moveToElement(subelement,-65 , 0).click().build().perform();
	Thread.sleep(3000);

	}
}
