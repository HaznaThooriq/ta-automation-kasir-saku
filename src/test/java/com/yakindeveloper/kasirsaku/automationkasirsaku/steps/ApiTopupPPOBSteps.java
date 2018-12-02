
package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.api.LaporanController;
import com.yakindeveloper.kasirsaku.automationkasirsaku.api.TopupPPOBController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;

public class ApiTopupPPOBSteps extends ScenarioSteps {
    TopupPPOBController topupPPOBController = new TopupPPOBController();
    @Given("^user test API Create Topup PPOB$")
    public void userTestAPICreateTopupPPOB() {
        topupPPOBController.createTopupPPOB();
    }

    @Then("^user can see the result of create topup PPOB$")
    public void userCanSeeTheResultOfCreateTopupPPOB() {
        
    }

    @Given("^user test API Index Topup PPOB$")
    public void userTestAPIIndexTopupPPOB() {
        topupPPOBController.indexTopupPPOB();
    }

    @Then("^user can see the result of index topup PPOB$")
    public void userCanSeeTheResultOfIndexTopupPPOB() {
        
    }

    @Given("^user test API view Topup PPOB$")
    public void userTestAPIViewTopupPPOB() {
        topupPPOBController.viewTopupPPOB();
    }

    @Then("^user can see the result of view topup PPOB$")
    public void userCanSeeTheResultOfViewTopupPPOB() {
        
    }

    @Given("^user test API update Topup PPOB$")
    public void userTestAPIUpdateTopupPPOB() {
        topupPPOBController.updateTopupPPOB();
    }

    @Then("^user can see the result of update topup PPOB$")
    public void userCanSeeTheResultOfUpdateTopupPPOB() {
        
    }

    @Given("^user test API Delete Topup PPOB$")
    public void userTestAPIDeleteTopupPPOB() {
        topupPPOBController.deleteTopupPPOB();
    }

    @Then("^user can see the result of Delete topup PPOB$")
    public void userCanSeeTheResultOfDeleteTopupPPOB() {
    }
}

