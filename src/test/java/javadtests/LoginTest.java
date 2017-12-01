package javadtests;

import javadpages.MainPage;
import javadpages.MenuTop;
import javadpages.ProfilePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BasicTestCase {

//    private ProfilePage profilePage = PageFactory.initElements(getWebDriver(), ProfilePage.class);
    private MenuTop menuTop = PageFactory.initElements(getWebDriver(), MenuTop.class);
    private ProfilePage profilePage;

    @Test
    public void testLogin () {
        menuTop.open();
        profilePage = menuTop.openProfile();
        profilePage.loginAs(admin);
        Assert.assertTrue(PageTitle("JAVAD GNSS :: Home Page"));
        profilePage = menuTop.openProfile();
        profilePage.logOut();
        Assert.assertTrue(PageTitle("JAVAD GNSS"));
    }
}

