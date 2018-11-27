
package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.api.HutangController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;

public class ApiHutangSteps extends ScenarioSteps {
    HutangController hutangController = new HutangController();

    @Then("^user can see the massage Search Hutang berhasil$")
    public void userCanSeeTheMassageSearchHutangBerhasil() throws Throwable {
    }

    @Given("^user test API Search Hutang$")
    public void userTestAPISearchHutang() throws Throwable {
        hutangController.searchHutang();
    }

    @Given("^user test API Bayar Hutang$")
    public void userTestAPITransaksiHutang() throws Throwable {
       hutangController.hutangBayar();
    }

    @Then("^user can see the massage Transaksi hutang berhasil$")
    public void userCanSeeTheMassageTransaksiHutangBerhasil() throws Throwable {
    }

    @Then("^user can see the massage of Index hutang berhasil$")
    public void userCanSeeTheMassageOfIndexHutangBerhasil() throws Throwable {
    }

    @Given("^user test API View Hutang$")
    public void userTestAPIViewHutang() throws Throwable {
        hutangController.viewHutang();
    }

    @Then("^user can see the massage of View Hutang berhasil$")
    public void userCanSeeTheMassageOfViewHutangBerhasil() throws Throwable {
    }

    @Given("^user test API Hutang Pelanggan$")
    public void userTestAPIHutangPelanggan() throws Throwable {
        hutangController.hutangPelanggan();
    }

    @Then("^user can see the massage of Hutang Pelanggan berhasil$")
    public void userCanSeeTheMassageOfHutangPelangganBerhasil() throws Throwable {
    }

    @Given("^user test API Index hutang Transaksi$")
    public void userTestAPIIndexHutangTransaksi() throws Throwable {
        hutangController.indexHutang();
    }
}

