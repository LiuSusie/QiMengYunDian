package CheckPageLayout;
import org.testng.annotations.Test;

import com.selenium.base.Base;
import com.selenium.pagemethods.*;
//import com.selenium.utils.SeleniumUtil;

public class HomePage_001_CheckUI_Test extends Base {
	@Test
	public void CheckUI ()
	{
		
		if (HomePageMethods.checkHomePageUI(seleniumUtil)) {
            System.out.println("check home page successfully");

		}
		else {
            System.out.println("check home page unsuccessfully");

		}
		
	}
}
