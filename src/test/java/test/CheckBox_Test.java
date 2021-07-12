package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.CheckBox_ValidationPage;
import util.BrowserFactory;

public class CheckBox_Test {

	WebDriver driver;

	@Before
	public void lanchBrowser() {
		driver = BrowserFactory.init();
	}

	@Test
	public void checkbox_Feature() {
		
		CheckBox_ValidationPage checkbox = PageFactory.initElements(driver, CheckBox_ValidationPage.class);

		checkbox.toggle_all();
		checkbox.verifying_ToggleAllCheckBox_Is_Selected();
		checkbox.verifying_All_Checkbox_Is_Selected();
	}

	//@After
	public void closing_The_Browser() {
		BrowserFactory.tearDown();
	}
}
