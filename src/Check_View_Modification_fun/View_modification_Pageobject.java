package Check_View_Modification_fun;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class View_modification_Pageobject {

	@FindBy(xpath = "(//*[@id='dropdownMenuButton'])[1]")
	public static WebElement viewbtn;
	
	@FindBy(xpath = "//*[@id='headername0']")
	public static WebElement view1;
	
	@FindBy(xpath = "//*[@id='headername1']")
	public static WebElement view2;
	
	@FindBy(xpath = "//*[@id='headername2']")
	public static WebElement view3;
	
	@FindBy(xpath = "//*[@id='headername3']")
	public static WebElement view4;
	
	@FindBy(xpath = "//*[@id='headername4']")
	public static WebElement view5;
	
	@FindBy(xpath = "//*[@id='headername5']")
	public static WebElement view6;
	
	@FindBy(xpath = "//*[@id='accordionExample']/p")
	public static WebElement addviewbtn;
	
	@FindBy(xpath = "//*[@id='addviewform']/div[3]/button[2]")
	public static WebElement close;
	
	@FindBy(xpath = "//*[@id='headername0']/following::i[1]")
	public static WebElement editbtn;
	
	@FindBy(xpath = "//*[@id='deletecomomnotfication']/div/div/div/div/div/button[1]")
	public static WebElement editclose;
	
	@FindBy(xpath = "//*[@id='collapseOne0']/div/i[2]")
	public static WebElement deletebtn;
	
	@FindBy(xpath = "//*[@id='deletecomomnotfication']/div/div/div/div/div/button[1]")
	public static WebElement deleteok;
	
	
	
	@FindBy(xpath = "//*[@id='customviewsection']/div[2]/p/input")
	public static WebElement search;
	
	@FindBy(xpath = "//*[@id='viewname']")
	public static WebElement viewname;
	
	@FindBy(xpath = "//*[@id='seperatetab']")
	public static WebElement checkbox1;
	
	@FindBy(xpath = "//*[@id='lockview']")
	public static WebElement checkbox2;
	
	
	@FindBy(xpath = "//*[@id='availablelist_parent']")
	public static WebElement childcolumn;
	
	@FindBy(xpath = "//*[@id='availablelist_parent']/li[1]")
	public static WebElement mobileview;
	
	@FindBy(xpath = "//*[@id='availablelist_parent']/li[6]")
	public static WebElement phoneview;
	
	
	@FindBy(xpath = "//*[@id='combinedlist_parent']")
	public static WebElement parentcolumn;
	
	@FindBy(xpath = "//*[@id='availablecol']")
	public static WebElement searchfield1;
	
	@FindBy(xpath = "//*[@id='selectedcol']")
	public static WebElement searchfield2;
	
	@FindBy(xpath = "//*[@id='currency']")
	public static WebElement currency;
	
	
	@FindBy(xpath = "//*[@id='currency']/span")
	public static WebElement currencyaddremove;
	
	@FindBy(xpath = "//*[@id='phone']/following::span[1]")
	public static WebElement adding;
	
	@FindBy(xpath = "//*[@id=\"addviewform\"]/div[2]/div[2]/button")
	public static WebElement addfilter;
	
	@FindBy(xpath = "//*[@id='filter0']")
	public static WebElement filterselect;
	
	@FindBy(xpath = "//*[@id='filtercon0']")
	public static WebElement filtersup;
	
	@FindBy(xpath = "//*[@id=\"addviewform\"]/div[2]/div[2]/button")
	public static WebElement filterinput;
	
	@FindBy(xpath = "//*[@id='addviewform']/div[2]/div[2]/div/div[2]/div/input")
	public static WebElement optionsaddbtn;
	
	@FindBy(xpath = "//*[@id='addviewform']/div[2]/div[2]/div/div[2]/div[1]/i")
	public static WebElement filterdelete;
	
	@FindBy(xpath = "//*[@id='addviewform']/div[3]/button[2]")
	public static WebElement closebtn;
	
	@FindBy(xpath = "//*[@id='addviewform']/div[2]/div[1]/div/div[1]/div[3]/div/div/div[3]/div/i")
	public static WebElement shareoption;
	
	@FindBy(xpath = "//*[@id='selectuser']")
	public static WebElement selecteduser;
	
	@FindBy(xpath = "//*[@id='taskmultiselect']/div/div[1]/span")
	public static WebElement selectdrop;
	
	@FindBy(xpath = "//*[@id='taskmultiselect']/div/div[2]/ul[1]/li[1]/div")
	public static WebElement selectalluser;
	
	@FindBy(xpath = "//*[@id='addviewform']/div[3]/button[1]")
	public static WebElement savebtn;
	
	@FindBy(xpath = "//*[@id='addviewform']")
	public static WebElement addviewpageshow;
	
}
