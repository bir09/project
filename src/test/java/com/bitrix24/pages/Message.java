package com.bitrix24.pages;

import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Message {
    public Message(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement messageTab;

    @FindBy(xpath = "//div[@id='post-buttons-bottom']//span[@title='Link']")
    public WebElement linkIcon;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement link;

    @FindBy(id = "undefined")
    public WebElement saveButton;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframeMessageBody;

    @FindBy(xpath = "//body/a")
    public WebElement linkInMessageBody;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement quoteblock;

    @FindBy(xpath = "//span[@title='Quote text']/i")
    public WebElement quoteIcon;

    @FindBy(xpath= "(//button[@class='ui-btn ui-btn-lg ui-btn-primary'])[1]")
    public WebElement sendButton;

    @FindBy(xpath= "(//div[@class='blog-post-quote'])[1]/table/tbody/tr/td")
    public WebElement quoteSent;






}

