package Add_job_in_contact_module;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import Add_customer_scenario.Contact_comparison_info_pageobject;
import Initilaizer.login_pageobject;
import Initilaizer.login_the_page;

public class Ordering_page extends Add_Job {

	

	public static void Roller() throws InterruptedException {
		testcase = extents.createTest("Blind fabric product ordering ");
		PageFactory.initElements(driver, Order_page_pageobject.class);
		Thread.sleep(7000);
//		Order_page_pageobject.selectproduct.click();
//		Thread.sleep(2000);
//		
//		testcase.log(Status.INFO, "Click the Select product field to open the product list ");
//		Order_page_pageobject.searchfield.sendKeys("rollers");
//		Thread.sleep(2000);
//		
//		testcase.log(Status.INFO, "Enter the desierd product in seach field");
//		Order_page_pageobject.selectnewproduct.click();
		
		
		
		
		
		try {
			Actions actions=new Actions(driver);
			actions.moveToElement(Order_page_pageobject.selectproduct).build().perform();
			Thread.sleep(1000);
			actions.moveToElement(Order_page_pageobject.searchfield).sendKeys(Order_page_pageobject.searchfield, "roller").build().perform();
			actions.moveToElement(Order_page_pageobject.selectnewproduct).click(Order_page_pageobject.selectnewproduct).build().perform();
			testcase.log(Status.INFO, "Select roller product category product");
		} catch (Throwable e) {
			Thread.sleep(1000);
			Actions actions=new Actions(driver);
			actions.moveToElement(Order_page_pageobject.selectproduct).build().perform();
			Thread.sleep(2000);
			actions.moveToElement(Order_page_pageobject.searchfield).sendKeys(Order_page_pageobject.searchfield, "roller").build().perform();
			actions.moveToElement(Order_page_pageobject.selectnewproduct).click(Order_page_pageobject.selectnewproduct).build().perform();
			testcase.log(Status.INFO, "Select roller product category product");
		}
		
		
		testcase.log(Status.INFO, "Select the product");

		Thread.sleep(1000);

		String heading = Order_page_pageobject.heading.getText();

		Thread.sleep(1000);

		if (heading.equals("Rollers -Blind Fabrics Info")) {
			testcase.log(Status.PASS, "Blind fabric product order page open product:" + heading);
		} else {
			testcase.log(Status.FAIL, "Blind fabric product order page *not open product:" + heading);
		}

		Order_page_pageobject.productstatus.click();
		Thread.sleep(1000);
		Order_page_pageobject.selectproductstatus.click();
		testcase.log(Status.PASS, "Select the product status");

		Thread.sleep(1000);
		Select select2 = new Select(Order_page_pageobject.unittype);
//		List<WebElement> list3 = select2.getOptions();
//		int size3 = list3.size();
//		for (int i = 0; i <= size3 - 1; i++) {
//			select2.selectByIndex(i);
//		}
		select2.selectByVisibleText(" mm ");
	
		Thread.sleep(1000);
		testcase.log(Status.INFO, "Select the  unit type");

		Order_page_pageobject.quantity.clear();
		Order_page_pageobject.quantity.sendKeys("2");
		
		Thread.sleep(1000);
		Order_page_pageobject.room.sendKeys("10");
		
		Thread.sleep(1000);

		Select select5 = new Select(Order_page_pageobject.unittype);
		String unittype = select5.getFirstSelectedOption().getText();

		String widthunit = Order_page_pageobject.widthunit.getText();

		String dropunit = Order_page_pageobject.dropunit.getText();

		if ((unittype.equals(widthunit)) && (unittype.equals(dropunit))) {
			testcase.log(Status.PASS, "unit type correctly fixed in width & drop field Unit Type: " + unittype);
		} else {
			testcase.log(Status.FAIL, "unit type mismatch in width & drop field");
		}

		Order_page_pageobject.width.sendKeys("sasa");
		String width = Order_page_pageobject.width.getAttribute("value");
		if (width.isEmpty()) {
			
			testcase.log(Status.PASS, "alphapets not allowed in width field ");
			Order_page_pageobject.width.sendKeys("1000");
		} else {
	
			testcase.log(Status.FAIL, "Alphapets& simples allowed in width field");
		}

		Order_page_pageobject.drop.sendKeys("sasa");
		String drop = Order_page_pageobject.drop.getAttribute("value");
		if (drop.isEmpty()) {
			
			testcase.log(Status.PASS, "alphapets not allowed in drop field ");
			Order_page_pageobject.drop.sendKeys("1000");
		} else {
			
			testcase.log(Status.FAIL, "Alphapets& simples allowed in drop field");
		}

		Thread.sleep(1000);
		Select select3 = new Select(Order_page_pageobject.supplier);
		select3.selectByIndex(1);
		Thread.sleep(1000);
		Select select4 = new Select(Order_page_pageobject.pricinggroup);
		select4.selectByIndex(1);
		
		Thread.sleep(1000);
//		Thread.sleep(5000);
//		Thread.sleep(3000);
		Order_page_pageobject.fabric.click();
		testcase.log(Status.INFO, "Click Fabric field to select the color");
		Thread.sleep(3000);
//		Order_page_pageobject.fabric.click();
//		Thread.sleep(2000);

		String option = Order_page_pageobject.selectoption2.getText();
		Order_page_pageobject.selectoption2.click();
		Thread.sleep(3000);
		String selectedoption = Order_page_pageobject.fabric.getAttribute("value");

		if (option.equals(selectedoption)) {
			testcase.log(Status.PASS, "Selected  fabric option successfully view");
		} else {
			testcase.log(Status.FAIL, "Fabric option not displayed");
		}

		Order_page_pageobject.colour.click();
		Thread.sleep(3000);
		testcase.log(Status.INFO, "Click Color field to select the color");
		String colour = Order_page_pageobject.selectoption1.getText();
		Order_page_pageobject.selectoption1.click();
		testcase.log(Status.INFO, "Select a color");
		Thread.sleep(1000);
		String selectedcolour = Order_page_pageobject.colour.getAttribute("value");
		if (colour.equals(selectedcolour)) {
			testcase.log(Status.PASS, "Selected  colour option successfully view");
		} else {
			testcase.log(Status.FAIL, "colour option not displayed");
		}

		Order_page_pageobject.defaultlist.click();
		Thread.sleep(1000);
		testcase.log(Status.INFO, "Click Defaultlist field to select the option");
	
		Order_page_pageobject.multiselect1.click();
		
		testcase.log(Status.INFO, "Select the first option to remove default option");
		Thread.sleep(1000);
		Order_page_pageobject.multiselect2.click();
		testcase.log(Status.INFO, "Select the second option ");
		Order_page_pageobject.save.click();
		Thread.sleep(2000);
		
		testcase.log(Status.INFO, "Click the save button in the defaultlist popup");

		Thread.sleep(1000);
		Order_page_pageobject.specialinst.click();
		Order_page_pageobject.specialinst.sendKeys("12121");
		testcase.log(Status.INFO, "Enter the value in speciallist field");
		Thread.sleep(2000);

		List<String> rollerinfoinput = new ArrayList<String>();
		List<String> rollerinfooutput = new ArrayList<String>();

		Select select = new Select((Order_page_pageobject.unittype));
		rollerinfoinput.add(select.getFirstSelectedOption().getText());
		rollerinfoinput.add(Order_page_pageobject.quantity.getAttribute("value"));
		rollerinfoinput.add(Order_page_pageobject.room.getAttribute("value"));

		rollerinfoinput.add(Order_page_pageobject.width.getAttribute("value"));
		rollerinfoinput.add(Order_page_pageobject.drop.getAttribute("value"));
		Select select1 = new Select((Order_page_pageobject.supplier));
		rollerinfoinput.add(select1.getFirstSelectedOption().getText());
		Select select6 = new Select((Order_page_pageobject.pricinggroup));
		rollerinfoinput.add(select6.getFirstSelectedOption().getText());
		rollerinfoinput.add(Order_page_pageobject.fabric.getAttribute("value"));
		rollerinfoinput.add(Order_page_pageobject.colour.getAttribute("value"));
		rollerinfoinput.add(Order_page_pageobject.defaultlist.getAttribute("value"));
		rollerinfoinput.add(Order_page_pageobject.specialinst.getAttribute("value"));
		
		
		
		testcase.log(Status.INFO, "Get & Store the input values of all the field:  "+rollerinfoinput);
		Order_page_pageobject.productsave.click();
		
		testcase.log(Status.INFO, "Click the save button to save the order");
		Thread.sleep(1000);
		try {
			Order_page_pageobject.productroller2.click();
			testcase.log(Status.INFO, "Click the blind fabric product(rollers-blind fabric)");
		} catch (Exception e) {
			Thread.sleep(3000);
			Order_page_pageobject.productroller1.click();
			testcase.log(Status.INFO, "Click the blind fabric product(rollers-blind fabric)");
		}
		Thread.sleep(7000);
		
		

		try {
			Thread.sleep(2000);
			Order_page_pageobject.waringcancel.click();
//			if(Order_page_pageobject.heading.isEnabled()) {
//				testcase.log(Status.INFO, "exits oreder page opened");
//			}else {
//				testcase.log(Status.WARNING, "warning popup open ");
//				Order_page_pageobject.waringcancel.click();
//			}
			
		} catch (Throwable e) {
			
		}
		Thread.sleep(1000);
		Select select8 = new Select((Order_page_pageobject.unittype));
		rollerinfooutput.add(select8.getFirstSelectedOption().getText());
		rollerinfooutput.add(Order_page_pageobject.quantity.getAttribute("value"));
		rollerinfooutput.add(Order_page_pageobject.room.getAttribute("value"));

		rollerinfooutput.add(Order_page_pageobject.width.getAttribute("value"));
		rollerinfooutput.add(Order_page_pageobject.drop.getAttribute("value"));
		Select select9 = new Select((Order_page_pageobject.supplier));
		rollerinfooutput.add(select9.getFirstSelectedOption().getText());
		Select select10 = new Select((Order_page_pageobject.pricinggroup));
		rollerinfooutput.add(select10.getFirstSelectedOption().getText());
		rollerinfooutput.add(Order_page_pageobject.fabric.getAttribute("value"));
		rollerinfooutput.add(Order_page_pageobject.colour.getAttribute("value"));
		rollerinfooutput.add(Order_page_pageobject.defaultlist.getAttribute("value"));
		rollerinfooutput.add(Order_page_pageobject.specialinst.getAttribute("value"));
		testcase.log(Status.INFO, "Get & Store saved product values of all the field:  "+rollerinfooutput);
		Order_page_pageobject.productcancel.click();
		
		System.out.println(rollerinfoinput+"    input");
		System.out.println(rollerinfooutput+"    output");
		
		
		int x = rollerinfoinput.size();
		for (int i = 0; i <= x - 1; i++) {
			if (rollerinfoinput.get(i).equals(rollerinfooutput.get(i))) {
				
				testcase.log(Status.PASS, rollerinfoinput.get(i) + "----" + rollerinfooutput.get(i));
			} else {
				
				testcase.log(Status.FAIL, "not matched" + rollerinfoinput.get(i) + "----" + rollerinfooutput.get(i));
			}
		}
		
	}

