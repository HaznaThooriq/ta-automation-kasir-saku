package com.yakindeveloper.kasirsaku.automationkasirsaku;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/WebKasirSaku/Login.feature", tags = "@Dashboard")
public class DefinitionTestSuite {
}
