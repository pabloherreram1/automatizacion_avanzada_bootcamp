package automationcraft.testcreation.jetsmartGrupo5.pages;

import bctsoft.grupo5.pageobject.base.SeleniumBase;
import org.junit.Assert;
import org.openqa.selenium.*;

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
    private By resultados = By.cssSelector("div.sr_item");
    private By cantFiltroAplicados = By.cssSelector("div.barrel_o_filters a");

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

    public void verificarQueHayAlMenos1Resultado(){
        waitNumberOfElementsToBeMoreThan(resultados,0);
        int cantResultados = findElements(resultados).size();
        Assert.assertTrue(cantResultados>0);
    }

    public void verificar3filtrosAplicados() throws InterruptedException {
        waitElementDesappear(overlayFiltros);
        sleep(500);
        Assert.assertEquals(3,findElements(cantFiltroAplicados).size());
    }
}