	public static void venetains_product() throws InterruptedException {
		testcase = extents.createTest("Blind Slat product ordering ");
		PageFactory.initElements(driver, Order_page_pageobject.class);
		Thread.sleep(2000);
//		try {
//			Order_page_pageobject.selectproduct.click();
//			Thread.sleep(2000);
//
//		} catch (Throwable e) {
//			Thread.sleep(2000);
//			Order_page_pageobject.selectproduct.click();
//			Thread.sleep(2000);
//		}
//		testcase.log(Status.INFO, "Click the Select product field to open the product list ");
//
//		Order_page_pageobject.searchfield.sendKeys("venitians");
//		Thread.sleep(1000);
//		testcase.log(Status.INFO, "Click the Select product field to open the product list ");
//		Order_page_pageobject.selectnewproduct.click();
//		
		
		Actions actions=new Actions(driver);
		actions.moveToElement(Order_page_pageobject.selectproduct).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(Order_page_pageobject.searchfield).sendKeys(Order_page_pageobject.searchfield, "venitians").build().perform();
		actions.moveToElement(Order_page_pageobject.selectnewproduct).click(Order_page_pageobject.selectnewproduct).build().perform();
		
		
		
		
		Thread.sleep(2000);
		testcase.log(Status.INFO, "Select the product");

		String heading = Order_page_pageobject.heading.getText();

		Thread.sleep(1000);

		if (heading.equals("Venitians-Blind Slats Info")) {
			testcase.log(Status.PASS, "Blind slat product order page open product:" + heading);
		} else {
			testcase.log(Status.FAIL, "Blind slat product order page *not open product:" + heading);
		}

		Select select2 = new Select(Order_page_pageobject.unittype);
//		List<WebElement> list3 = select2.getOptions();
//		int size3 = list3.size();
//		for (int i = 0; i <= size3 - 1; i++) {
//			select2.selectByIndex(i);
//		}
		select2.selectByVisibleText(" mm ");
		testcase.log(Status.INFO, "Select the  unit type");

		Thread.sleep(1000);
		Order_page_pageobject.quantity.clear();
		Order_page_pageobject.quantity.sendKeys("2");
		Thread.sleep(1000);

		Select select3 = new Select(Order_page_pageobject.supplier);
		select3.selectByIndex(1);
		Thread.sleep(1000);
		testcase.log(Status.INFO, "Select the  Supplier");

		Select select5 = new Select(Order_page_pageobject.unittype);
		String unittype = select5.getFirstSelectedOption().getText();

		String widthunit = Order_page_pageobject.widthunit.getText();

		String dropunit = Order_page_pageobject.dropunit.getText();

		if ((unittype.equals(widthunit)) && (unittype.equals(dropunit))) {
			testcase.log(Status.PASS, "unit type correctly fixed in width & drop field Unit Type: " + unittype);
		} else {
			testcase.log(Status.FAIL, "unit type mismatch in width & drop field");
		}

		Order_page_pageobject.width.sendKeys("sasa");
		String width = Order_page_pageobject.width.getAttribute("value");
		if (width.isEmpty()) {
						testcase.log(Status.PASS, "alphapets not allowed in width field ");
			Order_page_pageobject.width.sendKeys("1000");
		} else {
			
			testcase.log(Status.FAIL, "Alphapets& simples allowed in width field");
		}

		

		Order_page_pageobject.drop.sendKeys("sasa");
		String drop = Order_page_pageobject.drop.getAttribute("value");
		if (drop.isEmpty()) {
			
			testcase.log(Status.PASS, "alphapets not allowed in drop field ");
			Order_page_pageobject.drop.sendKeys("1000");
		} else {
			
			testcase.log(Status.FAIL, "Alphapets& simples allowed in drop field");
		}



		try {
			Select select4 = new Select(Order_page_pageobject.producttype);
			select4.selectByIndex(1);
			testcase.log(Status.INFO, "Select the product type");

		} catch (Throwable e) {
			// TODO: handle exception
		}

		Thread.sleep(1000);

		Order_page_pageobject.recess.click();
		testcase.log(Status.INFO, "Click the Exact or recess field");
		// Order_page_pageobject.recess.click();
		Thread.sleep(1000);
		String option = Order_page_pageobject.selectoption1.getText();
		Order_page_pageobject.selectoption1.click();
		testcase.log(Status.INFO, "Click the Exact or recess field");
		
		String selectedoption = Order_page_pageobject.recess.getAttribute("value");

		if (option.equals(selectedoption)) {
			testcase.log(Status.PASS, "Selected  recess(list) option successfully view");
		} else {
			testcase.log(Status.FAIL, "recess(list) option not displayed");
		}
		Thread.sleep(1000);
		Order_page_pageobject.multiselect.click();
		testcase.log(Status.INFO, "Click the multiselect field");
		Thread.sleep(1000);
		Order_page_pageobject.multiselect1.click();
		
		testcase.log(Status.INFO, "Click the first option in the list");
		Order_page_pageobject.multiselect2.click();
	
		testcase.log(Status.INFO, "Click the second option in the list");
		Order_page_pageobject.save.click();
		Thread.sleep(1000);
		testcase.log(Status.INFO, "Click the save button");

		Order_page_pageobject.colour.click();
		Thread.sleep(2000);
		testcase.log(Status.INFO, "Click the color field (blind slat materials field");
		String colour = Order_page_pageobject.selectoption1.getText();
		Order_page_pageobject.selectoption1.click();

		Thread.sleep(2000);
		String selectedcolor = Order_page_pageobject.colour.getAttribute("value");

		if (colour.equals(selectedcolor)) {
			testcase.log(Status.PASS, "Selected  colour option successfully view");
		} else {
			testcase.log(Status.FAIL, "colour option not displayed");
		}
	
		Order_page_pageobject.location2.sendKeys("santh");
	
		testcase.log(Status.INFO, "enter the value in location field");
	

		Order_page_pageobject.locationtext.sendKeys("Los Angeles");
		Thread.sleep(1000);
		testcase.log(Status.INFO, "enter the value in location text field");
		Thread.sleep(1000);
		List<String> venitiansinfoinput = new ArrayList<String>();
		List<String> venitiansinfooutput = new ArrayList<String>();

		Select select = new Select((Order_page_pageobject.unittype));
		venitiansinfoinput.add(select.getFirstSelectedOption().getText());
		venitiansinfoinput.add(Order_page_pageobject.quantity.getAttribute("value"));
		Select select1 = new Select((Order_page_pageobject.supplier));
		venitiansinfoinput.add(select1.getFirstSelectedOption().getText());
		
		venitiansinfoinput.add(Order_page_pageobject.width.getAttribute("value"));
		venitiansinfoinput.add(Order_page_pageobject.drop.getAttribute("value"));
		Select select6 = new Select((Order_page_pageobject.producttype));
		venitiansinfoinput.add(select6.getFirstSelectedOption().getText());
		venitiansinfoinput.add(Order_page_pageobject.recess.getAttribute("value"));
		venitiansinfoinput.add(Order_page_pageobject.multiselect.getAttribute("value"));
		venitiansinfoinput.add(Order_page_pageobject.colour.getAttribute("value"));
		venitiansinfoinput.add(Order_page_pageobject.location.getAttribute("value"));
		venitiansinfoinput.add(Order_page_pageobject.locationtext.getAttribute("value"));
		
		
		
		testcase.log(Status.INFO, "Get & Store the input values of all the field:  "+venitiansinfoinput);
		Order_page_pageobject.productsave.click();
		
		testcase.log(Status.INFO, "Click the save button to save the order");
		
		try {
			Order_page_pageobject.productvenitian2.click();
			testcase.log(Status.INFO, "Click the blind slat product(venitians- blind slat)");
		} catch (Exception e) {
			Thread.sleep(3000);
			Order_page_pageobject.productvenitian1.click();
			testcase.log(Status.INFO, "Click the blind slat product(venitians- blind slat)");
		}
		Thread.sleep(5000);
		Select select8 = new Select((Order_page_pageobject.unittype));
		venitiansinfooutput.add(select8.getFirstSelectedOption().getText());
		venitiansinfooutput.add(Order_page_pageobject.quantity.getAttribute("value"));
		Select select9 = new Select((Order_page_pageobject.supplier));
		venitiansinfooutput.add(select9.getFirstSelectedOption().getText());

		venitiansinfooutput.add(Order_page_pageobject.width.getAttribute("value"));
		venitiansinfooutput.add(Order_page_pageobject.drop.getAttribute("value"));
		
		Select select10 = new Select((Order_page_pageobject.producttype));
		venitiansinfooutput.add(select10.getFirstSelectedOption().getText());
		
		venitiansinfooutput.add(Order_page_pageobject.recess.getAttribute("value"));
		venitiansinfooutput.add(Order_page_pageobject.multiselect.getAttribute("value"));
		venitiansinfooutput.add(Order_page_pageobject.colour.getAttribute("value"));
		venitiansinfooutput.add(Order_page_pageobject.location.getAttribute("value"));
		venitiansinfooutput.add(Order_page_pageobject.locationtext.getAttribute("value"));
		testcase.log(Status.INFO, "Get & Store saved product values of all the field:  "+venitiansinfooutput);
		Order_page_pageobject.productcancel.click();
		
		System.out.println(venitiansinfoinput+"    input");
		System.out.println(venitiansinfooutput+"    output");
		
		
		int x = venitiansinfoinput.size();
		for (int i = 0; i <= x - 1; i++) {
			if (venitiansinfoinput.get(i).equals(venitiansinfooutput.get(i))) {
				
				testcase.log(Status.PASS, venitiansinfoinput.get(i) + "----" + venitiansinfooutput.get(i));
			} else {
				testcase.log(Status.FAIL, "not matched" + venitiansinfoinput.get(i) + "----" + venitiansinfooutput.get(i));
			}
		}
		


	}

