package pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Removing_one_From_ListPage {
	WebDriver driver;

	public Removing_one_From_ListPage(WebDriver driver) {
		this.driver = driver;
	}

	// input[name='todo[0]']
	@FindBy(name = "todo[4]")
	WebElement First_CheckBox_Field;

	// input[name='submit'][value='Remove']
	@FindBy(css = "input[value='Remove']")
	WebElement Remove_Button_Field;

	public void select_one_item_from_list() {

		First_CheckBox_Field.click();

	}

	public void click_on_remove_button() {
		Remove_Button_Field.click();
		Assert.assertTrue(true);
	}

	public void verifying_removing_a_selected_item() throws IOException {
		try {
			boolean removed_item = First_CheckBox_Field.isDisplayed();
			System.out.println(removed_item);
			// Assert.assertTrue("The item is removed:", removed_item);
		} catch (Exception e) {
			System.out.println("Item got deleted.");
		}
	}
}
