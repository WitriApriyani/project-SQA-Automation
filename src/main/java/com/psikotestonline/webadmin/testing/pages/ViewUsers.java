package com.psikotestonline.webadmin.testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.psikotestonline.webadmin.testing.driver.DriverSingleton;

public class ViewUsers {

private WebDriver driver;

	public ViewUsers() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[8]/div[3]/div/button")
	private WebElement okBtn;
	
	@FindBy(xpath="//h3[@id='ui-id-9']")
	private WebElement task;
	
	@FindBy(xpath="//span[normalize-space()='Data Users']")
	private WebElement datausers;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[6]/table/tbody/tr[1]/td[7]/div/table/tbody/tr[1]/td[1]/div/img")
	private WebElement orangeicon;
	
	@FindBy(xpath="//*[@id=\"tl_viewedit_user--53383\"]/table/tbody/tr/td[1]/label")
	private WebElement datadisplayed;
	
	
	public void clicktaskmenu3() {
		task.click();
	}
	
	public void clickdatausers() {
		datausers.click();
	}
 	

	public void filterasactiveusers() {
		Select filter = new Select(driver.findElement(By.id("tl_data_users--53411_text")));
		filter.selectByValue("ACTIVE");
	}
	
	public String getdatadisplayed() {
		return datadisplayed.getText();
	}

	public void clickorangeicon() {
		orangeicon.click();
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
	

