package com.yakindeveloper.kasirsaku.automationkasirsaku;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/APIKasirsaku/APITopupPPOB.feature", tags = "@APIDeleteTopupPPOB")
public class DefinitionTestSuite {}
