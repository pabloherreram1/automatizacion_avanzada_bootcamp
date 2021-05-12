package automationcraft.testcreation.jetsmartGrupo5.pages;

import bctsoft.grupo5.pageobject.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JetSmartPasajesMasBaratoVuelo extends SeleniumBase{
    public JetSmartPasajesMasBaratoVuelo(WebDriver driver) {
        super(driver);
    }

    //Repositorio pasajes Mas barato
    private By btnFechaProxima = By.xpath("//div[contains(text(),'junio')]");
    private By btnContinuarPasajeBarato = By.xpath("//button[@id='calendarSubmit']");


    public void fechaProximaBarata(){
        waitElementToBePresent(btnFechaProxima, 5);
        if(isDisplayed(btnFechaProxima)){
            click(btnFechaProxima);
            click(btnContinuarPasajeBarato);
        }
    }

}


