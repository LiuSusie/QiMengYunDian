package com.selenium.seleniumtest3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.BeforeClass;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class chrometest {

	 WebDriver driver;
	    @BeforeClass
	    public void beforeClass(){
	       // System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");

	        Map<String, String> mobileEmulation = new HashMap<String, String>();
	        //设置设备,例如:Google Nexus 7/Apple iPhone 6
	        //mobileEmulation.put("deviceName", "Google Nexus 7"); 
	        mobileEmulation.put("deviceName", "iPhone X");   //这里是要使用的模拟器名称，就是浏览器中模拟器中的顶部型号
	        Map<String, Object> chromeOptions = new HashMap<String, Object>();     
	        chromeOptions.put("mobileEmulation", mobileEmulation);     
	        DesiredCapabilities capabilities = DesiredCapabilities.chrome();       
	        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
	        try {
	            System.out.println("开始启动driver~~~");
	            driver = new ChromeDriver(capabilities);
	            System.out.println("启动driver成功~~~");
	        } catch (Exception e) {
	            System.out.println("启动driver失败~~~");
	            System.out.println(e.getMessage());
	        }     
	    }
	    @Test
	    public void run(){        
	        driver.get("https://mall.qimeng.fm");
	        System.out.println("使用chrome,进入启蒙云店");
	        
	        //点击绘本图书tab
	      driver.findElement(By.xpath(".//*[@id='header-menu']/div/div[2]/a")).click();
	    }
	        
}
