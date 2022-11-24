package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearPage {


    public SmartBearPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@name='ctl00$MainContent$username']")
    public WebElement usernameField;

    @FindBy(xpath = "//input[@name='ctl00$MainContent$password']")
    public WebElement passwordField;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "//a[@href='Process.aspx']")
    public WebElement orderPage;

    @FindBy(xpath = "//select[starts-with(@id,'ctl00_Main')]")
    public static WebElement product;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public static WebElement quantity;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public static WebElement customerName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public static WebElement street;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public static WebElement city;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public static WebElement state;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public static WebElement zipCode;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_cardList_0']")
    public static WebElement creditCard;

    @FindBy(id= "ctl00_MainContent_fmwOrder_TextBox6")
    public static WebElement ccNumber;

    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox1")
    public static WebElement date;

    @FindBy(xpath = "//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")
    public static WebElement processBtn;

    @FindBy(xpath = "//a[.='View all orders']")
    public static WebElement viewAllOrders;



}
