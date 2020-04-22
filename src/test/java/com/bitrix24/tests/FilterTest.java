package com.bitrix24.tests;

import com.bitrix24.base.TestBase;
import com.bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class FilterTest extends TestBase {

    @Test
    public void test() {
//        TODO  As a user, I should be able to use "Filter  and search" functionality on Active Stream.
        // TODO 1. User should be able to search by clicking on default filters. (work, favorate, my activity, annoucements, and workflows)

        test = report.createTest("Filter Sidebar");
        test.info("Login into Betrix24");
        loginPage.login(ConfigurationReader.getProperty("username_helpdesk8"), ConfigurationReader.getProperty("password"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchBox =  message.fSBox;

        test.info("Click on the search Box");
        searchBox.click();
        test.info("clicking on each item on the filter sidebar to verify it functions");
        for (WebElement list: message.fSideBar){
            list.click();
            System.out.println(message.verifyFilter.getText());
            message.removeBtn.click();
            searchBox.click();

        }


    }
}
