package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage
{
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement fullNameBox;
    WebElement emailBox;
    WebElement currentAddressBox;
    WebElement permanentAddressBox;

    public TextBoxPage(WebDriver driver, WebDriverWait wdwait)
    {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFullNameBox() {
        return fullNameBox;
    }

    public WebElement getEmailBox() {
        return emailBox;
    }

    public WebElement getCurrentAddressBox()
    {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddressBox() {
        return permanentAddressBox;
    }

    //------------------------

    public void clickOnCurrentAddress()
    {
        getCurrentAddressBox().click();
    }


}
