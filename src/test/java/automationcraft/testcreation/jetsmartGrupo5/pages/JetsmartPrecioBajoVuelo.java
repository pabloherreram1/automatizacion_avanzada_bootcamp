package automationcraft.testcreation.jetsmartGrupo5.pages;

import bctsoft.grupo5.pageobject.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JetsmartPrecioBajoVuelo extends SeleniumBase{
    public JetsmartPrecioBajoVuelo(WebDriver driver) {
        super(driver);
    }

    //Respositorio de Precio barato
    private By btnPrecio = By.xpath("//div[@class='smart-fee nowrap big ']");

    public void preciobaratovuelo(){
        if (isDisplayed(btnPrecio)){
            click(btnPrecio);
        }
    }
}


