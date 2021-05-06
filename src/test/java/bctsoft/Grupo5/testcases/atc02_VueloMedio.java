package bctsoft.Grupo5.testcases;
import bctsoft.Grupo5.pageobject.pages.*;
import bctsoft.Grupo5.testcases.TestBase;
import org.junit.Test;

import java.text.ParseException;

public class atc02_VueloMedio extends TestBase{
    protected bctsoft.Grupo5.pageobject.pages.JetSmartHomePage jsHomePage;
    protected JetSmartInicioSesionPage InicioSesionPage;

    @Test
    public void atc02_Vuelos_Encontrados_Ida_y_vuelta() throws InterruptedException, ParseException {
        jsHomePage = new JetSmartHomePage(driver);
        jsHomePage.goToUrl("https://jetsmart.com/cl/es/");
        jsHomePage.cerrarModuloSuscribete();
        jsHomePage.btnInicioSesion();

        InicioSesionPage = new JetSmartInicioSesionPage(driver);
        InicioSesionPage.waitInputLogin();
        InicioSesionPage.iniciarSesion();

        jsHomePage.formVueloMedio();

    }
}
