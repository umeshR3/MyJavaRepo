package com.testpages;

import com.pages.HomePage;
import com.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utillPackage.Utillclass;

public class BaseTest {
    WebDriver driver;
    LoginPage login;


    @BeforeClass
    public void driverLunchSetUp()
    {
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
        driver=new ChromeDriver();
        login=new LoginPage(driver);

        driver.manage().window().maximize();
        driver.get("http://umesh-pc:85/login.jsp");
    }
    @Test
    public void login() throws InterruptedException
    {

       /* login.userName();
        login.passWord();
        login.submit();
        Thread.sleep(1000);*/
       login.loginAs("admin","manager");
       Thread.sleep(3000);

    }


}
