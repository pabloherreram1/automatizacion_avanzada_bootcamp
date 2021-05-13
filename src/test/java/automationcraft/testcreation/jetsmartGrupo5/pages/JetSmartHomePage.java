package automationcraft.testcreation.jetsmartGrupo5.pages;

import bctsoft.grupo5.pageobject.base.SeleniumBase;
import org.junit.Assert;
import org.openqa.selenium.*;

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

    private By noHayResultado = By.cssSelector("li.dg-typing-result-item");
    private By listVuelos = By.cssSelector("div.fee-selector label");


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
    private By dato = By.cssSelector("div.sr_header");

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
    private By btnBuscarTraslado = By.xpath("//button[contains(text(),'Buscar')]");

    private By containerCalendar = By.cssSelector("div.ct-calendar-container table");
    private By mesMostradoT = By.cssSelector("div.ctc-calendar__title");
    private By btnNextT = By.cssSelector("div.ctc-calendar__nav--next");
    private By diaDisponibleCT = By.cssSelector("div.ct-calendar-container td:not(.ct-disabled");
    private By primerElementoLT = By.cssSelector("#item-0-0");
    private By btnHorario1pm = By.cssSelector("#ct-time-picker-pick-up-option-78");
    private By btnHorario9am = By.cssSelector("#ct-time-picker-pick-up-option-54");
    private By btnHorario10am = By.cssSelector("#ct-time-picker-pick-up-option-60");
    private By cantidadPasajeros1 = By.cssSelector("div[list] li[aria-label*='1']");
    private By cantidadPasajeros2 = By.cssSelector("div[list] li[aria-label*='2']");

    private By resultadoTraslado = By.cssSelector("ul.ct-space-v li");
    private By panelResultadoT = By.cssSelector("div.ct-availability div.ct-panel-title");
    private By boxResultados = By.cssSelector("fieldset");
    private By btnClassT   = By.xpath("//button[@class='ct-btn ct-btn-p ']");


    private By pablo = By.xpath("//span[contains(text(),'pablo Ignacio Herrera Mateluna')]");



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










            click(btnBuscar);

        }
    }

    //___________Vuelo Alto___________________________
    public void checkidaVuelo(){
        if(isDisplayed(tabVuelo)){
            waitElementDesappear(loaderTabVuelo, findElement(tabVuelo));
            waitElementToBePresent(CheckIda, 3);
            click(CheckIda);
        }
    }

    public void select1Adulto(){
        if(isDisplayed(listPasajero)){
            click(listPasajero);
        }
    }

    public void select2nino() throws InterruptedException {
        sleep(500);
        waitElementToBeClickable(cajaopen, 3);
        click(btnPasajeroIncrementoNinos);
        click(btnPasajeroIncrementoNinos);
        click(btnOkPasajero);
    }

    //_________VueloMEdio___________________
    public void ingresoDestinoVueloMedio(String string){
        if(isDisplayed(txtDestino)){
            click(txtDestino);
            type(string, txtDestino);
            waitElementToBeClickable(findElement(txtDestino, findElement(tabVuelo)), 10);
            waitElementToBeClickable(findElement(esperaDestinoAR, findElement(tabVuelo)), 10);
            click(esperaDestinoAR);
        }
    }

    public void checkIdaYVueltaMedio(){
        if(isDisplayed(CheckIdayVuelta)){
            click(CheckIdayVuelta);
        }
    }

    public void primeraFechaDisponibleTraslado(){
        if(isDisplayed(calendarIda)){
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
        }
    }

    public void vueltaDosSemanasPosteriorTraslado()throws ParseException{
        if(isDisplayed(calendarVuelta)){
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
        }
    }

    public void presionarBotonBuscarVuelo(){
        if(isDisplayed(btnBuscar)){
            click(btnBuscar);
        }
    }

    public void alertaVueloMedio(){
        if(isDisplayed(listVuelos)){
            List<WebElement> vuelos = findElements(listVuelos);
            String vueloIDA = vuelos.get(0).getText();
            String vueloVUELTA = vuelos.get(1).getText();
            String resultado = vueloIDA + "\n"+vueloVUELTA;
            //Assert.();
        }
    }

    //-----------Vuelo Bajo--------------------------
    public void ingresoOrigenVuelo(String string){
        if(isDisplayed(txtOrigen)){
            type(string, txtOrigen);
            click(txtOrigen);
            waitElementToBeClickable(findElement(esperaOrigenCL, findElement(tabVuelo)), 10);
            click(esperaOrigenCL);
        }
    }

    public void ingresoDestinoVueloBajo(String string){
        if(isDisplayed(txtDestino)){
            click(txtDestino);
            type(string, txtDestino);
            waitElementToBeClickable(findElement(txtDestino, findElement(tabVuelo)), 10);
            click(esperaDestinoAR);
        }
    }

    public void alertaDeVueloBajo(){
        waitVisibilityOfElement(noHayResultado);
        Assert.assertEquals("No hay resultados.", getText(noHayResultado));
    }
