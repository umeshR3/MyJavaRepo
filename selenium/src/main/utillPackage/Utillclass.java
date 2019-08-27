package utillPackage;

import org.openqa.selenium.WebDriver;

public class Utillclass {
    WebDriver driver;

    public Utillclass(WebDriver driver)
    {
        this.driver=driver;
    }

    public String getTitle()
    {
       String titel= driver.getTitle();

        return titel;
    }
}
