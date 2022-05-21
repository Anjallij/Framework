package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.SkillraryDemoApplication;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass{
	
	@Test
	public void tc2() throws IOException, InterruptedException {
SkillraryLoginPage s=new SkillraryLoginPage(driver);
s.gerasbutton();
s.skillrraydemoApplication();

SkillraryDemoApplication sd=new SkillraryDemoApplication(driver);
driverutilities.switchTabs(driver);
driverutilities.dropDown(sd.getCourseadd(),p.getPropertyFiledata("coursedd"));

TestingPage t=new TestingPage(driver);
driverutilities.dragdrop(driver,t.getSeleniumtraining(),t.getCart());
 Point fb = t.getFacebookicon().getLocation();
 int x = fb.getX();
 int y=fb.getY();
 
 
 
 driverutilities.scrollbar(driver, x, y);
 t.facebook();
 
 
 
	}

}