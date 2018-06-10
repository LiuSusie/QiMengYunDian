package com.selenium.base;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium.utils.SeleniumUtil;

public class Base {
	 //输出本页面日志 初始化
    static Logger logger = Logger.getLogger(Base.class.getName());
//	public static WebDriver driver;
	
	 protected SeleniumUtil seleniumUtil = null;
	    @BeforeClass
	    /**启动浏览器并打开测试页面*/
	    public  void startTest(){
	       	   
	    	 seleniumUtil = new SeleniumUtil();
	    	 try {
	             //启动浏览器launchBrowser方法可以自己看看，主要是打开浏览器，输入测试地址，并最大化窗口
	             seleniumUtil.lauchBrowser();
	             seleniumUtil.driver.get("https://mall.qimeng.fm");
	         } catch (Exception e) {
	             logger.warning("浏览器不能正常工作，请检查是不是被手动关闭或者其他原因");
	         }
	    }
	    
	    
	   
	 
	//    public WebDriver getDriver() {
	  //	  return this.driver;
	    //}
/*	    @Test
	    public void run(){        
	        driver.get("https://mall.qimeng.fm");
	        System.out.println("使用chrome,进入启蒙云店");
	        
	        //点击绘本图书tab
	     // driver.findElement(By.xpath(".//*[@id='header-menu']/div/div[2]/a")).click();
	    }
  */  
}

