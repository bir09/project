package com.bitrix24.pages;

import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Topic {
    public Topic(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "lhe_button_title_blogPostForm")
    public WebElement topicIcon;

    @FindBy(xpath = "(//input[@*=\"feed-add-post-inp feed-add-post-inp-active\"])")
    public WebElement textBox;

    @FindBy(id = "POST_TITLE")
    public WebElement textBoxTitle;
}
