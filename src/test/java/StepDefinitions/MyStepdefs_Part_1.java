package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AddUserMenu;
import pages.BasePage;
import pages.LoginMenu;
import utilities.Driver;
public class MyStepdefs_Part_1 {
    WebDriver driver = Driver.getDriver();
    AddUserMenu addUserMenu = new AddUserMenu();
    LoginMenu loginMenu = new LoginMenu();
     @Given("I navigate to the website")
    public void iNavigateToWebsite() {
        driver.get("http://thedemosite.co.uk/");
        driver.manage().window().maximize();
    }

    @Given("I enter Add a User page")

    public void iEnterAddAUserPage() {

         addUserMenu.enterAddName();
    }

    @And("I enter username  {string}")
    public void iEnterUsername(String userN) {
        addUserMenu.fillInUserName(userN);

    }

    @And("I enter password  {string}")
    public void iEnterPassword(String password) {
        addUserMenu.fillInUserPassword(password);
    }

    @When("I click save button")
    public void iClickSaveButton() {
        addUserMenu.save();
    }

    @Then("I validate error {string}")
    public void iValidateError(String message) {
         addUserMenu.errorMessage();

    }

    @Then("I validate success message")
    public void iValidateSuccessMessage() {
         addUserMenu.successAdding();
    }

    @Given("I enter Login page")
    public void iEnterLoginPage() {
         loginMenu.enterLoginPage();
    }

    @When("I click Test Login button")
    public void iClickTestLoginButton() {
         loginMenu.clickOnLoginButton();
     }

    @Then("I validate error message {string}")
    public void iValidateErrorMessage(String message) {
         loginMenu.getAlertMessage();
    }


//    @Given("I enter Add a User page")
//    public void iEnterAddAUserPage() {
//       addUserMenu.enterAddName();
//    }
//
//    @When("I enter invalid {string} and any {string}")
//    public void iEnterInvalidAndAny(String username, String password) {
//
//    }
//    @And("I click save button")
//    public void iClickSaveButton() {
//
//    }
//    @Then("I see error message {string}")
//    public void iSeeErrorMessage(String message) {
//         message = addUserMenu.getErrorMessage();
//    }
//
//
//    @And("I click  on the ‘OK’ button of the alert box")
//    public void iClickOnTheOKButtonOfTheAlertBox() {
//         addUserMenu.clickOkOnAlert();
//    }
//
//    @And("I enter valid {string} but invalid {string}")
//    public void iEnterValidButInvalid(String userN, String passW) {
//         addUserMenu.fillInUserName(userN);
//         addUserMenu.fillInUserPassword(passW);
//    }
}


