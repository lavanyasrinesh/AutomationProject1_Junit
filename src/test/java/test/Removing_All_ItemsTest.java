package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.Removing_All_ItemsPage;
import util.BrowserFactory;

public class Removing_All_ItemsTest {

	WebDriver driver;
	
	@Before
	public void launchBrowser() {
		driver=BrowserFactory.init();
	}
	
	@Test
	public void removingAllItemsFromList() throws InterruptedException {
		Removing_All_ItemsPage all=PageFactory.initElements(driver, Removing_All_ItemsPage.class);
	all.clickingToggleAll();
	all.removingAllItem();
	all.validiateTheRemovedAllItems();
	}
	
	@After
	public void closingBrowser() {
		BrowserFactory.tearDown();
	}
}