//--------------------------------------------------------------------------------------

    //Hoteles

    public void formHotelesAlto() throws ParseException {
        if(isDisplayed(btnHoteles)){
            click(btnHoteles);
            cambiarAiframe(IframeHotel);
            clearTxtFromInput(txtDestinoHotel);
            type("Londres", txtDestinoHotel);
            click(calendarIdaHotel);
            elegirPrimerDiaDisponible(calendarIdaHotel,nombreDelMes,calendarioHotel,diaDelMes);

            click(calendarVueltaHotel);
            //proceso calendar VUELTA 2 semanas
            elegirCheckOutEn2Semanas();
            click(btnBuscarHotel);
            salirDelIframe();
            cambiarDeTab(1);

            //Selecionar los 3 filtros
        }


    }

    //____________Hotel Medio____________
    public void ingresoOrigenHotel(String string){
        if(isDisplayed(txtDestinoHotel)){
            click(txtDestinoHotel);
            clearTxtFromInput(txtDestinoHotel);
            type(string, txtDestinoHotel);
        }
    }

    public void primeraFechaDisponibleHotel() throws ParseException {
        if(isDisplayed(calendarIdaHotel)){
            click(calendarIdaHotel);
            elegirPrimerDiaDisponible(calendarIdaHotel,nombreDelMes,calendarioHotel,diaDelMes);
        }
    }

    public void segundaFechaDisponibleHotel() throws ParseException {
        if(isDisplayed(calendarVueltaHotel)){
            click(calendarVueltaHotel);
            //proceso calendar VUELTA 2 semanas
            elegirCheckOutEn2Semanas();
        }
    }




    //----------Hotel Bajo------------------------------

    public void ingresoFormHotel(){
        if(isDisplayed(btnHoteles)){
            click(btnHoteles);
            cambiarAiframe(IframeHotel);
        }
    }

    public void ingresoOrigenHotelBajo(){
        if(isDisplayed(txtDestinoHotel)){
            click(txtDestinoHotel);
            clearTxtFromInput(txtDestinoHotel);
            type("Antartica", txtDestinoHotel);
        }
    }

    public void btnBuscarHotel(){
        if(isDisplayed(btnBuscarHotel)){
            click(btnBuscarHotel);
            salirDelIframe();
            cambiarDeTab(1);

        }
    }


    //--------------------------------------------------------------------------

    public void elegirPrimerDiaDisponible(By selectorDeIda, By nombreDelMes,By calendarioDelIfreme,By diasDelMes) throws ParseException {
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
        click(selectorDeIda);
        WebElement calendario = findElement(calendarioDelIfreme);
        String nombreMes = getText(nombreDelMes,calendario);
        for (WebElement dia : findElements(diasDelMes)) {
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

    public void formTrasladoAlto() throws ParseException, InterruptedException {
        if(isDisplayed(btnTraslado)){
            click(btnTraslado);
            cambiarAiframe(IframeTraslado);
            click(radiobtnIda);
            type("Ezeiza", txtAeropuertoOrigen);
            waitElementToBeClickable(primerElementoLT, 5);
            click(primerElementoLT);
            type("Newbery", txtAeropuertoDestino);
            waitElementToBeClickable(primerElementoLT, 5);
            click(primerElementoLT);
            waitElementToBeClickable(containerCalendar, 5);
            elegirFechaDespDe(30);
            waitElementToBeClickable(btnHorario9am, 5);//13pm
            click(btnHorario9am);
            waitElementToBeClickable(cantidadPasajeros2, 5);
            click(cantidadPasajeros2);
            click(btnBuscarTraslado);
            salirDelIframe();
            cambiarDeTab(1);
        }
    }



    //______________Traslado Medio_____________________

    public void selectRadiobtnIdaYvuelta(){
        if(isDisplayed(radiobtnIdaVuelta)){
            click(radiobtnIdaVuelta);
        }
    }

    public void seleccionoFechaIda30() throws ParseException, InterruptedException {
        if(isDisplayed(containerCalendar)){
            //Fecha 30 desp del actual
            waitElementToBeClickable(containerCalendar, 5);
            elegirFechaDespDe(30);
        }
    }

    public void horario9am(){
        if(isDisplayed(btnHorario9am)){
            //Selecionar 9am
            waitElementToBeClickable(btnHorario9am,5);
            click(btnHorario9am);
        }
    }

    public void Fecha_1_dia_despues_de_la_fecha_ida() throws ParseException, InterruptedException {
        if(isDisplayed(containerCalendar)){
            waitElementToBeClickable(containerCalendar,5);
            elegirFechaDespDe(31);
        }

    }

    public void btnTrasladoMedio(){
        WebElement ele = driver.findElement(By.cssSelector("button.ct-btn.ct-btn-p.gt-is-valid"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", ele);
        salirDelIframe();
        cambiarDeTab(1);
    }



    //__________Traslado Bajo_______________________________
    public void ingresarFormTraslado(){
        if(isDisplayed(btnTraslado)){
            click(btnTraslado);
            cambiarAiframe(IframeTraslado);
        }
    }
    public void selectRadiobtn(){
        if(isDisplayed(radiobtnIda)){
            click(radiobtnIda);
        }
    }

    public void ingresarOrigenTraslado(String string){
        if(isDisplayed(txtAeropuertoOrigen)){
            type(string, txtAeropuertoOrigen);
            waitElementToBeClickable(primerElementoLT, 5);
            click(primerElementoLT);
        }
    }

    public void ingresarDestinoTraslado(String string){
        if(isDisplayed(txtAeropuertoDestino)){
            type(string, txtAeropuertoDestino);
            waitElementToBeClickable(primerElementoLT, 5);
            click(primerElementoLT);
        }
    }

    public void firstFechadisponible()throws ParseException, InterruptedException{
        if(isDisplayed(containerCalendar)){
            waitElementToBeClickable(containerCalendar, 5);
            elegirPrimerDiaDisponibleT();
        }
    }

    public void horarioTrasladoBajo(){
        if(isDisplayed(btnHorario1pm)){
            waitElementToBeClickable(btnHorario1pm, 5);//13pm
            click(btnHorario1pm);
        }
    }

    public void seleccionUnPasajeroTrasladoBajo(){
        click(listPasajeroTraslado);
        if(isDisplayed(cantidadPasajeros1)){
            waitElementToBeClickable(cantidadPasajeros1, 5);
            click(cantidadPasajeros1);
        }
    }

    public void btnTrasladoBajo(){
        if(isDisplayed(btnBuscarTraslado)){
            click(btnBuscarTraslado);
            salirDelIframe();
            cambiarDeTab(1);
        }
    }

    public void alertaTrasladoBajo(){
        if(isDisplayed(btnClassT)){
            waitElementToBeClickable(btnClassT,10);
            int size = findElements(resultadoTraslado).size();
            System.out.println("el sSIZE ES ESTEEEEEEEEEE: "+ size);
            Assert.assertEquals(11,size);
        }
    }
    //---------------------------------------------------------------
    public void elegirPrimerDiaDisponibleT() throws ParseException {
        String actualDate = obtenerDia(); //Hoy retorna "2021-05-04"
        String fechaActual[] = actualDate.split("-");
        String actualDay = fechaActual[2];
        actualDay = actualDay.replaceFirst("^0*", "");

        //Array de meses para comparar.
        String[] nombresDeMeses = {"enero","febrero","marzo","mbril","mayo","junio","julio","agosto",
                "septiembre","octubre","noviembre","diciembre"};

        String diaActual = obtenerDia();
        String diaSiguiente = obtenerDiaCambiado(diaActual, 1);
        String fechaEntera[] = diaSiguiente.split("-");
        int month = Integer.parseInt(fechaEntera[1]);
        String diaABuscar = fechaEntera[2];
        diaABuscar = diaABuscar.replaceFirst("^0*", "");

        String palabraABuscar = nombresDeMeses[month-1];
        palabraABuscar = palabraABuscar.toUpperCase();
        waitElementToBePresent(containerCalendar,5);
        String mesMostrado = getText(mesMostradoT);
        while (!mesMostrado.contains(palabraABuscar)){
            click(btnNextT);
            mesMostrado = getText(mesMostradoT);
        }

        waitElementToBePresent(diaDisponibleCT,5);
        for (WebElement dia: findElements(diaDisponibleCT)) {
            String atributoAriaLabe = getAttribute(dia,"aria-label");//dia.getAttribute("aria-label");
            if(atributoAriaLabe.contains(diaABuscar)){
                dia.click();
                break;
            }

        }
    }

    public void elegirFechaDespDe(int diasDesp) throws ParseException, InterruptedException {
        String actualDate = obtenerDia(); //Hoy retorna "2021-05-04"
        String fechaActual[] = actualDate.split("-");
        String actualDay = fechaActual[2];
        actualDay = actualDay.replaceFirst("^0*", "");

        //Array de meses para comparar.
        String[] nombresDeMeses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
                "septiembre", "octubre", "noviembre", "diciembre"};

        String diaActual = obtenerDia();
        String diaSiguiente = obtenerDiaCambiado(diaActual, diasDesp);
        String fechaEntera[] = diaSiguiente.split("-");
        int month = Integer.parseInt(fechaEntera[1]);
        String diaABuscar = fechaEntera[2];
        diaABuscar = diaABuscar.replaceFirst("^0*", "");

        String palabraABuscar = nombresDeMeses[month - 1];
        palabraABuscar = palabraABuscar.toUpperCase();
        waitElementToBePresent(containerCalendar,5);
        String mesMostrado = getText(mesMostradoT);//driver.findElement(mesMostradoT).getText();

        while (!mesMostrado.contains(palabraABuscar)) {
            driver.findElement(btnNextT).click();
            mesMostrado = getText(mesMostradoT);
        }
        waitNumberOfElementsToBeMoreThan(diaDisponibleCT,0);
        sleep(500);
        for (WebElement dia : findElements(diaDisponibleCT)) {
            String atributoAriaLabel = getAttribute(dia,"aria-label");
            if (atributoAriaLabel.contains(diaABuscar)) {
                dia.click();
                break;
            }
        }
    }

    public void elegirHorarioDestino(By locator){


    }


        //Funciones xD ojito

    public void btnInicioSesion(){
        waitElementToBePresent(btnIniciar, 5);
        if(isDisplayed(btnIniciar)){
            click(btnIniciar);
        }
    }


    public String verificoInicioSesion(){
        return getText(pablo);
    }

}








