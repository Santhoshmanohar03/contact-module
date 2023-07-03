package Execution;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Awnings_configure.Add_Fabric;
import Awnings_configure.Add_Option;
import Awnings_configure.Location_list_add;
import Awnings_configure.New_Blindfabric_formsetup;
import Awnings_configure.New_product_add_general_info;

//import Blind_fabric_configure.Add_Fabric;
//import Blind_fabric_configure.Add_Option;
//import Blind_fabric_configure.Location_list_add;
//import Blind_fabric_configure.New_Blindfabric_formsetup;
//import Blind_fabric_configure.New_product_add_general_info;
import Form_setup_Vs_Orderitem.Field_comparision;
import initilizer.Login_the_page;

public class Awnings_product_execution extends Login_the_page {
	
	
	@BeforeTest
	public void Open_The_browser() {

		ChromeOptions option = new ChromeOptions();

		option.addArguments("--disable-notifications");

		option.addArguments("--remote-allow-origins=*");

		System.setProperty("webdriver.chrome.driver", "G:\\Selenium setups\\drivers\\chromedriver.exe");
		driver = new ChromeDriver(option);

		driver.manage().window().maximize();
//		Dimension dim=new Dimension(1024, 768);
//		driver.manage().window().setSize(dim);
		driver.get("https://blindmatrix.software/dashboard"); // https://curtainmatrix.co.uk/testingsource/contacts

		extents = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("ExtentReport.html");
		extents.attachReporter(htmlReporter);

	}

	@Test(priority = 1)
	
	public static void Login_The_Application() throws InterruptedException, IOException {
		Login_the_page.login_the_application();

		Login_the_page.switchto();
		Thread.sleep(5000);
		}
	
//		@Test(priority = 2)
//		public static void create_new_product() throws InterruptedException, IOException {
//			New_product_add_general_info.open_setting();
//			New_product_add_general_info.Create_new_Awnings_product();
//	
//		}
//	
//		@Test(priority = 3)
//		public static void New_blind_product_creation() throws InterruptedException, IOException {
//			New_Blindfabric_formsetup.numericXfield();
//			New_Blindfabric_formsetup.numericYfield();
//		New_Blindfabric_formsetup.price_group();
//		New_Blindfabric_formsetup.Awnings_material();
//		New_Blindfabric_formsetup.list_field();
//		New_Blindfabric_formsetup.text_field();
//		New_Blindfabric_formsetup.locationlist();
//		New_Blindfabric_formsetup.numeric();
//		Thread.sleep(2000);
//
//	}
//
//	@Test(priority = 4)
//
//	public static void Add_option() throws IOException, InterruptedException {
//
//		Add_Option.add_new_option();
//		Add_Option.link_the_option();
//		Add_Option.save_the_options();
//	}
//
//	@Test(priority = 5)
//	public static void List_Subfield() throws InterruptedException, IOException {
//		Add_Option.subfield();
//		Add_Option.threedotoptions();
//	}

	@Test(priority = 6)
	public static void Add_new_fabric_with_colour() throws InterruptedException, IOException {
//		Add_Fabric.Add_new_fabric();
		Add_Fabric.verify_and_link_the_fabric();

	}

//	@Test(priority = 7)
//	public static void location_list_add() throws IOException, InterruptedException {
//		Location_list_add.add_location_list();
//	}
//
//	@Test(priority = 8)
//	public static void product_comparision() throws InterruptedException, IOException {
//		Field_comparision.Awnings_order_item_validation();
//	}
//	


	@AfterTest
	public void Close_The_Browser() throws InterruptedException {
		extents.flush();
//			driver.quit();
	}

	
	
	
	

}
