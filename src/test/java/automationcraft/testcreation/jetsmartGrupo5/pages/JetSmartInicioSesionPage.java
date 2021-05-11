package automationcraft.testcreation.jetsmartGrupo5.pages;

import bctsoft.grupo5.pageobject.base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class JetSmartInicioSesionPage extends SeleniumBase{

    public JetSmartInicioSesionPage(WebDriver driver){
        super(driver);
    }

    //Repositorios objetos Iniciar sesion
    private By txtCorreo = By.cssSelector("input[name='username']");
    private By txtPassword = By.cssSelector("input[name='password']");
    private By btnInicioSesion = By.xpath("//button[contains(text(),'Inicia sesión')]");

    public void waitInputLogin(){
        waitElementToBePresent(txtCorreo,10);
    }

    public void ingresarCorreo(){
        if(isDisplayed(txtCorreo)){
            type("pabloherreram1@hotmail.com", txtCorreo);
        }
    }

    public void ingresarPass(){
        if(isDisplayed(txtPassword)){
            type("pabloprueba123", txtPassword);
        }
    }

    public void btnInicio(){
        if(isDisplayed(btnInicioSesion)){
            click(btnInicioSesion);
        }
    }
}


