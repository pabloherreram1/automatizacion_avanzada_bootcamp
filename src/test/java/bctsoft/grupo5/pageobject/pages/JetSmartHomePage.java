package bctsoft.grupo5.pageobject.pages;
import org.openqa.selenium.*;
import bctsoft.grupo5.pageobject.base.SeleniumBase;
import java.text.ParseException;
import java.util.List;

/**
 * URL: https://jetsmart.com/cl/es/
 * HomePage para automatizacion de casos de Pruebas
 */

public class JetSmartHomePage extends SeleniumBase{

    public JetSmartHomePage(WebDriver driver) {
        super(driver);
    }

    //repositorio objetos JetSmartHomePAge
    private  By modalIsShow = By.cssSelector("div.modal.fade.show");
    private By btnPopUpClose = By.xpath("//div[@class='modal-header']//button[@type='button']");
    private By txtNombreSuscribete = By.xpath("//input[@id='name']");
    private By txtApellidoSuscribete = By.xpath("//input[@id='lastname']");
    private By txtEmailSuscribete = By.xpath("//input[@id='email']");
    private By btnSuscribete = By.xpath("//span[contains(text(),'Suscríbete')]");
    private By btnIniciar = By.xpath("//span[contains(text(),'Inicia Sesión')]");


    //repositorio formulario Vuelos
    private By tabVuelo = By.cssSelector("div.dg-tab.dg-flights");
    private By txtOrigen = By.cssSelector("input[ref='from']");
    private By esperaOrigenCL = By.cssSelector("ul.dg-typing-results li[data-citycode='SCL']");
    private By txtDestino = By.cssSelector("input[ref='to']");
    private By esperaDestinoAR = By.cssSelector("ul.dg-typing-results li[data-citycode='BUE']");
    private By CheckIdayVuelta = By.cssSelector("label[for='sbReturnJourney']");
    private By CheckIda = By.cssSelector("label[for='sbOneWayJourney']");
    private By calendarIda = By.cssSelector("input[ref='fromDateElem']");
    private By calendarVuelta = By.cssSelector("input[ref='toDateElem']");
    private By listmeses = By.cssSelector("div.dayContainer");
    private By diastotales = By.cssSelector("span");
    private By diasInhabilitados = By.cssSelector("span.disabled");
    private By loaderTabVuelo = By.cssSelector("div.RTloader-parentoverflow");

    private By diaSelecionado = By.cssSelector("span.flatpickr-day.selected");
    private By calendarOpen = By.cssSelector("div.dg-calendar.open");
    private String txtAnteriorDiaVuelta = "div[ref='calendarInboundInside'] span[aria-label='";
    private String txtPosteriorDiaVuelta = "']:not(.nextMonthDay)";


    private By cajaopen = By.cssSelector("div.dg-quantity-dropdown.open");
    private By listPasajero = By.cssSelector("input[ref='paxSummary']");
    private By btnPasajeroIncrementoAdultos = By.cssSelector("pax-amount[ref='adults'] div[title='Increase Quantity']");
    private By btnPasajeroDecrementoAdultos = By.cssSelector("pax-amount[ref='adults'] div[title='Decrease Quantity']");
    private By btnPasajeroIncrementoNinos = By.cssSelector("pax-amount[ref='children'] div[title='Increase Quantity']");
    private By btnPasajeroDecrementoNinos = By.cssSelector("pax-amount[ref='children'] div[title='Decrease Quantity']");
    private By btnPasajeroIncrementoInfantes = By.cssSelector("pax-amount[ref='infants'] div[title='Increase Quantity']");
    private By btnPasajeroDecrementoInfantes = By.cssSelector("pax-amount[ref='infants'] div[title='Decrease Quantity']");
    private By btnOkPasajero = By.xpath("//button[contains(text(),'OK')]");

    private By btnBuscar = By.xpath("//button[@id='rt_button']");

