package bctsoft.Grupo5.pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import bctsoft.Grupo5.pageobject.base.SeleniumBase;

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
