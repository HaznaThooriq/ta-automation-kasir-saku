
package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.api.ProfileController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;

public class ApiProfileSteps extends ScenarioSteps {
    ProfileController profileController  = new ProfileController();

    @Given("^user test API Profil with Authorization '(.*)'$")
    public void userTestAPIProfilWithAuthorization(String auth) throws Throwable {
        profileController.profilHappyFlow(auth);
    }

    @Then("^user can see the profile$")
    public void userCanSeeTheProfile() throws Throwable {
    }

    @Given("^user test API Profil with Error Authorization '(.*)'$")
    public void userTestAPIProfilWithErrorAuthorization(String auth) throws Throwable {
        profileController.profilErrorFlow(auth);
    }

    @Then("^user can't see the profile$")
    public void userCanTSeeTheProfile() throws Throwable {
    }
}

