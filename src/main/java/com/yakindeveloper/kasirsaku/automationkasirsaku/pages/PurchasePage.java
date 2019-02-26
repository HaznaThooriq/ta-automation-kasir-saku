package com.yakindeveloper.kasirsaku.automationkasirsaku.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;
@Component
public class PurchasePage extends PageObject {

    @FindBy(id = "error")
    private WebElementFacade errorTransaction;

    @FindBy(xpath = "//a[@href='/supplier/index']")
    private WebElementFacade btnsupplier;

    @FindBy(xpath = "//a[@href='/transaksi/bayar']")
    private WebElementFacade btnPembelian;

    @FindBy(xpath = "/html/body/section[1]/aside/div[2]/div/ul/li[3]/a")
    private WebElementFacade btnPembelianLala;

    @FindBy(xpath = "//span[@class='filter-option pull-left']")
    private WebElementFacade fieldPilihBarang;

    @FindBy(xpath = "//div[@class='bs-searchbox']/input")
    private WebElementFacade fieldInputBarang;

    @FindBy(id = "beli")
    private WebElementFacade btnBeli;

    @FindBy(id = "jml-bayar")
    private WebElementFacade fieldJumlahBayar;

    @FindBy(id = "kode-member")
    private WebElementFacade filedKodeMember;

    @FindBy(id = "checkout")
    private WebElementFacade btnCheckout;

    @FindBy(id = "tot-kembalian")
    private WebElementFacade popupTotalKembalian;

    public void transaksiError(){
        errorTransaction.isDisplayed();
    }

    public void clickBtnPembelian(){
        btnPembelian.click();
    }

    public void pilihBarang(){
        System.out.println("123");
        fieldPilihBarang.click();
    }

    public void searchBarang(String barang){
        fieldInputBarang.typeAndEnter(barang);
    }

    public void typeKodeMember(String member){
        filedKodeMember.type(member);
    }

    public void clickBtnBeli(){
        btnBeli.click();
    }

    public void userInputJumlahBayarAs(String jumlah){
        fieldJumlahBayar.type(jumlah);
    }

    public void userInputKodeMemberAs(String kodemember){
        filedKodeMember.type(kodemember);
    }

    public void userClickCheckoutButton(){
        btnCheckout.click();
        waitABit(1000L);
    }

    public boolean userCanSeePopupPengembalianAs(String kembalian){
        return popupTotalKembalian.containsText(kembalian);
    }

}