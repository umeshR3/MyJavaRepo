package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utillPackage.Utillclass;

public class CustomerProjectPage extends BasePage {
    Utillclass utillclass;
    String customerName="customerName"+ System.currentTimeMillis();
    String progectName="progectName"+System.currentTimeMillis();
    String discription="I am new customer"+System.currentTimeMillis();
/*    @FindBy(xpath ="//input[@type='text']")
    public WebElement customerElement;*/
    By customerElement=By.xpath("//input[@type='text']");
    By clickAddCustomerButton=By.xpath("//input[@value='Add New Customer']");
    By customerDiscription=By.xpath("//td//textarea[@name='description']");
    By clickSubmitButton=By.xpath("//input[@name='createCustomerSubmit']");
    By successMessage=By.xpath("//span[@class='successmsg']");
    By addProjectRadioButton=By.id("add_project_action");
    By addProjectName=By.xpath("//input[@name='name')");

    public CustomerProjectPage(WebDriver driver) {
        super(driver);
        utillclass=new Utillclass(driver);
    }

    @Override
    public boolean waitForLoaded() {
        return false;
    }
    public CustomerProjectPage customeradd()
    {
        driver.findElement(customerElement).sendKeys(customerName);
        driver.findElement(customerDiscription).sendKeys(discription);
        driver.findElement(clickAddCustomerButton).click();
        utillclass.sendKeyMethod(customerElement,customerName);
        utillclass.sendKeyMethod(customerDiscription,discription);
        utillclass.clickMethod(clickSubmitButton);
        return this;


    }
    public void customeraddAndAddProject() throws InterruptedException {
       /* driver.findElement(customerElement).sendKeys(customerName);
        driver.findElement(customerDiscription).sendKeys(discription);*/
        driver.findElement(clickAddCustomerButton).click();
        utillclass.sendKeyMethod(customerElement,customerName);
        utillclass.sendKeyMethod(customerDiscription,discription);
        Thread.sleep(4000);
        utillclass.clickMethod(addProjectRadioButton);
        utillclass.clickMethod(clickSubmitButton);

        utillclass.sendKeyMethod(addProjectName,progectName);

        utillclass.clickMethod(clickSubmitButton);


    }
    public String getText()
    {
        return utillclass.getText(successMessage);
    }

}
