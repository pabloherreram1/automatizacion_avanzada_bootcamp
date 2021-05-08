package bctsoft.grupo5.testcases;

import bctsoft.grupo5.pageobject.pages.*;
import org.testng.annotations.Test;

import java.text.ParseException;


public class atc09_TrasladoAlto extends TestBase{
    protected JetSmartHomePage jsHomePage;
    protected JetSmartInicioSesionPage InicioSesionPage;
    protected JetSmartResultado2Traslado Resultado2Traslado;
    protected JetSmartResultado3Traslado Resultado3Traslado;

    @Test
    public void atc09_ReservacionTransporte() throws ParseException, InterruptedException {
        jsHomePage = new JetSmartHomePage(driver);
        jsHomePage.goToUrl("https://jetsmart.com/cl/es/");
        jsHomePage.cerrarModuloSuscribete();

        jsHomePage.btnInicioSesion();
        InicioSesionPage = new JetSmartInicioSesionPage(driver);
        InicioSesionPage.waitInputLogin();
        InicioSesionPage.iniciarSesion();


        jsHomePage.formTrasladoAlto();

        Resultado2Traslado = new JetSmartResultado2Traslado(driver);
        Resultado2Traslado.reservarAhora();

        Resultado3Traslado = new JetSmartResultado3Traslado(driver);
        Resultado3Traslado.datosTraslado();

    }
}
