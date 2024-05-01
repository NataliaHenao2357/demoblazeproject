package com.demoblaze.www.pages;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class PaginaInicio extends PageObject {

    @Getter private static By btnSingUp = By.id("signin2");
    @Getter private static By inputusername = By.id("sign-username");
    @Getter private static By inputpassword = By.id("sign-password");
    @Getter private static By btnSingUp1 = By.xpath("//button[@onclick=\"register()\"]");
    @Getter private static By btnloginUp = By.id("login2");
    @Getter private static By inputloginusername = By.id("loginusername");
    @Getter private static By inputloginpassword = By.id("loginpassword");
    @Getter private static By btnloginUp1 = By.xpath("//button[contains(text(),'Log in')]");
    @Getter private static By labelNombreUsuario = By.xpath("//a[@id=\"nameofuser\"]");


    public void AbrirPagina (String url){
        getDriver().manage().window().maximize();
        getDriver().get(url);
        getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }




}
