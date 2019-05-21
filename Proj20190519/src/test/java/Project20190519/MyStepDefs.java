package Project20190519;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    VerificationPage verificationPage = new VerificationPage();
    ClothingPage clothingPage = new ClothingPage();
    CurrencyChange currencyChange = new CurrencyChange();

    @Given("^user is on register page$")
    public void user_is_on_register_page()
    {
       homePage.verifyUserIsOnHomePage();


    }
    @When("^user enter all registration details$")
    public void userEnterAllRegistrationDetails()
    {
        registrationPage.userEnterAllDetailsForRegistration();

    }

    @Then("^user should able to register successfully$")
    public void userShouldAbleToRegisterSuccessfully()
    {
        verificationPage.registrationConfirmation();
    }

    @Given("^user is on homepage$")
    public void userIsOnHomepage()
    {
    homePage.verifyUserIsOnHomePage();
    }

    @When("^user click on item$")
    public void userClickOnItem()
    {
        clothingPage.userIsOnClothingPage();
    }

    @And("^click on change currency$")
    public void clickOnChangeCurrency()
    {
      currencyChange.userIsAbleToChangeCurrency();
    }

    @Then("^user should able to change currency$")
    public void userShouldAbleToChangeCurrency()
    {
        verificationPage.userCanSeeThatItemCurrencyAreChanged();
    }
}
