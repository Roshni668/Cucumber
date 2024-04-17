package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class OpportunitiesPage extends BasePage {
	static WebDriver driver;
	public OpportunitiesPage(){
		super(driver=BaseTest.getDriver("Chrome"));
		addboject("opportunity",By.xpath("//a[@title='Opportunities Tab']"));
		addboject("opportunitydropwn",By.id("fcf"));
		addboject("newopportunity", By.xpath("//input[@value=' New ']"));
		addboject("oppname", By.id("opp3"));
		addboject("accname", By.id("opp4"));
		addboject("closedate", By.id("opp9"));
		addboject("date", By.className("calToday"));
		addboject("source", By.id("opp17"));
		addboject("stagedrpdwn", By.id("opp11"));
		addboject("source", By.id("opp17"));
		addboject("save", By.xpath("//input[@name='save']"));
		addboject("go", By.xpath("//input[@value=' Go! ']"));
		addboject("stuckopportunity",By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
		addboject("Interval", By.id("quarter_q"));
		addboject("Include", By.id("open"));
		addboject("runreport", By.xpath("//input[@value='Run Report']"));
	
	
	}
	}

//WebElement Interval=driver.findElement(By.id("quarter_q"));
//Select summary=new Select(Interval);
//summary.selectByVisibleText("Current and Next FQ");
//
//WebElement Include=driver.findElement(By.id("open"));
//Select opp=new Select(Include);
//opp.selectByVisibleText("Open Opportunities");
//
//WebElement runreport=driver.findElement(By.xpath("//input[@value='Run Report']"));
//runreport.click();