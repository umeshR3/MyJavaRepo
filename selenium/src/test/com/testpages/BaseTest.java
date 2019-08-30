package com.testpages;

import com.pages.HomePage;
import com.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utillPackage.Utillclass;

import java.io.IOException;

public class BaseTest {
    WebDriver driver;
    LoginPage login;
    Utillclass utillclass=new Utillclass(driver);


    @BeforeClass
    public void driverLunchSetUp() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
        driver=new ChromeDriver();
        login=new LoginPage(driver);
       String url= utillclass.getPropertyValues("URL");
        System.out.println(url);

        driver.manage().window().maximize();
        driver.get(url);
        login();
    }

    public void login() throws InterruptedException, IOException
    {

       /* login.userName();
        login.passWord();
        login.submit();
        Thread.sleep(1000);*/
       String userName=utillclass.getPropertyValues("UserName");
       String passWord=utillclass.getPropertyValues("Password");

       login.loginAs(userName,passWord);
       Thread.sleep(3000);

    }


}
