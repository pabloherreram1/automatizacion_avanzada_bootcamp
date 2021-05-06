package bctsoft.grupo5.testcases;

import bctsoft.grupo5.pageobject.pages.JetSmartHomePage2;
import org.testng.annotations.Test;

public class atc01_testCase extends TestBase {

    protected JetSmartHomePage2 jsHomePage;

    @Test
    public void atc01_test(){
        jsHomePage = new JetSmartHomePage2(driver);
        jsHomePage.goToUrl("https://jetsmart.com/cl/es/");
        jsHomePage.cerrarModuloSuscribete();
    }


}


