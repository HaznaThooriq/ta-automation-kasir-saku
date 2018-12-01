

package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.api.PelangganController;
import com.yakindeveloper.kasirsaku.automationkasirsaku.api.SupplierController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;

public class ApiSupplierSteps extends ScenarioSteps {
    SupplierController supplierController = new SupplierController()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ;

    @Given("^user test API Create Supplier$")
    public void userTestAPICreateSupplier() {
        supplierController.createSupplier();
    }

    @Then("^user can see the massage Create Supplier berhasil$")
    public void userCanSeeTheMassageCreateSupplierBerhasil() {

    }

    @Given("^user test API Update Supplier$")
    public void userTestAPIUpdateSupplier() {
        supplierController.updateSupplier();
    }

    @Then("^user can see the massage Update Supplier berhasil$")
    public void userCanSeeTheMassageUpdateSupplierBerhasil() {

    }

    @Given("^user test API Search Supplier$")
    public void userTestAPISearchSupplier() {
        supplierController.searchSupplier();
    }

    @Then("^user can see the massage Search Supplier berhasil$")
    public void userCanSeeTheMassageSearchSupplierBerhasil() {

    }

    @Given("^user test API Delete Supplier$")
    public void userTestAPIDeleteSupplier() {
        supplierController.deleteSupplier();
    }

    @Then("^user can see the massage API Delete Supplier Berhasil$")
    public void userCanSeeTheMassageAPIDeleteSupplierBerhasil() {

    }

    @Given("^user test API Index Supplier$")
    public void userTestAPIIndexSupplier() {
        supplierController.indexSupplier();
    }

    @Then("^user can see the massage of Index Supplier Berhasil$")
    public void userCanSeeTheMassageOfIndexSupplierBerhasil() {

    }

    @Given("^user test API View Supplier$")
    public void userTestAPIViewSupplier() {
        supplierController.viewSupplier();
    }

    @Then("^user can see the massage of View Supplier berhasil$")
    public void userCanSeeTheMassageOfViewSupplierBerhasil() {
    }
}
