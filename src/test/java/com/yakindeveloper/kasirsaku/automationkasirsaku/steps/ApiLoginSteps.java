
package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.api.LoginController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;

public class ApiLoginSteps extends ScenarioSteps {
    LoginController loginController = new LoginController();

    @Given("^user test API Login with username '(.*)' and password '(.*)'$")
    public void userTestAPILogin(String username, String password) throws Throwable {
        loginController.loginHappyFlow(username, password);
    }

    @Then("^user can see the massage login berhasil$")
    public void userCanSeeTheMassageLoginBerhasil() throws Throwable {
    }

    @Given("^user test API error Login with username '(.*)' and password '(.*)'$")
    public void userTestAPIErrorLogin(String username, String password) throws Throwable {
        loginController.loginErrorFlow(username, password);
    }

    @Then("^user can see the massage login gagal$")
    public void userCanSeeTheMassageLoginGagal() throws Throwable {
    }
}

