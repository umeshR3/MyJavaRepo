package com.testpages;

import com.pages.CustomerID;
import com.pages.CustomerProjectPage;
import com.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utillPackage.Utillclass;

public class CustomerIDTest extends BaseTest {
    HomePage homepage;
    Utillclass utillclass;
    CustomerID customerID;
    @BeforeClass
    public void lunchdriver()
    {
       /* System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
       // login=new LoginPage(driver);*/
        //homepage=new HomePage(driver);
        homepage= PageFactory.initElements(driver,HomePage.class);


        utillclass=new Utillclass(driver);

    }
    @Test()
    public void navigateToProjectsAndCustomers()
    {

        String expectedProjectAndCustomerTitle="actiTIME - Active Projects & Customers";
        homepage.ProjectsAndCustomers();
        //homepage.CompletedTasks();
       /* String title=utillclass.getTitle();
        System.out.println("Title of the page" +title);
        Assert.assertEquals(expectedProjectAndCustomerTitle,title);
*/
    }
    @Test(dependsOnMethods = "navigateToProjectsAndCustomers")
    public void addNewcustomerAddNewProject() throws InterruptedException {
        customerID=new CustomerID(driver);
        customerID.customeraddAndAddProject();
       /* String expectedText="Customer has been successfully registered.";
        String actualText= customerProjectPage.customeradd().getText();
        Assert.assertEquals(expectedText,actualText);
        System.out.println(actualText);*/

    }
}
