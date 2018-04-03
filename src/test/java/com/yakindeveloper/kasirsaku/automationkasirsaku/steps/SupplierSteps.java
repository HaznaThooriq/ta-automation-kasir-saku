package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.pages.SupplierPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class SupplierSteps {
    @Autowired
    SupplierPage supplierPage;

    @Then("^supplier already create$")
    public void supplierAlreadyCreate() throws Throwable {
        /*      supplierPage.supplierAlreadyCreate();*/
    }

    @And("^supplier already delete$")
    public void supplierAlreadyDelete() throws Throwable {
        supplierPage.supplierAlreadyDelete();
    }

    @Then("^supplier already update$")
    public void supplierAlreadyUpdate() throws Throwable {
        /*       supplierPage.supplierAlreadyUpdate();*/
    }

    @And("^user click Add supplier$")
    public void userClickAddsupplier() throws Throwable {
        supplierPage.userClickAddsupplier();
    }

    @When("^user click button supplier$")
    public void userClickButtonsupplier() throws Throwable {
        supplierPage.userClickButtonsupplier();
    }

    @Then("^user in create supplier page$")
    public void userInCreatesupplierPage() throws Throwable {
        supplierPage.userInCreatesupplierPage();
    }

    @And("^user input alamat supplier as '(.*)'$")
    public void userInputAlamatAs(String alamat) throws Throwable {
        supplierPage.userInputAlamatAs(alamat);
    }

    @And("^user input email supplier as '(.*)'$")
    public void userInputEmailAs(String email) throws Throwable {
        supplierPage.userInputEmailAs(email);
    }

    @And("^user input telepon supplier as '(.*)'$")
    public void userInputTeleponAs(String telepon) throws Throwable {
        supplierPage.userInputTeleponAs(telepon);
    }

    @When("^user type Nama supplier as '(.*)'$")
    public void userTypeNamasupplierAs(String nama) throws Throwable {
        supplierPage.userTypeNamasupplierAs(nama);
    }

    @And("^user update alamat supplier into '(.*)'$")
    public void userUpdateAlamatInto(String alamat) throws Throwable {
        supplierPage.userInputAlamatAs(alamat);
    }

    @And("^user update email supplier into '(.*)'$")
    public void userUpdateEmailInto(String email) throws Throwable {
        supplierPage.userInputEmailAs(email);
    }

    @When("^user update Nama supplier into '(.*)'$")
    public void userUpdateNamasupplierInto(String nama) throws Throwable {
        supplierPage.userTypeNamasupplierAs(nama);
    }

    @And("^user update telepon supplier into '(.*)'$")
    public void userUpdateTeleponInto(String telepon) throws Throwable {
        supplierPage.userInputTeleponAs(telepon);
    }

}
