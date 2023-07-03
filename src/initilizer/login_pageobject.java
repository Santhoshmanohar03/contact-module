package initilizer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login_pageobject {

	@FindBy (id =  "companyname")
	public static WebElement companyname;
	
	@FindBy (id = "username")
	public static WebElement username;
	
	@FindBy (id = "password")
	public static WebElement password;
	
	@FindBy(xpath = "/html/body/app-root/main/section/lib-login/div/div/div/div/div[2]/div/form/div[4]/button[1]")
	public static WebElement loginbutton;
	
	@FindBy(xpath = "(//*[@href='/testingsource/contacts'])[1]")
	public static WebElement contactbtn;
	
	@FindBy(xpath = "//*[text()='Leads/Customers ']")
	public static WebElement leadscustomers;

}
