package bctsoft.Grupo5.testcases;

import bctsoft.Grupo5.pageobject.pages.*;
import bctsoft.Grupo5.testcases.TestBase;
import org.junit.Test;

public class atc01_VueloBajo extends TestBase{

    protected JetSmartHomePage jsHomePage;
    protected JetSmartInicioSesionPage InicioSesionPage;

    @Test
    public void atc01_Busqueda_sin_resultado(){
        jsHomePage = new JetSmartHomePage(driver);
        jsHomePage.goToUrl("https://jetsmart.com/cl/es/");
        jsHomePage.cerrarModuloSuscribete();
        jsHomePage.btnInicioSesion();

        InicioSesionPage = new JetSmartInicioSesionPage(driver);
        InicioSesionPage.waitInputLogin();
        InicioSesionPage.iniciarSesion();

        jsHomePage.formVueloBajo();
    }


}
