package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.pages.BarangPage;
import com.yakindeveloper.kasirsaku.automationkasirsaku.pages.PelangganPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.springframework.beans.factory.annotation.Autowired;

public class PelangganSteps extends ScenarioSteps {
    @Autowired
    PelangganPage pelangganPage;

    @Then("^pelanggan already create$")
    public void pelangganAlreadyCreate() throws Throwable {
/*      pelangganPage.pelangganAlreadyCreate();*/
    }

    @And("^pelanggan already delete$")
    public void pelangganAlreadyDelete() throws Throwable {
       pelangganPage.pelangganAlreadyDelete();
    }

    @Then("^pelanggan already update$")
    public void pelangganAlreadyUpdate() throws Throwable {
/*       pelangganPage.pelangganAlreadyUpdate();*/
    }

    @And("^user click Add pelanggan$")
    public void userClickAddPelanggan() throws Throwable {
      pelangganPage.userClickAddpelanggan();
    }

    @When("^user click button pelanggan$")
    public void userClickButtonPelanggan() throws Throwable {
        pelangganPage.userClickButtonpelanggan();
    }

    @Then("^user in create pelanggan page$")
    public void userInCreatePelangganPage() throws Throwable {
       pelangganPage.userInCreatepelangganPage();
    }

    @And("^user input alamat as '(.*)'$")
    public void userInputAlamatAs(String alamat) throws Throwable {
        pelangganPage.userInputAlamatAs(alamat);
    }

    @And("^user input email as '(.*)'$")
    public void userInputEmailAs(String email) throws Throwable {
        pelangganPage.userInputEmailAs(email);
    }

    @And("^user input telepon as '(.*)'$")
    public void userInputTeleponAs(String telepon) throws Throwable {
        pelangganPage.userInputTeleponAs(telepon);
    }

    @When("^user type Nama Pelanggan as '(.*)'$")
    public void userTypeNamaPelangganAs(String nama) throws Throwable {
        pelangganPage.userTypeNamapelangganAs(nama);
    }

    @And("^user update alamat into '(.*)'$")
    public void userUpdateAlamatInto(String alamat) throws Throwable {
        pelangganPage.userInputAlamatAs(alamat);
    }

    @And("^user update email into '(.*)'$")
    public void userUpdateEmailInto(String email) throws Throwable {
        pelangganPage.userInputEmailAs(email);
    }

    @When("^user update Nama Pelanggan into '(.*)'$")
    public void userUpdateNamaPelangganInto(String nama) throws Throwable {
        pelangganPage.userTypeNamapelangganAs(nama);
    }

    @And("^user update telepon into '(.*)'$")
    public void userUpdateTeleponInto(String telepon) throws Throwable {
        pelangganPage.userInputTeleponAs(telepon);
    }

}
