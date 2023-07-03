package Awnings_configure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import initilizer.Login_the_page;

public class Add_Option extends New_Blindfabric_formsetup {

	public static List<String> beforeaddoption = new ArrayList<String>();

	public static Properties prop3;
	public static String optionString;

	public static Properties options() throws IOException {

		File f = new File(
				"F:\\Product related project\\Product_Creation\\src\\Blind_fabric_configure\\option and fabric.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties prop3 = new Properties();
		prop3.load(fis);

		return prop3;

	}

	public static void add_new_option() throws IOException, InterruptedException {
		optionString = options().getProperty("optionname");
		testcase = extents.createTest("Add New Option And link ");

		File f = new File(
				"F:\\Product related project\\Product_Creation\\src\\Blind_fabric_configure\\option and fabric.properties");
		FileInputStream fis = new FileInputStream(f);
		prop3 = new Properties();
		prop3.load(fis);
		Thread.sleep(2000);
		String bg = "//*[text()=' " + formproperty().getProperty("list") + "  ']";

		WebElement element = driver.findElement(By.xpath(bg));
		element.click();
		testcase.log(Status.INFO, "Click the list option field");

		Thread.sleep(4000);



		PageFactory.initElements(driver, Add_product_pageobject.class);
		beforeaddoption.add(Add_product_pageobject.linkoptionbox.getText());

		if (Add_product_pageobject.fieldname.getAttribute("value").equals(element.getText())) {
			testcase.log(Status.PASS, "list option correctly opened");
		} else {
			testcase.log(Status.FAIL, "option wronly open*");
		}

		Add_product_pageobject.linkoptionplus.click();
		testcase.log(Status.INFO, "Click Plus button to open the exixting option pop-up");
		Thread.sleep(6000);

		Add_product_pageobject.addnewoption.click();
		testcase.log(Status.INFO, "Click +Add New Option button");

		Thread.sleep(4000);

		PageFactory.initElements(driver, Add_Option_pageobject.class);

		Add_Option_pageobject.optionname.sendKeys(prop3.getProperty("optionname"));
		testcase.log(Status.INFO, "Enter the option name");

		String optionamestring = prop3.getProperty("optionname").replaceAll("[^0-9]", "");
		int nameInt = Integer.parseInt(optionamestring);
		nameInt++; // Increment the numeric value
		String nameplus = prop3.getProperty("optionname").replaceAll("[0-9]", "") + String.format("%02d", nameInt);

		prop3.setProperty("optionname", nameplus);

		Add_Option_pageobject.optioncode.sendKeys(prop3.getProperty("optioncode"));
		testcase.log(Status.INFO, "Enter the Option code");

		String optioncodestring = prop3.getProperty("optioncode").replaceAll("[^0-9]", "");
		int codeInt = Integer.parseInt(optioncodestring);
		codeInt++;
		String codeplus = prop3.getProperty("optioncode").replaceAll("[0-9]", "") + String.format("%02d", codeInt);

		prop3.setProperty("optioncode", codeplus);

		Add_Option_pageobject.description.sendKeys(prop3.getProperty("description"));
		testcase.log(Status.INFO, "Enter the description");

		Add_Option_pageobject.supplierdropdown.click();
		testcase.log(Status.INFO, "Click the Supplier field to open the drop down");

		Thread.sleep(1000);
		Add_Option_pageobject.selectsupplier.click();
		testcase.log(Status.INFO, "Select the Supplier");

		Add_Option_pageobject.optionhasprice.click();
		testcase.log(Status.INFO, "Click the Option has Price toggle button");

		Add_Option_pageobject.unitcost.sendKeys(prop3.getProperty("unitcost"));
		testcase.log(Status.INFO, "Enter Unit cost value");

		Add_Option_pageobject.optionhasstock.click();
		testcase.log(Status.INFO, "Click the Option has Stock toggle button");

		Add_Option_pageobject.optionsavebtn.click();
		testcase.log(Status.INFO, "Click the save button to save the option");

		Thread.sleep(4000);

		try {
			Add_Option_pageobject.optioncancelbtn.click();
		} catch (Throwable e) {
			testcase.log(Status.PASS, "Successfully add a option");

		}

		FileOutputStream outputStream = new FileOutputStream(f);
		prop3.store(outputStream, prop3.getProperty(""));
		outputStream.close();

	}

	public static void link_the_option() throws InterruptedException, IOException {

		PageFactory.initElements(driver, Add_Option_pageobject.class);
		Thread.sleep(2000);
		Add_Option_pageobject.optioncheckboxs.click();
		testcase.log(Status.INFO, "Click  Option check box");

		String optionadded = Add_Option_pageobject.optioncheckboxs.getText();

		PageFactory.initElements(driver, Add_product_pageobject.class);

		Add_product_pageobject.linkoption.click();
		testcase.log(Status.INFO, "Click the Link option button to link the option");

		Thread.sleep(3000);
//		String afteraddoption=Add_product_pageobject.linkoptionbox.getText();
		List<String> afteraddoption = new ArrayList<String>();
		afteraddoption.add(Add_product_pageobject.linkoptionbox.getText());

		if (beforeaddoption.equals(afteraddoption)) {
			testcase.log(Status.FAIL, "Option not linked");
		} else {
			testcase.log(Status.PASS, "Option Successfully linked with the product");
		}
		Thread.sleep(4000);
		Add_product_pageobject.linkoptionbox.click();
		Thread.sleep(4000);
		testcase.log(Status.INFO, "Click Linked option box to open  ");

		PageFactory.initElements(driver, Add_Option_pageobject.class);

		String bg = "(//*[text()='" + optionadded + "'])[2]";

		WebElement optionelement = driver.findElement(By.xpath(bg));
		String op = optionelement.getText();
		if (optionelement.isDisplayed()) {
			testcase.log(Status.PASS, "option displayed successfully" + op);
		} else {
			testcase.log(Status.FAIL, "*option not linked");
		}
		int k = 0;
		try {
			for (int i = 1; i <= 20; i++) {
				WebElement element = driver.findElement(By
						.xpath("(//*[@id='myGrid']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[" + i + "]/div[1])[2]"));
				element.getText();
				k++;
			}

		} catch (Throwable e) {

			testcase.log(Status.INFO, "Linked option count: " + k);
		}
		testcase.log(Status.INFO, "Linked option count: " + k);

		Add_Option_pageobject.optionlistcancelbtn.click();

	}

	public static void save_the_options() throws InterruptedException {

		PageFactory.initElements(driver, Add_product_pageobject.class);
		Thread.sleep(5000);

//		try {
//			Add_product_pageobject.optiondefaultmulti.click();
//			Thread.sleep(1000);
//			Add_product_pageobject.selectdefaultoption.click();
//		} catch (Throwable e) {
//			// TODO: handle exception
//		}
//		try {
//			Thread.sleep(1000);
//			Select select =new Select(Add_product_pageobject.optiondefaultsingle);
//			select.selectByIndex(1);
//		} catch (Throwable e) {
//			
//		}
//		

		Add_product_pageobject.multiselect.click();
		Thread.sleep(1000);
		testcase.log(Status.INFO, "Click multi select radio button");
		Add_product_pageobject.optiondefaultmulti.click();
		Thread.sleep(1000);
		testcase.log(Status.INFO, "Click default box field");
		Add_product_pageobject.selectdefaultoption.click();

		Thread.sleep(1000);

		String mdefault = Add_product_pageobject.optiondefaultmulti.getText();

		testcase.log(Status.INFO, "Select desierd deafult field multiple-" + mdefault);

		Add_product_pageobject.singelselect.click();
		Thread.sleep(1000);
		testcase.log(Status.INFO, "Click single select radio button");

		Select select = new Select(Add_product_pageobject.optiondefaultsingle);
		select.selectByIndex(1);

		String sdefault = select.getFirstSelectedOption().getText();
		testcase.log(Status.INFO, "Select deafult option-" + sdefault);

		Thread.sleep(4000);
		Add_product_pageobject.fieldsavebtn.click();
		testcase.log(Status.INFO, "Save the Option field");
	}

	public static void subfield() throws InterruptedException, IOException {

		Thread.sleep(5000);

		String substring = "//*[text()=' " + formproperty().getProperty("list") + "  ']";

		WebElement subelement = driver.findElement(By.xpath(substring));

		Actions actions = new Actions(driver);

		actions.moveToElement(subelement).moveToElement(subelement, -60, 0).click().build().perform();

		Thread.sleep(2000);
		testcase.log(Status.INFO, "Click sub option  button");

		try {
			String op = "//*[text()=' " + optionString + "  ']";
			WebElement element3 = driver.findElement(By.xpath(op));
			if (element3.isDisplayed()) {

				testcase.log(Status.PASS, "linked option successfully viewed" + element3.getText());
			} else {
				testcase.log(Status.FAIL, "linked option not viewed" + element3.getText());
			}
		} catch (Throwable e) {
			// TODO: handle exception
		}

		try {
			String op = "//*[text()=' " + prop3.getProperty("optionname") + "  ']";
			WebElement element3 = driver.findElement(By.xpath(op));
			if (element3.isDisplayed()) {

				testcase.log(Status.PASS, "linked option successfully viewed" + element3.getText());
			} else {
				testcase.log(Status.FAIL, "linked option not viewed" + element3.getText());
			}
		} catch (Throwable e) {
			// TODO: handle exception
		}

		int k = 0;
		try {
			for (int i = 2; i <= 20; i++) {
				WebElement element = driver.findElement(By.xpath("(//*[@col-id='Option Name'])[" + i + "]"));
				element.getText();
				k++;
			}

		} catch (Throwable e) {

			testcase.log(Status.INFO, "Linked option count sub view: " + k);
		}

		Thread.sleep(2000);

		actions.moveToElement(subelement).moveToElement(subelement, -60, 0).click().build().perform();

	}

	public static void threedotoptions() throws InterruptedException, IOException {

		PageFactory.initElements(driver, Add_Option_pageobject.class);
		Thread.sleep(4000);

		File f = new File(
				"F:\\Product related project\\Product_Creation\\src\\Blind_fabric_configure\\option and fabric.properties");
		FileInputStream fis = new FileInputStream(f);
		prop3 = new Properties();
		prop3.load(fis);

		String substring = "//*[text()=' " + formproperty().getProperty("list") + "  ']";

		WebElement subelement = driver.findElement(By.xpath(substring));

		Actions action = new Actions(driver);
		action.moveToElement(subelement).moveToElement(subelement, -60, 0).click().build().perform();
		Thread.sleep(2000);
		Add_Option_pageobject.threedot.click();

		Actions actions = new Actions(driver);
		actions.moveToElement(Add_Option_pageobject.threedotaddnew).click().perform();
		Thread.sleep(4000);

		String optionT = prop3.getProperty("optionnameT");

		Add_Option_pageobject.optionname.sendKeys(prop3.getProperty("optionnameT"));
		testcase.log(Status.INFO, "Enter the option name");

		String optionamestring = prop3.getProperty("optionnameT").replaceAll("[^0-9]", "");
		int nameInt = Integer.parseInt(optionamestring);
		nameInt++; // Increment the numeric value
		String nameplus = prop3.getProperty("optionnameT").replaceAll("[0-9]", "") + String.format("%02d", nameInt);
		prop3.setProperty("optionnameT", nameplus);

		Add_Option_pageobject.optioncode.sendKeys(prop3.getProperty("optioncodeT"));
		testcase.log(Status.INFO, "Enter the Option code");

		String optioncodestring = prop3.getProperty("optioncodeT").replaceAll("[^0-9]", "");
		int codeInt = Integer.parseInt(optioncodestring);
		nameInt++; // Increment the numeric value
		String codeplus = prop3.getProperty("optioncodeT").replaceAll("[0-9]", "") + String.format("%02d", codeInt);

		prop3.setProperty("optioncodeT", codeplus);

		Add_Option_pageobject.description.sendKeys(prop3.getProperty("descriptionT"));
		testcase.log(Status.INFO, "Enter the description");

		Add_Option_pageobject.supplierdropdown.click();
		testcase.log(Status.INFO, "Clcik the Supplier field to open the drop down");

		Thread.sleep(1000);
		Add_Option_pageobject.selectsupplier.click();
		testcase.log(Status.INFO, "Select the Supplier");

		Add_Option_pageobject.optionhasprice.click();
		testcase.log(Status.INFO, "Click the Option has Price toggle button");

		Add_Option_pageobject.unitcost.sendKeys(prop3.getProperty("unitcostT"));
		testcase.log(Status.INFO, "Enter Unit cost value");

		Add_Option_pageobject.optionhasstock.click();
		testcase.log(Status.INFO, "Click the Option has Stock toggle button");

		Add_Option_pageobject.optionsavebtn.click();
		testcase.log(Status.INFO, "Click the save button to save the option");

		Thread.sleep(4000);

		try {
			Add_Option_pageobject.optioncancelbtn.click();
		} catch (Throwable e) {
			testcase.log(Status.PASS, "Successfully add a option");

		}
Thread.sleep(2000);
		FileOutputStream outputStream = new FileOutputStream(f);
		prop3.store(outputStream, prop3.getProperty(""));
		outputStream.close();

		String op = "//*[text()=' " + optionT + "  ']";
		WebElement element3 = driver.findElement(By.xpath(op));
		if (element3.isDisplayed()) {

			testcase.log(Status.PASS, "linked option successfully viewed from three dot add new" + element3.getText());
		}

		Add_Option_pageobject.threedot.click();

		Thread.sleep(1000);
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(Add_Option_pageobject.threedotuseexits).click().perform();
		testcase.log(Status.INFO, "Click  Option check box");
		Thread.sleep(7000);
		Add_Option_pageobject.optioncheckboxs.click();
		testcase.log(Status.INFO, "Click  Option check box");

		PageFactory.initElements(driver, Add_product_pageobject.class);

		Add_product_pageobject.linkoption.click();
		testcase.log(Status.INFO, "Click the Link option button to link the option");

		Thread.sleep(2000);

	}

}
