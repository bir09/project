package com.bitrix24.pages;

import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Message {
    public Message(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "feed-add-post-form-tab-message")
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

    @FindBy(id = "LIVEFEED_search")
    public WebElement fSBox;

    @FindBy(xpath ="//div[@class='main-ui-filter-sidebar-item']")
    public List<WebElement> fSideBar;

    @FindBy(xpath = "//div[@class='main-ui-filter-sidebar-item'][1]")
    public WebElement workbtn;

    @FindBy(xpath = "//div[@class='main-ui-filter-sidebar-item'][2]")
    public WebElement favBtn;

    @FindBy(xpath = "//div[@class='main-ui-filter-sidebar-item'][3]")
    public WebElement activityBtn;

    @FindBy(xpath = "//div[@class='main-ui-filter-sidebar-item'][4]")
    public WebElement annBtn;

    @FindBy(xpath = "//div[@class='main-ui-filter-sidebar-item'][5]")
    public WebElement workFlowBtn;

    @FindBy(xpath ="//div[@class='main-ui-filter-search-square main-ui-filter-search-square-preset main-ui-square']")
    public WebElement verifyFilter;

    @FindBy(xpath = "//div[@class='main-ui-item-icon main-ui-square-delete'][1]")
    public WebElement removeBtn;





}

