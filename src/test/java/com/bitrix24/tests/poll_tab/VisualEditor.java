package com.bitrix24.tests.poll_tab;

import com.bitrix24.base.TestBase;
import com.bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VisualEditor extends TestBase {


    @Test
    public void visualEditorTest() {
        //TODO:7. User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box.
        test = report.createTest("Visual Editor on Poll Tab");
        test.info("Login into Betrix24");
        loginPage.login(ConfigurationReader.getProperty("username_helpdesk8"), ConfigurationReader.getProperty("password"));
        test.info("Locating the Poll webElement");
        wait.until(ExpectedConditions.elementToBeClickable(poll.pollEl));
        poll.pollEl.click();
        test.info("Locating the Visual Editor WebElement");
        wait.until(ExpectedConditions.elementToBeClickable(poll.visualeditorEl));
        poll.visualeditorEl.click();
        test.info("Verify the presence of Editor text-Bar on the page");
        Assert.assertTrue(poll.editorText_Bar.isDisplayed());
        test.pass("User should be able to click on Visual Editor and see the editor text-bar displays on top of the message box");
    }
}