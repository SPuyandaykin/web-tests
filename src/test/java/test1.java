import com.google.common.base.Verify;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class test1 {
    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeMethod
    public void setUP (){
        driver = new ChromeDriver();
        driver.get("http://javad.com/");
        wait = new WebDriverWait(driver,10,500);
    }

    @AfterMethod
    public void tearDoun (){

//        driver.close();
    }

    @Test
    public void testOpenPages () throws InterruptedException {
        boolean bFlag = false;


    }

}