	public static void Awnings() throws InterruptedException {
		PageFactory.initElements(driver, Order_page_pageobject.class);
		Thread.sleep(3000);

		testcase = extents.createTest("Awnings product ordering ");
//		Order_page_pageobject.selectproduct.click();
//		Thread.sleep(2000);
//		testcase.log(Status.INFO, "Click the Select product field to open the product list ");
//		Order_page_pageobject.searchfield.sendKeys("awnings");
//		Thread.sleep(1000);
//		Order_page_pageobject.selectnewproduct.click();
//		
		
		Actions actions=new Actions(driver);
		actions.moveToElement(Order_page_pageobject.selectproduct).build().perform();
		Thread.sleep(1000);
		actions.moveToElement(Order_page_pageobject.searchfield).sendKeys(Order_page_pageobject.searchfield, "Awnings").build().perform();
		actions.moveToElement(Order_page_pageobject.selectnewproduct).click(Order_page_pageobject.selectnewproduct).build().perform();
		
		
		
		testcase.log(Status.INFO, "Select the  Awnings product");
		
		
		Thread.sleep(2000);

		String heading = Order_page_pageobject.heading.getText();

		Thread.sleep(1000);

		if (heading.equals("Awnings Info")) {
			testcase.log(Status.PASS, "Awnings product order page open product:" + heading);
		} else {
			testcase.log(Status.FAIL, "Awnings product order page *not open product:" + heading);
		}

		Select select2 = new Select(Order_page_pageobject.unittype);
//		List<WebElement> list3 = select2.getOptions();
//		int size3 = list3.size();
//		for (int i = 0; i <= size3 - 1; i++) {
//			select2.selectByIndex(i);
//		}
		select2.selectByVisibleText(" mm ");

		testcase.log(Status.INFO, "Select the  unit type");
		Thread.sleep(1000);
		Order_page_pageobject.quantity.clear();
		Order_page_pageobject.quantity.sendKeys("2");
		testcase.log(Status.INFO, "Clear &ente the quantity");
		

		Select select3 = new Select(Order_page_pageobject.supplier);
		select3.selectByIndex(1);
		Thread.sleep(1000);

		testcase.log(Status.INFO, "Select the supplier ");

		Select select5 = new Select(Order_page_pageobject.unittype);
		String unittype = select5.getFirstSelectedOption().getText();

		String widthunit = Order_page_pageobject.widthunit.getText();

		String dropunit = Order_page_pageobject.dropunit.getText();

		if ((unittype.equals(widthunit)) && (unittype.equals(dropunit))) {
			testcase.log(Status.PASS, "unit type correctly fixed in width & drop field");
		} else {
			testcase.log(Status.FAIL, "unit type mismatch in width & drop field");
		}
		Order_page_pageobject.width.sendKeys("sasa");
		String width = Order_page_pageobject.width.getAttribute("value");
		if (width.isEmpty()) {
			testcase.log(Status.PASS, "alphapets not allowed in width field ");
			Order_page_pageobject.width.sendKeys("1000");
		} else {
			testcase.log(Status.FAIL, "Alphapets& simples allowed in width field");
		}
		
		Order_page_pageobject.drop.sendKeys("sasa");
		String drop = Order_page_pageobject.drop.getAttribute("value");
		if (drop.isEmpty()) {
			testcase.log(Status.PASS, "alphapets not allowed in drop field ");
			Order_page_pageobject.drop.sendKeys("1000");
		} else {
			testcase.log(Status.FAIL, "Alphapets& simples allowed in drop field");
		}

	

		Thread.sleep(2000);
		Order_page_pageobject.awningmaterials.click();
		testcase.log(Status.INFO, "Click awnings material field to select the color");
		Thread.sleep(3000);

		
		
		String option = Order_page_pageobject.selectoption1.getText();
		Order_page_pageobject.selectoption1.click();
		Thread.sleep(2000);
		String selectedoption = Order_page_pageobject.awningmaterials.getAttribute("value");
 
		if (option.equals(selectedoption)) {
			testcase.log(Status.PASS, "Selected awnings material option successfully view");
		} else {
			testcase.log(Status.FAIL, "awnings material option not displayed");
		}
	
		Order_page_pageobject.colour.click();
		Thread.sleep(3000);
		testcase.log(Status.INFO, "Click Color field to select the color");
		String colour = Order_page_pageobject.selectoption1.getText();
		Order_page_pageobject.selectoption1.click();

		Thread.sleep(2000);
		String selectedcolour = Order_page_pageobject.colour.getAttribute("value");
		if (colour.equals(selectedcolour)) {
			testcase.log(Status.PASS, "Selected  colour option successfully view");
		} else {
			testcase.log(Status.FAIL, "colour option not displayed");
		}

		Select select4 = new Select(Order_page_pageobject.producttype);
		select4.selectByIndex(1);
		testcase.log(Status.INFO, "Select the product type");

		Thread.sleep(2000);
		Order_page_pageobject.multiselect.click();
		Thread.sleep(2000);
		testcase.log(Status.INFO, "Click the multiselect field");
		Thread.sleep(2000);
		Order_page_pageobject.multiselect1.click();
		
		testcase.log(Status.INFO, "Click the first option in the list");
		Order_page_pageobject.multiselect2.click();
	
		testcase.log(Status.INFO, "Click the second option in the list");
		Order_page_pageobject.save.click();
		Thread.sleep(2000);
		testcase.log(Status.INFO, "Click the save button");

		Select select = new Select(Order_page_pageobject.locationlist);
		select.selectByIndex(1);
		testcase.log(Status.INFO, "Select the location list");
	
		Order_page_pageobject.location.sendKeys("australia");
		testcase.log(Status.INFO, "Enter in the loaction text field");
	
		
		List<String> vawningsinfoinput = new ArrayList<String>();
		List<String> awningsinfooutput = new ArrayList<String>();

		Select select6 = new Select((Order_page_pageobject.unittype));
		vawningsinfoinput.add(select6.getFirstSelectedOption().getText());
		vawningsinfoinput.add(Order_page_pageobject.quantity.getAttribute("value"));
		Select select1 = new Select((Order_page_pageobject.supplier));
		vawningsinfoinput.add(select1.getFirstSelectedOption().getText());
		
		
		vawningsinfoinput.add(Order_page_pageobject.width.getAttribute("value"));
		vawningsinfoinput.add(Order_page_pageobject.drop.getAttribute("value"));
		vawningsinfoinput.add(Order_page_pageobject.awningmaterials.getAttribute("value"));
		
		vawningsinfoinput.add(Order_page_pageobject.colour.getAttribute("value"));
		
		
		
		Select select7 = new Select((Order_page_pageobject.producttype));
		vawningsinfoinput.add(select7.getFirstSelectedOption().getText());
		
		vawningsinfoinput.add(Order_page_pageobject.multiselect.getAttribute("value"));
		
		vawningsinfoinput.add(Order_page_pageobject.locationlist.getAttribute("value"));
		vawningsinfoinput.add(Order_page_pageobject.location.getAttribute("value"));
		
		
		
		testcase.log(Status.INFO, "Get & Store the input values of all the field:  "+vawningsinfoinput);
		Order_page_pageobject.productsave.click();
		
		testcase.log(Status.INFO, "Click the save button to save the order");
		Thread.sleep(3000);
		try {
			Order_page_pageobject.productawnings2.click();
			testcase.log(Status.INFO, "Click the Awnings product");
		} catch (Exception e) {
			
			Order_page_pageobject.productawnings1.click();
			testcase.log(Status.INFO, "Click the blind slat product");
		}
		Thread.sleep(4000);
	

		try {
			Order_page_pageobject.waringcancel.click();
//			if(Order_page_pageobject.heading.isEnabled()) {
//				testcase.log(Status.INFO, "exits oreder page opened");
//			}else {
//				testcase.log(Status.WARNING, "warning popup open ");
//				Order_page_pageobject.waringcancel.click();
//			}
			
		} catch (Throwable e) {
			
		}
		Thread.sleep(1000);
		Select select8 = new Select((Order_page_pageobject.unittype));
		awningsinfooutput.add(select8.getFirstSelectedOption().getText());
		awningsinfooutput.add(Order_page_pageobject.quantity.getAttribute("value"));
		Select select9 = new Select((Order_page_pageobject.supplier));
		awningsinfooutput.add(select9.getFirstSelectedOption().getText());

		awningsinfooutput.add(Order_page_pageobject.width.getAttribute("value"));
		awningsinfooutput.add(Order_page_pageobject.drop.getAttribute("value"));
		awningsinfooutput.add(Order_page_pageobject.awningmaterials.getAttribute("value"));
		try {
			awningsinfooutput.add(Order_page_pageobject.colour.getAttribute("value"));
		} catch (Throwable e) {
			testcase.log(Status.ERROR, "colour field not visible");
			awningsinfooutput.add(null);
		}
		
		
		
		Select select10 = new Select((Order_page_pageobject.producttype));
		awningsinfooutput.add(select10.getFirstSelectedOption().getText());
		
		
		awningsinfooutput.add(Order_page_pageobject.multiselect.getAttribute("value"));
		
		awningsinfooutput.add(Order_page_pageobject.locationlist.getAttribute("value"));
		awningsinfooutput.add(Order_page_pageobject.location.getAttribute("value"));
		testcase.log(Status.INFO, "Get & Store saved product values of all the field:  "+awningsinfooutput);
		Order_page_pageobject.productcancel.click();
		
		System.out.println(vawningsinfoinput+"    input");
		System.out.println(awningsinfooutput+"    output");
		
		
		int x = vawningsinfoinput.size();
		for (int i = 0; i <= x - 1; i++) {
			if (vawningsinfoinput.get(i).equals(awningsinfooutput.get(i))) {
				testcase.log(Status.PASS, vawningsinfoinput.get(i) + "----" + awningsinfooutput.get(i));
			} else {
				testcase.log(Status.FAIL, "not matched" + vawningsinfoinput
						.get(i) + "----" + awningsinfooutput.get(i));
			}
		}
		


	}
	
	
	
	
	
	
	
	

