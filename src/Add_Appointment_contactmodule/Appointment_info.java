//package Add_Appointment_contactmodule;
//
//import javax.swing.Action;
//
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.PageFactory;
//
//import Initilaizer.login_the_page;
//
//public class Appointment_info extends login_the_page{
//	
//	public static void Appointment_info_edit() throws InterruptedException {
//		PageFactory.initElements(driver, Add_Appointment_pageobject.class);
//		
//		
//		Add_Appointment_pageobject.confirmbtn.click();
//		Thread.sleep(1000);
//		Add_Appointment_pageobject.editbtn.click();
//		Thread.sleep(1000);
//		
//		
//PageFactory.initElements(driver, Appointment_info_pageobject.class);
//		
//		Appointment_info_pageobject.field.sendKeys("hgsdx");
//		
//		
//		
//	}
//	
//	
//	
//	public static void New_appointment_page_info(){
//		
//		
//		PageFactory.initElements(driver, Appointment_info_pageobject.class);
//		
//		Appointment_info_pageobject.field.sendKeys("hgsdx");
//		
//		
//		
//		
//	}
//	
//public static void save_new_appointment(){
//		
//		
//		PageFactory.initElements(driver, Add_Appointment_pageobject.class);
//		
//		Actions action=new Actions(driver);
//		action.moveToElement(Add_Appointment_pageobject.savebtn).click(Add_Appointment_pageobject.savebtn);
//		Add_Appointment_pageobject.savebtn.click();
//		
//		
//	}
//
//}
