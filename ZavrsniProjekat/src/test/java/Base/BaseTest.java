package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest
{
    public WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public String homepageURl;
    public HomepagePage homepagePage;
    public SidebarPage sidebarPage;
    public RadioButtonPage radioButtonPage;
    public ButtonsPage buttonsPage;
    public UploadDownloadPage uploadDownloadPage;
    public BrokenLinksPage brokenLinksPage;
    public LinksPage linksPage;
    public DynamicPropertiesPage dynamicPropertiesPage;
    public TextBoxPage textBoxPage;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        excelReader = new ExcelReader("G:\\Kurs\\Moj Folder\\ZavrsniProjekat\\TestData.xlsx");
        homepageURl = excelReader.getStringData("URLs", 1, 0);
        homepagePage = new HomepagePage(driver, wdwait);
        sidebarPage = new SidebarPage(driver, wdwait);
        textBoxPage = new TextBoxPage(driver, wdwait);
        radioButtonPage = new RadioButtonPage(driver, wdwait);
        buttonsPage = new ButtonsPage(driver, wdwait);
        uploadDownloadPage = new UploadDownloadPage(driver, wdwait);
        brokenLinksPage = new BrokenLinksPage(driver, wdwait);
        linksPage = new LinksPage(driver, wdwait);
        dynamicPropertiesPage = new DynamicPropertiesPage(driver, wdwait);
    }

    public void visibilityWait(WebElement element)
    {
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickabilityWait(WebElement element) {
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @AfterClass
    public void tearDown()
    {
        //driver.close();
        //driver.quit();
    }
}
