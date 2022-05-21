package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WhishlistPage;

public class TestCase3 extends BaseClass{
	@Test
	public void tc3() throws InterruptedException, IOException  {
SkillraryLoginPage s=new SkillraryLoginPage(driver);
s.searchtextbox(p.getPropertyFiledata("name"));
s.serachbutton();

CoreJavaPage c=new CoreJavaPage(driver);
c.corejavaselenium();

WhishlistPage w=new WhishlistPage(driver);
driverutilities.switchFrames(driver);
w.playbutton();
Thread.sleep(10000);
w.pauseicon();
driverutilities.switchbackframe(driver);
w.addtowishlist();


	}

}