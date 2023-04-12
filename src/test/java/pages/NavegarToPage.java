package pages;

import org.openqa.selenium.By;
import utils.BasePage;

public class NavegarToPage extends BasePage {

    //Se crea constructor
    public NavegarToPage() {
        super(driver);
    }

    //Se crean elementos

    private final By BUSQUEDA_TEXTO_YOUR_STORE = By.xpath("//a[contains(text(),'Your Store')]");

    //Busqueda en el navegador
    public void navegateToUrl(String url) {
        BasePage.navegateTo(url);
    }

    //Se busca texto
    public String busquedaTextoYourStore() {
        return obtenerTexto(BUSQUEDA_TEXTO_YOUR_STORE);
    }
}