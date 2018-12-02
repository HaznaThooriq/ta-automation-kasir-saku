
package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.api.GlobalSettingsController;
import com.yakindeveloper.kasirsaku.automationkasirsaku.api.LaporanController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;

public class ApiGlobalSettingsSteps extends ScenarioSteps {
    GlobalSettingsController globalSettingsController = new GlobalSettingsController();

    @Given("^user test API Index Global Settings$")
    public void userTestAPIIndexGlobalSettings() {
        globalSettingsController.indexGlobalSettings();
    }

    @Then("^user can see the result of get Index Global Settings$")
    public void userCanSeeTheResultOfGetIndexGlobalSettings() {

    }

    @Given("^user test API App Android Version Global Settings$")
    public void userTestAPIAppAndroidVersionGlobalSettings() {
        globalSettingsController.appAndroidVersionGlobalSettings();
    }

    @Then("^user can see the result of get App Android Global Settings$")
    public void userCanSeeTheResultOfGetAppAndroidGlobalSettings() {
    }
}

