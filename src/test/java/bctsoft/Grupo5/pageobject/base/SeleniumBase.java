package bctsoft.Grupo5.pageobject.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
/**
 * Clase Base de Selenium, para poder enmascarar
 * la version de Selenium
 */
public class SeleniumBase {
    //atributos
    protected WebDriver driver;

    //Constructor Base
    public SeleniumBase(WebDriver driver){
        this.driver = driver;
    }

    //Envoltorios Wrapper
    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public WebElement findElement(By locator, WebElement element){
        return element.findElement(locator);
    }

    public List<WebElement> findElements (By locator){
        return driver.findElements(locator);
    }
    public List<WebElement> findElements (By locator, WebElement element){
        return element.findElements(locator);
    }

    public String getText (By locator){
        return driver.findElement(locator).getText();
    }

    public String getAttribute (By locator,String tyoeOfAttribute){
        return driver.findElement(locator).getAttribute(tyoeOfAttribute);
    }
    public String getAttribute (WebElement element,String tyoeOfAttribute){
        return element.getAttribute(tyoeOfAttribute);
    }

    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void closeDriver(){
        driver.close();
    }

    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public boolean elemetExist (By locator){
        return findElements(locator).size()>0?true:false;
    }

    public void waitElementToBePresent (By locator, int timeOut){
        WebDriverWait w1 = new WebDriverWait(driver,timeOut);
        w1.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    public void waitElementToBeClickable(By locator, int timeOut){
        WebDriverWait w1 = new WebDriverWait(driver,timeOut);
        w1.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void waitElementToBeClickable(WebElement element, int timeOut){
        WebDriverWait w1 = new WebDriverWait(driver,timeOut);
        w1.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitNmberOfElementsToBe(By locator,int numberOfElements){
        WebDriverWait waiter = new WebDriverWait(driver,10);
        waiter.until(ExpectedConditions.numberOfElementsToBe(locator,numberOfElements));
    }

    public void goToUrl(String url){
        driver.get(url);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void sleep(int millisegundos) throws InterruptedException {
        Thread.sleep(500);
    }

    public void waitElementDesappear(By locator){
        List<WebElement> loader = findElements(locator);
        while (loader.size()>0){
            loader = findElements(locator);
        }
    }

    public void waitElementDesappear(By locator, WebElement element){
        List<WebElement> loader = findElements(locator, element);
        while (loader.size()>0){
            loader = findElements(locator, element);
        }
    }

    public static String obtenerDiaCambiado2(String actualDate, int numbDays) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(actualDate));
        c.add(Calendar.DATE, numbDays);  // number of days to add
        actualDate = sdf.format(c.getTime());  // actualDate is now the new date with the changes.
        return actualDate;
    }

    public By obtenerSelectorParametrizado(String txtAnterior, String parametro, String txtPosterior){
        By selector =By.cssSelector(txtAnterior+parametro+txtPosterior);
        return selector;
    }




}
