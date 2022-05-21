package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaPage {

	public static void main(String[] args) {


		@FindBy(xpath="//a[text()=' Core Java for Selenium']")
		private WebElement corejava;
		
		public CoreJavaPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
			
		}
		public void corejavaselenium() {
			corejava.click();
		}
		
		
		

	}

}
