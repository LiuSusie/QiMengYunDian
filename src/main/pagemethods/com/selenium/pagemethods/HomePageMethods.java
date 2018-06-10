package com.selenium.pagemethods;

import com.selenium.pages.HomePage;
import com.selenium.utils.SeleniumUtil;

public class HomePageMethods {

	public static boolean checkHomePageUI (SeleniumUtil seleniumUtil)
	
	{
		boolean bl=false;
		bl=seleniumUtil.isElementExist(HomePage.BANNER);
		return(bl);
		
	}
}
