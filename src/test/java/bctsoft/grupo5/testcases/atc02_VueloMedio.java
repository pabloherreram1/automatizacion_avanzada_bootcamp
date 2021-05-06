package bctsoft.grupo5.testcases;

import java.text.ParseException;
import bctsoft.grupo5.pageobject.pages.JetSmartHomePage;
import bctsoft.grupo5.pageobject.pages.JetSmartInicioSesionPage;
import org.testng.annotations.Test;

public class atc02_VueloMedio extends TestBase{
    protected JetSmartHomePage jsHomePage;
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


