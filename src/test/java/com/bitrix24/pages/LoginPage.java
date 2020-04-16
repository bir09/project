package com.bitrix24.pages;


import com.bitrix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement password;


    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement LogIn;



    public void login(String username,String password){
        this.userName.sendKeys(username);
        this.password.sendKeys(password);
        LogIn.click();
    }

}

