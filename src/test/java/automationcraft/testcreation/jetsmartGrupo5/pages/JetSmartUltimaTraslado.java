package automationcraft.testcreation.jetsmartGrupo5.pages;

import bctsoft.grupo5.pageobject.base.SeleniumBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JetSmartUltimaTraslado extends SeleniumBase {

    public JetSmartUltimaTraslado(WebDriver driver){
        super(driver);
    }

    private By resultadoTraslado = By.cssSelector("div.gt-payment-summary h3");

    public void verificarResumenPago(){
        waitElementToBeClickable(resultadoTraslado,10);
        Assert.assertEquals("Resumen del pago",getText(resultadoTraslado));
    }
}

