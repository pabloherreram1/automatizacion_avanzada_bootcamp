package automationcraft.testcreation.jetsmartGrupo5.steps;

import automationcraft.engine.selenium.DriverFactory;
import automationcraft.testcreation.jetsmartGrupo5.selenium.SeleniumBase;
import automationcraft.testcreation.jetsmartGrupo5.pages.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class StepsModuloLoginG5 {
    private JetSmartHomePage homePageG5 = new JetSmartHomePage(DriverFactory.getDriver());
    private JetSmartInicioSesionPage inicioSesionPageG5 = new JetSmartInicioSesionPage(DriverFactory.getDriver());;

    @Given("El usuario ingresa a {string}")
    public void El_usuario_ingresa(String string){
        homePageG5.goToUrl("https://jetsmart.com/cl/es/");
        homePageG5.cerrarModuloSuscribete();

    }
    @When("Ingreso al formulario Iniciar Sesion")
    public void Ingreso_al_formulario_Iniciar_Sesion(){
        homePageG5.btnInicioSesion();
    }

    @When("Escribo en el campo Correo Electronico {string}")
    public void Escribo_en_el_campo_Correo_Electronico(String string){
        inicioSesionPageG5.ingresarCorreo();
    }

    @When("Escribo en el campo contrasena {string}")
    public void Escribo_en_el_campo_contrasena(String string){
        inicioSesionPageG5.ingresarPass();
    }

    @When("Seleciono el boton {string} inicio")
    public void Seleciono_el_boton(String string){
        inicioSesionPageG5.btnInicio();
    }

    @Then("Inicia sesion Correctamente")
    public void Inicia_sesion_Correctamente(){
        Assert.assertEquals("pablo Ignacio Herrera Mateluna",homePageG5.verificoInicioSesion());
    }

}