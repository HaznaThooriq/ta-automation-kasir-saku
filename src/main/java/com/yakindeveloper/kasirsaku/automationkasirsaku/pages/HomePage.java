package com.yakindeveloper.kasirsaku.automationkasirsaku.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class HomePage extends PageObject{

    @FindBy(xpath = "//a[@class='navbar-brand']/img[@class='logo']")
    private WebElementFacade logo;

    @FindBy(xpath = "//div[@class=\'help-block\']")
    private WebElementFacade toastInvalidUsernamePassword;

    @FindBy(id = "loginform-username")
    private WebElementFacade fieldUsername;

    @FindBy(id = "loginform-password")
    private WebElementFacade fieldPassword;

    @FindBy(xpath = "//a[@href='#user-area']")
    private WebElementFacade btnUserArea;

    @FindBy(xpath = "//div[@class='container']/div/h1")
    private List<WebElementFacade> listContainer;

    @FindBy(xpath = "//a/i[@class='fa fa-sign-in fa-2x']")
    private WebElementFacade btnLoginHomepage;

    @FindBy(name = "login-button")
    private WebElementFacade btnLogin;

    @FindBy(xpath = "//div[@class='site-about']/h1")
    private WebElementFacade fieldWelcomeKasirsaku;

    public void goToUrl(String url){
        openAt(url);
    }

    public boolean logoIsAppear(){
        return logo.isDisplayed();
    }

    public void clickBtnUserArea(){
        btnUserArea.waitUntilClickable().click();
    }

    public void clickBtnLogin(){
        btnLoginHomepage.click();
    }

    public void clickLogin(){
        btnLogin.click();
    }

    public List<WebElementFacade> getListContainer() {
        return listContainer;
    }

    public boolean userAlreadyLoginAsKasirSaku(){
        return fieldWelcomeKasirsaku.isDisplayed();
    }

    public void login(String username, String password){
        fieldUsername.type(username);
        fieldPassword.type(password);
    }

    public boolean toastInvalidUsernamePassword(){
        return toastInvalidUsernamePassword.isVisible();
    }


}
