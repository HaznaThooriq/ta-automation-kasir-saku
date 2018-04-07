package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.api.TestController;
import cucumber.api.java.en.Given;

public class ApiSteps {
    TestController testController = new TestController();

    @Given("^test api nih$")
    public void testApiNih() {
       testController.testApi();
    }
}
