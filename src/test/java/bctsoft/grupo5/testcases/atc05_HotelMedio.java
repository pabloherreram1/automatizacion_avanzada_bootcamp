package bctsoft.grupo5.testcases;
import bctsoft.grupo5.pageobject.pages.*;
import org.testng.annotations.Test;

import java.text.ParseException;

public class atc05_HotelMedio extends TestBase{
    protected JetSmartHomePage jsHomePage;
    protected JetSmartInicioSesionPage InicioSesionPage;

    @Test
    public void atc05_EncontrarPaqueteAlojamiento() throws ParseException {
        jsHomePage = new JetSmartHomePage(driver);
        jsHomePage.goToUrl("https://jetsmart.com/cl/es/");
        jsHomePage.cerrarModuloSuscribete();

        jsHomePage.btnInicioSesion();
        InicioSesionPage = new JetSmartInicioSesionPage(driver);
        InicioSesionPage.waitInputLogin();
        InicioSesionPage.iniciarSesion();

        jsHomePage.formHotelesMedio();
    }
}
