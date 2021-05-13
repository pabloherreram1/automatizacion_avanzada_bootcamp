package automationcraft.testcreation.jetsmartGrupo5.pages;

import bctsoft.grupo5.pageobject.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JetSmartResultado3Traslado extends SeleniumBase{
    public JetSmartResultado3Traslado(WebDriver driver){
        super(driver);
    }

    //Repositorios objetos De Traslado
    private By txtNombrePasajero = By.cssSelector("#gt-customer-name");
    private By txtCorreo = By.cssSelector("#gt-customer-email");
    private By txtConfirmarCorreo = By.cssSelector("#gt-customer-confirm-email");
    private By btnCodigoArea = By.cssSelector("#gt-customer-country-code");
    private By clickCodigoArea = By.xpath("//option[contains(text(),'Islas Caimán (+1)')]");
    private By txtNumeroCelular = By.cssSelector("#gt-customer-mobile-number");
    private By txtNumeroVuelo = By.cssSelector("#gt-pickup-flight-number");
    private By btnIrCaja = By.xpath("//button[contains(text(),'Ir a caja')]");

    public void nombrePasajeroT(){
        if (isDisplayed(txtNombrePasajero)){
            type("Raul el perro", txtNombrePasajero);
        }
    }

    public void correoPasajeroT(){
        if (isDisplayed(txtCorreo)){
            type("Raul@gmail.com", txtCorreo);
        }
    }

    public void confirmarCorreoPasajeroT(){
        if (isDisplayed(txtConfirmarCorreo)){
            type("Raul@gmail.com", txtConfirmarCorreo);
        }
    }

    public void codigoAresPasajeroT(){
        if (isDisplayed(btnCodigoArea)){
            click(btnCodigoArea);
        }
    }

    public void numeroCelularPasajeroT(){
        if (isDisplayed(clickCodigoArea)){
            waitElementToBeClickable(clickCodigoArea, 10);
            type("88839039", txtNumeroCelular);
        }
    }

    public void numeroVueloPasajeroT(){
        if (isDisplayed(txtNumeroVuelo)){
            type("CD123", txtNumeroVuelo);
        }
    }

    public void btnIraCajaT(){
        if (isDisplayed(btnIrCaja)){
            click(btnIrCaja);
        }
    }


}
