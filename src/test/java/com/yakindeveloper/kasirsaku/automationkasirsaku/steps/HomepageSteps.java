package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.yakindeveloper.kasirsaku.automationkasirsaku.pages.HomePage;
import net.thucydides.core.steps.ScenarioSteps;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;

public class HomepageSteps extends ScenarioSteps {
    @Autowired
    HomePage homePage;

    @When("^user click button dashboard$")
    public void userClickButtonDashboard() throws Throwable {

    }

    @When("^user click Go To Dashboard menu$")
    public void userClickGoToDashboardMenu() throws Throwable {
        homePage.clickBtnLogin();
    }

    @When("^user click Login Button$")
    public void userClickLoginButton() throws Throwable {
        homePage.clickBtnLogin();
    }

    @When("^user click navbar user area$")
    public void userClickNavbarUserArea() throws Throwable {
        homePage.clickBtnUserArea();
    }

    @Given("^user go to '(.*)'$")
    public void userGoToUrl(String url) throws Throwable {
        homePage.goToUrl(url);
    }

    @Then("^user in dashboard menu$")
    public void userInDashboardMenu() throws Throwable {
        throw new PendingException();
    }

    @Then("^user in kasirsaku homepage$")
    public void userInKasirsakuHomepage() throws Throwable {
        homePage.logoIsAppear();
    }

    @Then("^user in side user area$")
    public void userInSideUserArea() throws Throwable {
        boolean found = false;
        for (int i = 0; i < homePage.getListContainer().size(); i++) {
            if (homePage.getListContainer().equals("User Area")) {
                found = true;
            }
        }
        assertThat("Failed to find user area", found);
    }

    @Then("^user login as kasir saku$")
    public void userAlreadyLoginAsKasirSaku() throws Throwable {
       homePage.userAlreadyLoginAsKasirSaku();
    }

    @When("^user type username as '(.*)' and password as '(.*)'$")
    public void userTypeToLogin(String username, String password) throws Throwable {
        homePage.login(username,password);
        homePage.clickLogin();
    }

    @Then("^toast invalid username and password appear$")
    public void userStillInLoginPage() throws Throwable {
        homePage.toastInvalidUsernamePassword();
    }
}