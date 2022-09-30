package com.psikotestonline.webadmin.testing.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.psikotestonline.webadmin.testing.driver.DriverSingleton;

public class ExportDataUsers {
	
private WebDriver driver;
			
	public ExportDataUsers() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="/html/body/div[8]/div[3]/div/button")
	private WebElement okeButton;
	
	@FindBy(xpath="//h3[@id='ui-id-9']")
	private WebElement task;
	
	@FindBy(xpath="//span[normalize-space()='Data Users']")
	private WebElement datausers;
	
	@FindBy(xpath="//*[@id=\"tl_data_users--53086\"]")
	private WebElement export;
	
	public void clickExport() {
		export.click();	
	
	}
	
	public void clicktaskmenu() {
		task.click();
	}
	
	public void clickdatausers() {
		datausers.click();
		
	}
	
	public boolean isFileDownloaded(String downloadPath, String fileName) {
		  File dir = new File(downloadPath);
		  File[] dirContents = dir.listFiles();

		  for (int i = 0; i < dirContents.length; i++) {
		      if (dirContents[i].getName().equals(fileName)) {
		          // File has been found, it can now be deleted:
		          dirContents[i].delete();
		          return true;
		      }
		          }
		      return false;
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