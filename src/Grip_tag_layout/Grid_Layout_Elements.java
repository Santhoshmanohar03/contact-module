package Grip_tag_layout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Initilaizer.login_the_page;

public class Grid_Layout_Elements extends login_the_page {

	public static void move_to_grid_layout() throws InterruptedException {
		PageFactory.initElements(driver, Grid_layout_pageobject.class);
		Thread.sleep(5000);
		Grid_layout_pageobject.gridtab.click();

//		for (int i = 2; i <= 10; i++) {
//
//			WebElement alp = driver
//					.findElement(By.xpath("/html/body/app-root/main/section/app-contacts/div[2]/div[1]/a[" + i + "]"));
//			alp.click();
//			Thread.sleep(1000);
//		}
		Thread.sleep(3000);
		Grid_layout_pageobject.alphapets.click();
		Thread.sleep(2000);

		Actions actions = new Actions(driver);
		actions.moveToElement(Grid_layout_pageobject.globalsearch).click(Grid_layout_pageobject.globalsearch)
				.sendKeys(Grid_layout_pageobject.globalsearch, "dada").build().perform();
		Thread.sleep(2000);
Grid_layout_pageobject.selectname.click();
Thread.sleep(5000);
driver.navigate().back();

	}

}
