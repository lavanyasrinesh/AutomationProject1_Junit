package test;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.Removing_one_From_ListPage;
import util.BrowserFactory;

public class Removing_A_List_Test {
	WebDriver driver;

	@Before
	public void lanchBrowser() {
		driver = BrowserFactory.init();
	}

	@Test
	public void removing_a_item() throws IOException  {
		Removing_one_From_ListPage remove = PageFactory.initElements(driver, Removing_one_From_ListPage.class);
		remove.select_one_item_from_list();
		remove.click_on_remove_button();
		remove.verifying_removing_a_selected_item();
	}

	@After
	public void tearDown() {
		BrowserFactory.tearDown();
	}
}
