package automationcraft.testcreation.jetsmartGrupo5.steps;

import automationcraft.engine.selenium.DriverFactory;
import automationcraft.testcreation.jetsmartGrupo5.pages.JetSmartHomePage;
import automationcraft.testcreation.jetsmartGrupo5.pages.JetSmartPaquetesLondresHoteles;
import automationcraft.testcreation.jetsmartGrupo5.pages.JetSmartSinPaqueteHotelesBajo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;

import java.text.ParseException;

public class StepsModuloHotelG5 {
    private JetSmartHomePage homePageG5 = new JetSmartHomePage(DriverFactory.getDriver());
    private JetSmartSinPaqueteHotelesBajo SinPaqueteHotelesBajo = new JetSmartSinPaqueteHotelesBajo(DriverFactory.getDriver());
    private JetSmartPaquetesLondresHoteles LondresHoteles = new JetSmartPaquetesLondresHoteles(DriverFactory.getDriver());
    @Given("soy el usuario e ingreso a la pagina {string} hotel")
    public void soy_el_usuario_e_ingreso_a_la_pagina(String string){
        homePageG5.goToUrl("https://jetsmart.com/cl/es/");
        homePageG5.cerrarModuloSuscribete();
    }

    @When("Ingreso al formulario hoteles")
    public void Ingreso_al_formulario_hoteles(){
        homePageG5.ingresoFormHotel();
    }

    @And("selecciono {string} en el campo Origen hotel bajo")
    public void selecciono_en_el_campo_Origen_hotel_bajo(String string){
        homePageG5.ingresoOrigenHotelBajo();
    }

    @And("selecciono {string} en el campo Origen hotel")
    public void selecciono_en_el_campo_Origen_hotel(String string){
        homePageG5.ingresoOrigenHotel(string);
    }

    @And("Agregar primera fecha disponible")
    public void Agregar_primera_fecha_disponible() throws ParseException {
        homePageG5.primeraFechaDisponibleHotel();
    }

    @And("Agregar fecha final de alojamiento de dos semanas posterior")
    public void Agregar_fecha_final_de_alojamiento_de_dos_semanas_posterior() throws ParseException {
        homePageG5.segundaFechaDisponibleHotel();
    }

    @And("presionar Buscar hotel")
    public void presionar_Buscar_hotel(){
        homePageG5.btnBuscarHotel();
    }

    @And("Selecionar el primer resultado del Checkbox en la categoria presupuesto")
    public void Selecionar_el_primer_resultado_del_Checkbox_en_la_categoria_presupuesto(){
        LondresHoteles.selecionFiltroPresupuesto();
    }

    @And("Selecionar el checkbox de filtros populares la opcion Hoteles")
    public void Selecionar_el_checkbox_de_filtros_populares_la_opcion_Hoteles(){
        LondresHoteles.SelecionFiltroPopulares();
    }

    @And("Selecionar el Checkbox de estrellas la opcion 3 Estrellas")
    public void Selecionar_el_Checkbox_de_estrellas_la_opcion_3_Estrellas(){
        LondresHoteles.SelecionFiltroEstrellas();
    }

    @Then("Se filtra los resultados y solo se muestran resultados pertenecientes a los 3 filtros aplicados")
    public void Se_filtra_los_resultados_y_solo_se_muestran_resultados_pertenecientes_a_los_3_filtros_aplicados() throws InterruptedException {
        LondresHoteles.verificar3filtrosAplicados();
    }

    @Then("Se muestra al menos un resultado alojamiento en Londres con una habitación")
    public void Se_muestra_al_menos_un_resultado_londres_una_habitacion(){
        LondresHoteles.verificarQueHayAlMenos1Resultado();
    }

    @Then("No se encuentra paquetes de alojamiento en Antartica")
    public void No_se_encuentra_paquetes_de_alojamiento_en_Antartica(){
        SinPaqueteHotelesBajo.alertaHotelbajo();
    }


}
