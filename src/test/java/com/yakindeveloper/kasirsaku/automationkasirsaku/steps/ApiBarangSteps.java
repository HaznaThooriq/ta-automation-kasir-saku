
package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.api.BarangController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;

public class ApiBarangSteps extends ScenarioSteps {
    BarangController barangController  = new BarangController();

    @Given("^user test API Barang with Authorization '(.*)'$")
    public void userTestAPIBarangWithAuthorization(String auth) throws Throwable {
       barangController.barangIndexHappyFlow(auth);
    }

    @Then("^user can see the index of barang$")
    public void userCanSeeTheIndexOfBarang() throws Throwable {
    }

    @Given("^user test API View Barang with Authorization '(.*)' and id '(.*)'$")
    public void userTestAPIViewBarangWithAuthorizationAndId(String auth, String id) throws Throwable {
        barangController.barangViewHappyFlow(auth, id);
    }

    @Then("^user can see the result of view barang$")
    public void userCanSeeTheResultOfViewBarang() throws Throwable {

    }

    @Given("^user test API Scan Barcode with Authorization '(.*)' and barcode '(.*)'$")
    public void userTestAPIScanBarcodeWithAuthorizationAndBarcode(String auth, String barcode) throws Throwable {
        barangController.scanBarcode(auth, barcode);
    }

    @Then("^user can see the result of Scan Barcode$")
    public void userCanSeeTheResultOfScanBarcode() throws Throwable {
    }

    @Given("^user test API Search Barang with Authorization '(.*)' and keyword '(.*)'$")
    public void userTestAPISearchBarangWithAuthorizationAndKeyword(String auth, String keyword) throws Throwable {
       barangController.searchBarang(auth, keyword);
    }

    @Then("^user can see the result search barang$")
    public void userCanSeeTheResultSearchBarang() throws Throwable {
    }


    @Given("^user test API Tambah Stock Barang Id '(.*)' with Authorization '(.*)', stock '(.*)', harga supplier '(.*)', harga baru '(.*)'$")
    public void userTestAPITambahStockBarangWithAuthorization(String id, String auth, String stock, String hargaSupplier, String hargaBaru) throws Throwable {
        barangController.tambahStockBarang(id, auth, stock, hargaSupplier, hargaBaru);
    }

    @Then("^user can see the result of tambah stock barang$")
    public void userCanSeeTheResultOfTambahStockBarang() throws Throwable {
    }

    @Given("^user test API Delete Barang Id '(.*)' with Authorization '(.*)'$")
    public void userTestAPIDeleteBarang(String id, String auth) throws Throwable {
        barangController.deleteBarang(id,auth);
    }

    @Then("^user can see the result of delete barang$")
    public void userCanSeeTheResultOfDeleteBarang() throws Throwable {

    }

    @Given("^user test API Barang with Error Authorization '(.*)'$")
    public void userTestAPIBarangWithErrorAuthorization(String auth) {
        barangController.barangIndexErrorFlow(auth);
    }

    @Then("^user can't see the index of barang$")
    public void userCanTSeeTheIndexOfBarang() {

    }

    @Given("^user test API View Barang Invalid Id with Authorization '(.*)' and id '(.*)'$")
    public void userTestAPIViewBarangInvalidIdWithAuthorizationAndId(String auth, String id) {
        barangController.barangViewErrorFlow(auth, id);
    }

    @Then("^user can't see the result of view barang$")
    public void userCanTSeeTheResultOfViewBarang() {

    }

    @Given("^user test API Scan Invalid Barcode with Authorization '(.*)' and barcode '(.*)'$")
    public void userTestAPIScanInvalidBarcodeWithAuthorizationAndBarcode(String auth, String barcode) {
        barangController.scanBarcodeErrorFlow(auth, barcode);
    }

    @Then("^user can't see the result of Scan Barcode$")
    public void userCanTSeeTheResultOfScanBarcode() {

    }

    @Given("^user test API Search Barang Invalid Keyword with Authorization '(.*)' and keyword '(.*)'$")
    public void userTestAPISearchBarangInvalidKeywordWithAuthorizationAndKeyword(String auth, String keyword) {
        barangController.searchBarangErrorFlow(auth,keyword);
    }

    @Then("^user can't see the result search barang$")
    public void userCanTSeeTheResultSearchBarang() {

    }

    @Given("^user test API Tambah Stock Barang Invalid Id '(.*)', stock '(.*)', harga supplier '(.*)', harga baru '(.*)'$")
    public void userTestAPITambahStockBarangInvalidId(String id, String stock, String hargaSupplier, String hargaBaru) {
        barangController.tambahStockBarangErrorFlow(id,stock,hargaSupplier,hargaBaru);
    }

    @Then("^user can't see the result of tambah stock barang$")
    public void userCanTSeeTheResultOfTambahStockBarang() {

    }

    @Given("^user test API Delete Barang Id '(.*)' with Invalid Authorization '(.*)'$")
    public void userTestAPIDeleteBarangIdWithInvalidAuthorizationB(String id, String auth) {
        barangController.deleteBarangErrorFlow(id, auth);
    }

    @Then("^user can't see the result of delete barang$")
    public void userCanTSeeTheResultOfDeleteBarang() {
    }
}

