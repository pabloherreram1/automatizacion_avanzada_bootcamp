package automationcraft.testcreation.jetsmartGrupo5.steps;

import automationcraft.engine.selenium.DriverFactory;
import automationcraft.testcreation.jetsmartGrupo5.pages.JetSmartHomePage;
import automationcraft.testcreation.jetsmartGrupo5.pages.JetSmartInicioSesionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepsModuloLoginG5 {
    private JetSmartHomePage homePageG5 = new JetSmartHomePage(DriverFactory.getDriver());
    private JetSmartInicioSesionPage inicioSesionPageG5 = new JetSmartInicioSesionPage(DriverFactory.getDriver());
    private String titulo;

    @Given("El usuario ingresa a {String}")
    public void El_usuario_ingresa(){
        homePageG5.goToUrl("https://jetsmart.com/cl/es/");
        homePageG5.cerrarModuloSuscribete();
        homePageG5.btnInicioSesion();

        inicioSesionPageG5.waitInputLogin();
    }
    @When("Ingreso al formulario Iniciar Sesion")
    public void Ingreso_al_formulario_Iniciar_Sesion(){
        inicioSesionPageG5.iniciarSesion();
    }


}
