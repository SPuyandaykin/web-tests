package javadtests;

import javaddata.UserData;
import javadutils.ConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

public class BasicTestCase {

    protected static WebDriver driver;

    public UserData admin = new UserData("FTesterBerg", "test123");

    protected WebDriver getWebDriver(){
        if(driver == null){
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Long.parseLong(ConfigProperties.getProperty("imp.wait")), TimeUnit.SECONDS);
        }
        return driver;
    }
    @AfterTest
    public  void tearDown () throws Exception {
 //       driver.quit();
    }
}
