package com.bitrix24.pages;

import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Poll {
    public Poll(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement pollEl;

    @FindBy(xpath = "//span[@id=\"lhe_button_editor_blogPostForm\"]")
    public WebElement visualeditorEl;

    @FindBy(xpath = "//div[@id=\"bx-html-editor-tlbr-idPostFormLHE_blogPostForm\"]")
    public  WebElement editorText_Bar;
}
