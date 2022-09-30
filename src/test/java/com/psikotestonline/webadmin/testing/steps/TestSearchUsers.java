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

public class TestSearchUsers {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private Login login = new Login();
	private SearchUsers searchUsers= new SearchUsers();
	
	public TestSearchUsers() {
		driver = Hook.driver;
		extentTest = Hook.extentTest;
	}
	
	@When("^navigate to dashboard page search users$")
	public void navigate_to_dashboard_page_search_users() {
		driver.get(Constants.url);
		login.login("developer", "23");
		login.clickBtn();
		login.clickOk();
		extentTest.log(LogStatus.PASS, "navigate to dashboard page users");
	}
	
	@And("^click task menu search users$")
	public void taskmenu_searchusers() {
		searchUsers.clicktask();
		extentTest.log(LogStatus.PASS, "click task menu search users");
			
	}
	
	@And("^click data users search users$")
	public void datauser_searchusers() {
		searchUsers.clickdatausers();
		extentTest.log(LogStatus.PASS, "click data users search users");
	}
	
	@And("^filter as active search users$")
	public void active_searchusers () {
		searchUsers.activeFilter();
		extentTest.log(LogStatus.PASS, "ilter as active search users");
		
	}
	
	@Then("^data displayed search users$")
	public void data_displayed_searchusers () {
		delay(2);
		List <WebElement> col = driver.findElements(By.xpath("//*[@id=\"tl_data_users--53082-cell-0-1\"]"));
        System.out.println("No of cols are :" +col.size());
        extentTest.log(LogStatus.PASS, "data displayed search users");
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
