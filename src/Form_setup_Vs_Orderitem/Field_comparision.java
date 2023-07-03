package Form_setup_Vs_Orderitem;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import Blind_fabric_configure.Add_Fabric;
import Blind_fabric_configure.Add_product_pageobject;

public class Field_comparision  extends Add_Fabric{
	
	
public static Properties prop5;
	
	
	public static Properties options() throws IOException {

		File f=new File("F:\\Product related project\\Product_Creation\\src\\initilizer\\file.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop4=new Properties();
		prop4.load(fis);
		
		return prop4;
		
	}
	
	
	public static void Blind_fabric_order_item_validation() throws InterruptedException, IOException {
		
		

		
		 List<String> field=new ArrayList<String>();
		for(int i=0;i<=9;i++) {
			WebElement v=driver.findElement(By.xpath("(//*[@row-id="+i+"])[2]/div[1]/span"));

			
				field.add(v.getText());
				
		}
		
		System.out.println(field);
		testcase = extents.createTest("Comparision with order item");

		
		
			PageFactory.initElements(driver, Add_product_pageobject.class);
			Add_product_pageobject.optionplusbtn.click();
			Thread.sleep(2000);
			
			
			Actions action2=new Actions(driver);
			action2.moveToElement(Add_product_pageobject.jobplus).click(Add_product_pageobject.jobplus).build().perform();
			
			
			
			testcase.log(Status.INFO, "swith to job page from product");
			Thread.sleep(6000);
			Add_product_pageobject.contactinfo.click();
			Thread.sleep(2000);
			testcase.log(Status.INFO, "Click contactinfo button to scrol the info");
			String productnamenumber =options().getProperty("blindfabricproductname").replaceAll("[^0-9]", ""); 
			int nameInt = Integer.parseInt(productnamenumber);
			nameInt--; 
			String nameplus = options().getProperty("blindfabricproductname").replaceAll("[0-9]", "") + String.format("%02d", nameInt); 
		
			
			
			
			try {
				Actions actions=new Actions(driver);
				actions.moveToElement(Add_product_pageobject.selectproduct).build().perform();
				Thread.sleep(1000);
				actions.moveToElement(Add_product_pageobject.searchfield).sendKeys(Add_product_pageobject.searchfield, nameplus).build().perform();
				actions.moveToElement(Add_product_pageobject.selectnewproduct).click(Add_product_pageobject.selectnewproduct).build().perform();
				
			} catch (Throwable e) {
				Thread.sleep(1000);
				Actions actions=new Actions(driver);
				actions.moveToElement(Add_product_pageobject.selectproduct).build().perform();
				Thread.sleep(2000);
				actions.moveToElement(Add_product_pageobject.searchfield).sendKeys(Add_product_pageobject.searchfield, nameplus).build().perform();
				actions.moveToElement(Add_product_pageobject.selectnewproduct).click(Add_product_pageobject.selectnewproduct).build().perform();	
			}

			
			Thread.sleep(4000);
			List<String> field2=new ArrayList<String>();
			for(int j=3;j<=12;j++) {
				String bg="//*[text()='"+nameplus+" Info']/following::label["+j+"]";
				WebElement element=driver.findElement(By.xpath(bg));
				String jobfield= element.getText();
//				System.out.println(jobfield);
				
				field2.add(jobfield);	
		
		}

			
			System.out.println(field2);
			
			
			
			int x = field.size();
			for (int i = 4; i <=x - 1; i++) {
				if (field.get(i).equals(field2.get(i))) {
					
					testcase.log(Status.PASS, field.get(i) + "----" + field2.get(i));
					
					
				} else {
					
					testcase.log(Status.FAIL, "not matched" + field.get(i) + "----" + field2.get(i));
				}
			}
			
			PageFactory.initElements(driver, Order_page_pageobject.class);

			File f5=new File("F:\\Product related project\\Product_Creation\\src\\Blind_fabric_configure\\FormSetup.properties");
			FileInputStream fis5=new FileInputStream(f5);
			Properties prop5=new Properties();
			prop5.load(fis5);

	
			String fabrictext="//*[text()='"+prop5.getProperty("material")+"']//following::input[1]";
			
			WebElement element=driver.findElement(By.xpath(fabrictext));
			
	
			element.click();
			Thread.sleep(6000);
			List<String> fabricfield=new ArrayList<String>();

	
			try {
				for(int i=2;i<=8;i++) {
					String fabric="(//*[@col-id='optionname'])["+i+"]/div/span";
					WebElement ff=driver.findElement(By.xpath(fabric));
					String fabricsstring= ff.getText();
//					System.out.println(jobfield);
					
					fabricfield.add(fabricsstring);
				}
			} catch (Throwable e) {
				
			}
			System.out.println("fabrics:"+fabricfield);
			
			
			
			File f=new File("F:\\Product related project\\Product_Creation\\src\\Blind_fabric_configure\\option and fabric.properties");
			FileInputStream fis=new FileInputStream(f);
			Properties prop4=new Properties();
			prop4.load(fis);
			
			String fabricname =prop4.getProperty("fabricname").replaceAll("[^0-9]", ""); 
			int fabricnameInt = Integer.parseInt(fabricname);
			fabricnameInt--; 
			String fabricnameplus =prop4.getProperty("fabricname").replaceAll("[0-9]", "") + String.format("%02d", fabricnameInt); 
			
			System.out.println(fabricnameplus);
	
				
				String fs="//*[contains(text(),'"+fabricnameplus+"')]/ancestor::div[2]";
				WebElement fabricelement=driver.findElement(By.xpath(fs));
				Actions actions=new Actions(driver);
						actions.moveToElement(fabricelement).click().perform();
				Thread.sleep(2000);
			
			
			
			
			
			Collections.reverse(afterlinkedfabric);
			System.out.println(afterlinkedfabric);
			
			int y = afterlinkedfabric.size();
			System.out.println(y);
			
			for (int i = 0; i <=3; i++) {
				if (afterlinkedfabric.get(i).equals(fabricfield.get(i))) {
					
					testcase.log(Status.PASS, afterlinkedfabric.get(i) + "----" + fabricfield.get(i));
					System.out.println(afterlinkedfabric.get(i) + "----" + fabricfield.get(i));
					
				} else {
					
					testcase.log(Status.FAIL, "not matched" + afterlinkedfabric.get(i) + "----" + fabricfield.get(i));
					System.out.println("not matched" + afterlinkedfabric.get(i) + "----" + fabricfield.get(i));
				}
			}
			
			
		
			
			
			
			
			
			
         	Order_page_pageobject.colour.click();
			Thread.sleep(3000);
			List<String> colorfield=new ArrayList<String>();

			try {
				for(int i=2;i<=7;i++) {
					String fabric="(//*[@col-id='optionname'])["+i+"]";
					WebElement ff=driver.findElement(By.xpath(fabric));
					String fabricstring= ff.getText();
//					System.out.println(jobfield);
					
					colorfield.add(fabricstring);
				}
			} catch (Throwable e) {
				
			}
			
			System.out.println("color:"+colorfield);
			
			Order_page_pageobject.selectoption1.click();
			
			System.out.println(afterlinkedfabric);
		
			Thread.sleep(2000);
			
			Order_page_pageobject.productsave.click();
			
	}
	
	
	
	public static void Awnings_order_item_validation() throws InterruptedException, IOException {
		
		

		
		 List<String> field=new ArrayList<String>();
		for(int i=0;i<=9;i++) {
			WebElement v=driver.findElement(By.xpath("(//*[@row-id="+i+"])[2]/div[1]/span"));

			
				field.add(v.getText());
				
		}
		
		System.out.println(field);
		testcase = extents.createTest("Comparision with order item");

		
		
			PageFactory.initElements(driver, Add_product_pageobject.class);
			Add_product_pageobject.optionplusbtn.click();
			Thread.sleep(2000);
			
			
			Actions action2=new Actions(driver);
			action2.moveToElement(Add_product_pageobject.jobplus).click(Add_product_pageobject.jobplus).build().perform();
			
			
			
			testcase.log(Status.INFO, "swith to job page from product");
			Thread.sleep(6000);
			Add_product_pageobject.contactinfo.click();
			Thread.sleep(2000);
			testcase.log(Status.INFO, "Click contactinfo button to scrol the info");
			String productnamenumber =options().getProperty("awningsproductname").replaceAll("[^0-9]", ""); 
			int nameInt = Integer.parseInt(productnamenumber);
			nameInt--; 
			String nameplus = options().getProperty("awningsproductname").replaceAll("[0-9]", "") + String.format("%02d", nameInt); 
		
			
			
			
			try {
				Actions actions=new Actions(driver);
				actions.moveToElement(Add_product_pageobject.selectproduct).build().perform();
				Thread.sleep(1000);
				actions.moveToElement(Add_product_pageobject.searchfield).sendKeys(Add_product_pageobject.searchfield, nameplus).build().perform();
				actions.moveToElement(Add_product_pageobject.selectnewproduct).click(Add_product_pageobject.selectnewproduct).build().perform();
				
			} catch (Throwable e) {
				Thread.sleep(1000);
				Actions actions=new Actions(driver);
				actions.moveToElement(Add_product_pageobject.selectproduct).build().perform();
				Thread.sleep(2000);
				actions.moveToElement(Add_product_pageobject.searchfield).sendKeys(Add_product_pageobject.searchfield, nameplus).build().perform();
				actions.moveToElement(Add_product_pageobject.selectnewproduct).click(Add_product_pageobject.selectnewproduct).build().perform();	
			}

			
			Thread.sleep(4000);
			List<String> field2=new ArrayList<String>();
			for(int j=3;j<=12;j++) {
				String bg="//*[text()='"+nameplus+" Info']/following::label["+j+"]";
				WebElement element=driver.findElement(By.xpath(bg));
				String jobfield= element.getText();
//				System.out.println(jobfield);
				
				field2.add(jobfield);	
		
		}

			
			System.out.println(field2);
			
			
			
			int x = field.size();
			for (int i = 4; i <=x - 1; i++) {
				if (field.get(i).equals(field2.get(i))) {
					
					testcase.log(Status.PASS, field.get(i) + "----" + field2.get(i));
					
					
				} else {
					
					testcase.log(Status.FAIL, "not matched" + field.get(i) + "----" + field2.get(i));
				}
			}
			
			PageFactory.initElements(driver, Order_page_pageobject.class);
			
			
			File f5=new File("F:\\Product related project\\Product_Creation\\src\\Blind_fabric_configure\\FormSetup.properties");
			FileInputStream fis5=new FileInputStream(f5);
			Properties prop5=new Properties();
			prop5.load(fis5);

	
			String fabrictext="//*[text()='"+prop5.getProperty("Awningsmaterial")+"']//following::input[1]";
			
			WebElement element=driver.findElement(By.xpath(fabrictext));
			
	
			element.click();
			Thread.sleep(6000);
			List<String> fabricfield=new ArrayList<String>();

	
			try {
				for(int i=2;i<=8;i++) {
					String fabric="(//*[@col-id='optionname'])["+i+"]/div/span";
					WebElement ff=driver.findElement(By.xpath(fabric));
					String fabricsstring= ff.getText();
//					System.out.println(jobfield);
					
					fabricfield.add(fabricsstring);
				}
			} catch (Throwable e) {
				
			}
			System.out.println("fabrics:"+fabricfield);
			
			
			
			File f=new File("F:\\Product related project\\Product_Creation\\src\\Blind_fabric_configure\\option and fabric.properties");
			FileInputStream fis=new FileInputStream(f);
			Properties prop4=new Properties();
			prop4.load(fis);
			
			String fabricname =prop4.getProperty("fabricname").replaceAll("[^0-9]", ""); 
			int fabricnameInt = Integer.parseInt(fabricname);
			fabricnameInt--; 
			String fabricnameplus =prop4.getProperty("fabricname").replaceAll("[0-9]", "") + String.format("%02d", fabricnameInt); 
			
			System.out.println(fabricnameplus);
	
				
				String fs="//*[contains(text(),'"+fabricnameplus+"')]/ancestor::div[2]";
				WebElement fabricelement=driver.findElement(By.xpath(fs));
				Actions actions=new Actions(driver);
						actions.moveToElement(fabricelement).click().perform();
				Thread.sleep(2000);
			
			
			
			
			
			Collections.reverse(afterlinkedfabric);
			System.out.println(afterlinkedfabric);
			
			int y = afterlinkedfabric.size();
			System.out.println(y);
			
			for (int i = 0; i <=3; i++) {
				if (afterlinkedfabric.get(i).equals(fabricfield.get(i))) {
					
					testcase.log(Status.PASS, afterlinkedfabric.get(i) + "----" + fabricfield.get(i));
					System.out.println(afterlinkedfabric.get(i) + "----" + fabricfield.get(i));
					
				} else {
					
					testcase.log(Status.FAIL, "not matched" + afterlinkedfabric.get(i) + "----" + fabricfield.get(i));
					System.out.println("not matched" + afterlinkedfabric.get(i) + "----" + fabricfield.get(i));
				}
			}
			
			
		
			
			
			
			
			
			
        	Order_page_pageobject.colour.click();
			Thread.sleep(3000);
			List<String> colorfield=new ArrayList<String>();

			try {
				for(int i=2;i<=7;i++) {
					String fabric="(//*[@col-id='optionname'])["+i+"]";
					WebElement ff=driver.findElement(By.xpath(fabric));
					String fabricstring= ff.getText();
//					System.out.println(jobfield);
					
					colorfield.add(fabricstring);
				}
			} catch (Throwable e) {
				
			}
			
			System.out.println("color:"+colorfield);
			
			Order_page_pageobject.selectoption1.click();
			
			System.out.println(afterlinkedfabric);
		
			Thread.sleep(2000);
			
			Order_page_pageobject.productsave.click();
	}


}
