package automationcraft.testcreation.jetsmartGrupo5.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import bctsoft.grupo5.pageobject.base.SeleniumBase;

public class JetSmartUltimaVentaVuelo extends SeleniumBase{

    public JetSmartUltimaVentaVuelo(WebDriver driver) {
        super(driver); }

    private By paymentText = By.cssSelector("div.fc-payment-message");
    public void verificarPago(){
        waitElementToBeClickable(paymentText,10);
        Assert.assertEquals("https://booking.jetsmart.com/V2/Payment",getURL());
    }
}
