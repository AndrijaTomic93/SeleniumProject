package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPropertiesPage
{
    WebDriver driver;
    static WebDriverWait wdwait;
    WebElement enableButton;
    WebElement colorChange;
    WebElement visibleAfter;
    public DynamicPropertiesPage(WebDriver driver, WebDriverWait wdwait)
    {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getEnableButton() {
        return driver.findElement(By.id("enableAfter"));
    }

    public WebElement getColorChange() {
        return driver.findElement(By.id("colorChange"));
    }

    public WebElement getVisibleAfter() {
        return driver.findElement(By.id("visibleAfter"));
    }


    //------------------------

    public static boolean isClickable(WebElement webe)
    {
        try
        {
            wdwait.until(ExpectedConditions.elementToBeClickable(webe));
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    public static boolean isDifferentColor(String boja, String boja2)
    {
        boolean prolaziTest = false;
        try
        {

            if(boja!=boja2)
            {
                prolaziTest =  true;
            }
        }
        catch (Exception e)
        {
            return false;
        }
        return prolaziTest;
    }
}
