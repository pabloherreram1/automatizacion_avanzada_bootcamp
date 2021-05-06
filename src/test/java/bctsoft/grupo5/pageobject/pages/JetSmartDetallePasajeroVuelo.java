package bctsoft.grupo5.pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import bctsoft.grupo5.pageobject.base.SeleniumBase;


public class JetSmartDetallePasajeroVuelo extends SeleniumBase{
    public JetSmartDetallePasajeroVuelo(WebDriver driver) {
        super(driver);
    }

    private By btnPagarVuelo = By.cssSelector("div.passengers-button-container button:not(.disabled)");

    public void selecionarbtnPagar(){
        if(isDisplayed(btnPagarVuelo)){
            waitElementToBePresent(btnPagarVuelo, 5);
            click(btnPagarVuelo);
        }
    }
}


