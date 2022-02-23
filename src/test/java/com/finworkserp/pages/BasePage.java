package com.finworkserp.pages;

import com.finworkserp.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(className = "oe_topbar_name")
    public WebElement userName;

    @FindBy(linkText = "Log out")
    public WebElement logoutBtn;

    public String getUserName(){
        return userName.getText();
    }
}
