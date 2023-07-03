 package Jobhistory_Task_Documents;

import java.util.Set;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import Exits_Customer_page.Exits_customer_pageobject;
import Initilaizer.login_the_page;

public class jobhistory extends login_the_page {

	public static void jobhistory() throws InterruptedException {

		PageFactory.initElements(driver, pageobject.class);
		Thread.sleep(3000);
		
		String oldwindow = driver.getWindowHandle();
		pageobject.jobhistory.click();
		Thread.sleep(2000);
		String Jobrefno2=pageobject.selectjobref.getText();
		String invoiceno2=pageobject.selectinvoice.getText();
//		System.out.println("job ref no.."+Jobrefno2);
//		System.out.println("invoice no.."+invoiceno2);
		pageobject.selectjobref.click();
		Thread.sleep(12000);
		Set<String> handle = driver.getWindowHandles();
		
			for (String newwindow : handle) {
				driver.switchTo().window(newwindow);
			}
	
		
//		
		Select select=new Select(pageobject.orderstatus);
		select.selectByIndex(2);
		
		String Jobrefno=pageobject.jobrefno.getAttribute("value");
	String invoiceno=pageobject.invoiceno.getAttribute("value");
	if(Jobrefno.equals(Jobrefno2)) {
	}else {
	}
	
	if(invoiceno.equals(invoiceno2)) {
	}else {
	}
		
	Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(oldwindow);
		
       
		
		
//		
//		driver.navigate().to(Currenturl);		
//		Thread.sleep(5000);
		
	}

}
