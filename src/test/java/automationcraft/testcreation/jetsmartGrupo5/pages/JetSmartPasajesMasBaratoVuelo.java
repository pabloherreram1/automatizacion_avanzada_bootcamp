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


    public void fechaProximaBarata() throws InterruptedException {
        waitElementToBeClickable(btnFechaProxima,5);
        sleep(1000);
        if(isDisplayed(btnFechaProxima)){
            click(btnFechaProxima);
        }
    }

    public void ponerContinuar() throws InterruptedException {
        waitElementToBeClickable(btnContinuarPasajeBarato,5);
        sleep(500);
        if(isDisplayed(btnContinuarPasajeBarato)){
            click(btnContinuarPasajeBarato);
        }
    }

}


