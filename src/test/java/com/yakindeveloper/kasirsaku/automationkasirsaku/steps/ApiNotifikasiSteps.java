
package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.api.LaporanController;
import com.yakindeveloper.kasirsaku.automationkasirsaku.api.NotifikasiController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;

public class ApiNotifikasiSteps extends ScenarioSteps {
    NotifikasiController notifikasiController = new NotifikasiController();

    @Then("^user can see get the result of get Index Notifikasi$")
    public void userCanSeeGetTheResultOfGetIndexNotifikasi() {
        notifikasiController.indexNotifikasi();
    }

    @Given("^user test API Index Notifikasi$")
    public void userTestAPIIndexNotifikasi() {
    }
}