    //repositorio formulario Hoteles
    private By btnHoteles = By.cssSelector("i.jsh-icon.jsh-bed");
    private By IframeHotel = By.cssSelector("div[id='hotel_container'] iframe");
    private By txtDestinoHotel = By.cssSelector("#b_destination");
    private By calendarIdaHotel = By.cssSelector("#checkInDate");
    private By calendarVueltaHotel = By.cssSelector("#checkoutDate");
    private By calendarioHotel = By.cssSelector("#ui-datepicker-div");
    private By diaDelMes = By.cssSelector("table td:not(.ui-state-disabled)");
    private By nombreDelMes = By.cssSelector("span.ui-datepicker-month");
    private By btnMesSiguiente = By.cssSelector("a.ui-datepicker-next");
    private By listHabitacionHotel = By.xpath("//*[contains(@name,'no_rooms')]  ");
    private By listAdultosHotel = By.xpath("//*[contains(@name,'group_adults')]");
    private By listNinosHotel = By.cssSelector("//*[contains(@name,'group_children')]");
    private By btnBuscarHotel = By.cssSelector("input[name='submit']");

    //Repositorio Formulario Traslado(Transporte)
    private By btnTraslado = By.cssSelector("i.jsh-van");
    private By IframeTraslado = By.cssSelector("div.dg-transfers iframe");
    private By radiobtnIda = By.cssSelector("span[ng-bind='labelOneWay']");
    private By radiobtnIdaVuelta = By.cssSelector("span[ng-bind='labelReturn']");
    private By txtAeropuertoOrigen = By.cssSelector("#input-pickup");
    private By txtAeropuertoDestino = By.cssSelector("#input-dropoff");
    private By calendarRecogidaTraslado = By.cssSelector("#input-pickup-date");
    private By listHorarioIda = By.cssSelector("#ct-time-picker-pick-up-input");
    private By calendarVueltaTraslado = By.cssSelector("#input-return-date");
    private By listHorarioVuelta = By.cssSelector("#ct-time-picker-drop-off-input");
    private By listPasajeroTraslado = By.cssSelector("#passenger-number-input");
    private By btnBuscarTraslado = By.cssSelector("button.ct-btn.ct-btn-p");



    //keyword Driven
    public void cerrarModuloSuscribete(){
        //waitElementToBePresent(btnPopUpClose, 5);
        do{
            try {
                click(btnPopUpClose);
            }catch (ElementClickInterceptedException e){
            }
        }while(elemetExist(modalIsShow));
    }


/*
    public void suscribirseEnPopUp(){
        if (isDisplayed(txtNombreSuscribete)){
            type("nombre",txtNombreSuscribete);
            type("apellido",txtApellidoSuscribete);
            type("email@email.em",txtEmailSuscribete);
            click(btnSuscribete);
        }
    }

 */

    //Vuelos
    public void formVueloAlto() throws InterruptedException {
        if(isDisplayed(tabVuelo)){
            type("Santiago", txtOrigen);
            click(txtOrigen);
            waitElementToBeClickable(findElement(esperaOrigenCL, findElement(tabVuelo)), 10);
            click(esperaOrigenCL);
            type("Buenos Aires", txtDestino);
            click(txtDestino);
            waitElementToBeClickable(findElement(esperaDestinoAR, findElement(tabVuelo)), 10);
            click(esperaDestinoAR);
            waitElementDesappear(loaderTabVuelo, findElement(tabVuelo));
            waitElementToBePresent(CheckIda, 3);
            click(CheckIda);
            click(calendarIda);

            for (WebElement mes: findElements(listmeses)) {
                boolean out = false;
                for (WebElement diaT: findElements(diastotales, mes)) {
                    if(!findElements(diasInhabilitados, mes).contains(diaT)){
                        diaT.click();
                        out = true;
                        break;
                    }
                }
                if(out==true)
                    break;
            }

            click(listPasajero);
            sleep(500);
            waitElementToBeClickable(cajaopen, 3);
            click(btnPasajeroIncrementoNinos);
            click(btnPasajeroIncrementoNinos);
            click(btnOkPasajero);
            click(btnBuscar);

        }
    }

