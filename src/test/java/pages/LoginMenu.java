package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginMenu extends BasePage{

    public LoginMenu(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(), 'Login')]")
    private WebElement loginAccsess;

    @FindBy(css = "input[name=\"username\"]")
    private WebElement usernameElement;

    @FindBy(css = "input[name=\"password\"]")
    private WebElement passwordElement;

    @FindBy(css = "input[value=\"Test Login\"]")
    private WebElement TestLoginButton;

    @FindBy(xpath = "//b[contains(text(), '**Successful Login**')]")
    private WebElement succsessText;

    public void enterLoginPage(){
        clickOnElement(loginAccsess);
    }
    public void enterUsername(String username) {
        sendKeysToElement(usernameElement, username);
    }

    public void enterPassword(String password){
        sendKeysToElement(passwordElement, password);
    }

    public void clickOnLoginButton(){
        clickOnElement(TestLoginButton);
    }

    public String getTextOfLoginSuccsess(){
        return getTextOfElement(succsessText);
    }
    public String getAlertMessage(){
        return getTextOfAlert();
    }
}
/*

 */