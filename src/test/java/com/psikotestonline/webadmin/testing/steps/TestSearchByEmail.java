package com.psikotestonline.webadmin.testing.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.psikotestonline.webadmin.testing.pages.Login;
import com.psikotestonline.webadmin.testing.pages.SearchUsers;
import com.psikotestonline.webadmin.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSearchByEmail {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;

	private Login login = new Login();
	private SearchUsers searchUsers= new SearchUsers();
	
	public TestSearchByEmail() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;

	}
	
	@When("navigate to dashboard page user")
	public void navigate_to_dashboard_page_user() {
		driver.get(Constants.url);
		login.login("developer", "23");
		login.clickBtn();
		login.clickOk();
		extentTest.log(LogStatus.PASS, "navigate to dashboard page user");
	}
	
	
	@And("click task menu user")
	public void task_menu_user() {
		searchUsers.clicktask();
		extentTest.log(LogStatus.PASS, "click task menu user");	
		
	}
	
	@And("click data users user")
	public void click_data_users_user() {
		searchUsers.clickdatausers();
		extentTest.log(LogStatus.PASS, "click data users user");
	
	}
	
	@And("input email users user")
	public void input_email_users_user() {
		searchUsers.typesearchbox("testterus@gmail.com");
		searchUsers.clickbtnsearchuser();
		extentTest.log(LogStatus.PASS, "input email users user");
	
	}
	

	@Then("data displayed user")
	public void data_displayed_user() {
		List <WebElement> col = driver.findElements(By.xpath("//*[@id=\"tl_data_users--53082_table\"]"));
        System.out.println("No of cols are : " +col.size());
        extentTest.log(LogStatus.PASS, "data displayed user");
	
	}
	
	
	}
	
	
