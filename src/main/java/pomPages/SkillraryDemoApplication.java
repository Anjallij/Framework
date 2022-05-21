package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApplication {

	@FindBy(id="course")
	private WebDriver cousetab;
	
	@FindBy(name="addresstype")
	private WebElement courseadd;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	public SkillraryDemoApplication(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCousetab() {
		return (WebElement) cousetab;
	}
	public void seleniumtrainingtab() {
		seleniumtraining.click();
	}

	public WebElement getCourseadd() {
		return courseadd;
	}
}
