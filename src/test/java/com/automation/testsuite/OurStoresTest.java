package com.automation.testsuite;

import com.automation.pages.HomePage;
import com.automation.pages.OurStoresPage;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OurStoresTest extends TestBase {

    HomePage homePage;
    OurStoresPage ourStoresPage;

    @BeforeMethod
    public void initialize(){
        homePage = new HomePage();
        ourStoresPage = new OurStoresPage();
    }

    @Test
    public void verifyUserShouldBrowseOurStorePage(){
        homePage.clickOnOurStoresLink();
        ourStoresPage.clickOnOkButtonForPopUp();
        ourStoresPage.scrollThroughMap();
        ourStoresPage.takeScreenshot();
    }
}
