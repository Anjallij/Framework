package scripts;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WhishlistPage;

public class TestCase3 extends BaseClass{

	public static void main(String[] args) {


		@Test
		public void tc3() {
			SkillraryLoginPage s=new SkillraryLoginPage(driver);
			s.searchtextbox(p.getPropertyFiledata("name"));
			s.searchbutton();
			
			CoreJavaPage c=new CoreJavaPage(driver);
			c.corejavaselenium();
			
			WhishlistPage w=new WhishlistPage(driver);
			driverutilities.switchFrames(driver);
			w.playbutton();
			Thread.sleep(1000);
			w.pauseicon();
			driverutilities.switchbackframe(driver);
			w.addtowishlist();
			
			
			
		}
		

	}

}
