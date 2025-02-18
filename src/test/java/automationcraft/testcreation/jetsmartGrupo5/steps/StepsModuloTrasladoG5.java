package automationcraft.testcreation.jetsmartGrupo5.steps;

import automationcraft.engine.selenium.DriverFactory;
import automationcraft.testcreation.jetsmartGrupo5.pages.JetSmartHomePage;
import automationcraft.testcreation.jetsmartGrupo5.pages.JetSmartResultado2Traslado;
import automationcraft.testcreation.jetsmartGrupo5.pages.JetSmartResultado3Traslado;
import automationcraft.testcreation.jetsmartGrupo5.pages.JetSmartUltimaTraslado;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.ElementClickInterceptedException;

import java.text.ParseException;

public class StepsModuloTrasladoG5 {
    private JetSmartHomePage homePageG5 = new JetSmartHomePage(DriverFactory.getDriver());
    private JetSmartResultado2Traslado Resultado2Traslado = new JetSmartResultado2Traslado(DriverFactory.getDriver());
    private JetSmartResultado3Traslado Resultado3Traslado = new JetSmartResultado3Traslado(DriverFactory.getDriver());
    private JetSmartUltimaTraslado UltimaTraslado = new JetSmartUltimaTraslado(DriverFactory.getDriver());

    @Given("soy el usuario e ingreso a la pagina {string} traslado")
    public void soy_el_usuario_e_ingreso_a_la_pagina_traslado(String string){
        homePageG5.goToUrl("https://jetsmart.com/cl/es/");
        homePageG5.cerrarModuloSuscribete();
    }

    @When("Ingreso al formulario Traslados")
    public void Ingreso_al_formulario_Traslados(){
        homePageG5.ingresarFormTraslado();
    }

    @And("Seleciono radio boton {string}")
    public void Seleciono_radio_boton(String string){
        homePageG5.selectRadiobtn();
    }
    @And("Seleciono radio boton Ida y vuelta")
    public void Seleciono_radio_boton(){
        homePageG5.selectRadiobtnIdaYvuelta();
    }
    @And("selecciono {string} en el campo Origen traslado")
    public void selecciono_en_el_campo_Origen_traslado(String string){
        homePageG5.ingresarOrigenTraslado(string);
    }

    @And("selecciono {string} en el campo Destino traslado")
    public void selecciono_en_el_campo_Destino_traslado(String string){
        homePageG5.ingresarDestinoTraslado(string);
    }

    @And("Seleciono radio boton ida y vuelta")
    public void Seleciono_radio_boton_ida_y_vuelta(){

    }


    @And("Selecciono la primera fecha disponible")
    public void Selecciono_la_primera_fecha_disponible() throws ParseException, InterruptedException {
        homePageG5.firstFechadisponible();
    }

    @And("Seleciono una fecha de ida en 30 dias")
    public void Seleciono_una_fecha_de_ida_en_30_dias() throws ParseException, InterruptedException {
        homePageG5.seleccionoFechaIda30();
    }

    @And("Seleciono una fecha de vuelta en 31 dias de la fecha actual")
    public void Seleciono_fecha_vuelta_en_31_dias_de_la_fecha_actual() throws ParseException, InterruptedException {
        homePageG5.Fecha_1_dia_despues_de_la_fecha_ida();
    }

    @And("Selecciono el horario de las 13:00hrs")
    public void Selecciono_el_horario_de_las_13hrs(){
        homePageG5.horarioTrasladoBajo();
    }

    @And("Seleciono el horario de las 9AM")
    public void Seleciono_el_horario_de_las_9AM(){
        homePageG5.horario9am();
    }


    @And("Selecciono un pasajero")
    public void Selecciono_un_pasajero(){
        homePageG5.seleccionUnPasajeroTrasladoBajo();
    }

    @And("Seleciona 2 pasajeros")
    public void Seleciona_2_pasajeros(){
        homePageG5.seleccionDosPasajeroTrasladoAlto();
    }

    @And("presiono el boton Buscar traslado")
    public void presiono_el_boton_Buscar_traslado(){
        try {
            homePageG5.btnTrasladoBajo();
        }catch (ElementClickInterceptedException e) {
            homePageG5.btnTrasladoMedio();
        }
    }

    @And("Click en reservar ahora en el primer resultado")
    public void Click_en_reservar_ahora_en_el_primer_resultado(){
        Resultado2Traslado.reservarAhora();
    }

    @And("Ingresar nombre del pasajero {string}")
    public void Ingresar_nombre_del_pasajero(String string){
        Resultado3Traslado.nombrePasajeroT();
    }

    @And("Ingresar email del pasajero {string}")
    public void Ingresar_email_del_pasajero(String string){
        Resultado3Traslado.correoPasajeroT();
    }

    @And("Ingresar email de confirmacion del pasajero {string}")
    public void Ingresar_email_de_confirmacion_del_pasajero(String string){
        Resultado3Traslado.confirmarCorreoPasajeroT();
    }

    @And("Ingresar codigo pais {string} del pasajero")
    public void Ingresar_codigo_pais_del_pasajero(String string){
        Resultado3Traslado.codigoAresPasajeroT();
    }

    @And("Ingresar numero celular del pasajero {string}")
    public void Ingresar_numero_celular_del_pasajero(String string){
        Resultado3Traslado.numeroCelularPasajeroT();
    }

    @And("Ingresar numero de vuelo del pasajero {string}")
    public void Ingresar_numero_de_vuelo_del_pasajero(String string){
        Resultado3Traslado.numeroVueloPasajeroT();
    }

    @And("presionar boton {string} T")
    public void presionar_boton_T(String string){
        Resultado3Traslado.btnIraCajaT();
    }

    @Then("Se muestra en pantalla los medios de pago disponibles y los datos del transporte")
    public void Se_muestra_en_pantalla_los_medios_de_pago_disponibles_y_los_datos_del_transporte() {
        UltimaTraslado.verificarResumenPago();
    }

    @Then("Se muestran las opciones de traslado del aeropueto de España, La Serena.")
    public void Se_muestran_las_opciones_de_traslado_del_aeropuerto_de_Esp(){
        homePageG5.alertaTrasladoBajo();
    }

    @Then("Se muestra que no se han encontrado resultados para el traslado")
    public void Se_muestra_que_no_se_han_encontrado_resultados_para_el_traslado(){
        Resultado2Traslado.verificarQueNoHayTrasladosDisp();
    }

}
