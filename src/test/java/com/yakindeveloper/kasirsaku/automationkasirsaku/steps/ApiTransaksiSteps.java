
package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.api.TransaksiController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;

public class ApiTransaksiSteps extends ScenarioSteps {
    TransaksiController transaksiController = new TransaksiController();

    @Then("^user can see the massage Transaksi Bayar berhasil$")
    public void userCanSeeTheMassageTransaksiBayarBerhasil() throws Throwable {
    }

    @Given("^user test API Transaksi Bayar$")
    public void userTestAPITransaksiBayar() throws Throwable {
        transaksiController.transaksiBayar();
    }

    @Then("^user can see the massage of Index Transaksi berhasil$")
    public void userCanSeeTheMassageOfIndexTransaksiBerhasil() throws Throwable {
        transaksiController.indexTransaksi();
    }

    @Given("^user test API Index Transaksi$")
    public void userTestAPIIndexTransaksi() throws Throwable {
    }

    @Given("^user test API View Transaksi$")
    public void userTestAPIViewTransaksi() throws Throwable {
        transaksiController.viewTransaksi();
    }

    @Then("^user can see the massage of View Transaksi berhasil$")
    public void userCanSeeTheMassageOfViewTransaksiBerhasil() throws Throwable {
    }

    @Given("^user test API Search Transaksi$")
    public void userTestAPISearchTransaksi() throws Throwable {
        transaksiController.searchTransaksi();
    }

    @Then("^user can see the massage of Search Transaksi berhasil$")
    public void userCanSeeTheMassageOfSearchTransaksiBerhasil() throws Throwable {
    }

    @Given("^user test API Transaksi Bayar Invalid Id Pelanggan$")
    public void userTestAPITransaksiBayarInvalidIdPelanggan() {
        transaksiController.transaksiBayarInvalidIdPelanggan();
    }

    @Then("^user can see the massage Transaksi Bayar gagal$")
    public void userCanSeeTheMassageTransaksiBayarGagal() {

    }

    @Given("^user test API Index Transaksi with Errror Authentication$")
    public void userTestAPIIndexTransaksiWithErrrorAuthentication() {
        transaksiController.indexTransaksiErrorAuth();
    }

    @Then("^user can see the massage of Index Transaksi gagal$")
    public void userCanSeeTheMassageOfIndexTransaksiGagal() {

    }

    @Given("^user test API View Transaksi with Invalid Id Transaksi$")
    public void userTestAPIViewTransaksiWithInvalidIdTransaksi() {
        transaksiController.viewTransaksiInvalidId();
    }

    @Then("^user can see the massage of View Transaksi gagal$")
    public void userCanSeeTheMassageOfViewTransaksiGagal() {

    }

    @Given("^user test API Search Transaksi with Invalid Id$")
    public void userTestAPISearchTransaksiWithInvalidId() {
        transaksiController.viewTransaksiInvalidId();
    }

    @Then("^user can see the massage of Search Transaksi gagal$")
    public void userCanSeeTheMassageOfSearchTransaksiGagal() {
    }
}

