package com.demoblaze.www.Steps;

import com.demoblaze.www.pages.PaginaInicio;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class BlazerStep {

    PaginaInicio paginaInicio = new PaginaInicio();

    @Step
    public void AbrirPagina (String url){
        paginaInicio.AbrirPagina(url);
    }
    @Step
    public void ClickSingnUp(){
        paginaInicio.getDriver().findElement(PaginaInicio.getBtnSingUp()).click();

    }
    @Step
    public void LlenarDatos(String usuario, String clave) throws InterruptedException {
        Thread.sleep(3000);
        paginaInicio.getDriver().findElement(PaginaInicio.getInputusername()).sendKeys(usuario);
        Thread.sleep(1000);
        paginaInicio.getDriver().findElement(PaginaInicio.getInputpassword()).sendKeys(clave);
        Thread.sleep(1000);
    }
    @Step
    public void ClickSingnUp1(){
        paginaInicio.getDriver().findElement(PaginaInicio.getBtnSingUp1()).click();

    }
    @Step
    public void validarCreacion (String texto) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(texto,paginaInicio.getDriver().switchTo().alert().getText());
       paginaInicio.getDriver().switchTo().alert().accept();
    }
    @Step
    public void ClickLoginUp() {
        paginaInicio.getDriver().findElement(PaginaInicio.getBtnloginUp()).click();

    }

    @Step
    public void llenarDatoslogin(String usuario, String clave) throws InterruptedException {
        Thread.sleep(3000);
        paginaInicio.getDriver().findElement(PaginaInicio.getInputloginusername()).sendKeys(usuario);
        Thread.sleep(1000);
        paginaInicio.getDriver().findElement(PaginaInicio.getInputloginpassword()).sendKeys(clave);
        Thread.sleep(1000);
    }
    @Step
    public void ClickLoginUp1() throws InterruptedException {
        Thread.sleep(3000);
        paginaInicio.getDriver().findElement(PaginaInicio.getBtnloginUp1()).click();
        JavascriptExecutor js = (JavascriptExecutor) paginaInicio.getDriver();
        // Ejecutar JavaScript para hacer clic en un elemento
        String xpath = "//button[contains(text(),'Log in')]";
        js.executeScript("document.evaluate(\"" + xpath + "\", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();");

    }
    @Step
    public void labelNombreUsuario(String usuario) throws InterruptedException {
        Thread.sleep(10000);
        String textoesperado= paginaInicio.getDriver().findElement(By.xpath("/html/body/nav/div[1]/ul/li[7]/a")).getText();
        //Assert.assertEquals("Welcome "+ usuario,textoesperado);
        System.out.print("El texto que estoy trayento" + textoesperado);
        Thread.sleep(3000);

    }

    }
