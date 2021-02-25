package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddUserMenu extends BasePage{
    private WebDriver driver;
    @FindBy(xpath = "//a[contains(text(), 'Add a User')]")
    private WebElement addUserButton;

    @FindBy(css="input[name=\"username\"]")
    private WebElement usernameElement;

    @FindBy(css="input[name=\"password\"]")
    private WebElement passwordE;

    @FindBy(css="input[name=\"FormsButton2\"]")
    private WebElement saveButton;

    @FindBy(xpath = "//blockquote/blockquote/blockquote")
    private WebElement existanceOfUsername;

    public AddUserMenu() {

        PageFactory.initElements(driver, this);
    }

    public void enterAddName() {
        clickOnElement(addUserButton);
    }

    public void fillInUserName(String username) {
        sendKeysToElement(usernameElement, username);
    }

    public void fillInUserPassword(String password){
        sendKeysToElement(passwordE, password);
    }

    public void save(){
        clickOnElement(saveButton);
    }



    public void clickOkOnAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void successAdding(){
        getTextOfElement(existanceOfUsername);
    }
    public void errorMessage(){
        getTextOfAlert();
    }
}
/*
public class LoginPOM extends BasePom {
    private WebDriver driver;

    @FindBy(css="input[formcontrolname='username']")
    private WebElement username;

    @FindBy(css="input[formcontrolname='password']")
    private WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(css="svg[data-icon=\"bars\"]")
    private WebElement menu;

    @FindBy(css="div[role='alertdialog']")
    private WebElement alert;

    @FindBy(xpath="//mat-error[contains(text(), 'Email is required')]")
    private WebElement emailErrorMessage;

    @FindBy(xpath="//mat-error[contains(text(), 'Password is required')]")
    private WebElement passwordErrorMessage;

    public LoginPOM(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
        PageFactory.initElements(driver, this);
    }

    public void fillInUserName(String username) {
        this.username.clear();
        this.username.sendKeys(username);
    }

    public void fillInUserPassword(String password){
        this.password.clear();
        this.password.sendKeys(password);
    }

    public void login(){
        loginButton.click();
    }

    public void waitForMenu() {
        wait.until(ExpectedConditions.visibilityOf(menu));
    }

    public void waitForErrorMessage(String message) {
        wait.until(ExpectedConditions.textToBePresentInElement(alert, message));
    }

    public void waitForEmailError() {
        wait.until(ExpectedConditions.visibilityOf(emailErrorMessage));
    }

    public void waitForPasswordError() {
        wait.until(ExpectedConditions.visibilityOf(passwordErrorMessage));
    }


}
 */