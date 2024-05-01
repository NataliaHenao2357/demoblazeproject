package com.demoblaze.www.StepsDefinitions;

import com.demoblaze.www.Steps.BlazerStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class BlazeStepDefinitions {

    @Steps
    private BlazerStep blazerStep;

    @Cuando("hacemos clic en “Sing UP”")
    public void hacemosClicEnSingUP() {
       blazerStep.ClickSingnUp();
    }
    @Cuando("llenamos los datos")
    public void llenamosLosDatos(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        blazerStep.LlenarDatos(dataTable.row(0).get(0),dataTable.row(0).get(1));

    }
    @Entonces("la cuenta se crea exitosamente y se visualiza el mensaje {string}")
    public void laCuentaSeCreaExitosamenteYSeVisualizaElMensaje(String string) throws InterruptedException {
        blazerStep.ClickSingnUp1();
        blazerStep.validarCreacion(string);
    }



    @Dado("que contamos con una cuenta")
    public void queContamosConUnaCuenta() {

    }
    @Cuando("hacemos clic en “Log in”")
    public void hacemosClicEnLogIn() {
      blazerStep.ClickLoginUp();
    }

    @Cuando("ingresamos {string} y {string}")
    public void ingresamosY(String string, String string2) throws InterruptedException {
           blazerStep.llenarDatoslogin(string, string2);
    }


    @Entonces("Ingresamos con exito")
    public void ingresamosConExito() throws InterruptedException {
        blazerStep.ClickLoginUp1();


    }

    @Entonces("nos debe aparecer nuestro nombre de usuario {string} en la esquina superior derecha.")
    public void nosDebeAparecerNuestroNombreDeUsuarioEnLaEsquinaSuperiorDerecha(String usuario) throws InterruptedException {
       blazerStep.labelNombreUsuario(usuario);
    }
}
