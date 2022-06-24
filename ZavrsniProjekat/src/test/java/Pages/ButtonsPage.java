package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ButtonsPage
{
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement doubleClickButton;
    WebElement doubleClickButtonMessage;
    WebElement rightClickButton;
    WebElement rightClickButtonMessage;
    WebElement clickMeButton;
    WebElement clickMeButtonMessage;
    Actions act;

    public ButtonsPage(WebDriver driver, WebDriverWait wdwait)
    {
        this.driver = driver;
        this.wdwait = wdwait;
        this.act = new Actions(driver);
    }

    public WebElement getDoubleClickButton() {
        return driver.findElement(By.id("doubleClickBtn"));
    }

    public WebElement getRightClickButton() {
        return driver.findElement(By.id("rightClickBtn"));
    }

    public List<WebElement> getClickMeButton()
    {
        return driver.findElements(By.cssSelector(".btn.btn-primary"));
    }

    public WebElement getDoubleClickButtonMessage()
    {
        return driver.findElement(By.id("doubleClickMessage"));
    }

    public WebElement getRightClickButtonMessage()
    {
        return driver.findElement(By.id("rightClickMessage"));
    }

    public WebElement getClickMeButtonMessage()
    {
        return driver.findElement(By.id("dynamicClickMessage"));
    }

    //------------------------

    public void clickOnDoubleClick()
    {
        act.doubleClick(getDoubleClickButton()).perform();
    }

    public void clickOnRigthClick()
    {
        act.contextClick(getRightClickButton()).perform();
    }

    public void clickOnclickMeButton()
    {
        for (int i = 0; i<getClickMeButton().size(); i++)
        {
            //scrollIntoView(getClickMeButton().get(i));
            if (getClickMeButton().get(i).getText().equals("Click Me"))
            {
                getClickMeButton().get(i).click();
                break;
            }
        }
    }
}
