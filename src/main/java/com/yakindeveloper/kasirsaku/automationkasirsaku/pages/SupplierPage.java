package com.yakindeveloper.kasirsaku.automationkasirsaku.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

@Component
public class SupplierPage extends PageObject {

    @FindBy(xpath = "//a[@href='/supplier/index']")
    private WebElementFacade btnsupplier;

    @FindBy(xpath = "//a[@href='/supplier/create']")
    private WebElementFacade btnCreate;

    @FindBy(xpath = "//div[@class='header']/h2")
    private WebElementFacade fieldCreatesupplier;

    @FindBy(id = "supplier-nama")
    private WebElementFacade fieldNama;

    @FindBy(id = "supplier-alamat")
    private WebElementFacade fieldAlamat;

    @FindBy(id = "supplier-phone")
    private WebElementFacade fieldPhone;

    @FindBy(id = "supplier-email")
    private WebElementFacade fieldEmail;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElementFacade btnSubmit;

    @FindBy(id = "w1-success-0")
    private WebElementFacade popupDelete;

    @FindBy(xpath = "//a[@class='btn bg-blue btn-circle waves-effect waves-circle waves-float']")
    private WebElementFacade btnUpdate;

    @FindBy(xpath = "//a[@data-method='post']")
    private WebElementFacade btnTrash;

    public void userClickButtonsupplier() {
        btnsupplier.click();
    }

    public void userClickAddsupplier() {
        btnCreate.click();
    }

    public void userTypeNamasupplierAs(String namasupplier) {
        fieldNama.type(namasupplier);
    }

    public void userInputAlamatAs(String alamat) {
        fieldAlamat.type(alamat);
    }

    public void userInputEmailAs(String email) {
        fieldEmail.type(email);
    }

    public void userInputTeleponAs(String telepon) {fieldPhone.type(telepon);
    }


    public boolean supplierAlreadyDelete() {
        return popupDelete.isDisplayed();
    }


    public boolean userInCreatesupplierPage() {
        return fieldCreatesupplier.isDisplayed();
    }



}