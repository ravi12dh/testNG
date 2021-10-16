package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

		public void waitForElement(WebDriver driver, int timeInSeconds, WebElement elementLocator) {
			WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
			wait.until(ExpectedConditions.visibilityOf(elementLocator) );
			
		}
		public void selectDropDown(WebElement element) {
			Select sel = new Select(element);
			//sel.selectByVisibleText(visibleText);
			
			List<WebElement> elem = sel.getOptions();
			for(WebElement webElement : elem) {
				System.out.println("option :" + webElement.getText());
			}
			
		}
}
