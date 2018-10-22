package com.yakindeveloper.kasirsaku.automationkasirsaku.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

@Component
public class MemberPage extends PageObject {

    @FindBy(id = "w1-success-0")
    private WebElementFacade popupMemberSuccessCreated;

    @FindBy(xpath = "//div[@class='header']/h2")
    private WebElementFacade fieldRequestKartuMember;

    @FindBy(xpath = "//a[@href='/member/index']")
    private WebElementFacade fieldMember;

    @FindBy(id = "member-nama")
    private WebElementFacade fieldNamaMember;

    @FindBy(id = "member-phone")
    private WebElementFacade fieldPhoneMember;

    @FindBy(id = "member-alamat")
    private WebElementFacade fieldAlamatMember;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElementFacade btnSubmit;

    public void userClickButtonMember(){
        fieldMember.click();
    }

    public boolean btnMemberIsDisplayed(){
        return  fieldMember.isDisplayed();
    }

    public boolean popupMemberSuccessCreatedIsAppear(){
        return popupMemberSuccessCreated.isDisplayed();
    }

    public boolean userInRequestKartuMemberPage(){
        return fieldRequestKartuMember.isDisplayed();
    }

    public void userClickButtonCreate(){
        btnSubmit.click();
    }

    public void userTypeAlamatAs(String alamat){
        fieldAlamatMember.type(alamat);
    }

    public void userTypeNamaMemberAs(String nama){
        fieldNamaMember.type(nama);
    }

    public void userTypeTelephoneAs(String nomor){
        fieldPhoneMember.type(nomor);
    }




}
