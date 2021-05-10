package automationcraft.testcreation.jetsmartGrupo5.steps;

import automationcraft.engine.selenium.DriverFactory;
import automationcraft.testcreation.jetsmartGrupo5.pages.JetSmartHomePage;
import automationcraft.testcreation.jetsmartGrupo5.pages.JetSmartInicioSesionPage;

public class StepsModuloLoginG5 {
    private JetSmartHomePage homePageG5 = new JetSmartHomePage(DriverFactory.getDriver());
    private JetSmartInicioSesionPage inicioSesionPageG5 = new JetSmartInicioSesionPage(DriverFactory.getDriver());
}
