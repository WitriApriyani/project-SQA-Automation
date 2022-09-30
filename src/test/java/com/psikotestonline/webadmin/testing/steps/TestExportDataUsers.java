package com.psikotestonline.webadmin.testing.steps;

import org.openqa.selenium.WebDriver;

import com.psikotestonline.webadmin.testing.pages.ExportDataUsers;
import com.psikotestonline.webadmin.testing.pages.Login;
import com.psikotestonline.webadmin.testing.pages.SearchUsers;
import com.psikotestonline.webadmin.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestExportDataUsers {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private Login login = new Login();
	private SearchUsers searchUsers= new SearchUsers();
	private ExportDataUsers exportDataUsers= new ExportDataUsers();
	
	public TestExportDataUsers() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;
	}

	@When("^navigate to dashboard page$")
	public void navigate_to_dashboard_page() {
		driver.get(Constants.url);
		login.login("developer", "23");
		login.clickBtn();
		login.clickOk();
		extentTest.log(LogStatus.PASS, "navigate to dashboard page");

	}
	@And("click task menu")
	public void task_menu() {
		exportDataUsers.clicktaskmenu();
		extentTest.log(LogStatus.PASS, "click task menu");
	}
	
	@And("click data users")
	public void data_users() {
		exportDataUsers.clickdatausers();
		extentTest.log(LogStatus.PASS, "click data users");
	}
	
	@And("click export")
	public void click_eport() {
		exportDataUsers.clickExport();
		extentTest.log(LogStatus.PASS, "click export");
	}
	
	@Then("the data will be download as Excel")
	public void the_data_will_be_download_as_Excel() {
		exportDataUsers.isFileDownloaded("/Users/macbook/Downloads", "exportdatausers (1).xls");
		extentTest.log(LogStatus.PASS, "the data will be download as Excel");
	}
	}
	
		
		
