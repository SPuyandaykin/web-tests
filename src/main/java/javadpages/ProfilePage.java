package javadpages;

import javaddata.UserData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends Page {

    @FindBy(linkText = "Sign in")
    public WebElement linkSingIn;

    @FindBy(name="Login")
    public WebElement fieldUsername;

    @FindBy(name = "Password")
    public WebElement fieldPassword;

    @FindBy(css="input[type='Password']+button[class='button']")
    public WebElement buttonLogin;

    public ProfilePage(WebDriver driver){
        super(driver);
    }

    public void loginAs (UserData admin){
//        linkSingIn.clear();
        type(fieldUsername, admin.name);
        type(fieldPassword, admin.password);
        buttonLogin.click();
//        return PageFactory.initElements(driver, MainPage.class);
    }

    @Override
    public void open(){
    }
}
