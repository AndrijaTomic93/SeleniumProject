package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomepagePage
{
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement elements;
    WebElement forms;
    WebElement alertsFrameWindows;
    WebElement widgets;
    WebElement interactions;
    WebElement bookStoreApplication;


    public HomepagePage(WebDriver driver, WebDriverWait wdwait)
    {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public List<WebElement> getElements()
    {
        return driver.findElements(By.className("card-body"));
    }

    //------------------------

    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickOnElements()
    {
        for (int i = 0; i<getElements().size(); i++)
        {
            scrollIntoView(getElements().get(i));
            if (getElements().get(i).getText().equals("Elements")){
                getElements().get(i).click();
            }
        }
    }

    public void clickOnForms()
    {
        for (int i = 0; i<getElements().size(); i++)
        {
            scrollIntoView(getElements().get(i));
            if (getElements().get(i).getText().equals("Forms")){
                getElements().get(i).click();
            }
        }
    }

    public void clickOnAlertsFrameWindows()
    {
        for (int i = 0; i<getElements().size(); i++)
        {
            scrollIntoView(getElements().get(i));
            if (getElements().get(i).getText().equals("Alerts, Frame & Windows")){
                getElements().get(i).click();
            }
        }
    }

    public void clickOnWidgets()
    {
        for (int i = 0; i<getElements().size(); i++)
        {
            scrollIntoView(getElements().get(i));
            if (getElements().get(i).getText().equals("Widgets")){
                getElements().get(i).click();
            }
        }
    }

    public void clickOnInteractions()
    {
        for (int i = 0; i<getElements().size(); i++)
        {
            scrollIntoView(getElements().get(i));
            if (getElements().get(i).getText().equals("Interactions")){
                getElements().get(i).click();
            }
        }
    }

    public void clickOnBookstoreApplication()
    {
        for (int i = 0; i<getElements().size(); i++)
        {
            scrollIntoView(getElements().get(i));
            if (getElements().get(i).getText().equals("Book Store Application")){
                getElements().get(i).click();
            }
        }
    }
}
