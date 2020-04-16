package com.bitrix24.tests;

import com.bitrix24.base.TestBase;
import com.bitrix24.utilities.BrowserUtilities;
import com.bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class InsertLinkURL extends TestBase {
    //4. User should be able to insert videos by clicking on the video icon and entering the video URL.
    @Test
    public void insertLinkURL(){
        test = report.createTest("Insert Link URL tests");
        test.info("1. Login to Bitrix24 application");
        loginPage.login(ConfigurationReader.getProperty("username_helpdesk7"),
                ConfigurationReader.getProperty("password"));


        test.info("2. Click on message tab");
        BrowserUtilities.wait(2);
        message.messageTab.click();

        test.info("3. Click on link icon");
        BrowserUtilities.wait(2);
        message.linkIcon.click();

        test.info("4. Enter the URL");
        message.link.sendKeys("hhttps://www.youtube.com/watch?v=CRlGDDprdOQ");

        test.info("5. Click on the save button");
        wait.until(ExpectedConditions.elementToBeClickable(message.saveButton));
        message.saveButton.click();

        test.info("6. Verify that URL in the message body");
        driver.switchTo().frame(message.iframeMessageBody);
        String expectedLink = "https://www.youtube.com/watch?v=CRlGDDprdOQ";
        String actualLink = message.linkInMessageBody.getText();
        assertEquals(expectedLink,actualLink);

        test.pass("Insert Link URL tests PASSED");


    }
}
