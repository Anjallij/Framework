package scripts;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.Addtocart;
import pomPages.SkillraryDemoApplication;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass{
	
	@Test
	public void tc1() {
SkillraryLoginPage s=new SkillraryLoginPage(driver);
s.gerasbutton();
s.skillrraydemoApplication();

SkillraryDemoApplication d=new SkillraryDemoApplication(driver);
driverutilities.switchTabs(driver);
driverutilities.mouseHover(driver,d.getCousetab());
d.seleniumtrainingtab();

Addtocart a=new Addtocart(driver);
driverutilities.doubleClick(driver,a.getAddbtn());
a.addtocartbutton();
driverutilities.alertPopup(driver);

	}}
