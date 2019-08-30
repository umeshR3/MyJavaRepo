package utillPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utillclass {
    WebDriver driver;
    Properties properties;

    public Utillclass(WebDriver driver)
    {
        this.driver=driver;
    }

    public String getTitle()
    {
       String titel= driver.getTitle();

        return titel;
    }
    public  Properties getPropertyInstance() throws IOException {

        if (properties==null) {
            File file = new File("src\\test\\resources\\Properties.properties");
            FileInputStream fileInputStream = new FileInputStream(file);
            properties = new Properties();
            properties.load(fileInputStream);

        }
        return properties;

    }
    public String getPropertyValues(String propertyKey) throws IOException {

            return getPropertyInstance().getProperty(propertyKey);

    }
    public void clickMethod(By element)
    {
        driver.findElement(element).click();

    }
    public void sendKeyMethod(By element,String sendKeysValue){
        driver.findElement(element).sendKeys(sendKeysValue);
    }
    public void sendKeyMethod(WebElement element , String sendKeysValue){
        element.sendKeys(sendKeysValue);
    }
    public String getText(By element){
        String textReturned= driver.findElement(element).getText();
        return textReturned;
    }
    public void getAPIMethod(){
        String getEndPointUrl="http://localhost:8081/rest/api/2/issue/SCRUM-25";

    }
}