	public static void Shutter() throws InterruptedException {

		PageFactory.initElements(driver, Order_page_pageobject.class);
		Thread.sleep(3000);
		testcase = extents.createTest("Blind fabric product order ");
//		try {
//			Order_page_pageobject.selectproduct.click();
//
//		} catch (Exception e) {
//			Thread.sleep(5000);
//			Order_page_pageobject.selectproduct.click();
//			Thread.sleep(2000);
//		}
//		testcase.log(Status.INFO, "Click the Select product field to open the product list ");
//		Order_page_pageobject.searchfield.sendKeys("shutter");
//		Thread.sleep(1000);
//		testcase.log(Status.INFO, "Enter the desierd product in seach field");
//		Order_page_pageobject.selectnewproduct.click();
//		testcase.log(Status.INFO, "Select the product");
	

		Actions actions=new Actions(driver);
		actions.moveToElement(Order_page_pageobject.selectproduct).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(Order_page_pageobject.searchfield).sendKeys(Order_page_pageobject.searchfield, "shutters").build().perform();
		actions.moveToElement(Order_page_pageobject.selectnewproduct).click(Order_page_pageobject.selectnewproduct).build().perform();
		
		
		
		testcase.log(Status.INFO, "Select the  Shutter product ");
		
		Thread.sleep(3000);
		String heading = Order_page_pageobject.heading.getText();

		Thread.sleep(1000);

		if (heading.equals("Shutters Info")) {
			testcase.log(Status.PASS, "Shutter product order page open product:" + heading);
		} else {
			testcase.log(Status.FAIL, "Shutter product order page *not open product:" + heading);
		}

		Select select2 = new Select(Order_page_pageobject.unittype);
//		List<WebElement> list3 = select2.getOptions();
//		int size3 = list3.size();
//		for (int i = 0; i <= size3 - 1; i++) {
//			select2.selectByIndex(i);
//		}
		select2.selectByVisibleText(" mm ");
		Thread.sleep(1000);
		Order_page_pageobject.quantity.clear();
		Order_page_pageobject.quantity.sendKeys("2");
		
		Select select3 = new Select(Order_page_pageobject.supplier);
		select3.selectByIndex(1);
		Thread.sleep(1000);
//		Select select4 = new Select(Order_page_pageobject.producttype);
//		select4.selectByIndex(1);
//		Thread.sleep(1000);
//		log.info("Select the  producttype");

		Order_page_pageobject.xsqure.sendKeys("sasa");
		String xsqure = Order_page_pageobject.xsqure.getAttribute("value");
		if (xsqure.isEmpty()) {
			testcase.log(Status.PASS, "alphapets not allowed in xsqure field ");
			Order_page_pageobject.xsqure.sendKeys("1000");
		} else {
			testcase.log(Status.FAIL, "Alphapets& simples allowed in xsqure filed");
		}

		Order_page_pageobject.ysqure.sendKeys("sasa");
		String ysqure = Order_page_pageobject.ysqure.getAttribute("value");
		if (ysqure.isEmpty()) {
			testcase.log(Status.PASS, "alphapets not allowed in ysqure field ");
			Order_page_pageobject.ysqure.sendKeys("1000");
		} else {
			testcase.log(Status.FAIL, "Alphapets& simples allowed in ysqure filed");
		}

		Thread.sleep(1000);



		Order_page_pageobject.specialinst.sendKeys("blindtrade");
	

		Order_page_pageobject.location.sendKeys("sasa");
		Thread.sleep(2000);
		Order_page_pageobject.shuttertype.click();
		Thread.sleep(3000);
		testcase.log(Status.INFO, "Click shuttertype field to select the color");
		String option = Order_page_pageobject.selectoption1.getText();
		Order_page_pageobject.selectoption1.click();
		Thread.sleep(2000);
		String selectedoption = Order_page_pageobject.shuttertype.getAttribute("value");

		if (option.equals(selectedoption)) {
			testcase.log(Status.PASS, "Selected  shuttertype option successfully view");
		} else {
			testcase.log(Status.FAIL, "shuttertype option not displayed");
		}

		Order_page_pageobject.colour.click();
		Thread.sleep(3000);
		testcase.log(Status.INFO, "Click Color field to select the color");
		String colour = Order_page_pageobject.selectoption1.getText();
		Order_page_pageobject.selectoption1.click();
		Thread.sleep(2000);
		String selectedcolour = Order_page_pageobject.colour.getAttribute("value");
		if (colour.equals(selectedcolour)) {
			testcase.log(Status.PASS, "Selected  colour option successfully view");
		} else {
			testcase.log(Status.FAIL, "colour option not displayed");
		}
//		Order_page_pageobject.extra.click();
//		Thread.sleep(2000);
//		Order_page_pageobject.singleselect1.click();
//		Thread.sleep(2000);

		Order_page_pageobject.multiselect.click();

		testcase.log(Status.INFO, "Click the multiselect field");
		Thread.sleep(2000);
		Order_page_pageobject.multiselect1.click();

		testcase.log(Status.INFO, "Click the first option in the list");
		Order_page_pageobject.multiselect2.click();

		testcase.log(Status.INFO, "Click the second option in the list");
		Order_page_pageobject.save.click();
		Thread.sleep(2000);
		testcase.log(Status.INFO, "Click the save button");
		
		
		
		List<String> shutterinfoinput = new ArrayList<String>();
		List<String> shutterinfooutput = new ArrayList<String>();

		Select select6 = new Select((Order_page_pageobject.unittype));
		shutterinfoinput.add(select6.getFirstSelectedOption().getText());
		shutterinfoinput.add(Order_page_pageobject.quantity.getAttribute("value"));
		Select select1 = new Select((Order_page_pageobject.supplier));
		shutterinfoinput.add(select1.getFirstSelectedOption().getText());
//		Select select7 = new Select((Order_page_pageobject.producttype));
//		shutterinfoinput.add(select7.getFirstSelectedOption().getText());
		
		shutterinfoinput.add(Order_page_pageobject.xsqure.getAttribute("value"));
		shutterinfoinput.add(Order_page_pageobject.ysqure.getAttribute("value"));
		shutterinfoinput.add(Order_page_pageobject.specialinst.getAttribute("value"));
		shutterinfoinput.add(Order_page_pageobject.shuttertype.getAttribute("value"));
		
		shutterinfoinput.add(Order_page_pageobject.colour.getAttribute("value"));
		
		shutterinfoinput.add(Order_page_pageobject.multiselect.getAttribute("value"));
		
	
		
		
		
		testcase.log(Status.INFO, "Get & Store the input values of all the field:  "+shutterinfoinput);
		Order_page_pageobject.productsave.click();
		
		testcase.log(Status.INFO, "Click the save button to save the order");
		Thread.sleep(3000);
		try {
			Order_page_pageobject.productshutter2.click();
			testcase.log(Status.INFO, "Click the shutter product");
		} catch (Exception e) {
			Thread.sleep(1000);
			Order_page_pageobject.productshutter1.click();
			testcase.log(Status.INFO, "Click the shutter product");
		}
		Thread.sleep(3000);

		try {
			
			if(Order_page_pageobject.heading.isDisplayed()) {
				testcase.log(Status.INFO, "exits oreder page opened");
			}else {
				testcase.log(Status.WARNING, "warning popup open ");
				Order_page_pageobject.waringcancel.click();
			}
			
		} catch (Throwable e) {
			
		}
		Thread.sleep(1000);
		
		Select select8 = new Select((Order_page_pageobject.unittype));
		shutterinfooutput.add(select8.getFirstSelectedOption().getText());
		shutterinfooutput.add(Order_page_pageobject.quantity.getAttribute("value"));
		Select select9 = new Select((Order_page_pageobject.supplier));
		shutterinfooutput.add(select9.getFirstSelectedOption().getText());
//		Select select10 = new Select((Order_page_pageobject.producttype));
//		shutterinfooutput.add(select10.getFirstSelectedOption().getText());
//		
		
		shutterinfooutput.add(Order_page_pageobject.xsqure.getAttribute("value"));
		shutterinfooutput.add(Order_page_pageobject.ysqure.getAttribute("value"));
		shutterinfooutput.add(Order_page_pageobject.specialinst.getAttribute("value"));
		shutterinfooutput.add(Order_page_pageobject.shuttertype.getAttribute("value"));
		try {
			shutterinfooutput.add(Order_page_pageobject.colour.getAttribute("value"));
		} catch (Throwable e) {
			testcase.log(Status.ERROR, "colour field not visible");
			shutterinfooutput.add(null);
		}
	
		shutterinfooutput.add(Order_page_pageobject.multiselect.getAttribute("value"));
		
		
		testcase.log(Status.INFO, "Get & Store saved product values of all the field:  "+shutterinfooutput);
		Order_page_pageobject.productcancel.click();
		
		System.out.println(shutterinfoinput+"    input");
		System.out.println(shutterinfooutput+"    output");
		
		
		int x = shutterinfoinput.size();
		for (int i = 0; i <= x - 1; i++) {
			if (shutterinfoinput.get(i).equals(shutterinfooutput.get(i))) {
				testcase.log(Status.PASS, shutterinfoinput.get(i) + "----" + shutterinfooutput.get(i));
			} else {
				testcase.log(Status.FAIL, "not matched" + shutterinfoinput
						.get(i) + "----" + shutterinfooutput.get(i));
			}
		}
		
	}

