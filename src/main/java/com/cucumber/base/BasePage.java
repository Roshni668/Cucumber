package com.cucumber.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class BasePage {
	
	WebDriver driver;
	HashMap<String,By> objecRepo=new HashMap<String,By>();
	//String store logical name
	//by store how do you identify element
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
	
 public void enterIntoTextBox(String logicalname,String value) {
	 WebElement element=getElement(logicalname);
	 element.sendKeys(value);
 }
 
 public void addboject(String logicalname,By by)
 {
	 objecRepo.put(logicalname, by);
 }
public WebElement getElement(String logicalname) {
	By by=objecRepo.get(logicalname);
	WebElement element=driver.findElement(by);
	return element;
}
public void clickonButton(String logicalName) {
	WebElement element = getElement(logicalName);
	element.click();
	}
public void waitforElement(String logicalName) {
	WebElement element = getElement(logicalName);
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(element));
	
}

public void clickonCheckBox(String logicalName) {
	WebElement element=getElement(logicalName);
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(element));
	element.click();
}

public void clickonLink(String logicalName) {
	WebElement element=getElement(logicalName);
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(element));
	element.click();
	
}

public void CloseWindow() {
	
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> handlesList = new ArrayList<>(windowHandles);
	String parentWindowHandle = handlesList.get(0);
	String childWindowHandle = handlesList.get(1);
	driver.switchTo().window(childWindowHandle);
	driver.close();
	driver.switchTo().window(parentWindowHandle);
	}

public void validateText(String logicalName, String exceptedText) {
	WebElement element=getElement(logicalName);
	waitforElement(logicalName);
	String ActualText=element.getText();
	Assert.assertEquals(exceptedText, ActualText);
	
}

public void validateTextBox(String logicalName, String exceptedText) {
	WebElement element=getElement(logicalName);
	waitforElement(logicalName);
	String ActualText=element.getText();
	Assert.assertEquals(exceptedText, ActualText);
}

public void clickElementinFrame(String logicalName) {
	WebElement element=getElement(logicalName);
	waitforElement(logicalName);
	 driver.switchTo().frame(element);
	 
}

public void switchtodeafultpage() {
	driver.switchTo().defaultContent();
	
}

public void clearTextBox(String logicalName) {
	 WebElement element=getElement(logicalName);
	 element.clear();
	
}

public void uploadfile(String logicalName, String value) throws InterruptedException {
	Thread.sleep(2000);
	WebElement element=getElement(logicalName);
	Thread.sleep(1000);
	//waitforElement(logicalName);
	Thread.sleep(3000);
	element.sendKeys(value);
}

public void selectVisibleText(String logicalName, String value) {
	WebElement element=getElement(logicalName);
	Select data=new Select(element);
	data.selectByVisibleText(value);
	
	
}

public void selectValue(String logicalName, String value) {
	WebElement element=getElement(logicalName);
	waitforElement(logicalName);
	Select data=new Select(element);
	data.selectByValue(value);
}

public void ClickOnDropdown(String logicalName) {
	WebElement element=getElement(logicalName);
	waitforElement(logicalName);
	//waitforElement(logicalName);
	element.click();
	
}

public void selectFromDropDown(String value) {
//	WebElement element=getElement(logicalName);
//	Select dropdown = new Select(logicalName);
// dropdown.selectByVisibleText(value);
	
}

public void acceptAlert() {
	driver.switchTo().alert().accept();
	
}

public void actionToMove(String logicalName) {
	WebElement element = getElement(logicalName);
	Actions action = new Actions(driver);
	action.moveToElement(element).build().perform();
	waitforElement(logicalName);
	element.click();
	
}



//public void selectOptionFromDropdown(String option) {
//  WebElement dropdownElement = driver.findElement(By.id("dropdown")); // Assuming id of the dropdown
//  Select dropdown = new Select(dropdownElement);
//  dropdown.selectByVisibleText(option);
//}


//public void selectIndex(String logicalName, int value) {
//	WebElement element=getElement(logicalName);
//	Select data=new Select(element);
//	data.selectByIndex(value);
//}


}
