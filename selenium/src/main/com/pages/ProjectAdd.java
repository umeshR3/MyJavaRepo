package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utillPackage.Utillclass;

public class ProjectAdd extends BasePage {
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
    By addProjectName=By.xpath("//input[@name='name']");
    By clickcreateProject=By.name("createProjectSubmit");
    By clickAddNewProject= By.xpath("//input[@value='Add New Project']");
    By selectDropDown=By.name("customerId");
    By addTaskToThisProject=By.id("add_tasks_action");
    By addTaskWhenYouAddMoreTask=By.name("task[0].name");
    String taskName="NewTask"+ System.currentTimeMillis();
    public ProjectAdd(WebDriver driver) {
        super(driver);
        utillclass=new Utillclass(driver);

    }

    @Override
    public boolean waitForLoaded() {
        return false;
    }
    public ProjectAdd customeraddAndAddProject() throws InterruptedException {
       /* driver.findElement(customerElement).sendKeys(customerName);
        driver.findElement(customerDiscription).sendKeys(discription);*/
        driver.findElement(clickAddCustomerButton).click();
        Thread.sleep(3000);
        utillclass.sendKeyMethod(customerElement,customerName);
        utillclass.sendKeyMethod(customerDiscription,discription);
        Thread.sleep(4000);
        utillclass.clickMethod(addProjectRadioButton);
        utillclass.clickMethod(clickSubmitButton);

        utillclass.sendKeyMethod(addProjectName,progectName);

        utillclass.clickMethod(clickcreateProject);
        return this;


    }


    public void addProject()
    {
        utillclass.clickMethod(clickAddNewProject);
        Select select=new Select(driver.findElement(selectDropDown));
        select.selectByIndex(2);
        utillclass.sendKeyMethod(addProjectName,progectName);
        utillclass.clickMethod(clickcreateProject);

    }
    public void addProjectAddTask()
    {
        utillclass.clickMethod(clickAddNewProject);
        Select select=new Select(driver.findElement(selectDropDown));
        select.selectByIndex(2);
        utillclass.sendKeyMethod(addProjectName,progectName);
        utillclass.clickMethod(addTaskToThisProject);
        utillclass.clickMethod(clickcreateProject);

    }
    public void addMoreProject()
    {
        utillclass.clickMethod(clickAddNewProject);
        Select select=new Select(driver.findElement(selectDropDown));
        select.selectByIndex(2);
        utillclass.sendKeyMethod(addProjectName,progectName);
        utillclass.clickMethod(addTaskToThisProject);
        utillclass.clickMethod(clickcreateProject);
        utillclass.sendKeyMethod(addTaskWhenYouAddMoreTask,taskName);

    }


    public String getText()
    {
        return utillclass.getText(successMessage);
    }

}

