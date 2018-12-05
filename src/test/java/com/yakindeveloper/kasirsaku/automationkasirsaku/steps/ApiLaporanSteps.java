
package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.api.LaporanController;
import com.yakindeveloper.kasirsaku.automationkasirsaku.api.LoginController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;

public class ApiLaporanSteps extends ScenarioSteps {
    LaporanController laporanController = new LaporanController();

    @Given("^user test API laporan$")
    public void userTestAPILaporan() {
        laporanController.laporanHappyFlow();
    }

    @Then("^user can see get the result of get laporan berhasil$")
    public void userCanSeeGetTheResultOfGetLaporanBerhasil() {
    }

    @Given("^user test API laporan with Invalid Auth$")
    public void userTestAPILaporanWithInvalidAuth() {
        laporanController.laporanErrorFlow();
    }

    @Then("^user can see get the result of get laporan gagal$")
    public void userCanSeeGetTheResultOfGetLaporanGagal() {
    }
}

