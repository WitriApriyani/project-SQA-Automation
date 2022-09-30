package com.psikotestonline.webadmin.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.psikotestonline.webadmin.testing.driver.DriverSingleton;

public class SearchUsers {

private WebDriver driver;
	
	public SearchUsers() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/div[8]/div[3]/div/button")
	private WebElement okBtn;
	
	@FindBy(xpath="//h3[@id='ui-id-9']")
	private WebElement task;
	
	@FindBy(xpath="//span[normalize-space()='Data Users']")
	private WebElement datausers;
	
	@FindBy(xpath="//input[@id='tl_data_users--53078_text']")
	private WebElement searchbox;
	
	@FindBy(xpath="//*[@id=\"53084_query\"]/span")
	private WebElement btnsearchuser;
	
	public void activeFilter() {
		Select filter = new Select(driver.findElement(By.xpath("//*[@id=\"tl_data_users--53411_text\"]")));
		filter.selectByValue("ACTIVE");
	}
	
	public void nonactiveFilter() {
		Select filter = new Select(driver.findElement(By.xpath("//*[@id=\"tl_data_users--53411_text\"]")));
		filter.selectByValue("NON ACTIVE");
	}
	
	public void clicktask() {
		task.click();
	}
	
	public void clickdatausers() {
		datausers.click();
	}
 	
	
	public void clickbtnsearchuser() {
		btnsearchuser.click();
		
	}
	
	public void typesearchbox(String searchbox) {
		this.searchbox.sendKeys(searchbox);
	}
	
	
	public void clickOk() {
		delay(3);
		okBtn.click();
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