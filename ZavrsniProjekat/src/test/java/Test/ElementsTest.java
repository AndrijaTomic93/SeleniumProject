package Test;

import Base.BaseTest;
import Pages.SidebarPage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;

public class ElementsTest extends BaseTest
{
    @BeforeMethod
    public void pageSetUp()
    {
        driver.manage().window().maximize();
        driver.navigate().to(homepageURl);
    }

    @Test (priority = 10)
    public void testTextBox() throws InterruptedException {
        homepagePage.clickOnElements();
        sidebarPage.clickOnTextBox();
        textBoxPage.clickOnCurrentAddress();
        /*Actions action = new Actions(driver);
        Thread.sleep(2000);
        action.moveToElement(textBoxPage.getCurrentAddressBox(), 665, 130); //moves to bottom right corner
        action.clickAndHold();
        action.moveByOffset(0, 50);
        action.release();
        action.perform();*/



    }

    @Test (priority = 20)
    public void testRadioButton() throws InterruptedException {
        homepagePage.clickOnElements();
        sidebarPage.clickOnRadioButton();
        radioButtonPage.clickOnYesButton();
        Thread.sleep(1000);
        Assert.assertTrue(radioButtonPage.getYesRadioButton().isSelected());
        Assert.assertEquals(radioButtonPage.getYesRadioButtonMessage().getText(), excelReader.getStringData("Stringovi", 1, 0));
        Thread.sleep(1000);
        radioButtonPage.clickOnImpressiveButton();
        Thread.sleep(1000);
        Assert.assertTrue(radioButtonPage.getImpressiveRadioButton().isSelected());
        Assert.assertEquals(radioButtonPage.getImpressiveRadioButtonMessage().getText(), excelReader.getStringData("Stringovi", 2, 0));
        Thread.sleep(1000);
        radioButtonPage.clickOnNoButton();
        Thread.sleep(1000);
        Assert.assertTrue(radioButtonPage.getNoRadioButton().isSelected());
        Assert.assertEquals(radioButtonPage.getNoRadioButtonMessage().getText(), excelReader.getStringData("Stringovi", 3, 0));
    }

    @Test (priority = 30)
    public void testButtons() throws InterruptedException
    {
        homepagePage.clickOnElements();
        sidebarPage.clickOnButtons();
        buttonsPage.clickOnDoubleClick();
        Assert.assertEquals(buttonsPage.getDoubleClickButtonMessage().getText(), excelReader.getStringData("Stringovi", 1, 1));
        Thread.sleep(1000);
        buttonsPage.clickOnRigthClick();
        Assert.assertEquals(buttonsPage.getRightClickButtonMessage().getText(), excelReader.getStringData("Stringovi", 2, 1));
        Thread.sleep(1000);
        buttonsPage.clickOnclickMeButton();
        Assert.assertEquals(buttonsPage.getClickMeButtonMessage().getText(), excelReader.getStringData("Stringovi", 3, 1));
    }

    @Test (priority = 40)
    public void testUploadDownload() throws InterruptedException
    {
        homepagePage.clickOnElements();
        sidebarPage.clickOnUploadAndDownload();
        uploadDownloadPage.clickOnDownloadButton();
        driver.navigate().to(excelReader.getStringData("URLs", 1, 1));
        Thread.sleep(1000);
        File f = new File("C:\\Users\\Uros\\Downloads\\sampleFile.jpeg");
        Assert.assertTrue(f.exists());
        Thread.sleep(1000);
        driver.navigate().back();
        uploadDownloadPage.clickOnUploadButton();
        Assert.assertEquals(uploadDownloadPage.getUploadMessage().getText(), excelReader.getStringData("Stringovi", 1, 2));
        Assert.assertTrue(uploadDownloadPage.getUploadMessage().isDisplayed());
        f.delete();
        Assert.assertFalse(f.exists());
    }

    @Test (priority = 50)
    public void testLinks() throws InterruptedException
    {
        homepagePage.clickOnElements();
        sidebarPage.clickOnLinks();
        visibilityWait(linksPage.getLink1());
        linksPage.clickOnLink1();
        linksPage.clickOnLink2();
        ArrayList<String> tabList = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), homepageURl);
        driver.close();
        Thread.sleep(1000);
        driver.switchTo().window(tabList.get(2));
        Assert.assertEquals(driver.getCurrentUrl(), homepageURl);
        driver.close();
        driver.switchTo().window(tabList.get(0));
        visibilityWait(linksPage.getApiCreated());
        linksPage.clickOnApiCreated();
        Thread.sleep(1000);
        Assert.assertEquals(linksPage.getApiMessage().getText(), excelReader.getStringData("Stringovi", 1, 3));
        linksPage.clickOnApiNoContent();
        Thread.sleep(1000);
        Assert.assertEquals(linksPage.getApiMessage().getText(), excelReader.getStringData("Stringovi", 2, 3));
        linksPage.clickOnApiMoved();
        Thread.sleep(1000);
        Assert.assertEquals(linksPage.getApiMessage().getText(), excelReader.getStringData("Stringovi", 3, 3));
        linksPage.clickOnApiBadRequest();
        Thread.sleep(1000);
        Assert.assertEquals(linksPage.getApiMessage().getText(), excelReader.getStringData("Stringovi", 4, 3));
        linksPage.clickOnApiApiUnauthorized();
        Thread.sleep(1000);
        Assert.assertEquals(linksPage.getApiMessage().getText(), excelReader.getStringData("Stringovi", 5, 3));
        linksPage.clickOnApiForbidden();
        Thread.sleep(1000);
        Assert.assertEquals(linksPage.getApiMessage().getText(), excelReader.getStringData("Stringovi", 6, 3));
        linksPage.clickOnApiNotFound();
        Thread.sleep(1000);
        Assert.assertEquals(linksPage.getApiMessage().getText(), excelReader.getStringData("Stringovi", 7, 3));
    }

    @Test (priority = 60)
    public void testBrokenLinks() throws InterruptedException
    {
        homepagePage.clickOnElements();
        sidebarPage.clickOnBrokenLinks();
        Assert.assertTrue(brokenLinksPage.getValidImage().isDisplayed());
        brokenLinksPage.clickOnValidLink();
        Assert.assertEquals(driver.getCurrentUrl(), homepageURl);
        Thread.sleep(1000);
        driver.navigate().back();
        brokenLinksPage.clickOnBrokenLink();
        Assert.assertEquals(driver.getCurrentUrl(), excelReader.getStringData("URLs", 1, 2));
    }

    @Test (priority = 70)
    public void testDynamicProperties() throws InterruptedException
    {
        homepagePage.clickOnElements();
        sidebarPage.clickOnDynamicProperties();
        visibilityWait(dynamicPropertiesPage.getColorChange());
        String boja = dynamicPropertiesPage.getColorChange().getCssValue("color");
        String prvaBoja  = Color.fromString(boja).asRgba();
        Assert.assertTrue(dynamicPropertiesPage.isClickable(dynamicPropertiesPage.getEnableButton()));
        visibilityWait(dynamicPropertiesPage.getVisibleAfter());
        Assert.assertTrue(dynamicPropertiesPage.getVisibleAfter().isDisplayed());
        boja = dynamicPropertiesPage.getColorChange().getCssValue("color");
        String drugaBoja = Color.fromString(boja).asRgba();
        Assert.assertTrue(dynamicPropertiesPage.isDifferentColor(prvaBoja, drugaBoja));
    }


}
