package automationcraft.testcreation.jetsmartGrupo5.pages;

import bctsoft.grupo5.pageobject.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JetSmartSeleccionDePasajeVuelo extends SeleniumBase{
    public JetSmartSeleccionDePasajeVuelo(WebDriver driver) {
        super(driver);
    }

    //Repositorio de Seleccion de Pasaje
    private By btnMasBarato = By.cssSelector("div.flight-switch button.flight-switch-btn");

    //Selecionar el Boton
    public void rederigirOferta(){
        if(isDisplayed(btnMasBarato)){
            click(btnMasBarato);
        }
    }
}

