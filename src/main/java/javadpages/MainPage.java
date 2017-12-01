package javadpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Page{

    public MainPage(WebDriver driver){
        super(driver);
    }
    @FindBy(linkText="Sign out")
    public WebElement linkLogOut;

    @FindBy(xpath = "//a[@class='login']")
    public WebElement linkLogin;

    @Override
    public void open(){

    }

    public boolean isLoggedOut(){
        if(isElementPresent(linkLogin)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isLoggedIn(){
        return isElementPresent(linkLogOut);
    }

    public void logout(){
        linkLogOut.click();
    }
}
