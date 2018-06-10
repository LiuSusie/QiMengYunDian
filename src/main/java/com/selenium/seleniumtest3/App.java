package com.selenium.seleniumtest3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import com.selenium.utils.SeleniumUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       
    }

    @Test
    public void t() {
        System.out.println( "This is a testng test for github" );
//        WebDriver driver = new FirefoxDriver();
        
//       driver.get("http://www.baidu.com");
        SeleniumUtil  su=new SeleniumUtil();
        su.get("http://www.baidu.com");
 //       su.get("http://www.baidu.com");

    }
    
}
