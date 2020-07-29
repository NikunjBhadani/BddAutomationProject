package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Util{//Hooks is sub class of Util class

    BrowserManager browserManager = new BrowserManager(); //Crate Object Of BrowserManager.

    @Before//Before run All Feature file.
    public void openBrowser()
    {
        browserManager.setChromeBrowser();//call Method of BrowserManager class
    }
    @After//After run All Feature file.
    public void closeBrowser()
    {
        browserManager.closeBrowser();//call Method of BrowserManager class
    }


}
