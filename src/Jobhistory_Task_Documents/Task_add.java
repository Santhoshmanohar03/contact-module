package Jobhistory_Task_Documents;


import org.openqa.selenium.support.PageFactory;

//import Exits_Customer_page.Exits_customer_pageobject;
import Initilaizer.login_the_page;

public class Task_add extends login_the_page {

	public static void add_task() throws InterruptedException {

		PageFactory.initElements(driver, pageobject.class);
		Thread.sleep(3000);
		pageobject.task.click();
		Thread.sleep(1000);

		pageobject.addtask.click();
		Thread.sleep(2000);
	}
	
}
