package Form_setup_Vs_Orderitem;

import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import Blind_fabric_configure.Add_Fabric;



public class Ordering_page extends Add_Fabric {

	

	public static void Roller() throws InterruptedException {
		testcase = extents.createTest("Blind fabric product ordering ");
		PageFactory.initElements(driver, Order_page_pageobject.class);
		Thread.sleep(7000);

		
		
		
		
		
		
		
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

}
