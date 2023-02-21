package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ViewAllOrderPage extends BasePage {

    public ViewAllOrderPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }



}
