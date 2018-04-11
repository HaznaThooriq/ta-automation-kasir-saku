package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.pages.BarangPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.springframework.beans.factory.annotation.Autowired;

public class BarangSteps extends ScenarioSteps {

    @Autowired
    BarangPage barangPage;

    @Then("^barang already create$")
    public void barangAlreadyCreate() throws Throwable {
        barangPage.barangAlreadyCreate();
    }

    @And("^barang already delete$")
    public void barangAlreadyDelete() throws Throwable {
        barangPage.barangAlreadyDelete();
    }

    @Then("^barang already update$")
    public void barangAlreadyUpdate() throws Throwable {
       barangPage.barangAlreadyUpdate();
    }


    @And("^user click Add Barang$")
    public void userClickAddBarang() throws Throwable {
       barangPage.userClickAddBarang();
    }

    @When("^user click button barang$")
    public void userClickButtonBarang() throws Throwable {
       barangPage.userClickButtonBarang();
    }

    @And("^user click create button$")
    public void userClickCreateButton() throws Throwable {
      barangPage.userClickCreateButton();
    }

    @When("^user click OK button$")
    public void userClickOKButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user click trash icon$")
    public void userClickTrashIcon() throws Throwable {
        barangPage.userClickTrashIcon();
    }

    @And("^user click update button$")
    public void userClickUpdateButton() throws Throwable {
        barangPage.userClickCreateButton();
    }

    @When("^user click update icon$")
    public void userClickUpdateIcon() throws Throwable {
        barangPage.userClickUpdateButton();
    }

    @Then("^user in create barang page$")
    public void userInCreateBarangPage() throws Throwable {
      barangPage.userInCreateBarangPage();
    }

    @Then("^user in update page$")
    public void userInUpdatePage() throws Throwable {
        barangPage.userInCreateBarangPage();
    }

    @And("^user input harga jual as '(.*)'$")
    public void userInputHargaJualAs(String hargaJual) throws Throwable {
        barangPage.userInputHargaJualAs(hargaJual);
    }

    @And("^user input harga supplier as '(.*)'$")
    public void userInputHargaSupplierAs(String hargaSupplier) throws Throwable {
        barangPage.userInputHargaSupplierAs(hargaSupplier);
    }

    @And("^user input stok as '(.*)'$")
    public void userInputStokAs(String stok) throws Throwable {
       barangPage.userInputStokAs(stok);
    }

    @When("^user type Nama Barang as '(.*)'$")
    public void userTypeNamaBarangAs(String namaBarang) throws Throwable {
       barangPage.userTypeNamaBarangAs(namaBarang);
    }

    @And("^user update harga jual into '(.*)'$")
    public void userUpdateHargaJualInto(String hargaJual) throws Throwable {
        barangPage.userInputHargaJualAs(hargaJual);
    }

    @And("^user update harga supplier into '(.*)'$")
    public void userUpdateHargaSupplierInto(String hargaSupplier) throws Throwable {
        barangPage.userInputHargaSupplierAs(hargaSupplier);
    }

    @When("^user update name into '(.*)'$")
    public void userUpdateNameInto(String name) throws Throwable {
       barangPage.userTypeNamaBarangAs(name);
    }

    @And("^user update stok into '(.*)'$")
    public void userUpdateStokInto(String stok) throws Throwable {
       barangPage.userInputStokAs(stok);
    }

    @And("^user upload foto$")
    public void userUploadFoto() throws Throwable {
        barangPage.userUploadFoto();
    }
}
