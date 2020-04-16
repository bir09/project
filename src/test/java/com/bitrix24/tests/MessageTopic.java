package com.bitrix24.tests;

import com.bitrix24.base.TestBase;
import com.bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MessageTopic extends TestBase {

    @Test
    public void topicIcon() throws InterruptedException {
   //8. User should be able to click on the Topic icon to see the Message Topic text box displays on top of the message box.
        test = report.createTest("Topic icon tests");
        test.info("1. Login to Bitrix24 application");
        loginPage.login(ConfigurationReader.getProperty("username_hr7"),
                ConfigurationReader.getProperty("password"));
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    //    Thread.sleep(3000);
        test.info("2. Clicking on message tab");
        message.messageTab.click();
       // Thread.sleep(3000);

        test.info("3. Clicking on the topic icon");
        wait.until(ExpectedConditions.elementToBeClickable(topic.topicIcon));
        if(!topic.textBoxTitle.isDisplayed()) {
            topic.topicIcon.click();
        }
      //  Thread.sleep(3000);


        test.info("4. Verify that Topic text box displays on top of the message box");


        assertTrue(topic.textBoxTitle.isDisplayed());




        test.pass("Topic text box is displayed on top of the message box");



    }
}
