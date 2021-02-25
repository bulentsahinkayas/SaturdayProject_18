package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

// This class is built as "singleton" pattern.

public class BasePage{
    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    protected void clickOnElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected void sendKeysToElement(WebElement element, String key) {
        wait.until(ExpectedConditions.visibilityOf(element)).clear();
        element.sendKeys(key);
    }

    protected String getTextOfElement(WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }
    protected String getTextOfAlert(){
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }
}
