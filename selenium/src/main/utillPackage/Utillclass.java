package utillPackage;

import com.google.gson.Gson;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utillPackage.com.pojoClasses.Customer;
import utillPackage.com.pojoClasses.authenticationPojoClass;

import java.io.*;
import java.util.Properties;

public class Utillclass {
    WebDriver driver;
    Properties properties;
    Object obj;
    public Utillclass()
    {

    }

    public Utillclass(WebDriver driver)
    {
        this.driver=driver;
    }

    public String getTitle()
    {
       String titel= driver.getTitle();

        return titel;
    }
    public authenticationPojoClass jsonFile() throws IOException {
        Gson gson=new Gson();
        // System.out.println(utillclass.getFileHandler("test1").getAbsolutePath());
        //authenticationPojoClass auth=gson.fromJson(new FileReader(utillclass.getFileHandler("test1").getAbsolutePath()),authenticationPojoClass.class);
        authenticationPojoClass auth=gson.fromJson(new FileReader("D:\\01Automation\\MyJavaRepo\\selenium\\src\\test\\resources\\jsonFile"),authenticationPojoClass.class);
        // auth.getCustomer()[0].getName();
        Customer[] customer=auth.getCustomer();

        return auth;
    }
    public String excelInstance(int rownum,int cellnum) throws IOException {
        File file=new File("D:\\01Automation\\MyJavaRepo\\selenium\\src\\test\\resources\\TestData.xlsx");
        FileInputStream fileInputStream=new FileInputStream(file);
        Workbook wb=WorkbookFactory.create(fileInputStream);
        Sheet sheet=wb.getSheet("Sheet1");
        String value=sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
        return value;


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
    /*public void sendKeyMethod(WebElement element , String sendKeysValue){
         element.sendKeys(sendKeysValue);
    }*/
    public String getText(By element){
        String textReturned= driver.findElement(element).getText();
        return textReturned;
    }
    public String getAPIMethod(){
        String getEndPointUrl="http://localhost:8081/rest/api/2/issue/SCRUM-25";
        return getEndPointUrl;

    }

    public File getFileHandler(String fileName)
    {
        File file=new File("src\\test\\resources\\"+fileName);
        return file;
    }

}
