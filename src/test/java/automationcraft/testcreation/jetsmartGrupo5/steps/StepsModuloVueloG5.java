package automationcraft.testcreation.jetsmartGrupo5.steps;

import automationcraft.engine.selenium.DriverFactory;
import automationcraft.testcreation.jetsmartGrupo5.pages.*;
import bctsoft.grupo5.pageobject.pages.JetSmartFijarPrecio24hrsVuelo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.text.ParseException;

public class StepsModuloVueloG5 {
    private JetSmartHomePage homePageG5 = new JetSmartHomePage(DriverFactory.getDriver());
    private JetSmartSeleccionDePasajeVuelo SeleccionDePasajeVuelo = new JetSmartSeleccionDePasajeVuelo(DriverFactory.getDriver());
    private JetSmartPasajesMasBaratoVuelo PasajesMasBaratoVuelo = new JetSmartPasajesMasBaratoVuelo(DriverFactory.getDriver());
    private JetsmartPrecioBajoVuelo PrecioBajoVuelo = new JetsmartPrecioBajoVuelo(DriverFactory.getDriver());
    private JetSmartEleccionPackVuelo EleccionPackVuelo = new JetSmartEleccionPackVuelo(DriverFactory.getDriver());
    private JetSmartFijarPrecio24hrsVuelo FijarPrecio24hrsVuelo = new JetSmartFijarPrecio24hrsVuelo(DriverFactory.getDriver());
    private JetSmartDetallePasajeroVuelo DetallePasajeroVuelo = new JetSmartDetallePasajeroVuelo(DriverFactory.getDriver());
    private JetSmartUltimaVentaVuelo UltimaVentaVuelo = new JetSmartUltimaVentaVuelo(DriverFactory.getDriver());
    @Given("soy el usuario e ingreso a la pagina {string}")
    public void soy_el_usuario_e_ingreso_a_la_pagina(String string){
        homePageG5.goToUrl("https://jetsmart.com/cl/es/");
        homePageG5.cerrarModuloSuscribete();
    }

    @And("selecciono {string} en el campo Origen")
    public void selecciono_en_el_campo_Origen(String string){
        homePageG5.ingresoOrigenVuelo(string);
    }

    @And("selecciono {string} en el campo Destino")
    public void selecciono_en_el_campo_Destino(String string){
        homePageG5.ingresoDestinoVueloBajo(string);
    }

    @And("selecciono {string} en el campo Destino medio")
    public void selecciono_en_el_campo_Destino_medio(String string){
        homePageG5.ingresoDestinoVueloMedio(string);
    }

    @And("Seleciono el Checkbox de Ida")
    public void Seleciono_el_Checkbox_de_Ida(){
        homePageG5.checkidaVuelo();
    }
    @And("selecciono ckeck ida y vuelta")
    public void selecciono_ckeck_ida_y_vuelta(){
        homePageG5.checkIdaYVueltaMedio();
    }

    @And("Seleciona la primera fecha disponible ida")
    public void Seleciona_la_primera_fecha_disponible_ida(){
        homePageG5.primeraFechaDisponibleTraslado();
    }

    @And("Seleciono la vuelta dos semanas posterior a la fecha de ida")
    public void Seleciono_la_vuelta_dos_semanas_posterior_a_la_fecha_de_ida() throws ParseException {
        homePageG5.vueltaDosSemanasPosteriorTraslado();
    }

    @And("Seleciono un Adulto")
    public void Seleciono_un_Adulto(){
        homePageG5.select1Adulto();
    }

    @And("Seleciono dos ninos")
    public void Seleciono_dos_ninos() throws InterruptedException {
        homePageG5.select2nino();
    }

    @And("presiono BuscarSmart")
    public void presiono_BuscarSmart(){
        homePageG5.presionarBotonBuscarVuelo();
    }

    @And("Seleciono el boton Vuelo Mas barato")
    public void Seleciono_el_boton(){
        SeleccionDePasajeVuelo.rederigirOferta();
    }


    @And("Selecion la primera fecha de vuelo disponible del proximo mes")
    public void Selecion_la_primera_fecha_de_vuelo_disponible_del_proximo_mes() throws InterruptedException {
        PasajesMasBaratoVuelo.fechaProximaBarata();
    }

    @And("Presiono el boton continuar")
    public void Presiono_el_boton_continuar() throws InterruptedException {
        PasajesMasBaratoVuelo.ponerContinuar();
    }

    @And("presiono precio vuelo")
    public void presiono_precio_vuelo(){
        PrecioBajoVuelo.preciobaratovuelo();
    }

    @And("Seleciono el Pack de vuelo mas barato")
    public void Seleciono_el_Pack_de_vuelo_mas_barato() throws InterruptedException {
        EleccionPackVuelo.packVuelo();
    }

    @And("fijo precio por 24hrs")
    public void fijo_precio_por_24hrs() throws InterruptedException {
        FijarPrecio24hrsVuelo.fijarPrecio();
    }

    @And("Clickear en Continuar")
    public void Clickear_en_Continuar() throws InterruptedException {
        FijarPrecio24hrsVuelo.continuarBtn24hrs();
    }

    @And("Clickear en pagar ahora")
    public void Clickear_en_pagar_ahora(){
        DetallePasajeroVuelo.selecionarbtnPagar();
    }

    @Then("Se muestra en la pantalla de medios de pago, la fecha cambiada de IDA con la nueva fecha de vuelo más barata")
    public void Se_muestra_en_la_pantalla_de_medios_de_pago_la_fecha_cambiada_de_IDA_con_la_nueva_fecha_de_vuelo_mas_barata(){
        UltimaVentaVuelo.verificarPago();
    }

    @Then("Se muestra los vuelos en las fechas y lugares correspondientes")
    public void Se_muestra_los_vuelos_en_las_fechas_y_lugares_correspondientes(){
        homePageG5.alertaVueloMedio();
    }

    @Then("Aparece la alerta {string}")
    public void Aparece_la_alerta(String string){
        homePageG5.alertaDeVueloBajo();
    }


}
