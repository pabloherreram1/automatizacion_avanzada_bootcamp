package bctsoft.grupo5.testcases;
import bctsoft.grupo5.pageobject.pages.*;
import org.testng.annotations.Test;

public class atc04_HotelBajo extends TestBase{
    protected JetSmartHomePage jsHomePage;
    protected JetSmartInicioSesionPage InicioSesionPage;

    @Test
    public void atc04_NoEncontrarPaqueteDeAlojamiento(){
        jsHomePage = new JetSmartHomePage(driver);
        jsHomePage.goToUrl("https://jetsmart.com/cl/es/");
        jsHomePage.cerrarModuloSuscribete();

        jsHomePage.btnInicioSesion();
        InicioSesionPage = new JetSmartInicioSesionPage(driver);
        InicioSesionPage.waitInputLogin();
        InicioSesionPage.iniciarSesion();

        jsHomePage.formHotelesBajo();

    }
}
