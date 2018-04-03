package com.yakindeveloper.kasirsaku.automationkasirsaku.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

@Component
public class PelangganPage extends PageObject {

    @FindBy(xpath = "//a[@href='/pelanggan/index']")
    private WebElementFacade btnpelanggan;

    @FindBy(xpath = "//a[@href='/pelanggan/create']")
    private WebElementFacade btnCreate;

    @FindBy(xpath = "//div[@class='header']/h2")
    private WebElementFacade fieldCreatepelanggan;

    @FindBy(id = "pelanggan-nama")
    private WebElementFacade fieldNama;

    @FindBy(id = "pelanggan-alamat")
    private WebElementFacade fieldAlamat;

    @FindBy(id = "pelanggan-phone")
    private WebElementFacade fieldPhone;

    @FindBy(id = "pelanggan-email")
    private WebElementFacade fieldEmail;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElementFacade btnSubmit;

    @FindBy(id = "w1-success-0")
    private WebElementFacade popupDelete;

    @FindBy(xpath = "//a[@class='btn bg-blue btn-circle waves-effect waves-circle waves-float']")
    private WebElementFacade btnUpdate;

    @FindBy(xpath = "//a[@data-method='post']")
    private WebElementFacade btnTrash;

    public void userClickButtonpelanggan() {
        btnpelanggan.click();
    }

    public void userClickAddpelanggan() {
        btnCreate.click();
    }

    public void userTypeNamapelangganAs(String namapelanggan) {
        fieldNama.type(namapelanggan);
    }

    public void userInputAlamatAs(String alamat) {
        fieldAlamat.type(alamat);
    }

    public void userInputEmailAs(String email) {
        fieldEmail.type(email);
    }

    public void userInputTeleponAs(String telepon) {fieldPhone.type(telepon);
    }


    public boolean pelangganAlreadyDelete() {
        return popupDelete.isDisplayed();
    }


    public boolean userInCreatepelangganPage() {
        return fieldCreatepelanggan.isDisplayed();
    }



}