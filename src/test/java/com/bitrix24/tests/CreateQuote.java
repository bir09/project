package com.bitrix24.tests;

import com.bitrix24.base.TestBase;
import com.bitrix24.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CreateQuote extends TestBase {
    //User should be able to create quote by clicking on Comma icon
    @Test
    public void createQuoteTest(){
        test = report.createTest("Quote icon tests");
        test.info("1. Login to Bitrix24 application");
        loginPage.login(ConfigurationReader.getProperty("username_hr8"),
                ConfigurationReader.getProperty("password"));
        test.info("2. Click on message tab");
        message.messageTab.click();
        test.info("4. Click on quote icon");
        wait.until(ExpectedConditions.elementToBeClickable(message.quoteIcon));
        message.quoteIcon.click();
        test.info("5.Writing quote in the quote block");

        WebElement frame=driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        message.quoteblock.sendKeys("TO BE OR NOT TO BE!");
        driver.switchTo().defaultContent();
        test.info("6. Click on send button");
        wait.until(ExpectedConditions.elementToBeClickable(message.sendButton));
        message.sendButton.click();

        test.info("7. Verifying quote is displayed on the page");
        String textmessage=message.quoteSent.getText();
        assertTrue(message.quoteSent.isDisplayed());
        assertEquals(textmessage,"TO BE OR NOT TO BE!");
        test.pass("pass: Quote Icon verification test");
    }
}
