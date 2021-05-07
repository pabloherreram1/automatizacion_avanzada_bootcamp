package bctsoft.grupo5.pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import bctsoft.grupo5.pageobject.base.SeleniumBase;

public class JetSmartPaquetesLondresHoteles extends SeleniumBase {
    public JetSmartPaquetesLondresHoteles(WebDriver driver) {
        super(driver);
    }

    private By ContainerFiltros = By.cssSelector("form[id='filterbox_wrap'] div.filterbox");
    private By SpanFiltros = By.cssSelector("span:not(.bui-switch__indicator");
    private By SpanLabel = By.cssSelector("span.filter_label");
    private By btnFiltroPresupuesto = By.cssSelector("span:not(.bui-switch__indicator)");
    private By bodyNoHover= By.cssSelector("body.no-hover");
    private By overlayFiltros = By.cssSelector("div.sr-usp-overlay.sr-usp-overlay--wide");


    String filtroPresupuesto = "";
    String filtroPop = "";
    String filtroStars = "";
    public void esperaDeResultados(){
        waitNmberOfElementsToBe(bodyNoHover,0);
    }
    public void esperaDeFiltrosAplicados(){
        waitNmberOfElementsToBe(overlayFiltros,0);
    }

    public void selecionFiltroPresupuesto(){
        WebElement filtroDeseado = null;
        for (WebElement object: findElements(ContainerFiltros)) {
            String fnlist = object.getText();
            if(fnlist.contains("Tu presupuesto (por noche)")){
                System.out.println("Entre en el PRIMER IF");
                filtroDeseado = object;
                filtroPresupuesto = findElement(SpanFiltros, object).getText();
                filtroDeseado.findElement(btnFiltroPresupuesto).click();
            }

        }
    }

    public void SelecionFiltroPopulares(){
        WebElement filtroDeseado = null;
        for (WebElement object: findElements(ContainerFiltros)) {
            String nombreFiltro = object.getText();
            if(nombreFiltro.contains("Filtros populares")){
                System.out.println("Le asigne un nuevo object en popu");
                filtroDeseado = object;
            }
        }
        for (WebElement filtro: findElements(SpanFiltros,filtroDeseado)) {
            String nombreFiltro =  filtro.getText();
            if(nombreFiltro.contains("Hoteles")){
                filtro.click(); //Click en el filtro DE HOTELES
                filtroPop = filtro.getText();
            }
        }
    }

    public void SelecionFiltroEstrellas(){
        WebElement filtroDeseado = null;
        for (WebElement object: findElements(ContainerFiltros)) {
            String nombreFiltro = object.getText();
            if(nombreFiltro.contains("Estrellas")){
                filtroDeseado = object;
            }
        }
        for (WebElement filtro: findElements(SpanFiltros, filtroDeseado)) {
            String nombreFiltro =  filtro.getText();
            if(nombreFiltro.contains("3 estrellas")){
                filtro.click(); //Click en el filtro DE 3 ESTRELLAS
                filtroStars = filtro.getText();
            }
        }
    }
}


