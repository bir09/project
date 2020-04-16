package com.bitrix24.tests;

import com.bitrix24.base.TestBase;
import com.bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;


public class FilterTest extends TestBase {

    @Test
    public void test() throws InterruptedException {
//        TODO  As a user, I should be able to use "Filter  and search" functionality on Active Stream.
        // TODO 1. User should be able to search by clicking on default filters. (work, favorate, my activity, annoucements, and workflows)
        test = report.createTest("Filter Sidebar");
        test.info("Login into Betrix24");
        loginPage.login(ConfigurationReader.getProperty("username_helpdesk8"), ConfigurationReader.getProperty("password"));
        test.info("Click on the filter and search box ");
        message.fSBox.click();
        test.info("Verify the list on the filter side bar");
        Thread.sleep(2000);
        List<WebElement> filterList = message.fSideBar;
        System.out.println(filterList);

        test.info("Verify user is able to click on work");
        message.workbtn.click();
        test.info("make sure in the search box");
        System.out.println(message.verifyFilter);
        Thread.sleep(2000);
        test.info("remove work");
        message.removeBtn.click();
        Thread.sleep(3000);
        test.info("click search Box");
        message.fSBox.click();
        Thread.sleep(2000);

        test.info("Verify user is able to click on Favorites");
        message.favBtn.click();
        test.info("make sure it in the search box");
        System.out.println(message.verifyFilter);
        Thread.sleep(2000);
        test.info("remove favorites");
        message.removeBtn.click();
        Thread.sleep(3000);
        test.info("click search Box");
        message.fSBox.click();
        Thread.sleep(2000);

        test.info("Verify user is able to click on My Activity");
        message.activityBtn.click();
        test.info("make sure in the search box");
        System.out.println(message.verifyFilter);
        Thread.sleep(2000);
        test.info("remove My Activity");
        message.removeBtn.click();
        test.info("click search Box");
        message.fSBox.click();
        Thread.sleep(3000);

        test.info("Verify user is able to click on announcements");
        message.annBtn.click();
        Thread.sleep(2000);
        test.info("make sure in the search box");
        System.out.println(message.verifyFilter);
        Thread.sleep(2000);
        test.info("remove announcements");
        message.removeBtn.click();
        Thread.sleep(3000);
        test.info("click search Box");
        message.fSBox.click();
        Thread.sleep(2000);

        test.info("click search Box");
        message.fSBox.click();
        Thread.sleep(2000);
        test.info("Verify user is able to click on Workflow");
        message.workFlowBtn.click();
        Thread.sleep(2000);
        test.info("make sure in the search box");
        System.out.println(message.verifyFilter);
        Thread.sleep(2000);
        test.info("remove workFlow");
        message.removeBtn.click();
        Thread.sleep(3000);
        test.info("click search Box");
        message.fSBox.click();
        Thread.sleep(2000);











    }
}