	public static void curtains() throws InterruptedException {

		PageFactory.initElements(driver, Order_page_pageobject.class);
		Thread.sleep(3000);
//		Order_page_pageobject.selectproduct.click();
//		Thread.sleep(2000);
//
//		Order_page_pageobject.searchfield.sendKeys("curtain");
//		Thread.sleep(1000);
//		Order_page_pageobject.selectnewproduct.click();
//		
		


		Actions actions=new Actions(driver);
		actions.moveToElement(Order_page_pageobject.selectproduct).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(Order_page_pageobject.searchfield).sendKeys(Order_page_pageobject.searchfield, "curtains").build().perform();
		actions.moveToElement(Order_page_pageobject.selectnewproduct).click(Order_page_pageobject.selectnewproduct).build().perform();
		
		
		
		testcase.log(Status.INFO, "Select the  Shutter product ");
		
		
		
		
		
		
		Thread.sleep(2000);
		Select select2 = new Select(Order_page_pageobject.unittype);
//		List<WebElement> list3 = select2.getOptions();
//		int size3 = list3.size();
//		for (int i = 0; i <= size3 - 1; i++) {
//			select2.selectByIndex(i);
//		}
		select2.selectByVisibleText(" mm ");
		Thread.sleep(1000);
		Order_page_pageobject.quantity.clear();
		Order_page_pageobject.quantity.sendKeys("6");
	
		Select select3 = new Select(Order_page_pageobject.supplier);
		select3.selectByIndex(1);
		Thread.sleep(1000);
		Order_page_pageobject.width.sendKeys("1000");
		

		Order_page_pageobject.drop.sendKeys("sasa");
		String drop = Order_page_pageobject.drop.getAttribute("value");
		if (drop.isEmpty()) {
			Order_page_pageobject.drop.sendKeys("1000");
		} else {
		}
		Thread.sleep(1000);

		Select select4 = new Select(Order_page_pageobject.pairsingle);
		select4.selectByIndex(2);

		Thread.sleep(1000);

		Select select6 = new Select(Order_page_pageobject.producttype);
		select6.selectByIndex(2);

		Thread.sleep(2000);

	
		Order_page_pageobject.softfurnishing.click();
//		Thread.sleep(6000);
//		Order_page_pageobject.fabric.click();
		Thread.sleep(3000);
		Order_page_pageobject.selectoption1.click();
		Thread.sleep(2000);

		Order_page_pageobject.colour.click();
		Thread.sleep(3000);
		Order_page_pageobject.selectoption1.click();

		Thread.sleep(1000);
		Order_page_pageobject.liningtype.click();
		Thread.sleep(2000);
		Order_page_pageobject.selectoption1.click();

		Thread.sleep(1000);
		Order_page_pageobject.defaultlist.click();
		Thread.sleep(1000);
		Order_page_pageobject.multiselect1.click();
		Thread.sleep(1000);
//		Order_page_pageobject.multiselect2.click();
		Order_page_pageobject.save.click();
		Thread.sleep(2000);

//				Thread.sleep(2000);
//				Order_page_pageobject.blackoutline.click();
//				Thread.sleep(2000);
//				Order_page_pageobject.singleselect1.click();
//				Thread.sleep(2000);
//				
//				Order_page_pageobject.singlelist.click();
//				Thread.sleep(2000);
//				Order_page_pageobject.singleselect1.click();
//				Thread.sleep(2000);
//				Order_page_pageobject.sub.click();
//				Thread.sleep(2000);
//				Order_page_pageobject.multiselect1.click();
//				Order_page_pageobject.save.click();
//				Thread.sleep(2000);
//				

		Order_page_pageobject.productsave.click();
		Thread.sleep(1000);
//				try {
//					Order_page_pageobject.productcancel.click();
//				} catch (Throwable e) {
//					// TODO: handle exception
//				}

	}

