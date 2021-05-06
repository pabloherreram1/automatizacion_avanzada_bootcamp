package bctsoft.grupo5.testcases;
import bctsoft.grupo5.pageobject.pages.*;
import org.testng.annotations.Test;


public class atc03_VueloAlto extends TestBase{
    protected JetSmartHomePage jsHomePage;
    protected JetSmartInicioSesionPage InicioSesionPage;
    protected JetSmartSeleccionDePasajeVuelo SelecionPasajeDeVuelo;
    protected JetSmartPasajesMasBaratoVuelo pasajeMasBarato;
    protected JetsmartPrecioBajoVuelo precioBajo;
    protected JetSmartEleccionPackVuelo EleccionPackVuelo;
    protected JetSmartFijarPrecio24hrsVuelo Precio24hrsVuelo;
    protected JetSmartDetallePasajeroVuelo DetallePasajeroVuelo;

    @Test
    public void atc03_Fecha_de_Ida_cambiado() throws InterruptedException {
        jsHomePage = new JetSmartHomePage(driver);
        jsHomePage.goToUrl("https://jetsmart.com/cl/es/");
        jsHomePage.cerrarModuloSuscribete();
        jsHomePage.btnInicioSesion();

        InicioSesionPage = new JetSmartInicioSesionPage(driver);
        InicioSesionPage.waitInputLogin();
        InicioSesionPage.iniciarSesion();

        jsHomePage.formVueloAlto();

        //pagina 2
        SelecionPasajeDeVuelo = new JetSmartSeleccionDePasajeVuelo(driver);
        SelecionPasajeDeVuelo.rederigirOferta();

        //pagina 3
        pasajeMasBarato = new JetSmartPasajesMasBaratoVuelo(driver);
        pasajeMasBarato.fechaProximaBarata();

        //pagina 4
        precioBajo = new JetsmartPrecioBajoVuelo(driver);
        precioBajo.preciobaratovuelo();

        //pagina 5
        EleccionPackVuelo = new JetSmartEleccionPackVuelo(driver);
        EleccionPackVuelo.packVuelo();

        //pagina 6
        Precio24hrsVuelo = new JetSmartFijarPrecio24hrsVuelo(driver);
        Precio24hrsVuelo.fijarPrecio();

        //pagina 7
        DetallePasajeroVuelo = new JetSmartDetallePasajeroVuelo(driver);
        DetallePasajeroVuelo.selecionarbtnPagar();

    }
}


