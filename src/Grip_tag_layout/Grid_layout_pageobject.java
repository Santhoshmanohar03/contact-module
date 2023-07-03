package Grip_tag_layout;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Grid_layout_pageobject {
	@FindBy(xpath = "/html/body/app-root/main/section/app-contacts/div[1]/div[2]/ul/li[2]/a")
	public static WebElement gridtab;
	
	@FindBy(xpath = "/html/body/app-root/main/section/app-contacts/div[1]/div[2]/ul/li[1]/a")
	public static WebElement listtab;
	
	@FindBy(xpath = "/html/body/app-root/main/section/app-contacts/div[1]/div[2]/div[1]")
	public static WebElement globalsearch;
	
	@FindBy(xpath = "//*[@id='home']/div/div[1]/div/div[1]/div[1]/h3")
	public static WebElement selectname;
	
	
	@FindBy(xpath = "/html/body/app-root/main/section/app-contacts/div[2]/div[1]/a[1]")
	public static WebElement alphapets;
	
}
