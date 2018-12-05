
package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.api.PelangganController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;

public class ApiPelangganSteps extends ScenarioSteps {
    PelangganController pelangganController = new PelangganController()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ;

    @Given("^user test API Create Pelanggan$")
    public void userTestAPICreatePelanggan() throws Throwable {
        pelangganController.createPelanggan();
    }

    @Then("^user can see the massage Create Pelanggan berhasil$")
    public void userCanSeeTheMassageCreatePelangganBerhasil() throws Throwable {

    }

    @Given("^user test API Update Pelanggan$")
    public void userTestAPIUpdatePelanggan() throws Throwable {
        pelangganController.updatePelanggan();
    }

    @Then("^user can see the massage Update Pelanggan berhasil$")
    public void userCanSeeTheMassageUpdatePelangganBerhasil() throws Throwable {

    }

    @Given("^user test API Search Pelanggan$")
    public void userTestAPISearchPelanggan() throws Throwable {
       pelangganController.searchPelanggan();
    }

    @Then("^user can see the massage Search Pelanggan berhasil$")
    public void userCanSeeTheMassageSearchPelangganBerhasil() throws Throwable {

    }

    @Given("^user test API Delete Pelanggan$")
    public void userTestAPIDeletePelanggan() throws Throwable{
        pelangganController.deletePelanggan();
    }

    @Then("^user can see the massage API Delete Pelanggan Berhasil$")
    public void userCanSeeTheMassageAPIDeletePelangganBerhasil() throws Throwable {

    }

    @Given("^user test API Index Pelanggan$")
    public void userTestAPIIndexPelanggan() throws Throwable {
       pelangganController.indexPelanggan();
    }

    @Then("^user can see the massage of Index Pelanggan Berhasil$")
    public void userCanSeeTheMassageOfIndexPelangganBerhasil() throws Throwable {

    }

    @Given("^user test API View Pelanggan$")
    public void userTestAPIViewPelanggan() throws Throwable {
        pelangganController.viewPelanggan();
    }

    @Then("^user can see the massage of View Pelanggan berhasil$")
    public void userCanSeeTheMassageOfViewPelangganBerhasil() throws Throwable {

    }

    @Given("^user test API Create Pelanggan Invalid Auth$")
    public void userTestAPICreatePelangganInvalidAuth() {
        pelangganController.createPelangganInvalidAuth();
    }

    @Then("^user can see the massage Create Pelanggan gagal$")
    public void userCanSeeTheMassageCreatePelangganGagal() {
        
    }

    @Given("^user test API Update Pelanggan Invalid Id$")
    public void userTestAPIUpdatePelangganInvalidId() {
        pelangganController.updatePelangganInvalidId();
    }

    @Then("^user can see the massage Update Pelanggan gagal$")
    public void userCanSeeTheMassageUpdatePelangganGagal() {
        
    }

    @Given("^user test API Search Pelanggan Invalid Id$")
    public void userTestAPISearchPelangganInvalidId() {
        pelangganController.searchPelangganInvalidId();
    }

    @Then("^user can see the massage Search Pelanggan gagal$")
    public void userCanSeeTheMassageSearchPelangganGagal() {
        
    }

    @Given("^user test API Delete Pelanggan Invalid Id$")
    public void userTestAPIDeletePelangganInvalidId() {
        pelangganController.deletePelangganInvalidId();
    }

    @Then("^user can see the massage API Delete Pelanggan gagal$")
    public void userCanSeeTheMassageAPIDeletePelangganGagal() {
        
    }

    @Given("^user test API Index Pelanggan Invalid Auth$")
    public void userTestAPIIndexPelangganInvalidAuth() {
        pelangganController.indexPelangganInvalidAuth();
    }

    @Then("^user can see the massage of Index Pelanggan gagal$")
    public void userCanSeeTheMassageOfIndexPelangganGagal() {
        
    }

    @Given("^user test API View Pelanggan Invalid Id$")
    public void userTestAPIViewPelangganInvalidId() {
        pelangganController.viewPelangganInvalidId();
    }

    @Then("^user can see the massage of View Pelanggan gagal$")
    public void userCanSeeTheMassageOfViewPelangganGagal() {
    }
}

