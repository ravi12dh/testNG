package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.CategoryFunction;
import util.BrowserFactory;

public class CategoryFunctionTest {

	WebDriver driver;

	@Test
	public void validUserisAbleToAddCategory() throws InterruptedException {

		driver = BrowserFactory.init();
		CategoryFunction categoryFunction = PageFactory.initElements(driver, CategoryFunction.class);
		
		categoryFunction.interCategoryField();
		categoryFunction.clickAddCategoryButton();
		categoryFunction.AssertionForduplicatedMessageDisplay();
		categoryFunction.CencelDuplicateMessageDisplay();
		categoryFunction.monthDropDownHasAllTheMonth();
		categoryFunction.getCountryList();
		
		//BrowserFactory.tearDown();
	}
}
