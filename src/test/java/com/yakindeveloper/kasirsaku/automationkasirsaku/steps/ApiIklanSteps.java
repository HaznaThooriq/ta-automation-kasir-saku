
package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.api.IklanController;
import com.yakindeveloper.kasirsaku.automationkasirsaku.api.LaporanController;
import com.yakindeveloper.kasirsaku.automationkasirsaku.api.TransaksiController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;

public class ApiIklanSteps extends ScenarioSteps {
    IklanController iklanController = new IklanController();

    @Given("^user test API Index Iklan$")
    public void userTestAPIIndexIklan() {
        iklanController.indexIklanHappyFlow();
    }

    @Then("^user can see get the result of get Index iklan berhasil$")
    public void userCanSeeGetTheResultOfGetIndexIklanBerhasil() {

    }

    @Given("^user test API View Iklan$")
    public void userTestAPIViewIklan() {
        iklanController.viewIklanHappyFlow();
    }

    @Then("^user can see get the result of get View iklan berhasil$")
    public void userCanSeeGetTheResultOfGetViewIklanBerhasil() {
    }

    @Given("^user test API Index Iklan Invalid Auth$")
    public void userTestAPIIndexIklanInvalidAuth() {
        iklanController.indexIklanInvalidAuth();
    }

    @Then("^user can see get the result of get Index iklan gagal$")
    public void userCanSeeGetTheResultOfGetIndexIklanGagal() {

    }

    @Given("^user test API View Iklan Invalid Id$")
    public void userTestAPIViewIklanInvalidId() {
        iklanController.viewIklanInvalidId();
    }

    @Then("^user can see get the result of get View iklan gagal$")
    public void userCanSeeGetTheResultOfGetViewIklanGagal() {
    }
}

