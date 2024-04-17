package com.cucumber.steps;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;
import com.cucumber.pagefactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps extends BaseTest{
	
	BasePage page;
	PageFactory  pageFactory=new PageFactory();
	
	@Given("User launch the application in {string}")
	public void user_launch_the_application_in(String browsername) throws IOException {
	   launchapplication(browsername);
	  
	}
	@Given("User is on {string}")
	public void user_is_on(String pageName) {
	  // page=pageFactory.initialize(pageName);
		page = pageFactory.initialize(pageName);
		}
	
	@Then("User wait for Element {string}")
	public void user_wait_for_element(String logicalname) {
	  page.waitforElement(logicalname);
	}
	@Then("User Enter into the text box {string} {string}")
	public void user_enter_into_the_text_box(String logicalname, String value) {
	    page.enterIntoTextBox(logicalname, value);
	}
	@Then("User Click on Checkbox {string}")
	public void user_click_on_checkbox(String logicalName) {
	  page.clickonCheckBox(logicalName);
	}
	@Then("Click on the button {string}")
	public void click_on_the_button(String logicalname) {
	  page.clickonButton(logicalname); 
	}
	 
	  @Then("Click on user menu dropdown {string}")
	  public void click_on_user_menu_dropdown(String logicalName) {
	      page.clickonButton(logicalName);
	  }
	  	  @Then("Click on link {string}")
		  public void click_on_link(String logicalName) {
			  page.clickonLink(logicalName);
		  }
	  	@Then("User verifies the Message {string} {string}")
	  	public void user_verifies_the_message(String logicalName, String exceptedText) {
	  	    page.validateText(logicalName,exceptedText);
	  	}
	  	@Then("User verifies the text box {string} {string}")
	  	public void user_verifies_the_text_box(String logicalName, String exceptedText) {
	  	   page.validateTextBox(logicalName,exceptedText);
	  	}
	  	@Then("New Frame open {string}")
	  	public void new_frame_open(String logicalName) {
	  	page.clickElementinFrame(logicalName);   
	  	}
	  	  @Then("Close the child window")
		  public void close_the_child_window() {
		      page.CloseWindow();
		  }
	  	@Then("User Clear the text box {string}")
	  	public void user_clear_the_text_box(String logicalName) {
	  	    page.clearTextBox(logicalName);
	  	}
	  	@Then("upload Data {string} {string}")
	  	public void upload_data(String logicalName, String value) throws InterruptedException {
	  	    page.uploadfile(logicalName,value);
	  	}
	  	@Then("Click on DropDown {string}")
	  	public void click_on_drop_down(String logicalName) {
	  	    page.ClickOnDropdown(logicalName);
	  	}
//	  	@Then("Click on DropDown {string} {string}")
//	  	public void click_on_drop_down(String logicalName, String value) {
//	  	    page.selectVisibleText(logicalName,value);
//	  	    page.selectValue(logicalName,value);
//	  	  //  page.selectbyIndex(logicalName,value);
//	  	}
//	  	@Then("Select option from Dropdown {string}")
//	  	public void select_option_from_dropdown(String value) {
//	  	  page.selectFromDropDown(value);
//	  	}
//	  	@Then("Select option from Dropdown  {string} {string}")
//	  	public void select_from_drop_down_list(String logicalName, String value) {
//	  		page.selectVisibleText(logicalName,value);
//	  	    page.selectValue(logicalName,value);
//	  	}
//	  	@Then("Select option from Dropdown {string} {string}")
//	  	public void select_option_from_dropdown(String logicalName, String value) {
//	  		page.selectVisibleText(logicalName,value);
//	  	    page.selectValue(logicalName,value);
//	  	}

	  	@Then("Select Text from DropDown {string} {string}")
	  	public void select_text_from_drop_down(String logicalName, String value) {
	  		page.selectVisibleText(logicalName,value);
	  		
	  	}
	  	@Then("go back to Menu {string}")
	  	public void go_back_to_menu(String logicalName) {
	  	   page.actionToMove(logicalName);
	  	}

	  	@Then("switch to deafult page")
	  	public void switch_to_deafult_page() {
	  	    page.switchtodeafultpage();
	  	}
	  	@Then("Accept Alert")
	  	public void accept_alert() {
	  	    page.acceptAlert();
	  	   }
//	  	@Then("I verify the Opportunities dropdown is present with options:")
//	  	public void i_verify_the_opportunities_dropdown_is_present_with_options(io.cucumber.datatable.DataTable dataTable) {
//	  	   page.verifyDropdown();
//	  	}
		  
		  
		
		 


	
	@After
	public void teardown() {
		driver.close();
		driver=null;
	}
}
