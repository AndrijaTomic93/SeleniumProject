package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RadioButtonPage
{
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement yesRadioButton;
    WebElement yesRadioButtonMessage;
    WebElement impressiveRadioButton;
    WebElement impressiveRadioButtonMessage;
    WebElement noRadioButton;
    WebElement noRadioButtonMessage;

    public RadioButtonPage(WebDriver driver, WebDriverWait wdwait)
    {
        this.driver = driver;
        this.wdwait = wdwait;
    }
    public WebElement getYesRadioButton()
    {
        return driver.findElement(By.id("yesRadio"));
    }
    public WebElement getImpressiveRadioButton()
    {
        return driver.findElement(By.id("impressiveRadio"));
    }
    public WebElement getNoRadioButton()
    {
        return driver.findElement(By.id("noRadio"));
    }

    public WebElement getYesRadioButtonMessage() {
        return driver.findElement(By.className("text-success"));
    }

    public WebElement getImpressiveRadioButtonMessage() {
        return driver.findElement(By.className("text-success"));
    }

    public WebElement getNoRadioButtonMessage() {
        return driver.findElement(By.className("text-success"));
    }

    public List<WebElement> getRadioButtonElements()
    {
        return driver.findElements(By.className("custom-control-label"));
    }

    //------------------------

    public void clickOnYesButton()
    {
        for (int i = 0; i<getRadioButtonElements().size(); i++)
        {
            //scrollIntoView(getSidebarElements().get(i));
            if (getRadioButtonElements().get(i).getAttribute("for").equals("yesRadio"))
            {
                getRadioButtonElements().get(i).click();
                break;
            }
        }
    }

    public void clickOnImpressiveButton()
    {
        for (int i = 0; i<getRadioButtonElements().size(); i++)
        {
            //scrollIntoView(getSidebarElements().get(i));
            if (getRadioButtonElements().get(i).getAttribute("for").equals("impressiveRadio"))
            {
                getRadioButtonElements().get(i).click();
                break;
            }
        }
    }

    public void clickOnNoButton()
    {
        for (int i = 0; i<getRadioButtonElements().size(); i++)
        {
            //scrollIntoView(getSidebarElements().get(i));
            if (getRadioButtonElements().get(i).getAttribute("for").equals("noRadio"))
            {
                getRadioButtonElements().get(i).click();
                break;
            }
        }
    }
}
