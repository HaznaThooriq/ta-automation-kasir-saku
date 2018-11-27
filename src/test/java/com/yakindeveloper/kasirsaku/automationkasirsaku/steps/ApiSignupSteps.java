
package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.api.SignupController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;

public class ApiSignupSteps extends ScenarioSteps {
    SignupController signupController = new SignupController();


    @Then("^user can see the massage Registrasi berhasil$")
    public void userCanSeeTheMassageRegistrasiBerhasil() throws Throwable {

    }

    @Given("^user test API Signup with data nama '(.*)' and toko '(.*)' at '(.*)' username '(.*)' email '(.*)' phone '(.*)' password '(.*)'$")
    public void userTestAPISignup(String nama, String toko, String kota, String username, String email, String phone, String password) throws Throwable {
        signupController.SignupHappyFlow(nama, toko, kota, username, email, phone, password);
    }

    @Given("^user test API Signup error with data nama '(.*)' and toko '(.*)' at '(.*)' username '(.*)' email '(.*)' phone '(.*)' password '(.*)'$")
    public void userTestAPISignupError(String nama, String toko, String kota, String username, String email, String phone, String password) throws Throwable {
      signupController.SignupErrorFlow(nama, toko, kota, username, email, phone, password);
    }

    @Then("^user can see the massage Registrasi gagal$")
    public void userCanSeeTheMassageRegistrasiGagal() throws Throwable {
    }
}

