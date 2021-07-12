package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Removing_All_ItemsPage {

	// Validate that all list item could be removed using
	// the remove button and when "Toggle All" functionality is on.
	// http://techfios.com/test/101/
	WebDriver driver;
	public Removing_All_ItemsPage(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(name = "allbox")
	WebElement Toggle_All_CheckBox;

	@FindBy(css = "input[value='Remove']")
	WebElement Remove_Button_Field;
	// todo[2]
	@FindBy(name = "todo[0]")
	WebElement CheckBox1;
	@FindBy(name = "todo[1]")
	WebElement CheckBox2;
	@FindBy(name = "todo[2]")
	WebElement CheckBox3;
	@FindBy(css = "input[type='checkbox']")
	List<WebElement> All_CheckBox_Field;

	public void clickingToggleAll() {
		Toggle_All_CheckBox.click();
	}

	public void removingAllItem() {
		Remove_Button_Field.click();
	}
	public void validiateTheRemovedAllItems() throws InterruptedException {
		try {		
			boolean firstitem=CheckBox1.isDisplayed();
			boolean seconditem=CheckBox2.isDisplayed();
			boolean thirditem=CheckBox3.isDisplayed();
		}catch(Exception e) {
			System.out.println("All items got deleted");
		}
	}
}
