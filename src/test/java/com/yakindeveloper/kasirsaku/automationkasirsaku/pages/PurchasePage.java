package com.yakindeveloper.kasirsaku.automationkasirsaku.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import java.lang.ref.PhantomReference;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class PurchasePage extends PageObject {
    @FindBy(xpath = "//a[@href='/transaksi/bayar']")
    private WebElementFacade btnPembelian;

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

    public void clickBtnPembelian(){
        btnPembelian.click();
    }

    public void pilihBarang(){
        fieldPilihBarang.click();
    }

    public void searchBarang(String barang){
        fieldInputBarang.typeAndEnter(barang);
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
    }

    public boolean userCanSeePopupPengembalianAs(String kembalian){
        return popupTotalKembalian.containsText(kembalian);
    }

}