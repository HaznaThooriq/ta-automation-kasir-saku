package com.yakindeveloper.kasirsaku.automationkasirsaku;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/WebKasirSaku/ErrorScenario/UserGotoDashboard.feature", tags = "")
public class DefinitionTestSuite {}
