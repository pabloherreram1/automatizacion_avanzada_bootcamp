package bctsoft.grupo5.testcases;

import bctsoft.grupo5.pageobject.pages.JetSmartHomePage;
import bctsoft.grupo5.pageobject.pages.JetSmartInicioSesionPage;
import bctsoft.grupo5.pageobject.pages.JetSmartPaquetesLondresHoteles;
import org.testng.annotations.Test;


import java.text.ParseException;

public class atc06_HotelAlto extends TestBase{
    protected JetSmartHomePage jsHomePage;
    protected JetSmartInicioSesionPage InicioSesionPage;
    protected JetSmartPaquetesLondresHoteles PaquetesLondresHoteles;

    @Test
    public void atc06_MostrarPaqueteFiltrado() throws ParseException {
        jsHomePage = new JetSmartHomePage(driver);
        jsHomePage.goToUrl("https://jetsmart.com/cl/es/");
        jsHomePage.cerrarModuloSuscribete();

        /*jsHomePage.btnInicioSesion();
        InicioSesionPage = new JetSmartInicioSesionPage(driver);
        InicioSesionPage.waitInputLogin();
        InicioSesionPage.iniciarSesion();

         */

        jsHomePage.formHotelesAlto();

        PaquetesLondresHoteles = new JetSmartPaquetesLondresHoteles(driver);
        PaquetesLondresHoteles.esperaDeResultados();
        PaquetesLondresHoteles.selecionFiltroPresupuesto();
        PaquetesLondresHoteles.SelecionFiltroPopulares();
        PaquetesLondresHoteles.SelecionFiltroEstrellas();
        PaquetesLondresHoteles.esperaDeFiltrosAplicados();
    }
}
