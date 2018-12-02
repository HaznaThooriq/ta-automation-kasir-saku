
package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.api.TopupPPOBController;
import com.yakindeveloper.kasirsaku.automationkasirsaku.api.TransaksiPPOBController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;

public class ApiTransaksiPPOBSteps extends ScenarioSteps {

    TransaksiPPOBController transaksiPPOBController = new TransaksiPPOBController();

    @Given("^user test API Create Transaksi PPOB$")
    public void userTestAPICreateTransaksiPPOB() {
        transaksiPPOBController.createTransaksiPPOB();
    }

    @Then("^user can see get the result of create Transaksi PPOB$")
    public void userCanSeeGetTheResultOfCreateTransaksiPPOB() {

    }

    @Given("^user test API Index Transaksi PPOB$")
    public void userTestAPIIndexTransaksiPPOB() {
        transaksiPPOBController.indexTransaksiPPOB();
    }

    @Then("^user can see the result of Transaksi topup PPOB$")
    public void userCanSeeTheResultOfTransaksiTopupPPOB() {

    }

    @Given("^user test API view Transaksi PPOB$")
    public void userTestAPIViewTransaksiPPOB() {
        transaksiPPOBController.viewTopupPPOB();
    }
}

