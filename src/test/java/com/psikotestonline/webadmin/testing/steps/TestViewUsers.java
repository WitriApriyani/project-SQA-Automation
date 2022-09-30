package com.psikotestonline.webadmin.testing.steps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.psikotestonline.webadmin.testing.pages.ExportDataUsers;
import com.psikotestonline.webadmin.testing.pages.Login;
import com.psikotestonline.webadmin.testing.pages.SearchUsers;
import com.psikotestonline.webadmin.testing.pages.ViewUsers;
import com.psikotestonline.webadmin.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestViewUsers {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private Login login = new Login();
	private ViewUsers viewUsers= new ViewUsers();
	
	public TestViewUsers() {
		driver=Hook.driver;
		extentTest=Hook.extentTest;
		
	}
	
	@When("^navigate to dashboard page 3$")
	public void navigate_to_dashboard_page_3() {
		driver.get(Constants.url);
		login.login("developer", "23");
		login.clickBtn();
		login.clickOk();
		extentTest.log(LogStatus.PASS, "navigate to dashboard page 3");
	}
	
	@And("click task menu 3")
	public void click_task_menu_3() {
		viewUsers.clicktaskmenu3();
		extentTest.log(LogStatus.PASS, "click task menu 3");
	}
	
	@And("click data users 3")
	public void click_data_users_3() {
		viewUsers.clickdatausers();
		extentTest.log(LogStatus.PASS, "click data users 3");
	}
	
	@And("filter as active users")
	public void filter_as_asctive_users() {
		viewUsers.filterasactiveusers();
		extentTest.log(LogStatus.PASS, "filter as active users");
	}
	
	@And("click orange icon")
	public void click_orange_icon() {
		delay(2);
		viewUsers.clickorangeicon();
		extentTest.log(LogStatus.PASS, "click  orange icon");
	}
	
	@Then("data displayed")
	public void data_displayed() {
		assertEquals(viewUsers.getdatadisplayed(), "Nama");
		extentTest.log(LogStatus.PASS, "data displayed");
	}
	
	static void delay(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

}


	}
}
