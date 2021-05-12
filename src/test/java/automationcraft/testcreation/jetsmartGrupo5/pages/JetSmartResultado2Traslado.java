package automationcraft.testcreation.jetsmartGrupo5.pages;

import bctsoft.grupo5.pageobject.base.SeleniumBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JetSmartResultado2Traslado extends SeleniumBase{

    public JetSmartResultado2Traslado(WebDriver driver){
        super(driver);
    }

    //Repositorios objetos De Traslado
    private By btnReservarNow = By.xpath("//button[@class='ct-btn ct-btn-p ']");
    private By sinResultadosT = By.cssSelector("div.ct-availability div.ct-panel-title");
    public void reservarAhora(){
        waitElementToBeClickable(btnReservarNow, 20);
        if(isDisplayed(btnReservarNow)){
            click(btnReservarNow);
        }
    }

    public void verificarQueNoHayTrasladosDisp(){
        waitElementToBeClickable(sinResultadosT,15);
        Assert.assertEquals("Lamentablemente no se han encontrado opciones de traslado…",getText(sinResultadosT));
    }



}
