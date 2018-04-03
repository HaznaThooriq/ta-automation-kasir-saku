package com.yakindeveloper.kasirsaku.automationkasirsaku.steps;

import com.yakindeveloper.kasirsaku.automationkasirsaku.pages.MemberPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberSteps {
    @Autowired
    MemberPage memberPage;

    @Then("^popup member success created is appear$")
    public void popupMemberSuccessCreatedIsAppear() throws Throwable {
        memberPage.popupMemberSuccessCreatedIsAppear();
    }

    @When("^user click button create$")
    public void userClickButtonCreate() throws Throwable {
        memberPage.userClickButtonCreate();
    }

    @When("^user click button member$")
    public void userClickButtonMember() throws Throwable {
        memberPage.userClickButtonMember();
    }

    @Then("^user in Request Kartu Member page$")
    public void userInRequestKartuMemberPage() throws Throwable {
        memberPage.userInRequestKartuMemberPage();
    }

    @And("^user type alamat as '(.*)'$")
    public void userTypeAlamatAs(String alamat) throws Throwable {
        memberPage.userTypeAlamatAs(alamat);
    }

    @When("^user type nama member as '(.*)'$")
    public void userTypeNamaMemberAs(String nama) throws Throwable {
        memberPage.userTypeNamaMemberAs(nama);
    }

    @And("^user type telephone as '(.*)'$")
    public void userTypeTelephoneAs(String nomor) throws Throwable {
        memberPage.userTypeTelephoneAs(nomor);
    }
}
