package bctsoft.grupo5.testcases;

import bctsoft.grupo5.pageobject.pages.JetSmartHomePage;
import bctsoft.grupo5.pageobject.pages.JetSmartInicioSesionPage;
import org.testng.annotations.Test;

import java.text.ParseException;


public class atc09_TrasladoAlto extends TestBase{
    protected JetSmartHomePage jsHomePage;
    protected JetSmartInicioSesionPage InicioSesionPage;

    @Test
    public void atc08_busquedaSinResultado() throws ParseException, InterruptedException {
        jsHomePage = new JetSmartHomePage(driver);
        jsHomePage.goToUrl("https://jetsmart.com/cl/es/");
        jsHomePage.cerrarModuloSuscribete();
        /*
        jsHomePage.btnInicioSesion();
        InicioSesionPage = new JetSmartInicioSesionPage(driver);
        InicioSesionPage.waitInputLogin();
        InicioSesionPage.iniciarSesion();
         */

        jsHomePage.formTrasladoMedio();
    }
}
