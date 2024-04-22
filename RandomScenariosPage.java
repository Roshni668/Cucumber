package com.cucumber.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class RandomScenariosPage extends BasePage{
	static WebDriver driver;
	public RandomScenariosPage(){
		super(driver=BaseTest.getDriver("Chrome"));
		addboject("NameLink", By.className("currentStatusUserName"));
		addboject("Home", By.xpath("//a[@title='Home Tab']"));
		addboject("ALLTab", By.id("AllTab_Tab"));
		addboject("custmizemytab", By.className("btnImportant"));
		addboject("selectedTabstoRemove", By.id("duel_select_1"));
		addboject("savebtn", By.xpath("//input[@class='btn primary']"));
		addboject("datelink", By.xpath("//span[@class='pageDescription']/a"));
		addboject("timelink8pm", By.xpath("//*[@id=\"p:f:j_id25:j_id61:28:j_id64\"]/a"));
		addboject("subjectcomboicon", By.className("comboboxIcon"));
		addboject("otherlink", By.xpath("//a[contains(text(),'Other')]"));
		addboject("endtime", By.xpath("//input[@id='EndDateTime_time']"));
		addboject("savebtn", By.xpath("//input[@value=' Save ']"));
		addboject("timelink8pm", By.xpath("//*[@id=\"p:f:j_id25:j_id61:20:j_id64\"]"));
		addboject("Recurrencecheckbox", By.xpath("//input[@id='IsRecurrence']"));
		addboject("weeklybtn", By.xpath("//input[@value='ftw']"));
		addboject("recurrenceEndDate", By.xpath("//input[@id='RecurrenceEndDateOnly']"));
		addboject("savebtn1", By.xpath("//input[@value=' Save ']"));
		//addboject("monthview", By.className("monthViewIcon"));
		addboject("monthview", By.xpath("//img[@class='monthViewIcon']"));
		}
}//img[@class='monthViewIcon']