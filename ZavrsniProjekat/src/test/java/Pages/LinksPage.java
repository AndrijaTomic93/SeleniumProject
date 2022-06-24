package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksPage
{
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement link1;
    WebElement link2;
    WebElement apiCreated;
    WebElement apiNoContent;
    WebElement apiMoved;
    WebElement apiBadRequest;
    WebElement apiUnauthorized;
    WebElement apiForbidden;
    WebElement apiNotFound;
    WebElement apiNotification;
    WebElement apiMessage;

    public LinksPage(WebDriver driver, WebDriverWait wdwait)
    {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getLink1() {
        return driver.findElement(By.id("simpleLink"));
    }

    public WebElement getLink2() {
        return driver.findElement(By.id("dynamicLink"));
    }

    public WebElement getApiCreated() {
        return driver.findElement(By.id("created"));
    }

    public WebElement getApiNoContent() {
        return driver.findElement(By.id("no-content"));
    }

    public WebElement getApiMoved() {
        return driver.findElement(By.id("moved"));
    }

    public WebElement getApiBadRequest() {
        return driver.findElement(By.id("bad-request"));
    }

    public WebElement getApiUnauthorized() {
        return driver.findElement(By.id("unauthorized"));
    }

    public WebElement getApiForbidden() {
        return driver.findElement(By.id("forbidden"));
    }

    public WebElement getApiNotFound() {
        return driver.findElement(By.id("invalid-url"));
    }
    public WebElement getApiMessage()
    {
        return driver.findElement(By.id("linkResponse"));
    }
    //------------------------

    public void clickOnLink1()
    {
        getLink1().click();
    }
    public void clickOnLink2()
    {
        getLink2().click();
    }
    public void clickOnApiCreated()
    {
        getApiCreated().click();
    }
    public void clickOnApiNoContent()
    {
        getApiNoContent().click();
    }
    public void clickOnApiMoved()
    {
        getApiMoved().click();
    }
    public void clickOnApiBadRequest()
    {
        getApiBadRequest().click();
    }
    public void clickOnApiApiUnauthorized()
    {
        getApiUnauthorized().click();
    }
    public void clickOnApiForbidden()
    {
        getApiForbidden().click();
    }
    public void clickOnApiNotFound()
    {
        getApiNotFound().click();
    }
}
