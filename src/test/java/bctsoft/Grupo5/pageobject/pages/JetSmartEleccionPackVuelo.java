package bctsoft.Grupo5.pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import bctsoft.Grupo5.pageobject.base.SeleniumBase;


public class JetSmartEleccionPackVuelo extends SeleniumBase{
    public JetSmartEleccionPackVuelo(WebDriver driver) {
        super(driver);
    }

    //Repositorio de Eleccion de pack de vuelo
    private By btnLoQuiero = By.cssSelector("button.bundle-button:not([style*='display: none'])");
    private By ContainerBtnLoquiero = By.cssSelector("flight-fee div.bundles-container.hidden-xs div.bundle-container:not(.simple,.full)");

    public void packVuelo(){
        waitElementToBeClickable(ContainerBtnLoquiero, 5);
        findElement(btnLoQuiero, findElement(ContainerBtnLoquiero)).click();
    }
}
