package bctsoft.grupo5.pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import bctsoft.grupo5.pageobject.base.SeleniumBase;

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