    public void formVueloMedio() throws ParseException {
        if(isDisplayed(tabVuelo)){
            type("Santiago", txtOrigen);
            click(txtOrigen);
            waitElementToBeClickable(findElement(esperaOrigenCL, findElement(tabVuelo)), 10);
            click(esperaOrigenCL);
            type("Buenos Aires", txtDestino);
            click(txtDestino);
            waitElementToBeClickable(findElement(esperaDestinoAR, findElement(tabVuelo)), 10);
            click(esperaDestinoAR);
            waitElementDesappear(loaderTabVuelo, findElement(tabVuelo));
            waitElementToBePresent(CheckIdayVuelta, 3);
            click(CheckIdayVuelta);
            click(calendarIda);
            for (WebElement mes: findElements(listmeses)) {
                boolean out = false;
                for (WebElement diaT: findElements(diastotales, mes)) {
                    if(!findElements(diasInhabilitados, mes).contains(diaT)){
                        diaT.click();
                        out = true;
                        break;
                    }
                }
                if(out==true)
                    break;
            }

            click(calendarVuelta);
            int diasSalteados = 14;
            String dosSemanasDesp = obtenerDiaCambiado2(getAttribute(diaSelecionado,"aria-label"),diasSalteados);
            dosSemanasDesp = dosSemanasDesp.substring(0,1).toUpperCase() + dosSemanasDesp.substring(1);
            waitNmberOfElementsToBe(calendarOpen, 1);
            WebElement diaVuelta = findElement(obtenerSelectorParametrizado(txtAnteriorDiaVuelta,dosSemanasDesp,txtPosteriorDiaVuelta));
            do{
                try {
                    if(getAttribute(diaVuelta,"class").contains("disabled")){
                        diasSalteados++;
                        dosSemanasDesp = obtenerDiaCambiado2(getAttribute(diaSelecionado,"aria-label"),diasSalteados);
                        dosSemanasDesp = dosSemanasDesp.substring(0,1).toUpperCase() + dosSemanasDesp.substring(1);
                        diaVuelta = findElement(obtenerSelectorParametrizado(txtAnteriorDiaVuelta,dosSemanasDesp,txtPosteriorDiaVuelta));
                    }
                    diaVuelta.click();
                }catch (ElementClickInterceptedException e){
                }catch (StaleElementReferenceException e){
                }
            }while(!(findElements(diaSelecionado).size()>1));





            click(btnBuscar);
        }
    }

    public void formVueloBajo(){
        if(isDisplayed(txtOrigen)){
            type("Santiago", txtOrigen);
            type("AAAAA", txtDestino);
            click(btnBuscar);
        }
    }

    //Hoteles

    public void formHotelesAlto() throws ParseException {
        if(isDisplayed(btnHoteles)){
            click(btnHoteles);
            cambiarAiframe(IframeHotel);
            clearTxtFromInput(txtDestinoHotel);
            type("Londres", txtDestinoHotel);
            click(calendarIdaHotel);
            elegirPrimerDiaDisponible();

            click(calendarVueltaHotel);
            //proceso calendar VUELTA 2 semanas
            elegirCheckOutEn2Semanas();
            click(btnBuscarHotel);
            salirDelIframe();
            cambiarDeTab(1);

            //Selecionar los 3 filtros
        }


    }
    public void formHotelesMedio() throws ParseException {
        if(isDisplayed(btnHoteles)){
            click(btnHoteles);
            cambiarAiframe(IframeHotel);
            clearTxtFromInput(txtDestinoHotel);
            type("Londres", txtDestinoHotel);
            click(calendarIdaHotel);
            elegirPrimerDiaDisponible();

            click(calendarVueltaHotel);
            //proceso calendar VUELTA 2 semanas
            elegirCheckOutEn2Semanas();
            click(btnBuscarHotel);

            //Encontrar paquetes Disponibles
        }
    }
    public void formHotelesBajo(){
        if(isDisplayed(btnHoteles)){
            click(btnHoteles);
            cambiarAiframe(IframeHotel);
            click(txtDestinoHotel);
            clearTxtFromInput(txtDestinoHotel);
            type("Antartica", txtDestinoHotel);
            click(btnBuscarHotel);
            salirDelIframe();
            cambiarDeTab(1);
        }
    }

