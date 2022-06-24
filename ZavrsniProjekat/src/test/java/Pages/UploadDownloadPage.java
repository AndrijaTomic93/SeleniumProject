package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadDownloadPage
{
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement downloadButton;
    WebElement uploadButton;
    WebElement uploadMessage;

    public UploadDownloadPage(WebDriver driver, WebDriverWait wdwait)
    {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getDownloadButton()
    {
        return driver.findElement(By.id("downloadButton"));
    }

    public WebElement getUploadButton()
    {
        return driver.findElement(By.id("uploadFile"));
    }

    public WebElement getUploadMessage()
    {
        return driver.findElement(By.id("uploadedFilePath"));
    }

    //------------------------

    public void clickOnDownloadButton()
    {
        getDownloadButton().click();
    }

    public void clickOnUploadButton()
    {
        getUploadButton().sendKeys("C:\\Users\\Uros\\Downloads\\sampleFile.jpeg");
    }
}