	public static void Order_edit() throws InterruptedException {
		PageFactory.initElements(driver, Order_page_pageobject.class);
		Thread.sleep(5000);
		testcase = extents.createTest("Edit order list");
		Actions actions = new Actions(driver);
		actions.clickAndHold(Order_page_pageobject.pp1).moveToElement(Order_page_pageobject.pp3).release().perform();

		testcase.log(Status.INFO, "Move the 1st order into 3rd order");

		Thread.sleep(3000);
		Order_page_pageobject.option3.click();
		Thread.sleep(1000);
		testcase.log(Status.INFO, "Click first three dot button to open the option");
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(Order_page_pageobject.copy2).click(Order_page_pageobject.copy2).build().perform();
		testcase.log(Status.INFO, "move on to copy option button & click it");
		Thread.sleep(6000);
		try {
			Order_page_pageobject.productsave.click();
			testcase.log(Status.INFO, "Click the save button to Save the copy of the product order");
			Thread.sleep(3000);
		} catch (Exception e) {
			Thread.sleep(8000);
			Order_page_pageobject.productsave.click();
			testcase.log(Status.INFO, "Click the save button to Save the copy of the product order");
			Thread.sleep(3000);
		}
try {
	Order_page_pageobject.option2.click();
	Thread.sleep(1000);
} catch (Throwable e) {
	Thread.sleep(2000);
	Order_page_pageobject.option2.click();
	Thread.sleep(1000);
}
		
		testcase.log(Status.INFO, "Click second three dot button to open the option");
		Actions actions5 = new Actions(driver);
		actions5.moveToElement(Order_page_pageobject.hold).click(Order_page_pageobject.hold).build().perform();
		testcase.log(Status.INFO, "move on to hold option button & click it");
		Thread.sleep(3000);

		Order_page_pageobject.option2.click();
		Thread.sleep(1000);
		testcase.log(Status.INFO, "Click second three dot button to open the option");
		Actions actions4 = new Actions(driver);
		actions4.moveToElement(Order_page_pageobject.unhold).click(Order_page_pageobject.unhold).build().perform();
		testcase.log(Status.INFO, "move on to unhold option button & click it");
		Thread.sleep(3000);

		Order_page_pageobject.option3.click();
		Thread.sleep(1000);
		testcase.log(Status.INFO, "Click first three dot button to open the option");
		Actions actions6 = new Actions(driver);
		actions6.moveToElement(Order_page_pageobject.delete2).click(Order_page_pageobject.delete2).build().perform();
		Thread.sleep(2000);
		testcase.log(Status.INFO, "move on to delete option button & click it");
		Order_page_pageobject.deleteok.click();
		testcase.log(Status.INFO, "Click delte ok button to delete the order");

	}

}
