package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class LoginPage extends BasePage {
	static WebDriver driver;
	public LoginPage(){
		super(driver=BaseTest.getDriver("Chrome"));
	addboject("Username",By.id("username"));
	addboject("Password",By.id("password"));
	addboject("Login",By.id("Login"));
	addboject("RememberMe",By.id("rememberUn"));
	addboject("ForgotYourPassowrd",By.id("forgot_password_link"));
	addboject("Continue",By.xpath("//input[@id='continue']"));
	addboject("UsernameForgotPassword",By.id("un"));
	addboject("Error",By.id("error"));
	//addboject("SavedUsername",By.id("idcard-identity"));
	addboject("SavedUsername", By.xpath("//span[@id='idcard-identity']"));
	addboject("Clearusername", By.id("clear_link"));
	addboject("Error1",By.xpath("//div[@id='error']"));
	
	
	}
	
}