    public void elegirPrimerDiaDisponible() throws ParseException {
        //Array de meses para comparar.
        String[] nombresDeMeses = {"enero","febrero","marzo","mbril","mayo","junio","julio","agosto",
                "septiembre","octubre","noviembre","diciembre"};

        String actualDate = obtenerDia(); //Hoy retorna "2021-04-30
        String fechaActual[] = actualDate.split("-");
        String actualDay = fechaActual[2];
        //Dia siguiente para la IDA
        String tomorrowDate = obtenerDiaCambiado(actualDate, 1);
        String fechaEntera[] = tomorrowDate.split("-");
        int month = Integer.parseInt(fechaEntera[1]);
        String dayWantedIda = fechaEntera[2];

        dayWantedIda = dayWantedIda.replaceFirst("^0*", "");
        String mesABuscarIda = nombresDeMeses[month-1];
        click(calendarIdaHotel);
        WebElement calendario = findElement(calendarioHotel);
        String nombreMes = getText(nombreDelMes,calendario);
        for (WebElement dia : findElements(diaDelMes)) {
            String numeroDia = dia.getText();
            if (numeroDia.equals(dayWantedIda)){
                dia.click();
                break;
            }
        }
    }

    public void elegirCheckOutEn2Semanas() throws ParseException {
        //Array de meses para comparar.
        String[] nombresDeMeses = {"enero","febrero","marzo","mbril","mayo","junio","julio","agosto",
                "septiembre","octubre","noviembre","diciembre"};

        String actualDate = obtenerDia(); //Hoy retorna "2021-04-30
        //Dia siguiente para la IDA
        String tomorrowDate = obtenerDiaCambiado(actualDate, 1);
        String fechaEntera[] = tomorrowDate.split("-");
        String twoWeeks = obtenerDiaCambiado(tomorrowDate, 14);
        String fechaTwoWeeks[] = twoWeeks.split("-");
        int monthTW = Integer.parseInt(fechaEntera[1]);
        String dayWantedVuelta = fechaTwoWeeks[2];

        dayWantedVuelta = dayWantedVuelta.replaceFirst("^0*", "");
        WebElement calendario = findElement(calendarioHotel);
        String nombreMes = getText(nombreDelMes,calendario);
        String mesABuscarVuelta = nombresDeMeses[monthTW-1];
        click(calendarVueltaHotel);
        while(!mesABuscarVuelta.equals(nombreMes)){
            calendario.findElement(btnMesSiguiente).click();
            nombreMes = getText(nombreDelMes,calendario);
        }
        for (WebElement dia : findElements(diaDelMes)) {
            String numeroDia = dia.getText();
            if (numeroDia.equals(dayWantedVuelta)){
                dia.click();
                break;
            }
        }

    }
    //Traslado(Transporte)

    public void formTrasladoAlto(){
        if(isDisplayed(btnTraslado)){
            click(btnTraslado);
        }
        if (isDisplayed(IframeTraslado)){
            click(radiobtnIda);
            type("Ezeiza", txtAeropuertoOrigen);
            type("Newbery", txtAeropuertoDestino);
            click(calendarRecogidaTraslado);
            //fecha ida 30 dias -> actual
            click(listHorarioIda);
            //Selecionar 9am
            click(listPasajeroTraslado);
            //Selecionar 2 pasajeros
            click(btnTraslado);

        }
    }
    public void formTrasladoMedio(){
        if(isDisplayed(btnTraslado)){
            click(btnTraslado);
        }
        if (isDisplayed(IframeTraslado)){
            click(radiobtnIdaVuelta);
            type("Ezeiza", txtAeropuertoOrigen);
            type("Bogota Colombia", txtAeropuertoDestino);
            click(calendarRecogidaTraslado);
            //fecha ida 30 dias -> actual
            click(listHorarioIda);
            //Selecionar 9am
            click(calendarVueltaTraslado);
            //Fecha 1 dia despues de la fecha ida
            click(listHorarioVuelta);
            //Selecionar 10am
            click(listPasajeroTraslado);
            //Selecionar 1 pasajeros
            click(btnTraslado);

        }
    }
    public void formTrasladoBajo(){
        if(isDisplayed(btnTraslado)){
            click(btnTraslado);
        }
        if (isDisplayed(IframeTraslado)){
            click(radiobtnIda);
            type("Santiago", txtAeropuertoOrigen);
            type("La Serena", txtAeropuertoDestino);
            click(calendarRecogidaTraslado);
            // mñn
            click(listHorarioIda);
            //13pm
            click(btnTraslado);
        }
    }


    //Funciones xD ojito

    public void btnInicioSesion(){
        //waitElementToBePresent(btnIniciar, 5);
        if(isDisplayed(btnIniciar)){
            click(btnIniciar);
        }
    }

}








