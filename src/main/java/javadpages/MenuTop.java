package javadpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class MenuTop extends Page {
    public MenuTop(WebDriver driver){
        super(driver);
    }

    @Override
    public void open(){
        driver.get("http://javad.com/jgnss/");
    }

    void ExpandMainMenu(){
        Actions builder = new Actions(driver);
        WebElement elementToShowMenu;

        elementToShowMenu = driver.findElement(By.cssSelector("#RedPepper"));
        builder.moveToElement(elementToShowMenu).release(elementToShowMenu).build().perform();
    }

    private boolean OpenSubMenu(By iClassName){
        if(IsElementExists(iClassName)) {
            driver.findElement(iClassName).click();
            return true;
        }else{
            return false;
        }

    }

    public ProfilePage openProfile() {
        ExpandMainMenu();
        if(OpenSubMenu(By.cssSelector("a[href='/cgi-bin/jgnss/cgi?Action=Members']"))) //change to web element
            return PageFactory.initElements(driver, ProfilePage.class);
        else
            return null;
    }
}
