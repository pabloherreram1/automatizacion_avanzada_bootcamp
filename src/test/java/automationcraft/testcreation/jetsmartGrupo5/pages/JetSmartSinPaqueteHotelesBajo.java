package automationcraft.testcreation.jetsmartGrupo5.pages;

import bctsoft.grupo5.pageobject.base.SeleniumBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class JetSmartSinPaqueteHotelesBajo extends SeleniumBase {
    public JetSmartSinPaqueteHotelesBajo(WebDriver driver) {
        super(driver);
    }

    //Repositorio
    private By dato = By.cssSelector("div.sr_header");

    public void alertaHotelbajo(){
        waitVisibilityOfElement(dato);
        Assert.assertEquals("Hay 0 alojamientos disponibles en este destino y alrededores",getText(dato));
    }
}
