package bctsoft.grupo5.pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import bctsoft.grupo5.pageobject.base.SeleniumBase;

public class JetSmartFijarPrecio24hrsVuelo extends SeleniumBase{
    public JetSmartFijarPrecio24hrsVuelo(WebDriver driver) {
        super(driver);
    }

    private By btnLoquieroFijarPrecio = By.cssSelector("button.fare-lock-button");
    private By btnOption24hrs = By.cssSelector("button.fare-lock-duration-btn");
    private By btnContinuar = By.cssSelector("div.flight-button-container button:not([style*='display: none'])");
    private By ContainerbtnContinuar = By.cssSelector("div.flight-button-container button:not([style*='display: none'])");
    private By vueloSeleccionado = By.cssSelector("div.selected-flight.show-offers");
    private By loaderOverlay = By.cssSelector("iv.rt-loader-overlay");
    private By cuadroOpcionesFijarPrecio = By.cssSelector("div.fare-lock-duration-selector.active");
    public void fijarPrecio() throws InterruptedException {
        waitElementToBePresent(vueloSeleccionado,5);
        waitElementDesappear(loaderOverlay);
        if(isDisplayed(btnLoquieroFijarPrecio)){
            waitElementToBeClickable(btnLoquieroFijarPrecio,10);
            click(btnLoquieroFijarPrecio);

            waitElementToBeClickable(cuadroOpcionesFijarPrecio,10);
            waitElementToBeClickable(btnOption24hrs, 10);
            click(btnOption24hrs);

            waitElementDesappear(loaderOverlay);
            waitElementToBeClickable(ContainerbtnContinuar, 10);
            sleep(500);
            click(btnContinuar);
            click(btnContinuar);
        }
    }
}


