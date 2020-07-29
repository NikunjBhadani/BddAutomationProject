package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDeft {
    //Crate Object Of Home Page
    HomePage homePage = new HomePage();
    //Crate Object Of RegisterPage
    RegisterPage registerPage = new RegisterPage();
    //Crate Object Of RegisterSuccessPage
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();

    //Given Key Word use for run user_is_on_homepage.
    @Given("^user is on homepage$")
    public void user_is_on_homepage()
    {
        homePage.verifyUserIsOnHomePage();//Call Method From HomePage
    }
    //Given Key Word use for run user_click_on_register_button.
    @When("^user click on register button$")
    public void user_click_on_register_button()
    {
        homePage.clickOnRegisterButton();//Call Method From HomePage
    }
    //Given Key Word use for run user_enter_all_registration_details.
    @When("^user enter all registration details$")
    public void user_enter_all_registration_details()
    {
        registerPage.verifyUserIsOnRegisterPage();//Call Method From RegisterPage
        registerPage.userEntersRegistrationDetails();//Call Method From RegisterPage
    }
    //Given Key Word use for run user_click_on_register_submit_button.
    @When("^user click on register-submit button$")
    public void user_click_on_register_submit_button()
    {
        registerPage.clickOnRegisterSubmitButton();//Call Method From RegisterPage
    }
    //Given Key Word use for run user_should_able_to_register_successfully.
    @Then("^user should able to register successfully$")
    public void user_should_able_to_register_successfully()
    {
        registerSuccessPage.verifyUserRegistrationSuccessfully();//Call Method From RegisterSuccessPage
    }
}
