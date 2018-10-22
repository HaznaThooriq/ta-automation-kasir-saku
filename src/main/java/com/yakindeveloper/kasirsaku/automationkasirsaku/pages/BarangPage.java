package com.yakindeveloper.kasirsaku.automationkasirsaku.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

@Component
public class BarangPage extends PageObject {

    @FindBy(xpath = "//div[@class='help-block']")
    private WebElementFacade toast;

    @FindBy(xpath = "//a[@href='/barang/index']")
    private WebElementFacade btnBarang;

    @FindBy(xpath = "//a[@href='/barang/create']")
    private WebElementFacade btnCreate;

    @FindBy(xpath = "//div[@class='header']/h2")
    private WebElementFacade fieldCreateBarang;

    @FindBy(id = "barang-nama")
    private WebElementFacade fieldNama;

    @FindBy(id = "barang-barcode_content")
    private WebElementFacade fieldBarcode;

    @FindBy(id = "barang-stok")
    private WebElementFacade fieldStock;

    @FindBy(id = "barang-harga_supplier")
    private WebElementFacade fieldHargaSupplier;

    @FindBy(id = "barang-harga_jual")
    private WebElementFacade fieldHargaJual;

    @FindBy(xpath = "//div/input[@id='barang-upload']")
    private WebElementFacade btnUploadFoto;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElementFacade btnSubmit;

    @FindBy(id = "w2-success-0")
    private WebElementFacade popup;

    @FindBy(id = "w1-success-0")
    private WebElementFacade popupDelete;

    @FindBy(xpath = "//a[@class='btn bg-blue btn-circle waves-effect waves-circle waves-float']")
    private WebElementFacade btnUpdate;

    @FindBy(xpath = "//a[@data-method='post']")
    private WebElementFacade btnTrash;

    public boolean toastIsVisible(){
        return toast.isVisible();
    }

    public void userClickButtonBarang() {
        btnBarang.click();
    }

    public void userClickAddBarang() {
        btnCreate.click();
    }

    public void userTypeNamaBarangAs(String namaBarang) {
        fieldNama.type(namaBarang);
    }

    public void userInputStokAs(String stok) {
        fieldStock.type(stok);
    }

    public void userInputHargaSupplierAs(String hargaSupplier) {
        fieldHargaSupplier.type(hargaSupplier);
    }

    public void userInputHargaJualAs(String hargaJual) {
        fieldHargaJual.type(hargaJual);
    }

    public void userUploadFoto() {
        System.out.println("tes123445");
        btnUploadFoto.click();
/*        List<WebElementFacade> listLihat = findAll(());
        for (int i = 0; i < listLihat.size(); i++) {
            if (listLihat.get(i).getText().toLowerCase().contains("Pilih File …")) {
                System.out.println("tes123445");
                listLihat.get(i).isDisplayed();
                listLihat.get(i).click();
            }
        }*/
        waitABit(100000);
/*        WebElement fileInput = getDriver().findElement(By.name("Barang[upload]"));
        fileInput.sendKeys("C:/path/to/1.png");*/
    }

    public void userClickCreateButton() {
        btnSubmit.click();
    }

    public boolean barangAlreadyCreate() {
        return popup.isDisplayed();
    }

    public boolean barangAlreadyDelete() {
        return popupDelete.isDisplayed();
    }

    public boolean barangAlreadyUpdate() {
        return popup.isDisplayed();
    }

    public boolean userInCreateBarangPage() {
        return fieldCreateBarang.isDisplayed();
    }

    public void userClickTrashIcon() {
        btnTrash.click();
        waitABit(10000);
        getDriver().switchTo().alert().accept();
    }

    public void userClickUpdateButton() {
        btnUpdate.click();
    }


}