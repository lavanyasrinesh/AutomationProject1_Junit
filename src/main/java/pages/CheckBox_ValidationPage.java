package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBox_ValidationPage extends BasePage {
	WebDriver driver;

	public CheckBox_ValidationPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(name = "allbox")
	WebElement Toggle_All_CheckBox;
	@FindBy(css = "input[type='checkbox']")
	List<WebElement> All_CheckBox_Field;
	
	public void toggle_all() {
		Toggle_All_CheckBox.click();

	}

	public void verifying_ToggleAllCheckBox_Is_Selected() {
		boolean Toggle_All = Toggle_All_CheckBox.isSelected();
		Assert.assertTrue("ToggleAll is not selected", Toggle_All);
		waitforElement(driver, 80, Toggle_All_CheckBox);
	}

	public void verifying_All_Checkbox_Is_Selected() {
		
		for (int i = 0; i < All_CheckBox_Field.size(); i++) {
			WebElement ele = All_CheckBox_Field.get(i);
			boolean allcheckboxs=ele.isSelected();
			Assert.assertTrue("CheckBoxs are Not Selected ", allcheckboxs);
			}
		

	}

}
