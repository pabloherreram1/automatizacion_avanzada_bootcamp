package automationcraft.testcreation.jetsmartGrupo5.pages;

import bctsoft.grupo5.pageobject.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class JetSmartEleccionPackVuelo extends SeleniumBase{
    public JetSmartEleccionPackVuelo(WebDriver driver) {
        super(driver);
    }

    //Repositorio de Eleccion de pack de vuelo
    private By btnLoQuiero = By.cssSelector("button.bundle-button:not([style*='display: none'])");
    private By ContainerBtnLoquiero = By.cssSelector("flight-fee div.bundles-container.hidden-xs div.bundle-container:not(.simple,.full)");

    public void packVuelo() throws InterruptedException {
        waitElementToBeClickable(ContainerBtnLoquiero, 10);
        sleep(500);
        findElement(btnLoQuiero, findElement(ContainerBtnLoquiero)).click();
    }
}


