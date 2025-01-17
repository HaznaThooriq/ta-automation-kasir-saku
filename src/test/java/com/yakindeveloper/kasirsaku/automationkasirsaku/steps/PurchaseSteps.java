package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.pages.PurchasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.springframework.beans.factory.annotation.Autowired;

public class PurchaseSteps extends ScenarioSteps {
    @Autowired
    PurchasePage purchasePage;

/*    @Steps
    HomepageSteps homepageSteps;*/

    @Then("^user can see popup pengembalian as '(.*)'$")
    public void userCanSeePopupPengembalianAs(String kembalian) throws Throwable {
        purchasePage.userCanSeePopupPengembalianAs(kembalian);
    }

    @And("^user click beli button$")
    public void userClickBeliButton() throws Throwable {
        purchasePage.clickBtnBeli();
    }

    @When("^user click button pembelian$")
    public void userClickButtonPembelian() throws Throwable {
        purchasePage.clickBtnPembelian();
        waitABit(1000L);
    }

    @And("^user click checkout button$")
    public void userClickCheckoutButton() throws Throwable {
        purchasePage.userClickCheckoutButton();
    }
/*

    @Given("^user go to dashboard of kasirsaku$")
    public void userGoToDashboardOfKasirsaku() throws Throwable {
       homepageSteps.userGoToUrl("http://kasirsaku.sahabatdeveloper.site/");
       homepageSteps.userInKasirsakuHomepage();
       homepageSteps.userClickNavbarUserArea();
       homepageSteps.userClickLoginButton();
       homepageSteps.userTypeToLogin("kasir_saku", "kasir_saku");
       homepageSteps.userClickNavbarUserArea();
       homepageSteps.userClickGoToDashboardMenu();
       homepageSteps.userAlreadyLoginAsKasirSaku();
    }
*/

    @And("^user input Jumlah Bayar As'(.*)'$")
    public void userInputJumlahBayarAs(String JumlahBayar) throws Throwable {
        purchasePage.userInputJumlahBayarAs(JumlahBayar);
    }

    @And("^user input kode member as '(.*)'$")
    public void userInputKodeMemberAs(String kodemember) throws Throwable {
        purchasePage.userInputKodeMemberAs(kodemember);
    }

    @When("^user pilh barang as '(.*)'$")
    public void userPilhBarangAs(String barang) throws Throwable {
        purchasePage.pilihBarang();
        waitABit(1000L);
        System.out.println("hazna lala");
        purchasePage.searchBarang(barang);
    }

    @Then("^user can see popup error transaksi$")
    public void userCanSeePopupErrorTransaksi() throws Throwable {
        purchasePage.transaksiError();
    }
}
