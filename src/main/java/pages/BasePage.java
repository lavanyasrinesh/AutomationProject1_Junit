package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public void waitforElement(WebDriver driver,int waittimeinsecond,WebElement element) {
		
		WebDriverWait wait=new WebDriverWait(driver,waittimeinsecond);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
}
