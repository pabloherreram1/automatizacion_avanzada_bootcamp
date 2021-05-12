package automationcraft.testcreation.jetsmartGrupo5.pages;

import bctsoft.grupo5.pageobject.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JetSmartResultado2Traslado extends SeleniumBase{

    public JetSmartResultado2Traslado(WebDriver driver){
        super(driver);
    }

    //Repositorios objetos De Traslado
    private By btnReservarNow = By.xpath("//button[@class='ct-btn ct-btn-p ']");

    public void reservarAhora(){
        waitElementToBeClickable(btnReservarNow, 20);
        if(isDisplayed(btnReservarNow)){
            click(btnReservarNow);
        }
    }

}
