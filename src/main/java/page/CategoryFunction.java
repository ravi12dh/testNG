package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class CategoryFunction extends BasePage {
	@FindBy(how = How.NAME, using = "categorydata")
	WebElement CATEGORYDATA_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@value='Add category']")
	WebElement ADD_CATEGORYBUTTON_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//select[@name='due_month']")
	WebElement MONTH_DROUP_DOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/span[1]")
	WebElement ASSERTION_FOR_DUPLICATED_MESSAGE_DISPLAY;
	@FindBy(how = How.XPATH, using = "//a[text()='Nevermind']")
	WebElement CANCEL_DUPLICATED_MESSAGE_DISPLAY;
	
	

	public void interCategoryField() {
		CATEGORYDATA_FIELD_LOCATOR.sendKeys("mavenProject2");
	}

	public void clickAddCategoryButton() {
		ADD_CATEGORYBUTTON_FIELD_LOCATOR.click();
	}
	
	public void AssertionForduplicatedMessageDisplay() {
		
		Assert.assertEquals(ASSERTION_FOR_DUPLICATED_MESSAGE_DISPLAY.getText(), "mavenProject2" + 
				"", "\"The category you want to add already exists: <mavenProject2>.");
	}
	public void monthDropDownHasAllTheMonth() {
		MONTH_DROUP_DOWN_ELEMENT.click();
		
	}
	public void getCountryList() {
		selectDropDown(MONTH_DROUP_DOWN_ELEMENT );
	}
	public void CencelDuplicateMessageDisplay() {
		CANCEL_DUPLICATED_MESSAGE_DISPLAY.click();
	
}
}