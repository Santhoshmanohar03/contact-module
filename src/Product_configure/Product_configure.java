package Product_configure;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import Exits_Customer_page.Exits_customer_pageobject;
import Initilaizer.login_the_page;
import Pricing_configure.Pricing_configure;

public class Product_configure extends login_the_page {


	public static void product_Enabledisable() throws InterruptedException, AWTException {
		Thread.sleep(3000);

		PageFactory.initElements(driver, Product_configure_pageobject.class);
		Thread.sleep(3000);
		Product_configure_pageobject.productconf.click();
		Thread.sleep(2000);

		Product_configure_pageobject.productenable.click();
		Thread.sleep(2000);

		Product_configure_pageobject.product1.click();
		Thread.sleep(1000);

		Product_configure_pageobject.product2.click();
		Thread.sleep(1000);
		Product_configure_pageobject.product3.click();
		Thread.sleep(1000);
//		Product_configure_pageobject.product4.click();
//		Thread.sleep(1000);
//		Product_configure_pageobject.product5.click();
//		Thread.sleep(1000);
//		Product_configure_pageobject.product6.click();
		Thread.sleep(1000);
		Product_configure_pageobject.product1online.click();
		Thread.sleep(1000);
		Product_configure_pageobject.product2onlin.click();
		Thread.sleep(1000);
		Product_configure_pageobject.product3online.click();
		Thread.sleep(1000);
//		Product_configure_pageobject.product4online.click();
//		Thread.sleep(1000);
//		Product_configure_pageobject.product5online.click();
//		Thread.sleep(1000);
		Select select1 = new Select(Product_configure_pageobject.select1);
		select1.selectByIndex(1);
		Thread.sleep(1000);
//		Select select2 = new Select(Exits_customer_pageobject.select2);
//		select2.selectByIndex(1);
		//Thread.sleep(3000);
		Select select3 = new Select(Product_configure_pageobject.select3);
		select3.selectByIndex(1);
		Thread.sleep(1000);
//		Select select4 = new Select(Product_configure_pageobject.select4);
//		select4.selectByIndex(1);
//		Thread.sleep(3000);
		Product_configure_pageobject.enable1.click();
		Thread.sleep(1000);
		Product_configure_pageobject.enable2.click();
		
		Thread.sleep(2000);
		
		
		
	}
	public static void Pricing_group_material_discount() throws InterruptedException, AWTException {

		PageFactory.initElements(driver, Product_configure_pageobject.class);

		Product_configure_pageobject.pricinggroup.click();
		Thread.sleep(2000);
		Product_configure_pageobject.adddiscountprice.click();
		Thread.sleep(3000);
		Product_configure_pageobject.discountprice.sendKeys("100");
		Thread.sleep(1000);
		Product_configure_pageobject.supplierprice.click();
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.moveToElement(Product_configure_pageobject.selectsupplierprice)
				.click(Product_configure_pageobject.selectsupplierprice).build().perform();
		Thread.sleep(2000);

		Product_configure_pageobject.productprice.click();
		Thread.sleep(1000);
		Actions action1 = new Actions(driver);
		action1.moveToElement(Product_configure_pageobject.selectproprice).click(Product_configure_pageobject.selectproprice)
				.build().perform();

		Thread.sleep(1000);

		Product_configure_pageobject.materialprice.click();
		Thread.sleep(1000);
		Actions action2 = new Actions(driver);
		action2.moveToElement(Product_configure_pageobject.selectmaterialprice)
				.click(Product_configure_pageobject.selectmaterialprice).build().perform();
		Thread.sleep(2000);

		
		Actions action4 = new Actions(driver);
		action4.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);

		Product_configure_pageobject.savebtnprice.click();
		Thread.sleep(2000);
		try {
			Product_configure_pageobject.cancelbtnprice.click();
		} catch (Throwable e) {
			// TODO: handle exception
		}
		

	}
	
	public static void Option_discount() {
		
	}
	
}
