package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util {//BrowserManager is sub class of Util class

    LoadProp loadProp = new LoadProp();

    public void setChromeBrowser() {
        //Store load property value in string
        String browserName = loadProp.getProperty("BrowserName");

        //if else if condition for cross browsing
        if (browserName.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\SetBrowser\\chromedriver.exe");//chrome driver path setup
            driver = new ChromeDriver();//object of chrome driver or chrome browser open

        } else if (browserName.equalsIgnoreCase("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\SetBrowser\\geckodriver.exe");
            driver = new FirefoxDriver();//object of firefox driver or firefox browser open

        } else if (browserName.equalsIgnoreCase("InternetExplorer"))
        {
            System.setProperty("webdriver.ie.driver", "src\\test\\resources\\SetBrowser\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();//object of InternetExplorerDriver or InternetExplorer open
        } else {
            System.out.println("You Enter Wrong Browser Name,Please Enter Valid Browser Name !!!" + browserName.equalsIgnoreCase(""));
        }

        driver.manage().window().maximize();//run time windows size maximize
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);//wait for 10 second before all test case
        driver.get(loadProp.getProperty("URL"));//type URL
    }

    public void closeBrowser() {
        driver.close();//close Browser
    }


}