package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLogin {

    public LibraryLogin(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement emailField;

    @FindBy(id = "inputPassword")
    public WebElement passField;

    @FindBy(xpath = "//button[@class ='btn btn-lg btn-primary btn-block']")
    public WebElement submitButton;


}
