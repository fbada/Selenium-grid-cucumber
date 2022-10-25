package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLogin {

   public VyTrackLogin(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement usrNameField;

    @FindBy(id = "prependedInput2")
    public WebElement pswdField;

    @FindBy(id = "_submit")
    public WebElement submitBtn;

    @FindBy(xpath = "//i[@class ='fa-question-circle']")
    public  WebElement helpIcon;
}
