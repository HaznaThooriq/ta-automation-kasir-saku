package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;


import com.yakindeveloper.kasirsaku.automationkasirsaku.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.springframework.beans.factory.annotation.Autowired;

public class LaporanSteps extends ScenarioSteps {
    @Autowired
    HomePage homePage;

    @When("^user click Laporan Button$")
    public void userClickLaporanButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user click Daftar Pembelian Button$")
    public void userClickDaftarPembelianButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user can see Laporan of Data Penjualan$")
    public void userCanSeeLaporanOfDataPenjualan() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user click Laba Button$")
    public void userClickLabaButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user can see grafik of laba$")
    public void userCanSeeGrafikOfLaba() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user click Stock Barang Button$")
    public void userClickStockBarangButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user can see stok barang$")
    public void userCanSeeStokBarang() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^user click Barang Terjual Button$")
    public void userClickBarangTerjualButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user can see grafik of Barang Terjual$")
    public void userCanSeeGrafikOfBarangTerjual() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}