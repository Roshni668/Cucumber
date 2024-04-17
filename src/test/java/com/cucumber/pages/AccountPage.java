package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class AccountPage extends BasePage {
	
	static WebDriver driver;
	public AccountPage(){
		super(driver=BaseTest.getDriver("Chrome"));
		addboject("Accounts",By.id("Account_Tab"));
		addboject("Createnewview",By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]")); 
		addboject("newtab",By.xpath("//input[@value=' New ']"));
		addboject("AccountName",By.xpath("//input[@id='acc2']"));
	addboject("typedropdown",By.xpath("//select[@id='acc6']"));
	addboject("save",By.xpath("//input[@value=' Save ']"));
	addboject("TechnologyPartner",By.xpath("//option[contains(text(),'Technology Partner')]"));
	addboject("customerdropdown",By.xpath("//select[@id='00Nak0000011nPX']"));
	addboject("CustomerPriority",By.xpath("//option[contains(text(),'High')]"));
	addboject("Createnewview",By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
	addboject("viewname",By.id("fname") );
	addboject("uniqueviewname",By.xpath("//input[@id='devname']"));
	addboject("save1", By.xpath("//input[@value=' Save ']"));
	addboject("viewdropdn",By.id("fcf"));
	addboject("Mergeaccount",By.xpath("//a[contains(text(),'Merge Accounts')]"));
	addboject("findacctext", By.xpath("//input[@id=\"srch\"]"));
	addboject("checkbox1", By.xpath("//input[@title='Select row 0']"));
	addboject("checkbox2", By.xpath("//input[@title='Select row 1']"));
	addboject("next",By.xpath("//input[@value=' Next ']"));
	addboject("merge", By.xpath("//input[@title='Merge']"));
	addboject("findbtn",By.xpath("//input[@value='Find Accounts']"));
	addboject("lastactivity",By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
	addboject("Datefrom", By.id("ext-gen152"));
	//addboject("FromToday", By.id("ext-gen152"));
	addboject("todaybtnfrom", By.id("ext-gen276"));
	addboject("DateTO", By.id("ext-gen154"));
	addboject("todaybtnTo", By.id("ext-gen291"));
	addboject("save2", By.id("ext-gen49"));
	addboject("Reportname", By.id("saveReportDlg_reportNameField"));
	addboject("reportuniquename", By.xpath("//input[@id='saveReportDlg_DeveloperName']"));
	addboject("savenrun", By.id("dlgSaveAndRun"));
	
	
	}
}

//WebElement lastactivity=driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
//lastactivity.click();
//WebElement Datefrom=driver.findElement(By.id("ext-gen152"));
//Datefrom.click();
//Thread.sleep(2000);
//WebElement FromToday=driver.findElement(By.id("ext-gen152"));
//FromToday.click();
//
//
//WebElement todaybtnfrom=driver.findElement(By.id("ext-gen276"));
//Thread.sleep(2000);
//todaybtnfrom.click();
//Thread.sleep(1000);
//
//WebElement DateTO=driver.findElement(By.id("ext-gen154"));
//DateTO.click();
//Thread.sleep(2000);
//
//WebElement todaybtnTo=driver.findElement(By.id("ext-gen291"));
//Thread.sleep(2000);
//todaybtnTo.click();
//Thread.sleep(1000);
//
//WebElement save=driver.findElement(By.id("ext-gen49"));
//save.click();
//WebElement Reportname=driver.findElement(By.id("saveReportDlg_reportNameField"));
//Reportname.sendKeys("Accounts");
//
//WebElement reportuniquename=driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']"));
//reportuniquename.sendKeys("124"); 
//// uniqename is must be uniqe everytime then it working
//Thread.sleep(2000);
//WebElement savenrun=driver.findElement(By.id("dlgSaveAndRun"));
//Thread.sleep(2000);
//savenrun.click();